package jfshub;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import jfshub.Datos.*;
import jfshub.Mensage.*;

/**
 *
 * @author Crhistian C
 */
public class JFSHub extends javax.swing.JFrame {

    /**
     * Creates new form JFSHub
     */
    public JFSHub() {
        initComponents();
        propiedadesJFrame();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelGeneral = new javax.swing.JPanel();
        panelIniciarSesion = new javax.swing.JPanel();
        imagenJFS = new java.awt.Label();
        txtPass = new javax.swing.JLabel();
        txtUltimaVersion = new javax.swing.JLabel();
        bIniciarSesion = new javax.swing.JButton();
        Usuario = new javax.swing.JTextField();
        bAyuda = new javax.swing.JButton();
        Pass = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGeneral.setLayout(new java.awt.CardLayout());

        panelIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        panelIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));

        imagenJFS.setAlignment(java.awt.Label.CENTER);
        imagenJFS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imagenJFS.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 70)); // NOI18N
        imagenJFS.setName(""); // NOI18N
        imagenJFS.setText("Los JFS");

        txtPass.setForeground(new java.awt.Color(102, 102, 102));
        txtPass.setText("Contraseña");

        txtUltimaVersion.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txtUltimaVersion.setForeground(new java.awt.Color(51, 153, 255));
        txtUltimaVersion.setText("Última versión: Conectando...");

        bIniciarSesion.setBackground(new java.awt.Color(255, 255, 255));
        bIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        bIniciarSesion.setText("Iniciar sesión");
        bIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarSesionActionPerformed(evt);
            }
        });

        Usuario.setBackground(new java.awt.Color(0, 0, 0));
        Usuario.setForeground(new java.awt.Color(255, 255, 255));
        Usuario.setToolTipText("");
        Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Usuario.setName(""); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        bAyuda.setBackground(new java.awt.Color(255, 255, 255));
        bAyuda.setForeground(new java.awt.Color(0, 0, 0));
        bAyuda.setText("Ayuda");
        bAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAyudaActionPerformed(evt);
            }
        });

        Pass.setBackground(new java.awt.Color(0, 0, 0));
        Pass.setForeground(new java.awt.Color(255, 255, 255));
        Pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PassActionPerformed(evt);
            }
        });
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PassKeyPressed(evt);
            }
        });

        txtUsuario.setForeground(new java.awt.Color(102, 102, 102));
        txtUsuario.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel1.setText("Versión actual: Estable 1.0.0");

        jLabel3.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("para administradores");

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel4.setText("Duar maricón si dice que se ve antiguo el programa. La weá funciona. ctmr ");
        jLabel4.setMinimumSize(new java.awt.Dimension(359, 14));

        javax.swing.GroupLayout panelIniciarSesionLayout = new javax.swing.GroupLayout(panelIniciarSesion);
        panelIniciarSesion.setLayout(panelIniciarSesionLayout);
        panelIniciarSesionLayout.setHorizontalGroup(
            panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtUltimaVersion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAyuda))
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addGap(205, 205, 205)
                                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtPass))
                                .addGap(52, 52, 52)
                                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(jLabel3))
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(imagenJFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(bIniciarSesion))
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addGap(154, 154, 154)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelIniciarSesionLayout.setVerticalGroup(
            panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarSesionLayout.createSequentialGroup()
                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAyuda))
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(imagenJFS, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                        .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsuario)
                            .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass)
                            .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addComponent(bIniciarSesion)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUltimaVersion)))
                .addGap(11, 11, 11))
        );

        Usuario.getAccessibleContext().setAccessibleName("");

        panelGeneral.add(panelIniciarSesion, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Al apretar ayuda muestra una ventana de ayuda.
     *
     * @param evt ActionEvent.
     */
    private void bAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAyudaActionPerformed
        Mensage.ventana(CodigoMensage.AYUDA, 1);
    }//GEN-LAST:event_bAyudaActionPerformed
    /**
     * Al apretar estable la conexiôn con la base de tabUsuarios.
     *
     * @param evt ActionEvent.
     */
    private void bIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIniciarSesionActionPerformed
        Datos.loadUser(Usuario.getText().trim(), Pass.getText().trim());

        if (!Datos.isConnected()) {
            Mensage.ventana(CodigoMensage.ERR_SERVER, 0);
        } else if (!Datos.isCorrectUser()) {
            Mensage.ventana(CodigoMensage.ERR_USER, 0);
        } else {
            iniciar();
        }
        
        iniciar();
    }//GEN-LAST:event_bIniciarSesionActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    /**
     * Al apretar ENTER en pass.
     *
     * @param evt ActionEvent.
     */
    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed

    }//GEN-LAST:event_PassActionPerformed

    private void PassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            bIniciarSesionActionPerformed(null);
        }
    }//GEN-LAST:event_PassKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFSHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFSHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFSHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFSHub.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFSHub().setVisible(true);
            }
        });
        getDataDB();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Usuario;
    private javax.swing.JButton bAyuda;
    private javax.swing.JButton bIniciarSesion;
    private java.awt.Label imagenJFS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelIniciarSesion;
    private javax.swing.JLabel txtPass;
    private static javax.swing.JLabel txtUltimaVersion;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Propiedades del JFrame inicial.
     */
    private void propiedadesJFrame() {
        ImageIcon img = new ImageIcon(JFSHub.class.getResource("images/icono1.png"));
        setIconImage(img.getImage().getScaledInstance(14, 15, Image.SCALE_DEFAULT));

        setTitle("JFS Hub for Admins");
        setLocationRelativeTo(null);
        setResizable(false);
    }

    private void iniciar() {
        //JOptionPane.showMessageDialog(null, "¡Bienvenido "
         //       + Datos.get(DataCode.NOMBRE) + "!", "Inicio de sesión", 1);
        setVisible(false);
        VentanaPrincipal ventana = new VentanaPrincipal();
        
        //Datos.closeConnection();
    }

    private static void getDataDB() {
        try {
            Datos.connectToDataBase();
            TimeUnit.SECONDS.sleep(3);
            txtUltimaVersion.setText("Última versión: " + Datos.checkUpdate());
            
            
        } catch (Exception e) {
            txtUltimaVersion.setForeground(Color.red);
            txtUltimaVersion.setText("No se pudo establecer conexión con la base"
                    + " de datos.");
        }

    }

}
