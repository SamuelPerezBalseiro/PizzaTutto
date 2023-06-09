package vista;

import controlador.*;
import javax.swing.JOptionPane;

/**
 * Clase que representa la ventana de ingreso, donde el usuario (cliente o empleado)
 * ingresa sus datos para validarlos y acceder al sistema
 * @author M. Celeste Cancio Vitale
 */
public class VentanaIngreso extends javax.swing.JFrame {

    ControladorUsuarioEmpleado controladorUsuarioEmpleado = new ControladorUsuarioEmpleado(this);
    ControladorUsuarioCliente controladorUsuarioCliente = new ControladorUsuarioCliente(this);
    
    String nombre="";
    
    /**
     * Constructor de la clase
     */
    public VentanaIngreso() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRotulo = new javax.swing.JPanel();
        lblIngresaDatos = new javax.swing.JLabel();
        lblCazuela1 = new javax.swing.JLabel();
        panelContenedorIngresos = new javax.swing.JPanel();
        panelIngresoCliente = new javax.swing.JPanel();
        lblCliente = new javax.swing.JLabel();
        lblUsuarioCliente = new javax.swing.JLabel();
        txtUsuarioCliente = new javax.swing.JTextField();
        lblContrasenaCliente = new javax.swing.JLabel();
        txtContrasenaCliente = new javax.swing.JPasswordField();
        btnIngresarCliente = new javax.swing.JButton();
        panelIngresoEmpleado = new javax.swing.JPanel();
        lblEmpleado = new javax.swing.JLabel();
        lblUsuarioEmpleado = new javax.swing.JLabel();
        txtUsuarioEmpleado = new javax.swing.JTextField();
        lblContrasenaEmpleado = new javax.swing.JLabel();
        txtContrasenaEmpleado = new javax.swing.JPasswordField();
        btnIngresarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 500));
        setResizable(false);

        panelRotulo.setBackground(new java.awt.Color(102, 204, 0));
        panelRotulo.setMaximumSize(new java.awt.Dimension(500, 100));
        panelRotulo.setMinimumSize(new java.awt.Dimension(500, 100));
        panelRotulo.setPreferredSize(new java.awt.Dimension(500, 100));
        panelRotulo.setLayout(new java.awt.GridBagLayout());

        lblIngresaDatos.setFont(new java.awt.Font("Sylfaen", 1, 24)); // NOI18N
        lblIngresaDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIngresaDatos.setText("Iniciar sesión");
        lblIngresaDatos.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblIngresaDatos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblIngresaDatos.setMaximumSize(new java.awt.Dimension(250, 33));
        lblIngresaDatos.setMinimumSize(new java.awt.Dimension(250, 33));
        lblIngresaDatos.setPreferredSize(new java.awt.Dimension(250, 33));
        panelRotulo.add(lblIngresaDatos, new java.awt.GridBagConstraints());

        lblCazuela1.setFont(new java.awt.Font("Sylfaen", 1, 36)); // NOI18N
        lblCazuela1.setForeground(new java.awt.Color(204, 51, 0));
        lblCazuela1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCazuela1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Cazuela 60.png"))); // NOI18N
        lblCazuela1.setText("Pizza Tutto");
        lblCazuela1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblCazuela1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        lblCazuela1.setMaximumSize(new java.awt.Dimension(250, 120));
        lblCazuela1.setMinimumSize(new java.awt.Dimension(250, 120));
        lblCazuela1.setPreferredSize(new java.awt.Dimension(250, 120));
        lblCazuela1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelRotulo.add(lblCazuela1, new java.awt.GridBagConstraints());

        getContentPane().add(panelRotulo, java.awt.BorderLayout.PAGE_START);

        panelContenedorIngresos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelContenedorIngresos.setMaximumSize(new java.awt.Dimension(500, 400));
        panelContenedorIngresos.setMinimumSize(new java.awt.Dimension(500, 400));
        panelContenedorIngresos.setPreferredSize(new java.awt.Dimension(500, 400));
        panelContenedorIngresos.setLayout(new java.awt.GridLayout(1, 0));

        panelIngresoCliente.setBackground(new java.awt.Color(102, 204, 0));
        panelIngresoCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelIngresoCliente.setMaximumSize(new java.awt.Dimension(250, 300));
        panelIngresoCliente.setMinimumSize(new java.awt.Dimension(250, 300));
        panelIngresoCliente.setPreferredSize(new java.awt.Dimension(250, 300));
        panelIngresoCliente.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        lblCliente.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCliente.setText("CLIENTE");
        lblCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblCliente.setMaximumSize(new java.awt.Dimension(140, 24));
        lblCliente.setMinimumSize(new java.awt.Dimension(140, 24));
        lblCliente.setPreferredSize(new java.awt.Dimension(140, 24));
        panelIngresoCliente.add(lblCliente);

        lblUsuarioCliente.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        lblUsuarioCliente.setText("Usuario:");
        lblUsuarioCliente.setMaximumSize(new java.awt.Dimension(150, 20));
        lblUsuarioCliente.setMinimumSize(new java.awt.Dimension(150, 20));
        lblUsuarioCliente.setPreferredSize(new java.awt.Dimension(150, 20));
        panelIngresoCliente.add(lblUsuarioCliente);

        txtUsuarioCliente.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtUsuarioCliente.setMargin(new java.awt.Insets(4, 4, 4, 4));
        txtUsuarioCliente.setMaximumSize(new java.awt.Dimension(170, 25));
        txtUsuarioCliente.setMinimumSize(new java.awt.Dimension(170, 25));
        txtUsuarioCliente.setPreferredSize(new java.awt.Dimension(170, 25));
        panelIngresoCliente.add(txtUsuarioCliente);

        lblContrasenaCliente.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        lblContrasenaCliente.setText("Contraseña:");
        lblContrasenaCliente.setMaximumSize(new java.awt.Dimension(150, 20));
        lblContrasenaCliente.setMinimumSize(new java.awt.Dimension(150, 20));
        lblContrasenaCliente.setPreferredSize(new java.awt.Dimension(150, 20));
        panelIngresoCliente.add(lblContrasenaCliente);

        txtContrasenaCliente.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtContrasenaCliente.setMargin(new java.awt.Insets(4, 4, 4, 4));
        txtContrasenaCliente.setMaximumSize(new java.awt.Dimension(170, 25));
        txtContrasenaCliente.setMinimumSize(new java.awt.Dimension(170, 25));
        txtContrasenaCliente.setPreferredSize(new java.awt.Dimension(170, 25));
        panelIngresoCliente.add(txtContrasenaCliente);

        btnIngresarCliente.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        btnIngresarCliente.setText("ACEPTAR");
        btnIngresarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarClienteActionPerformed(evt);
            }
        });
        panelIngresoCliente.add(btnIngresarCliente);

        panelContenedorIngresos.add(panelIngresoCliente);

        panelIngresoEmpleado.setBackground(new java.awt.Color(102, 204, 0));
        panelIngresoEmpleado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelIngresoEmpleado.setMaximumSize(new java.awt.Dimension(250, 300));
        panelIngresoEmpleado.setMinimumSize(new java.awt.Dimension(250, 300));
        panelIngresoEmpleado.setPreferredSize(new java.awt.Dimension(250, 300));
        panelIngresoEmpleado.setRequestFocusEnabled(false);
        panelIngresoEmpleado.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 15));

        lblEmpleado.setFont(new java.awt.Font("Sylfaen", 1, 18)); // NOI18N
        lblEmpleado.setText("EMPLEADO/A");
        lblEmpleado.setMaximumSize(new java.awt.Dimension(140, 24));
        lblEmpleado.setMinimumSize(new java.awt.Dimension(140, 24));
        lblEmpleado.setPreferredSize(new java.awt.Dimension(140, 24));
        panelIngresoEmpleado.add(lblEmpleado);

        lblUsuarioEmpleado.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        lblUsuarioEmpleado.setText("Usuario:");
        lblUsuarioEmpleado.setMaximumSize(new java.awt.Dimension(150, 20));
        lblUsuarioEmpleado.setMinimumSize(new java.awt.Dimension(150, 20));
        lblUsuarioEmpleado.setPreferredSize(new java.awt.Dimension(150, 20));
        panelIngresoEmpleado.add(lblUsuarioEmpleado);

        txtUsuarioEmpleado.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtUsuarioEmpleado.setMargin(new java.awt.Insets(4, 4, 4, 4));
        txtUsuarioEmpleado.setMaximumSize(new java.awt.Dimension(170, 25));
        txtUsuarioEmpleado.setMinimumSize(new java.awt.Dimension(170, 25));
        txtUsuarioEmpleado.setPreferredSize(new java.awt.Dimension(170, 25));
        txtUsuarioEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioEmpleadoActionPerformed(evt);
            }
        });
        panelIngresoEmpleado.add(txtUsuarioEmpleado);

        lblContrasenaEmpleado.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        lblContrasenaEmpleado.setText("Contraseña:");
        lblContrasenaEmpleado.setMaximumSize(new java.awt.Dimension(150, 20));
        lblContrasenaEmpleado.setMinimumSize(new java.awt.Dimension(150, 20));
        lblContrasenaEmpleado.setPreferredSize(new java.awt.Dimension(150, 20));
        panelIngresoEmpleado.add(lblContrasenaEmpleado);

        txtContrasenaEmpleado.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        txtContrasenaEmpleado.setMargin(new java.awt.Insets(4, 4, 4, 4));
        txtContrasenaEmpleado.setMaximumSize(new java.awt.Dimension(170, 25));
        txtContrasenaEmpleado.setMinimumSize(new java.awt.Dimension(170, 25));
        txtContrasenaEmpleado.setPreferredSize(new java.awt.Dimension(170, 25));
        panelIngresoEmpleado.add(txtContrasenaEmpleado);

        btnIngresarEmpleado.setFont(new java.awt.Font("Sylfaen", 1, 12)); // NOI18N
        btnIngresarEmpleado.setText("ACEPTAR");
        btnIngresarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarEmpleadoActionPerformed(evt);
            }
        });
        panelIngresoEmpleado.add(btnIngresarEmpleado);

        panelContenedorIngresos.add(panelIngresoEmpleado);

        getContentPane().add(panelContenedorIngresos, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * Método asociado al evento del botón de ingreso de cliente
     * @see #controladorUsuarioCliente.actionPerformed(ActionEvent)
     * @param evt ActionEvent
     */
    private void btnIngresarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarClienteActionPerformed
        controladorUsuarioCliente.actionPerformed(evt);
    }//GEN-LAST:event_btnIngresarClienteActionPerformed

    private void btnIngresarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarEmpleadoActionPerformed
        controladorUsuarioEmpleado.actionPerformed(evt);
    }//GEN-LAST:event_btnIngresarEmpleadoActionPerformed

    private void txtUsuarioEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioEmpleadoActionPerformed

    
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
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaIngreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaIngreso().setVisible(true);//Esto lo pongo en Principal
                new VentanaIngreso();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnIngresarCliente;
    public javax.swing.JButton btnIngresarEmpleado;
    private javax.swing.JLabel lblCazuela1;
    private javax.swing.JLabel lblCliente;
    public javax.swing.JLabel lblContrasenaCliente;
    private javax.swing.JLabel lblContrasenaEmpleado;
    private javax.swing.JLabel lblEmpleado;
    private javax.swing.JLabel lblIngresaDatos;
    public javax.swing.JLabel lblUsuarioCliente;
    public javax.swing.JLabel lblUsuarioEmpleado;
    private javax.swing.JPanel panelContenedorIngresos;
    private javax.swing.JPanel panelIngresoCliente;
    public javax.swing.JPanel panelIngresoEmpleado;
    private javax.swing.JPanel panelRotulo;
    public javax.swing.JPasswordField txtContrasenaCliente;
    public javax.swing.JPasswordField txtContrasenaEmpleado;
    public javax.swing.JTextField txtUsuarioCliente;
    public javax.swing.JTextField txtUsuarioEmpleado;
    // End of variables declaration//GEN-END:variables
}
