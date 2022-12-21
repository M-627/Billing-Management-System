/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

import com.formdev.flatlaf.FlatDarkLaf;
import java.awt.Color;
import javax.swing.UIManager;

/**
 *
 * @author mariam
 */
public class Administrator extends javax.swing.JFrame {

    /**
     * Creates new form Administrator
     */
    public Administrator() {
        initComponents();
    }
    
    private int choose = 1;
    Color blue = Color.decode("#008ABC");
    Color gray = Color.decode("#6A6A6A");

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TrickeyPanel = new javax.swing.JPanel();
        UserName = new javax.swing.JLabel();
        NavBar = new javax.swing.JPanel();
        NavDashboard = new javax.swing.JLabel();
        NavBills = new javax.swing.JLabel();
        NavAccounts = new javax.swing.JLabel();
        NavSettings = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Dashboard = new javax.swing.JPanel();
        NunberOfBills = new javax.swing.JLabel();
        TotalCost = new javax.swing.JLabel();
        BillsNumberCard = new javax.swing.JLabel();
        TotalCostCard = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DashboardTable = new javax.swing.JTable();
        Bills = new javax.swing.JPanel();
        NumberOfBills = new javax.swing.JLabel();
        TotalCostOfBills = new javax.swing.JLabel();
        TotalNumberOfBillsCard = new javax.swing.JLabel();
        TotalCostOfBillsCard = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillsTable = new javax.swing.JTable();
        Acounts = new javax.swing.JPanel();
        Settings = new javax.swing.JPanel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TrickeyPanel.setBackground(new java.awt.Color(0, 176, 239));
        getContentPane().add(TrickeyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 920, 1320, 50));

        UserName.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        UserName.setForeground(new java.awt.Color(17, 43, 60));
        UserName.setText("USER");
        getContentPane().add(UserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 90, 120, 50));

        NavBar.setOpaque(false);
        NavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavDashboard.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NavDashboard.setForeground(new java.awt.Color(0, 138, 188));
        NavDashboard.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NavDashboard.setText("Dashboard");
        NavDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavDashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NavDashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NavDashboardMouseExited(evt);
            }
        });
        NavBar.add(NavDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 170, 40));

        NavBills.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NavBills.setForeground(new java.awt.Color(106, 106, 106));
        NavBills.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NavBills.setText("Bills");
        NavBills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavBillsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NavBillsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NavBillsMouseExited(evt);
            }
        });
        NavBar.add(NavBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 90, 40));

        NavAccounts.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NavAccounts.setForeground(new java.awt.Color(106, 106, 106));
        NavAccounts.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NavAccounts.setText("Accounts");
        NavAccounts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavAccountsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NavAccountsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NavAccountsMouseExited(evt);
            }
        });
        NavBar.add(NavAccounts, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 150, 50));

        NavSettings.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        NavSettings.setForeground(new java.awt.Color(106, 106, 106));
        NavSettings.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        NavSettings.setText("Settings");
        NavSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NavSettingsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NavSettingsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NavSettingsMouseExited(evt);
            }
        });
        NavBar.add(NavSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 140, 50));

        getContentPane().add(NavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 1300, 70));

        jTabbedPane1.setBackground(new java.awt.Color(217, 217, 217));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        jTabbedPane1.setMaximumSize(new java.awt.Dimension(1320, 750));
        jTabbedPane1.setMinimumSize(new java.awt.Dimension(1320, 750));
        jTabbedPane1.setPreferredSize(new java.awt.Dimension(1320, 750));

        Dashboard.setBackground(new java.awt.Color(217, 217, 217));
        Dashboard.setMaximumSize(new java.awt.Dimension(1320, 750));
        Dashboard.setMinimumSize(new java.awt.Dimension(1320, 750));
        Dashboard.setOpaque(false);
        Dashboard.setPreferredSize(new java.awt.Dimension(1320, 750));
        Dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NunberOfBills.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        NunberOfBills.setForeground(new java.awt.Color(51, 255, 51));
        NunberOfBills.setText("NO.");
        Dashboard.add(NunberOfBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 60));

        TotalCost.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        TotalCost.setForeground(new java.awt.Color(51, 255, 51));
        TotalCost.setText("NO.");
        Dashboard.add(TotalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 90, 60));

        BillsNumberCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Number of bills card.png"))); // NOI18N
        Dashboard.add(BillsNumberCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 490, -1));

        TotalCostCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Total cost card.png"))); // NOI18N
        Dashboard.add(TotalCostCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 520, -1));

        DashboardTable.setBackground(new java.awt.Color(51, 51, 55));
        DashboardTable.setForeground(new java.awt.Color(255, 255, 255));
        DashboardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        DashboardTable.setPreferredSize(new java.awt.Dimension(535, 1320));
        DashboardTable.setRowHeight(35);
        DashboardTable.setSelectionBackground(new java.awt.Color(228, 238, 242));
        DashboardTable.setSelectionForeground(new java.awt.Color(51, 51, 55));
        jScrollPane1.setViewportView(DashboardTable);

        Dashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 1230, 350));

        jTabbedPane1.addTab("tab1", Dashboard);

        Bills.setMaximumSize(new java.awt.Dimension(1320, 750));
        Bills.setMinimumSize(new java.awt.Dimension(1320, 750));
        Bills.setOpaque(false);
        Bills.setPreferredSize(new java.awt.Dimension(1320, 750));
        Bills.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NumberOfBills.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        NumberOfBills.setForeground(new java.awt.Color(51, 255, 51));
        NumberOfBills.setText("NO.");
        Bills.add(NumberOfBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 60));

        TotalCostOfBills.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        TotalCostOfBills.setForeground(new java.awt.Color(51, 255, 51));
        TotalCostOfBills.setText("NO.");
        Bills.add(TotalCostOfBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 80, 90, 60));

        TotalNumberOfBillsCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Number of bills card.png"))); // NOI18N
        Bills.add(TotalNumberOfBillsCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 490, -1));

        TotalCostOfBillsCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Total cost card.png"))); // NOI18N
        Bills.add(TotalCostOfBillsCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 10, 520, -1));

        BillsTable.setBackground(new java.awt.Color(51, 51, 55));
        BillsTable.setForeground(new java.awt.Color(255, 255, 255));
        BillsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        BillsTable.setPreferredSize(new java.awt.Dimension(535, 1320));
        BillsTable.setRowHeight(35);
        BillsTable.setSelectionBackground(new java.awt.Color(228, 238, 242));
        BillsTable.setSelectionForeground(new java.awt.Color(51, 51, 55));
        jScrollPane2.setViewportView(BillsTable);

        Bills.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 1230, 350));

        jTabbedPane1.addTab("tab4", Bills);

        Acounts.setMaximumSize(new java.awt.Dimension(1320, 750));
        Acounts.setMinimumSize(new java.awt.Dimension(1320, 750));
        Acounts.setOpaque(false);
        Acounts.setPreferredSize(new java.awt.Dimension(1320, 750));
        jTabbedPane1.addTab("tab5", Acounts);

        Settings.setMaximumSize(new java.awt.Dimension(1320, 750));
        Settings.setMinimumSize(new java.awt.Dimension(1320, 750));
        Settings.setOpaque(false);
        Settings.setPreferredSize(new java.awt.Dimension(1320, 750));
        jTabbedPane1.addTab("tab2", Settings);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Dashboard Customer.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1496, 1032));
        background.setMinimumSize(new java.awt.Dimension(1496, 1032));
        background.setPreferredSize(new java.awt.Dimension(1496, 1032));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NavDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavDashboardMouseClicked
        // TODO add your handling code here:
        choose = 1;
        jTabbedPane1.setSelectedIndex(0);
        NavDashboard.setForeground(blue);
        NavBills.setForeground(gray);
        NavAccounts.setForeground(gray);
        NavSettings.setForeground(gray);
        NavDashboard.setText("Dashboard");
    }//GEN-LAST:event_NavDashboardMouseClicked

    private void NavDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavDashboardMouseEntered
        // TODO add your handling code here:
        if (choose == 1) {
        } else {
            String underline = "<HTML><u>Dashboard</u></HTML>";
            NavDashboard.setText(underline);
        }
    }//GEN-LAST:event_NavDashboardMouseEntered

    private void NavDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavDashboardMouseExited
        // TODO add your handling code here:
        NavDashboard.setText("Dashboard");
    }//GEN-LAST:event_NavDashboardMouseExited

    private void NavBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBillsMouseClicked
        // TODO add your handling code here:
        choose = 2;
        jTabbedPane1.setSelectedIndex(1);
        NavBills.setForeground(blue);
        NavDashboard.setForeground(gray);
        NavAccounts.setForeground(gray);
        NavSettings.setForeground(gray);
        NavBills.setText("Bills");
    }//GEN-LAST:event_NavBillsMouseClicked

    private void NavBillsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBillsMouseEntered
        // TODO add your handling code here:
        if (choose == 2) {
        } else {
            String underline = "<HTML><u>Bills</u></HTML>";
            NavBills.setText(underline);
        }
    }//GEN-LAST:event_NavBillsMouseEntered

    private void NavBillsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBillsMouseExited
        // TODO add your handling code here:
        NavBills.setText("Bills");
    }//GEN-LAST:event_NavBillsMouseExited

    private void NavAccountsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavAccountsMouseClicked
        // TODO add your handling code here:
        choose = 3;
        jTabbedPane1.setSelectedIndex(2);
        NavDashboard.setForeground(gray);
        NavBills.setForeground(gray);
        NavAccounts.setForeground(blue);
        NavSettings.setForeground(gray);
        NavAccounts.setText("Accounts");
    }//GEN-LAST:event_NavAccountsMouseClicked

    private void NavAccountsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavAccountsMouseEntered
        // TODO add your handling code here:
        if (choose == 3) {
        } else {
            String underline = "<HTML><u>Accounts</u></HTML>";
            NavAccounts.setText(underline);

        }
    }//GEN-LAST:event_NavAccountsMouseEntered

    private void NavAccountsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavAccountsMouseExited
        // TODO add your handling code here:
        NavAccounts.setText("Accounts");
    }//GEN-LAST:event_NavAccountsMouseExited

    private void NavSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSettingsMouseClicked
        // TODO add your handling code here:
        choose = 4;

        jTabbedPane1.setSelectedIndex(3);
        NavDashboard.setForeground(gray);
        NavBills.setForeground(gray);
        NavAccounts.setForeground(gray);
        NavSettings.setForeground(blue);
        NavSettings.setText("Settings");
    }//GEN-LAST:event_NavSettingsMouseClicked

    private void NavSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSettingsMouseEntered
        // TODO add your handling code here:
        if (choose == 4) {
        } else {
            String underline = "<HTML><u>Settings</u></HTML>";
            NavSettings.setText(underline);

        }
    }//GEN-LAST:event_NavSettingsMouseEntered

    private void NavSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSettingsMouseExited
        // TODO add your handling code here:
        NavSettings.setText("Settings");
    }//GEN-LAST:event_NavSettingsMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try{
                        UIManager.setLookAndFeel(new FlatDarkLaf());

            }
        catch (Exception ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acounts;
    private javax.swing.JPanel Bills;
    private javax.swing.JLabel BillsNumberCard;
    private javax.swing.JTable BillsTable;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JTable DashboardTable;
    private javax.swing.JLabel NavAccounts;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel NavBills;
    private javax.swing.JLabel NavDashboard;
    private javax.swing.JLabel NavSettings;
    private javax.swing.JLabel NumberOfBills;
    private javax.swing.JLabel NunberOfBills;
    private javax.swing.JPanel Settings;
    private javax.swing.JLabel TotalCost;
    private javax.swing.JLabel TotalCostCard;
    private javax.swing.JLabel TotalCostOfBills;
    private javax.swing.JLabel TotalCostOfBillsCard;
    private javax.swing.JLabel TotalNumberOfBillsCard;
    private javax.swing.JPanel TrickeyPanel;
    private javax.swing.JLabel UserName;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
