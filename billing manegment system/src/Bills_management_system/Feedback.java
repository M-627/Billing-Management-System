/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author mariam
 */
public class Feedback extends javax.swing.JFrame {

    /**
     * Creates new form Feedback
     */
    
    // COUNTER
    int counter = 0;
    Color Blue = Color.decode("#008ABC");
    Color BabyBlue =Color.decode("#E4EEF2");
    
    
    public Feedback() {
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

        l1 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        System = new javax.swing.JLabel();
        Background2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 700));
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        l1.setBackground(new java.awt.Color(228, 238, 242));
        l1.setForeground(new java.awt.Color(0, 138, 188));
        l1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 138, 188)));
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
        });
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 40, 50));

        l6.setBackground(new java.awt.Color(228, 238, 242));
        l6.setForeground(new java.awt.Color(0, 138, 188));
        l6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 138, 188)));
        l6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l6MouseExited(evt);
            }
        });
        getContentPane().add(l6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 40, 50));

        l2.setBackground(new java.awt.Color(228, 238, 242));
        l2.setForeground(new java.awt.Color(0, 138, 188));
        l2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 138, 188)));
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
        });
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 40, 50));

        l3.setBackground(new java.awt.Color(228, 238, 242));
        l3.setForeground(new java.awt.Color(0, 138, 188));
        l3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 138, 188)));
        l3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l3MouseExited(evt);
            }
        });
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 40, 50));

        l4.setBackground(new java.awt.Color(228, 238, 242));
        l4.setForeground(new java.awt.Color(0, 138, 188));
        l4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 138, 188)));
        l4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l4MouseExited(evt);
            }
        });
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, 40, 50));

        l5.setBackground(new java.awt.Color(228, 238, 242));
        l5.setForeground(new java.awt.Color(0, 138, 188));
        l5.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 138, 188)));
        l5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l5MouseExited(evt);
            }
        });
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, 40, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 138, 188));
        jLabel1.setText("6");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 10, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 138, 188));
        jLabel2.setText("1");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 10, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 138, 188));
        jLabel6.setText("5");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 20, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 138, 188));
        jLabel4.setText("3");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 138, 188));
        jLabel3.setText("2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 10, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 138, 188));
        jLabel5.setText("4");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 10, -1));

        System.setBackground(new java.awt.Color(207, 222, 231));
        System.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        System.setForeground(new java.awt.Color(0, 138, 188));
        System.setText("Help us to improve ourself by rating the application:");
        getContentPane().add(System, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        Background2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Feedback.png"))); // NOI18N
        getContentPane().add(Background2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
        l1.setBackground(Blue);
    }//GEN-LAST:event_l1MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
         l1.setBackground(BabyBlue);
    }//GEN-LAST:event_l1MouseExited

    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
        l1.setBackground(Blue);
        l2.setBackground(Blue);
    }//GEN-LAST:event_l2MouseEntered

    private void l3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseEntered
        l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
    }//GEN-LAST:event_l3MouseEntered

    private void l4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseEntered
        l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
        l4.setBackground(Blue);
    }//GEN-LAST:event_l4MouseEntered

    private void l5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseEntered
        l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
        l4.setBackground(Blue);
        l5.setBackground(Blue);
    }//GEN-LAST:event_l5MouseEntered

    private void l6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseEntered
        l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
        l4.setBackground(Blue);
        l5.setBackground(Blue);
        l6.setBackground(Blue);
    }//GEN-LAST:event_l6MouseEntered

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
        l2.setBackground(BabyBlue);
    }//GEN-LAST:event_l2MouseExited

    private void l3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseExited
        l3.setBackground(BabyBlue);
    }//GEN-LAST:event_l3MouseExited

    private void l4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseExited
       l4.setBackground(BabyBlue);
    }//GEN-LAST:event_l4MouseExited

    private void l5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseExited
        l5.setBackground(BabyBlue);
    }//GEN-LAST:event_l5MouseExited

    private void l6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseExited
        l6.setBackground(BabyBlue);
    }//GEN-LAST:event_l6MouseExited

    private void l1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseClicked
        l1.setBackground(Blue);

        counter = 1;
        

        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
    }//GEN-LAST:event_l1MouseClicked

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
        l1.setBackground(Blue);
        l2.setBackground(Blue);

        counter = 2;
        

        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
    }//GEN-LAST:event_l2MouseClicked

    private void l3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l3MouseClicked
        l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);

        counter = 3;
        

        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
    }//GEN-LAST:event_l3MouseClicked

    private void l4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l4MouseClicked
         l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
        l4.setBackground(Blue);

        counter = 4;
        

        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
    }//GEN-LAST:event_l4MouseClicked

    private void l5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l5MouseClicked
         l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
        l4.setBackground(Blue);
        l5.setBackground(Blue);

        counter = 5;
        

        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
    }//GEN-LAST:event_l5MouseClicked

    private void l6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l6MouseClicked
         l1.setBackground(Blue);
        l2.setBackground(Blue);
        l3.setBackground(Blue);
        l4.setBackground(Blue);
        l5.setBackground(Blue);
        l6.setBackground(Blue);

        counter = 6;
        

        JOptionPane.showMessageDialog(this, "Thank you for your rating");
        this.dispose();
    }//GEN-LAST:event_l6MouseClicked

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
                new Feedback().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background2;
    private javax.swing.JLabel System;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    // End of variables declaration//GEN-END:variables
}
