/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.UIManager;

/**
 *
 * @author ahmed
 */
public class BillsInfoAdmin extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public BillsInfoAdmin() {
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

        BillId = new javax.swing.JLabel();
        UploadedDate = new javax.swing.JLabel();
        TotalCost = new javax.swing.JLabel();
        Type = new javax.swing.JLabel();
        AccountId = new javax.swing.JLabel();
        AccountName = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        DoneButton = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(681, 681));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BillId.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        BillId.setForeground(new java.awt.Color(0, 138, 188));
        BillId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(BillId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, 210, 40));

        UploadedDate.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        UploadedDate.setForeground(new java.awt.Color(0, 138, 188));
        UploadedDate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(UploadedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 210, 40));

        TotalCost.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        TotalCost.setForeground(new java.awt.Color(0, 138, 188));
        TotalCost.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(TotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 210, 40));

        Type.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Type.setForeground(new java.awt.Color(0, 138, 188));
        Type.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Type, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 210, 40));

        AccountId.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        AccountId.setForeground(new java.awt.Color(0, 138, 188));
        AccountId.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(AccountId, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, 210, 40));

        AccountName.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        AccountName.setForeground(new java.awt.Color(0, 138, 188));
        AccountName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(AccountName, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, 210, 40));

        Status.setFont(new java.awt.Font("Dialog", 0, 20)); // NOI18N
        Status.setForeground(new java.awt.Color(0, 138, 188));
        Status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, 210, 40));

        DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtonMouseClicked(evt);
            }
        });
        getContentPane().add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 560, 110, 50));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Bills/bill info.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked
        
        this.dispose();
    }//GEN-LAST:event_DoneButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try
        {
            UIManager.setLookAndFeel(new FlatLightLaf());

        }
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillsInfoAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AccountId;
    private javax.swing.JLabel AccountName;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel BillId;
    private javax.swing.JLabel DoneButton;
    private javax.swing.JLabel Status;
    private javax.swing.JLabel TotalCost;
    private javax.swing.JLabel Type;
    private javax.swing.JLabel UploadedDate;
    // End of variables declaration//GEN-END:variables
}
