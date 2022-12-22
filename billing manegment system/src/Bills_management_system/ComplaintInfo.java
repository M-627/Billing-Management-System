/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

/**
 *
 * @author mariam
 */
public class ComplaintInfo extends javax.swing.JFrame {

    /**
     * Creates new form ComplaintInfo
     */
    public ComplaintInfo() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Panel = new javax.swing.JPanel();
        ComplaintId = new javax.swing.JLabel();
        ComplaintName = new javax.swing.JLabel();
        CompanyType = new javax.swing.JLabel();
        AccountId = new javax.swing.JLabel();
        AccountName = new javax.swing.JLabel();
        Solved = new javax.swing.JRadioButton();
        Unsolved = new javax.swing.JRadioButton();
        ComplaintReason = new javax.swing.JLabel();
        DoneButton = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(681, 681));
        setMinimumSize(new java.awt.Dimension(681, 681));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(681, 681));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel.setBackground(new java.awt.Color(255, 255, 255));
        Panel.setMaximumSize(new java.awt.Dimension(681, 681));
        Panel.setMinimumSize(new java.awt.Dimension(681, 681));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ComplaintId.setBackground(new java.awt.Color(255, 255, 255));
        ComplaintId.setForeground(new java.awt.Color(0, 176, 239));
        getContentPane().add(ComplaintId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 190, 40));

        ComplaintName.setBackground(new java.awt.Color(255, 255, 255));
        ComplaintName.setForeground(new java.awt.Color(0, 176, 239));
        getContentPane().add(ComplaintName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 190, 50));

        CompanyType.setBackground(new java.awt.Color(255, 255, 255));
        CompanyType.setForeground(new java.awt.Color(0, 176, 239));
        getContentPane().add(CompanyType, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 190, 40));

        AccountId.setBackground(new java.awt.Color(255, 255, 255));
        AccountId.setForeground(new java.awt.Color(0, 176, 239));
        getContentPane().add(AccountId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 190, 40));

        AccountName.setBackground(new java.awt.Color(255, 255, 255));
        AccountName.setForeground(new java.awt.Color(0, 176, 239));
        getContentPane().add(AccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 190, 40));

        Solved.setBackground(new java.awt.Color(228, 238, 242));
        buttonGroup1.add(Solved);
        Solved.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Solved.setForeground(new java.awt.Color(106, 106, 106));
        Solved.setText("Solved");
        getContentPane().add(Solved, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, -1, -1));

        Unsolved.setBackground(new java.awt.Color(228, 238, 242));
        buttonGroup1.add(Unsolved);
        Unsolved.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Unsolved.setForeground(new java.awt.Color(106, 106, 106));
        Unsolved.setText("Unsolved");
        Unsolved.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnsolvedActionPerformed(evt);
            }
        });
        getContentPane().add(Unsolved, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 430, -1, -1));

        ComplaintReason.setBackground(new java.awt.Color(255, 255, 255));
        ComplaintReason.setForeground(new java.awt.Color(0, 176, 239));
        getContentPane().add(ComplaintReason, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 280, 90));

        DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 100, 50));

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Complaints Info.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UnsolvedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnsolvedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnsolvedActionPerformed

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_DoneButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ComplaintInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplaintInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplaintInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplaintInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComplaintInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountId;
    private javax.swing.JLabel AccountName;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel CompanyType;
    private javax.swing.JLabel ComplaintId;
    private javax.swing.JLabel ComplaintName;
    private javax.swing.JLabel ComplaintReason;
    private javax.swing.JLabel DoneButton;
    private javax.swing.JPanel Panel;
    private javax.swing.JRadioButton Solved;
    private javax.swing.JRadioButton Unsolved;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
