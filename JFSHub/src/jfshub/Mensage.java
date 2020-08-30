package jfshub;

import javax.swing.JOptionPane;

/**
 *
 * @author Crhistian C
 */
public abstract class Mensage {

    public static void consola() {

    }

    public static void ventana(CodigoMensage c, int icon) {
        switch(c){
            case AYUDA:
                JOptionPane.showMessageDialog(null, "Sí, yo tampoco entiendo qué hace "
                + "este botón ahí.\nYo solo sigo ordenes :(.",
                "Ayuda", icon, null);
                break;
            case ERR_SERVER:
                JOptionPane.showMessageDialog(null, "Error al conectar al servidor."
                    + " Verifica tu conexión a internet.\n" + "Si el error "
                    + "persiste, contacta con Los JFS.", "Error de servidor",
                    icon);
                break;
            case ERR_USER:
                JOptionPane.showMessageDialog(null, "Usuario no valido o "
                    + "contraseña incorrecta", "Iniciar sesión" ,icon);
                break;
            case ERR_PRIV_USER:
                JOptionPane.showMessageDialog(null, "Esta función aún no está "
                + "disponible.", "Usuario privilegiado", icon);
                break;
            case SERVER_TEST:
                JOptionPane.showMessageDialog(null, "Comprobando conexiones.\n"
                + "Esto tardará un instante.", "Comprobando conexiones", icon);
                break;
        }
    }

    enum CodigoMensage {
        AYUDA,
        ERR_SERVER,
        ERR_USER,
        ERR_PRIV_USER,
        SERVER_TEST,
        
    }

}
