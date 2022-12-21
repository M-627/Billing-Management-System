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
public class Bills_info extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public Bills_info() {
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

        Status = new javax.swing.JLabel();
        Account_name = new javax.swing.JLabel();
        Acount_id = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        Total_coast = new javax.swing.JLabel();
        Uploaded_date = new javax.swing.JLabel();
        Bill_id = new javax.swing.JLabel();
        pay_button = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(681, 711));
        setMinimumSize(new java.awt.Dimension(681, 711));
        setPreferredSize(new java.awt.Dimension(681, 711));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Status.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Status.setForeground(new java.awt.Color(0, 138, 188));
        Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 210, 40));

        Account_name.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Account_name.setForeground(new java.awt.Color(0, 138, 188));
        Account_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Account_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 210, 40));

        Acount_id.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Acount_id.setForeground(new java.awt.Color(0, 138, 188));
        Acount_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Acount_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 210, 40));

        Type.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Type.setForeground(new java.awt.Color(0, 138, 188));
        Type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, 40));

        Total_coast.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Total_coast.setForeground(new java.awt.Color(0, 138, 188));
        Total_coast.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Total_coast, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 210, 40));

        Uploaded_date.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Uploaded_date.setForeground(new java.awt.Color(0, 138, 188));
        Uploaded_date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Uploaded_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 210, 40));

        Bill_id.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Bill_id.setForeground(new java.awt.Color(0, 138, 188));
        Bill_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Bill_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 210, 40));
        getContentPane().add(pay_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 110, 50));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/bill info.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Bills_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bills_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bills_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bills_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bills_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Account_name;
    private javax.swing.JLabel Acount_id;
    private javax.swing.JLabel Bill_id;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel Total_coast;
    private javax.swing.JLabel Type;
    private javax.swing.JLabel Uploaded_date;
    private javax.swing.JLabel background;
    private javax.swing.JLabel pay_button;
    // End of variables declaration//GEN-END:variables
}