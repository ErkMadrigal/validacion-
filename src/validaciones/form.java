package validaciones;

import java.awt.Color;

public class form extends javax.swing.JFrame {

    public static StringBuilder text = new StringBuilder();

    public form() {
        initComponents();
        this.setTitle("Validate");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setBackground(Color.blue);
        lblCurp.setText("");
        lblEmail.setText("");
        lblNombre.setText("");
        lblWeb.setText("");
    }

//    public void Analizar() {
//        String nombre = txtNombre.getText();
//        String email = txtEmail.getText();
//        String curp = txtCurp.getText();
//        String web = txtWeb.getText();
//        
//        int contador = 0;
//        //Validacion del nombre
//        if (nombre.matches("/^[a-z0-9_-]{3,16}$/")) {
//            lblNombre.setForeground(new Color(25, 111, 61));
//
//            lblNombre.setText("Correcto");
//            contador++;
//        } else {
//            lblNombre.setForeground(Color.red);
//            lblNombre.setText("Incorrecto");
//        }
//        //Validacion de Direccion de correo electronico
//        if (email.matches("[A-Z|a-z]([A-Z a-z 0-9](.)?(_)?)*(@)(gmail|outlook|hotmail|yahoo)(.com|.es|.gob)")) {
//            lblEmail.setForeground(new Color(25, 111, 61));
//
//            lblEmail.setText("Correcto");
//            contador++;
//        } else {
//            lblEmail.setForeground(Color.red);
//            lblEmail.setText("Incorrecto");
//        }
//        //Validacion de la CURP ---------------------------------------RIGJ990130HMCSLS07
//        if (curp.matches("[A-Z][A-Z][A-Z][A-Z][0-9][0-9]([0][0-9]|[1][0-2])([0][0-9]|[2][0-9]|"
//                + "[3][0|1])[H|M][A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9]")) {
//            lblCurp.setForeground(new Color(25, 111, 61));
//
//            lblCurp.setText("Correcto");
//            contador++;
//        } else {
//            lblCurp.setForeground(Color.red);
//            lblCurp.setText("Incorrecto");
//        }
//        //Validacion de la direccion URL 
//        if (web.matches("(www.)?([A-Z a-z 0-9]+)[a-z A-Z 0-9]*(.com)")) {
//            lblWeb.setForeground(new Color(25, 111, 61));
//            lblWeb.setText("Correcto");
//            contador++;
//        } else {
//            lblWeb.setForeground(Color.red);
//            lblWeb.setText("Incorrecto");
//        }
//        if (contador == 4) {
//            JOptionPane.showMessageDialog(null, "Datos validados correctamente ;)");
//        }
//
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblCurp = new javax.swing.JLabel();
        lblWeb = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtCurp = new javax.swing.JTextField();
        txtWeb = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("<html> <body> <p color=\"#0099CC\"><b>Ingresa los datos que se te piden para validarlos </b></p>   </body>  </html>");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("<html> <body> <p color=\"#0099CC\"><b>CURP</b></p>   </body>  </html>");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("<html> <body> <p color=\"#0099CC\"><b>URL</b></p>   </body>  </html>");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("<html> <body> <p color=\"#0099CC\"><b>Nombre</b></p>   </body>  </html>");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("<html> <body> <p color=\"#0099CC\"><b>Email</b></p>   </body>  </html>");

        lblNombre.setText("resp");

        lblEmail.setText("resp");

        lblCurp.setText("resp");

        lblWeb.setText("resp");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        txtCurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCurpKeyReleased(evt);
            }
        });

        txtWeb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWebKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed

    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
        System.out.println(txtNombre.getText());
        //Validacion del nombre
        if (txtNombre.getText().matches("[A-Z]([a-z]+|\\\\s[a-z]+)")) {
            lblNombre.setForeground(new Color(25, 111, 61));

            lblNombre.setText("Correcto");
        } else if (" ".equals(txtNombre.getText())) {
            lblNombre.setForeground(Color.red);
            lblNombre.setText("Campo vacio");
        } else {
            lblNombre.setForeground(Color.red);
            lblNombre.setText("Incorrecto");
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        //Validacion de Direccion de correo electronico

        if (txtEmail.getText().matches("^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)+$")) {
            lblEmail.setForeground(new Color(25, 111, 61));

            lblEmail.setText("Correcto");
        } else if (" ".equals(txtEmail.getText())) {
            lblEmail.setForeground(Color.red);
            lblEmail.setText("Campo vacio");
        } else {
            lblEmail.setForeground(Color.red);
            lblEmail.setText("Incorrecto");
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtCurpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCurpKeyReleased
        //Validacion de la CURP ---------------------------------------RIGJ990130HMCSLS07
        if (txtCurp.getText().matches("[A-Z][A-Z][A-Z][A-Z][0-9][0-9]([0][0-9]|[1][0-2])([0][0-9]|[2][0-9]|"
                + "[3][0|1])[H|M][A-Z][A-Z][A-Z][A-Z][A-Z][0-9][0-9]")) {
            lblCurp.setForeground(new Color(25, 111, 61));

            lblCurp.setText("Correcto");

        } else if (" ".equals(txtCurp.getText())) {
            lblCurp.setForeground(Color.red);
            lblCurp.setText("Campo vacio");
        } else {
            lblCurp.setForeground(Color.red);
            lblCurp.setText("Incorrecto");
        }
    }//GEN-LAST:event_txtCurpKeyReleased

    private void txtWebKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWebKeyReleased
        //Validacion de la direccion URL 
        if (txtWeb.getText().matches("(https?:\\/\\/)?([\\da-z\\.-]+)\\.([a-z\\.]{2,6})([\\/\\w \\.-]*)*")) {
            lblWeb.setForeground(new Color(25, 111, 61));
            lblWeb.setText("Correcto");
        } else if (" ".equals(txtWeb.getText())) {
            lblWeb.setForeground(Color.red);
            lblWeb.setText("Campo vacio");
        } else {
            lblWeb.setForeground(Color.red);
            lblWeb.setText("Incorrecto");
        }

    }//GEN-LAST:event_txtWebKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblCurp;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblWeb;
    public static javax.swing.JTextField txtCurp;
    public static javax.swing.JTextField txtEmail;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtWeb;
    // End of variables declaration//GEN-END:variables
}
