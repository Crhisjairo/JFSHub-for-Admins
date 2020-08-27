package jfshub;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
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
        bUsuarioPrivilegiado = new javax.swing.JButton();
        bIniciarSesion = new javax.swing.JButton();
        bRegistrarse = new javax.swing.JButton();
        Usuario = new javax.swing.JTextField();
        bAyuda = new javax.swing.JButton();
        Pass = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panelRegistrarse = new javax.swing.JPanel();
        bAtras = new javax.swing.JButton();
        txtNombreUsuarioReg = new javax.swing.JLabel();
        txtPassReg = new javax.swing.JLabel();
        txtNombreReg = new javax.swing.JLabel();
        txtApellidoReg = new javax.swing.JLabel();
        txtPaisReg = new javax.swing.JLabel();
        txtCorreoReg = new javax.swing.JLabel();
        txtEdadReg = new javax.swing.JLabel();
        nombreUsuarioReg = new javax.swing.JTextField();
        nombreReg = new javax.swing.JTextField();
        correoReg = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        paisReg = new javax.swing.JComboBox<>();
        edadReg = new javax.swing.JTextField();
        apellidoReg = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInformacion = new javax.swing.JTextArea();
        bRegistrarReg = new javax.swing.JButton();
        passReg = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelGeneral.setLayout(new java.awt.CardLayout());

        imagenJFS.setAlignment(java.awt.Label.CENTER);
        imagenJFS.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        imagenJFS.setFont(new java.awt.Font("iCiel Gotham Medium", 0, 70)); // NOI18N
        imagenJFS.setName(""); // NOI18N
        imagenJFS.setText("Los JFS");

        txtPass.setText("Contraseña");

        txtUltimaVersion.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        txtUltimaVersion.setForeground(new java.awt.Color(51, 153, 255));
        txtUltimaVersion.setText("Última versión: Conectando...");

        bUsuarioPrivilegiado.setText("Usuario privilegiado");
        bUsuarioPrivilegiado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUsuarioPrivilegiadoActionPerformed(evt);
            }
        });

        bIniciarSesion.setText("Iniciar sesión");
        bIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIniciarSesionActionPerformed(evt);
            }
        });

        bRegistrarse.setText("Registrarse");
        bRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarseActionPerformed(evt);
            }
        });

        Usuario.setToolTipText("");
        Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Usuario.setName(""); // NOI18N
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });

        bAyuda.setText("Ayuda");
        bAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAyudaActionPerformed(evt);
            }
        });

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

        txtUsuario.setText("Usuario");

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 10)); // NOI18N
        jLabel1.setText("Versión actual: Pre-alpha 0.0.1");

        javax.swing.GroupLayout panelIniciarSesionLayout = new javax.swing.GroupLayout(panelIniciarSesion);
        panelIniciarSesion.setLayout(panelIniciarSesionLayout);
        panelIniciarSesionLayout.setHorizontalGroup(
            panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addComponent(bRegistrarse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bIniciarSesion))
                            .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtUsuario)
                                    .addComponent(txtPass))
                                .addGap(52, 52, 52)
                                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(imagenJFS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtUltimaVersion)))
                .addContainerGap(191, Short.MAX_VALUE))
            .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                    .addContainerGap(508, Short.MAX_VALUE)
                    .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bUsuarioPrivilegiado, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(bAyuda, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addContainerGap()))
        );
        panelIniciarSesionLayout.setVerticalGroup(
            panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIniciarSesionLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addComponent(imagenJFS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsuario)
                    .addComponent(Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPass)
                    .addComponent(Pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bRegistrarse)
                    .addComponent(bIniciarSesion))
                .addGap(97, 97, 97)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUltimaVersion)
                .addGap(12, 12, 12))
            .addGroup(panelIniciarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelIniciarSesionLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(bUsuarioPrivilegiado)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 426, Short.MAX_VALUE)
                    .addComponent(bAyuda)
                    .addContainerGap()))
        );

        Usuario.getAccessibleContext().setAccessibleName("");

        panelGeneral.add(panelIniciarSesion, "card2");

        bAtras.setText("Atrás");
        bAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAtrasActionPerformed(evt);
            }
        });

        txtNombreUsuarioReg.setText("Nombre de usuario");

        txtPassReg.setText("Contraseña");

        txtNombreReg.setText("Nombre");

        txtApellidoReg.setText("Apellido");

        txtPaisReg.setText("Pais");

        txtCorreoReg.setText("Correo");

        txtEdadReg.setText("Edad");

        nombreUsuarioReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombreUsuarioRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombreUsuarioRegMouseExited(evt);
            }
        });

        nombreReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                nombreRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                nombreRegMouseExited(evt);
            }
        });

        correoReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                correoRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                correoRegMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Footlight MT Light", 0, 24)); // NOI18N
        jLabel9.setText("Información adicional");

        paisReg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Algeria", "Canadá", "Guatemala", "Nicaragua", "Perú" }));
        paisReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                paisRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                paisRegMouseExited(evt);
            }
        });

        edadReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                edadRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                edadRegMouseExited(evt);
            }
        });

        apellidoReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                apellidoRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                apellidoRegMouseExited(evt);
            }
        });

        txtInformacion.setEditable(false);
        txtInformacion.setColumns(20);
        txtInformacion.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        txtInformacion.setRows(5);
        txtInformacion.setText("Pasa el puntero\nsobre una casilla\npara obtener más\ninformación.");
        txtInformacion.setFocusable(false);
        jScrollPane1.setViewportView(txtInformacion);

        bRegistrarReg.setText("Registrarse");
        bRegistrarReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistrarRegActionPerformed(evt);
            }
        });

        passReg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passRegMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passRegMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Footlight MT Light", 0, 48)); // NOI18N
        jLabel2.setText("Registrarse");

        javax.swing.GroupLayout panelRegistrarseLayout = new javax.swing.GroupLayout(panelRegistrarse);
        panelRegistrarse.setLayout(panelRegistrarseLayout);
        panelRegistrarseLayout.setHorizontalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarseLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNombreUsuarioReg)
                    .addComponent(txtNombreReg)
                    .addComponent(txtCorreoReg)
                    .addComponent(txtPassReg))
                .addGap(101, 101, 101)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(correoReg, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(nombreReg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombreUsuarioReg, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passReg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bRegistrarReg)
                        .addGap(36, 36, 36))
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addComponent(txtApellidoReg)
                        .addGap(18, 18, 18)
                        .addComponent(apellidoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(txtEdadReg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edadReg, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)))
                .addGap(43, 43, 43)
                .addComponent(txtPaisReg)
                .addGap(18, 18, 18)
                .addComponent(paisReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(panelRegistrarseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bAtras)
                .addGap(151, 151, 151)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelRegistrarseLayout.setVerticalGroup(
            panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistrarseLayout.createSequentialGroup()
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bAtras))
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)))
                .addGap(42, 42, 42)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistrarseLayout.createSequentialGroup()
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreUsuarioReg)
                            .addComponent(nombreUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombreReg)
                            .addComponent(nombreReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorreoReg)
                            .addComponent(correoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPassReg)
                            .addComponent(passReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bRegistrarReg)
                .addGap(38, 38, 38)
                .addComponent(jLabel9)
                .addGap(34, 34, 34)
                .addGroup(panelRegistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(txtApellidoReg)
                    .addComponent(apellidoReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEdadReg)
                    .addComponent(edadReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPaisReg)
                    .addComponent(paisReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        panelGeneral.add(panelRegistrarse, "card3");

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
    }//GEN-LAST:event_bIniciarSesionActionPerformed

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    /**
     * Al apretar, se abrirâ una ventana que permite iniciar sesiôn a los
     * usuarios privilegiados.
     *
     * @param evt ActionEvent.
     */
    private void bUsuarioPrivilegiadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUsuarioPrivilegiadoActionPerformed
        Mensage.ventana(CodigoMensage.ERR_PRIV_USER, 1);
    }//GEN-LAST:event_bUsuarioPrivilegiadoActionPerformed

    /**
     * Al apretar ENTER en pass.
     *
     * @param evt ActionEvent.
     */
    private void PassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PassActionPerformed

    }//GEN-LAST:event_PassActionPerformed

    private void bRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarseActionPerformed
        panelIniciarSesion.setVisible(false);
        panelRegistrarse.setVisible(true);
    }//GEN-LAST:event_bRegistrarseActionPerformed

    private void bAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAtrasActionPerformed
        panelRegistrarse.setVisible(false);
        panelIniciarSesion.setVisible(true);
    }//GEN-LAST:event_bAtrasActionPerformed

//******************MONSTRAR INFORMACIÓN EN EL CUADRO DE TEXT*****************//
    private void nombreUsuarioRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreUsuarioRegMouseEntered
        txtInformacion.setText("Este será tu nombre\nde usuario.\nAsegúrate que"
                + " este\nnombre sea único.\nLos JFS lo usarán\npara identificarte.");
    }//GEN-LAST:event_nombreUsuarioRegMouseEntered

    private void nombreUsuarioRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreUsuarioRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_nombreUsuarioRegMouseExited

    private void nombreRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreRegMouseEntered
        txtInformacion.setText("Ingresa tu nombre\nreal. Los JFS\nlo usarán para"
                + "\nidentificarte.");
    }//GEN-LAST:event_nombreRegMouseEntered

    private void nombreRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_nombreRegMouseExited

    private void correoRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoRegMouseEntered
        txtInformacion.setText("Por el momento no\nverificamos tu\ncorreo electrónico."
                + "\nLos JFS lo usarán\npara ponerse en\ncontacto contigo\nsi es necesario.");
    }//GEN-LAST:event_correoRegMouseEntered

    private void correoRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_correoRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_correoRegMouseExited

    private void apellidoRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoRegMouseEntered
        txtInformacion.setText("Al agregar tu\napellido, Los JFS\nte podrán"
                + "\nidentificar con\nmás facilidad.");
    }//GEN-LAST:event_apellidoRegMouseEntered

    private void apellidoRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_apellidoRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_apellidoRegMouseExited

    private void edadRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadRegMouseEntered
        txtInformacion.setText("Al agregar tu edad,\nLos JFS adaptarán\nla "
                + "comunicación que\ntendrán contigo.");
    }//GEN-LAST:event_edadRegMouseEntered

    private void edadRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edadRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_edadRegMouseExited

    private void paisRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paisRegMouseEntered
        txtInformacion.setText("Al agregar tu país,\nLos JFS adaptarán\nel "
                + "lenguage popular\nutilizado.");
    }//GEN-LAST:event_paisRegMouseEntered

    private void paisRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paisRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_paisRegMouseExited

//****************************************************************************//
    private void bRegistrarRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistrarRegActionPerformed
        String[] newUser = {
            nombreUsuarioReg.getText(),
            nombreReg.getText(),
            apellidoReg.getText(),
            edadReg.getText(),
            paisReg.getSelectedItem().toString(),
            passReg.getText(),
            correoReg.getText()
        };

        //VERIFICACIÓN DE VALORES SALTANDO LOS QUE PUEDEN SER OMITIDOS//
        for (int i = 0; i < newUser.length; i++) {
            if (newUser[i].equals("") && i != 2 && i != 3 && i != 4) {
                JOptionPane.showMessageDialog(null, "No puedo registrarte.\n"
                        + "Falta valores por rellenar.", "Registrar", 0);
                return;
            }
        }

        try {
            Integer.parseInt(edadReg.getText());//probar si hay un entero
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Creo que la edad debería "
                    + "ser un número...", "Registrar", 0);
            System.out.println("Error: " + e);
            return;
        }
        //************************************************************//

        if (Datos.registerUser(newUser)) {
            JOptionPane.showMessageDialog(null, "¡Te has registrado correctamente!\n",
                    "Registrar", 1);
            iniciar();
        }

    }//GEN-LAST:event_bRegistrarRegActionPerformed

    private void passRegMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passRegMouseEntered
        txtInformacion.setText("No sé para qué\npueda servir\nesta "
                + "información.");
    }//GEN-LAST:event_passRegMouseEntered

    private void passRegMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passRegMouseExited
        txtInformacion.setText("Pasa el puntero\n"
                + "sobre una casilla\n"
                + "para obtener más\n"
                + "información.");
    }//GEN-LAST:event_passRegMouseExited

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
    private javax.swing.JTextField apellidoReg;
    private javax.swing.JButton bAtras;
    private javax.swing.JButton bAyuda;
    private javax.swing.JButton bIniciarSesion;
    private javax.swing.JButton bRegistrarReg;
    private javax.swing.JButton bRegistrarse;
    private javax.swing.JButton bUsuarioPrivilegiado;
    private javax.swing.JTextField correoReg;
    private javax.swing.JTextField edadReg;
    private java.awt.Label imagenJFS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombreReg;
    private javax.swing.JTextField nombreUsuarioReg;
    private javax.swing.JComboBox<String> paisReg;
    private javax.swing.JPanel panelGeneral;
    private javax.swing.JPanel panelIniciarSesion;
    private javax.swing.JPanel panelRegistrarse;
    private javax.swing.JPasswordField passReg;
    private javax.swing.JLabel txtApellidoReg;
    private javax.swing.JLabel txtCorreoReg;
    private javax.swing.JLabel txtEdadReg;
    private javax.swing.JTextArea txtInformacion;
    private javax.swing.JLabel txtNombreReg;
    private javax.swing.JLabel txtNombreUsuarioReg;
    private javax.swing.JLabel txtPaisReg;
    private javax.swing.JLabel txtPass;
    private javax.swing.JLabel txtPassReg;
    private static javax.swing.JLabel txtUltimaVersion;
    private javax.swing.JLabel txtUsuario;
    // End of variables declaration//GEN-END:variables

    /**
     * Propiedades del JFrame inicial.
     */
    private void propiedadesJFrame() {
        ImageIcon img = new ImageIcon(JFSHub.class.getResource("images/icono1.png"));
        setIconImage(img.getImage().getScaledInstance(14, 15, Image.SCALE_DEFAULT));

        setTitle("JFS Hub");
        setLocationRelativeTo(null);
        setResizable(false);

        

        //Panel Registar//
        paisReg.setSelectedIndex(4);
        //**************//
    }

    private void iniciar() {
        JOptionPane.showMessageDialog(null, "¡Bienvenido "
                + Datos.get(DataCode.NOMBRE) + "!", "Inicio de sesión", 1);
        setVisible(false);
        VentanaPrincipal ventana = new VentanaPrincipal();
        Datos.closeConnection();
    }

    private static void getDataDB () {
        try {
            Datos.connectToDataBase();
            txtUltimaVersion.setText("Última versión: " + Datos.checkUpdate());
        } catch (Exception e) {
            txtUltimaVersion.setForeground(Color.red);
            txtUltimaVersion.setText("No se pudo establecer conexión con la base"
                    + " de datos.");
        }
        
    }
}
