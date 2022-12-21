/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

/**
 *
 * @author ahmed
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        login = new javax.swing.JPanel();
        LoginButton = new javax.swing.JLabel();
        RegisterNowLabel = new javax.swing.JLabel();
        ForgotPassword = new javax.swing.JLabel();
        LginUsername = new javax.swing.JTextField();
        LoginPassword = new javax.swing.JPasswordField();
        LoginBackground = new javax.swing.JLabel();
        Register = new javax.swing.JPanel();
        BackToLoginButton = new javax.swing.JLabel();
        RegisterUsername = new javax.swing.JTextField();
        RegisterPassword = new javax.swing.JPasswordField();
        RegisterConfirmPassword = new javax.swing.JPasswordField();
        RegisterButtom = new javax.swing.JLabel();
        RefisterBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 630));
        setPreferredSize(new java.awt.Dimension(400, 630));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(217, 217, 217));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(400, 600));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(400, 600));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(400, 650));

        login.setBackground(new java.awt.Color(217, 217, 217));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginButton.setBackground(new java.awt.Color(0, 138, 188));
        LoginButton.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(237, 231, 227));
        LoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoginButton.setText("Login");
        LoginButton.setOpaque(true);
        login.add(LoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, 170, 30));

        RegisterNowLabel.setFont(new java.awt.Font("Segoe UI Semilight", 0, 20)); // NOI18N
        RegisterNowLabel.setForeground(new java.awt.Color(0, 138, 188));
        RegisterNowLabel.setText("Register now");
        RegisterNowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterNowLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RegisterNowLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RegisterNowLabelMouseExited(evt);
            }
        });
        login.add(RegisterNowLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 130, 30));

        ForgotPassword.setFont(new java.awt.Font("Segoe UI Semilight", 0, 16)); // NOI18N
        ForgotPassword.setForeground(new java.awt.Color(106, 106, 106));
        ForgotPassword.setText("Forgot pasword?");
        ForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ForgotPasswordMouseExited(evt);
            }
        });
        login.add(ForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, 120, 30));

        LginUsername.setBackground(new java.awt.Color(217, 217, 217));
        LginUsername.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        LginUsername.setForeground(new java.awt.Color(0, 138, 188));
        LginUsername.setToolTipText("Enter your name");
        LginUsername.setBorder(null);
        LginUsername.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        login.add(LginUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 219, 180, 40));

        LoginPassword.setBackground(new java.awt.Color(217, 217, 217));
        LoginPassword.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        LoginPassword.setForeground(new java.awt.Color(0, 138, 188));
        LoginPassword.setToolTipText("Enter your password");
        LoginPassword.setBorder(null);
        login.add(LoginPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 310, 180, 30));

        LoginBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Login (1).png"))); // NOI18N
        login.add(LoginBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("tab1", login);

        Register.setBackground(new java.awt.Color(217, 217, 217));
        Register.setMaximumSize(new java.awt.Dimension(400, 600));
        Register.setMinimumSize(new java.awt.Dimension(400, 600));
        Register.setPreferredSize(new java.awt.Dimension(400, 600));
        Register.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToLoginButton.setBackground(new java.awt.Color(0, 138, 188));
        BackToLoginButton.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        BackToLoginButton.setForeground(new java.awt.Color(237, 231, 227));
        BackToLoginButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackToLoginButton.setText(" ");
        BackToLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToLoginButtonMouseClicked(evt);
            }
        });
        Register.add(BackToLoginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 70, 30));

        RegisterUsername.setBackground(new java.awt.Color(217, 217, 217));
        RegisterUsername.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        RegisterUsername.setForeground(new java.awt.Color(0, 138, 188));
        RegisterUsername.setToolTipText("Enter your name");
        RegisterUsername.setBorder(null);
        RegisterUsername.setDisabledTextColor(new java.awt.Color(217, 217, 217));
        Register.add(RegisterUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 219, 180, 40));

        RegisterPassword.setBackground(new java.awt.Color(217, 217, 217));
        RegisterPassword.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        RegisterPassword.setForeground(new java.awt.Color(0, 138, 188));
        RegisterPassword.setToolTipText("Enter your password");
        RegisterPassword.setBorder(null);
        Register.add(RegisterPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 320, 180, 30));

        RegisterConfirmPassword.setBackground(new java.awt.Color(217, 217, 217));
        RegisterConfirmPassword.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        RegisterConfirmPassword.setForeground(new java.awt.Color(0, 138, 188));
        RegisterConfirmPassword.setToolTipText("Enter your password");
        RegisterConfirmPassword.setBorder(null);
        Register.add(RegisterConfirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 400, 180, 40));

        RegisterButtom.setBackground(new java.awt.Color(0, 138, 188));
        RegisterButtom.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        RegisterButtom.setForeground(new java.awt.Color(237, 231, 227));
        RegisterButtom.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        RegisterButtom.setText("Register");
        RegisterButtom.setOpaque(true);
        Register.add(RegisterButtom, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 510, 160, 30));

        RefisterBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Register (3).png"))); // NOI18N
        RefisterBackground.setText("jLabel1");
        Register.add(RefisterBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        jTabbedPane1.addTab("tab2", Register);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterNowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterNowLabelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_RegisterNowLabelMouseClicked

    private void BackToLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToLoginButtonMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);

    }//GEN-LAST:event_BackToLoginButtonMouseClicked

    private void ForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseEntered
        // TODO add your handling code here:
        String underline="<HTML><u>Forgot pasword?</u></HTML>";
        ForgotPassword.setText(underline);
    }//GEN-LAST:event_ForgotPasswordMouseEntered

    private void ForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordMouseExited
        // TODO add your handling code here:
        ForgotPassword.setText("Forgot pasword?");
    }//GEN-LAST:event_ForgotPasswordMouseExited

    private void RegisterNowLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterNowLabelMouseEntered
        // TODO add your handling code here:
        String underline="<HTML><u>Register now</u></HTML>";
        RegisterNowLabel.setText(underline);
    }//GEN-LAST:event_RegisterNowLabelMouseEntered

    private void RegisterNowLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterNowLabelMouseExited
        // TODO add your handling code here:
        RegisterNowLabel.setText("Register now");
    }//GEN-LAST:event_RegisterNowLabelMouseExited

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackToLoginButton;
    private javax.swing.JLabel ForgotPassword;
    private javax.swing.JTextField LginUsername;
    private javax.swing.JLabel LoginBackground;
    private javax.swing.JLabel LoginButton;
    private javax.swing.JPasswordField LoginPassword;
    private javax.swing.JLabel RefisterBackground;
    private javax.swing.JPanel Register;
    private javax.swing.JLabel RegisterButtom;
    private javax.swing.JPasswordField RegisterConfirmPassword;
    private javax.swing.JLabel RegisterNowLabel;
    private javax.swing.JPasswordField RegisterPassword;
    private javax.swing.JTextField RegisterUsername;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel login;
    // End of variables declaration//GEN-END:variables
}
