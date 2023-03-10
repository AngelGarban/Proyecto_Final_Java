
package Vista;

import Modelo.RegistroDao;
import Modelo.registro;


public class Registro extends javax.swing.JFrame {
    //Instancia de mi clase registro
    registro r = new registro();
    //Instancia de mi clase RegistroDao
    RegistroDao rDao = new RegistroDao();

    //Constructor de la clase
    public Registro() {
        initComponents();
        //Para centrar la ventana de registro en el centro de la pantalla
        this.setLocationRelativeTo(null);
    }

    //Metodo para registrar un nuevo usuario a la base de datos
    public void RegistrarUsuario() {
        //Se definen las variables que obtienen los datos del formulario
        String nombre = txtNombreRegistro.getText();
        String correo = txtCorreoRegistro.getText();
        String password = String.valueOf(txtPassRegistro.getPassword());

        //Se establecen los valores de las variables privadas del objeto registro a traves de los setters
        r.setNombre(nombre);
        r.setCorreo(correo);
        r.setPassword(password);
        //Se llama al metodo Registrar usuario de la clase RegistroDao
        rDao.RegistrarUsuario(r);                
        //Se cierra el Form de registro
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNombreRegistro = new javax.swing.JLabel();
        txtNombreRegistro = new javax.swing.JTextField();
        lblCorreoRegistro = new javax.swing.JLabel();
        txtCorreoRegistro = new javax.swing.JTextField();
        lblPasswordRegistro = new javax.swing.JLabel();
        txtPassRegistro = new javax.swing.JPasswordField();
        btnGuardarUsuario = new javax.swing.JButton();
        lblTituloRegistro = new javax.swing.JLabel();
        pnlBackgroundRegistro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombreRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblNombreRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblNombreRegistro.setText("Nombre");
        getContentPane().add(lblNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtNombreRegistro.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtNombreRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, -1));

        lblCorreoRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblCorreoRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreoRegistro.setText("Correo");
        getContentPane().add(lblCorreoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtCorreoRegistro.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtCorreoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, -1));

        lblPasswordRegistro.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPasswordRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordRegistro.setText("Contrase??a");
        getContentPane().add(lblPasswordRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        txtPassRegistro.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(txtPassRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, -1));

        btnGuardarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        btnGuardarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        btnGuardarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarUsuario.setText("Registrar Usuario");
        btnGuardarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 140, 40));

        lblTituloRegistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblTituloRegistro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloRegistro.setText("Registrar Usuario Nuevo");
        getContentPane().add(lblTituloRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        pnlBackgroundRegistro.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout pnlBackgroundRegistroLayout = new javax.swing.GroupLayout(pnlBackgroundRegistro);
        pnlBackgroundRegistro.setLayout(pnlBackgroundRegistroLayout);
        pnlBackgroundRegistroLayout.setHorizontalGroup(
            pnlBackgroundRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        pnlBackgroundRegistroLayout.setVerticalGroup(
            pnlBackgroundRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(pnlBackgroundRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Bot??n Registrar Usuario
    private void btnGuardarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarUsuarioActionPerformed
        //Se llama al metodo Registrar Usuario
        RegistrarUsuario();
        
    }//GEN-LAST:event_btnGuardarUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarUsuario;
    private javax.swing.JLabel lblCorreoRegistro;
    private javax.swing.JLabel lblNombreRegistro;
    private javax.swing.JLabel lblPasswordRegistro;
    private javax.swing.JLabel lblTituloRegistro;
    private javax.swing.JPanel pnlBackgroundRegistro;
    private javax.swing.JTextField txtCorreoRegistro;
    private javax.swing.JTextField txtNombreRegistro;
    private javax.swing.JPasswordField txtPassRegistro;
    // End of variables declaration//GEN-END:variables
}
