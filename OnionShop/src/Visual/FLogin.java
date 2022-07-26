
package Visual;

import Logic.Usuario;
import java.awt.Color;
import javax.swing.*;

public class FLogin extends javax.swing.JFrame {

    Usuario usuario = new Usuario();
    private String usu, contra;
    public FLogin() {
        initComponents();
        Imagenes();
    }

    private void Imagenes(){        
        ImageIcon logo = new ImageIcon(getClass().getResource("/Imagenes/LogoMin.jpg"));
        jlLogo.setIcon(new ImageIcon(logo.getImage().getScaledInstance(jlLogo.getWidth(), jlLogo.getHeight(), 4)));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jlLogo = new javax.swing.JLabel();
        jtfUsuario = new javax.swing.JTextField();
        jbLogin = new javax.swing.JButton();
        jl1 = new javax.swing.JLabel();
        jbRegistrarse = new javax.swing.JButton();
        JlUsuario = new javax.swing.JLabel();
        JlContraseña = new javax.swing.JLabel();
        jlError = new javax.swing.JLabel();
        jpfContraseña = new javax.swing.JPasswordField();
        JlIniciar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio de Sesion");
        setBackground(new java.awt.Color(204, 204, 255));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlLogo.setText("jLabel2");
        jlLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLogoMouseClicked(evt);
            }
        });
        jPanel1.add(jlLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 110, 90));

        jtfUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(jtfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 120, -1));

        jbLogin.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbLogin.setText("Iniciar sesion");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        jPanel1.add(jbLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 180, 120, -1));

        jl1.setBackground(new java.awt.Color(204, 204, 255));
        jl1.setOpaque(true);
        jPanel1.add(jl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 130, 280));

        jbRegistrarse.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbRegistrarse.setText("Registrarse");
        jbRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(jbRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 120, -1));

        JlUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JlUsuario.setText("Usuario");
        jPanel1.add(JlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, -1));

        JlContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JlContraseña.setText("Contraseña");
        jPanel1.add(JlContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        jlError.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlError.setForeground(new java.awt.Color(255, 0, 51));
        jlError.setText("  ");
        jPanel1.add(jlError, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 260, -1));

        jpfContraseña.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jpfContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpfContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(jpfContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 120, -1));

        JlIniciar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        JlIniciar.setText("Inicie Sesion para continuar");
        jPanel1.add(JlIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(223, 13, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 40, 30));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 40, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.gridheight = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfUsuarioActionPerformed
       if(jtfUsuario.getText().equals("")){
           jtfUsuario.setBackground(new java.awt.Color(255, 255, 204));
           jlError.setText("*El Campo es Obligatorio*");
           jLabel4.setText("*");
       }else{
           jtfUsuario.setBackground(Color.WHITE);
           jlError.setText("");
           jLabel4.setText("");
           jpfContraseña.requestFocus();
       }
        
    }//GEN-LAST:event_jtfUsuarioActionPerformed

    private void jpfContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpfContraseñaActionPerformed
         if(jpfContraseña.getText().equals("")){
           jpfContraseña.setBackground(new java.awt.Color(255, 255, 204));
           jlError.setText("*El Campo es Obligatorio*");
           jLabel1.setText("*");
       }else{
           jpfContraseña.setBackground(Color.WHITE);
           jlError.setText("");
           jLabel1.setText("");
           jbLogin.requestFocus();
       }
    }//GEN-LAST:event_jpfContraseñaActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        // TODO add your handling code here:
        Inicio inicio = new Inicio();
        usuario.setNombUsuario(jtfUsuario.getText());
        usuario.setContraseña(jpfContraseña.getText());
        if(usuario.Login().equals("")){
            this.setVisible(false);
            inicio.setVisible(true);
            inicio.usuario = this.usuario;
            FVendedor.vendedor = this.usuario;
        }else{
            jlError.setText(usuario.Login());
        }
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarseActionPerformed
        FRegistrarse fr = new FRegistrarse();
        fr.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbRegistrarseActionPerformed

    private void jlLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLogoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jlLogoMouseClicked

    
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
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FLogin().setVisible(true);
            }
        });
    }

    public String getUsu() {
        return usu;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    

    public void returndatos(){
        jtfUsuario.setText(usu);
        jpfContraseña.setText(contra);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlContraseña;
    private javax.swing.JLabel JlIniciar;
    private javax.swing.JLabel JlUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbRegistrarse;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jlError;
    private javax.swing.JLabel jlLogo;
    private javax.swing.JPasswordField jpfContraseña;
    private javax.swing.JTextField jtfUsuario;
    // End of variables declaration//GEN-END:variables
}
