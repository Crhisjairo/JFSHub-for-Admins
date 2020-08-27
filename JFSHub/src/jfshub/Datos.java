package jfshub;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Crhistian C
 */
public abstract class Datos {

    private static ArrayList<String> data = new ArrayList();

    private static final String URL = "jdbc:mysql://jfs.sytes.net/JFS";
    private static final String USER_DB = "invitado";
    private static final String PASS_DB = "Lamamademena";
    private static PreparedStatement pst;
    private static Connection cn;
    private static ResultSet result;

    private static final int MAX_COLUMNS = 8;
    //private static String usuario;
    //private static String pass;

    private static boolean isConnected = false;
    private static boolean isCorrectUser = false;

    public static boolean connectToDataBase() {
        try {
            cn = DriverManager.getConnection(URL, USER_DB, PASS_DB);

            return isConnected = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return isConnected = false;
        }
    }

    public static boolean loadUser(String user, String pass) {
        if (cn == null) {
            System.out.println("Conecta la base de datos primero"
                    + "\nconnectToDataBase()");
            return false;
        }

        try {
            getData(user, pass);
            return true;
        } catch (HeadlessException | SQLException e) {
            System.out.println("Error: " + e);
            return false;
        }
    }

    /**
     * Recupera los datos del usuario encontrado.
     *
     * @throws SQLException
     */
    private static boolean getData(String u, String p) throws SQLException {
        pst = cn.prepareStatement(
                "SELECT * FROM usuarios WHERE usuario = ? AND BINARY pass = ?;");

        //adaptar query ? con los valores//
        pst.setString(1, u.trim());
        pst.setString(2, p.trim());
        //*****************************//
        result = pst.executeQuery(); //ejecutar query

        if (result.next()) { //si hay algo en resultado
            System.out.println("Se encontró coincidencias en la base de datos");

            //copiar la BD a data//
            for (int i = 1; i <= MAX_COLUMNS; i++) {
                data.add(result.getString(i));
                System.out.println(result.getString(i));
            }

            return isCorrectUser = true;
        } else {
            System.out.println("No se encontró coincidencias en la base de datos");

            return isCorrectUser = false;
        }
    }

    public static boolean registerUser(String[] newUser) {
        if (cn == null) {
            System.out.println("Conecta la base de datos primero"
                    + "\nconnectToDataBase()");
            return false;
        }

        try {
            pst = cn.prepareStatement(
                    "INSERT INTO usuarios (usuario, nombre, apellido, edad, pais, pass, correo)"
                    + "VALUES (?, ?, ?, ?, ?, ?, ?);");

            //adaptar query ? con los valores//
            pst.setString(1, newUser[0]);

            pst.setString(2, newUser[1].substring(0, 1).toUpperCase()
                    + newUser[1].substring(1)); //primera letra del nombre en mayus

            if (!newUser[3].equals("")) {//si apellido no está vacío
                pst.setString(3, newUser[2].substring(0, 1).toUpperCase()
                        + newUser[2].substring(1));//primera letra del nombre en mayus
            } else {//si apellido estâ vacîo
                pst.setString(3, "*NO REGISTRADO*");
            }

            if (!newUser[3].equals("")) {//si edad no está vacío
                pst.setInt(4, Integer.parseInt(newUser[3]));
            } else {
                pst.setInt(4, -1);
            }

            pst.setString(5, newUser[4]); //edad
            pst.setString(6, newUser[5]); //pass
            pst.setString(7, newUser[6]); //correo
            //*****************************//

            int rowsInserted = pst.executeUpdate(); //ejecutar query
            System.out.println("Líneas afectadas: " + rowsInserted);

            //iniciar sesion con el usuario nuevo
            getData(newUser[0], newUser[5]);

            return true;

        } catch (java.sql.SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe.\nElige otro"
                    + " nombre de usuario.", "Registrar", 1);
            System.out.println("Constraint no respetada: " + e);

            return false;
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Al parecer, la base de datos no"
                    + " me deja registrarte.\nRevisa tu conexión a internet y "
                    + "vuelve a intentar.", "Registrar", 0);

            System.out.println("Error: " + e);
            return false;
        }
    }

    public static String checkUpdate() {
        try {
            pst = cn.prepareStatement(
                    "SELECT version FROM versiones ORDER BY idVersiones DESC;");

            result = pst.executeQuery(); //ejecutar query
            
            if (result.next()) {
                return result.getString("version");
            }
            
            return null;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
            return "Error al verificar la versión";
        }
    }

    public static boolean closeConnection() {
        try {
            cn.close();
            System.out.println("Se cerró la conexión con la base de datos.");
            return isConnected = false;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return isConnected = true;
        }
    }

    //Acceso a datos//   
    public static String get(DataCode c) {
        switch (c) {
            case ID:
                return data.get(0);
            case USUARIO:
                return data.get(1);
            case NOMBRE:
                return data.get(2);
            case APELLIDO:
                return data.get(3);
            case EDAD:
                return data.get(4);
            case PAIS:
                return data.get(5);
            case CORREO:
                return data.get(7);
            default:
                return null;
        }
    }

    /**
     * Regresa true o false si se pudo cargar la base de datos.
     *
     * @return si se cargó la base de datos.
     */
    public static boolean isConnected() {
        return isConnected;
    }

    /**
     * Regresa true o false si el usuario es correcto en loadUser().
     *
     * @return si es el usuario correcto.
     */
    public static boolean isCorrectUser() {
        return isCorrectUser;
    }

    public enum DataCode {
        ID,
        USUARIO,
        NOMBRE,
        APELLIDO,
        EDAD,
        PAIS,
        CORREO
    }

}
