/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bills_management_system;

import com.formdev.flatlaf.*;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

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
    
    //Current user - Prepare in controller
    private int usrid = CurrentUser.usrid;
    
    public void showPieChart() {
    }    
    
    
    // Colors  global variables
    private int Choose = 1;
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
        NavSettings = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Dashboard = new javax.swing.JPanel();
        NunberOfComplaints = new javax.swing.JLabel();
        ComplaintsNumberCard = new javax.swing.JLabel();
        TotalSolvedComplaints = new javax.swing.JLabel();
        TotalSolvedComplaintsCard = new javax.swing.JLabel();
        SearchTextField = new javax.swing.JTextField();
        Search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DashboardTable = new javax.swing.JTable();
        panelBarChart = new javax.swing.JPanel();
        Archieve = new javax.swing.JLabel();
        ArchievedComplaints = new javax.swing.JPanel();
        ArchieveSearchTextField = new javax.swing.JTextField();
        ArchieveSearch = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ComplaintsTable = new javax.swing.JTable();
        Bills = new javax.swing.JPanel();
        CustomerIdTextField = new javax.swing.JTextField();
        UploadedDate = new com.toedter.calendar.JDateChooser();
        TotalCostTextField = new javax.swing.JTextField();
        SearchBillsTextField = new javax.swing.JTextField();
        CustomerIdLabl = new javax.swing.JLabel();
        UplodedDateLabel = new javax.swing.JLabel();
        UnpaidRadioButton = new javax.swing.JRadioButton();
        TotalCostLabel = new javax.swing.JLabel();
        SearchLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        BillsTable = new javax.swing.JTable();
        Settings = new javax.swing.JPanel();
        ProfileInfo = new javax.swing.JLabel();
        LogOut = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        NewPasswordTextField = new javax.swing.JTextField();
        NewPasswordLabel = new javax.swing.JLabel();
        DoneButton = new javax.swing.JLabel();
        Profile = new javax.swing.JPanel();
        FirstName = new javax.swing.JTextField();
        MiddleName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        UserNameAdmin = new javax.swing.JTextField();
        PasswordAdmin = new javax.swing.JTextField();
        EMail = new javax.swing.JTextField();
        CompanyID = new javax.swing.JTextField();
        CompanyName = new javax.swing.JTextField();
        CompantType = new javax.swing.JTextField();
        SaveButton = new javax.swing.JLabel();
        InformationBackground = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1440, 1024));
        setMinimumSize(new java.awt.Dimension(1440, 1024));
        setPreferredSize(new java.awt.Dimension(1440, 1024));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TrickeyPanel.setBackground(new java.awt.Color(0, 176, 239));
        getContentPane().add(TrickeyPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 940, 1320, 50));

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
        NavBar.add(NavDashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, 40));

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
        NavBar.add(NavBills, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 50, -1));

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
        NavBar.add(NavSettings, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 140, 50));

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

        NunberOfComplaints.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        NunberOfComplaints.setForeground(new java.awt.Color(51, 255, 51));
        NunberOfComplaints.setText("NO.");
        Dashboard.add(NunberOfComplaints, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 100, 60));

        ComplaintsNumberCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Dashboard/Number of complaints.png"))); // NOI18N
        Dashboard.add(ComplaintsNumberCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 490, -1));

        TotalSolvedComplaints.setFont(new java.awt.Font("Dialog", 1, 26)); // NOI18N
        TotalSolvedComplaints.setForeground(new java.awt.Color(51, 255, 51));
        TotalSolvedComplaints.setText("NO.");
        Dashboard.add(TotalSolvedComplaints, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 90, 60));

        TotalSolvedComplaintsCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Dashboard/solved complaints.png"))); // NOI18N
        Dashboard.add(TotalSolvedComplaintsCard, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 520, -1));

        SearchTextField.setBackground(new java.awt.Color(255, 255, 255));
        SearchTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SearchTextField.setForeground(new java.awt.Color(0, 138, 188));
        SearchTextField.setBorder(null);
        Dashboard.add(SearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 210, 400, 40));

        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Dashboard/Search.png"))); // NOI18N
        Dashboard.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, -1, -1));

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

        Dashboard.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 1220, 300));

        panelBarChart.setBackground(new java.awt.Color(50, 50, 50));
        panelBarChart.setForeground(new java.awt.Color(217, 217, 217));
        panelBarChart.setPreferredSize(new java.awt.Dimension(540, 346));
        panelBarChart.setLayout(new java.awt.BorderLayout());
        Dashboard.add(panelBarChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 270, 200));

        Archieve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Dashboard/Archieve.png"))); // NOI18N
        Archieve.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ArchieveMouseClicked(evt);
            }
        });
        Dashboard.add(Archieve, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 630, -1, -1));

        jTabbedPane1.addTab("tab1", Dashboard);

        ArchievedComplaints.setMaximumSize(new java.awt.Dimension(1320, 750));
        ArchievedComplaints.setMinimumSize(new java.awt.Dimension(1320, 750));
        ArchievedComplaints.setOpaque(false);
        ArchievedComplaints.setPreferredSize(new java.awt.Dimension(1320, 750));
        ArchievedComplaints.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ArchieveSearchTextField.setBackground(new java.awt.Color(255, 255, 255));
        ArchieveSearchTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        ArchieveSearchTextField.setForeground(new java.awt.Color(0, 138, 188));
        ArchieveSearchTextField.setBorder(null);
        ArchievedComplaints.add(ArchieveSearchTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 40, 400, 40));

        ArchieveSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Dashboard/Search.png"))); // NOI18N
        ArchievedComplaints.add(ArchieveSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, -1, -1));

        ComplaintsTable.setBackground(new java.awt.Color(51, 51, 55));
        ComplaintsTable.setForeground(new java.awt.Color(255, 255, 255));
        ComplaintsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ComplaintsTable.setPreferredSize(new java.awt.Dimension(535, 1320));
        ComplaintsTable.setRowHeight(35);
        ComplaintsTable.setSelectionBackground(new java.awt.Color(228, 238, 242));
        ComplaintsTable.setSelectionForeground(new java.awt.Color(51, 51, 55));
        jScrollPane3.setViewportView(ComplaintsTable);

        ArchievedComplaints.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 1220, 300));

        jTabbedPane1.addTab("tab2", ArchievedComplaints);

        Bills.setMaximumSize(new java.awt.Dimension(1320, 750));
        Bills.setMinimumSize(new java.awt.Dimension(1320, 750));
        Bills.setOpaque(false);
        Bills.setPreferredSize(new java.awt.Dimension(1320, 750));
        Bills.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CustomerIdTextField.setBackground(new java.awt.Color(255, 255, 255));
        CustomerIdTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CustomerIdTextField.setForeground(new java.awt.Color(0, 138, 188));
        CustomerIdTextField.setBorder(null);
        Bills.add(CustomerIdTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 750, 40));

        UploadedDate.setBackground(new java.awt.Color(255, 255, 255));
        UploadedDate.setForeground(new java.awt.Color(0, 138, 188));
        Bills.add(UploadedDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 290, 50));

        TotalCostTextField.setBackground(new java.awt.Color(255, 255, 255));
        TotalCostTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        TotalCostTextField.setForeground(new java.awt.Color(0, 138, 188));
        TotalCostTextField.setBorder(null);
        Bills.add(TotalCostTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 120, 210, 40));

        SearchBillsTextField.setBackground(new java.awt.Color(255, 255, 255));
        SearchBillsTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        SearchBillsTextField.setForeground(new java.awt.Color(0, 138, 188));
        SearchBillsTextField.setBorder(null);
        SearchBillsTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBillsTextFieldActionPerformed(evt);
            }
        });
        Bills.add(SearchBillsTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 790, 40));

        CustomerIdLabl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Bills/Id.png"))); // NOI18N
        Bills.add(CustomerIdLabl, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        UplodedDateLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Bills/Date.png"))); // NOI18N
        Bills.add(UplodedDateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        UnpaidRadioButton.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        UnpaidRadioButton.setForeground(new java.awt.Color(106, 106, 106));
        UnpaidRadioButton.setText("Unpaid");
        UnpaidRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnpaidRadioButtonActionPerformed(evt);
            }
        });
        Bills.add(UnpaidRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, 120, 40));

        TotalCostLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Bills/Cost.png"))); // NOI18N
        Bills.add(TotalCostLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        SearchLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Bills/search.png"))); // NOI18N
        Bills.add(SearchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, -1, -1));

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

        Settings.setMaximumSize(new java.awt.Dimension(1320, 750));
        Settings.setMinimumSize(new java.awt.Dimension(1320, 750));
        Settings.setOpaque(false);
        Settings.setPreferredSize(new java.awt.Dimension(1320, 750));
        Settings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ProfileInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/Profile info.png"))); // NOI18N
        ProfileInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileInfoMouseClicked(evt);
            }
        });
        Settings.add(ProfileInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/Logout.png"))); // NOI18N
        LogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogOutMouseClicked(evt);
            }
        });
        Settings.add(LogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 90, -1, -1));

        Password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/Password.png"))); // NOI18N
        Password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PasswordMouseClicked(evt);
            }
        });
        Settings.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        NewPasswordTextField.setBackground(new java.awt.Color(255, 255, 255));
        NewPasswordTextField.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        NewPasswordTextField.setForeground(new java.awt.Color(0, 138, 188));
        NewPasswordTextField.setBorder(null);
        Settings.add(NewPasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 560, 620, 40));

        NewPasswordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/NewPassword.png"))); // NOI18N
        Settings.add(NewPasswordLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        DoneButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/Done.png"))); // NOI18N
        DoneButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneButtonMouseClicked(evt);
            }
        });
        Settings.add(DoneButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 560, -1, -1));

        jTabbedPane1.addTab("tab2", Settings);

        Profile.setMaximumSize(new java.awt.Dimension(1320, 750));
        Profile.setMinimumSize(new java.awt.Dimension(1320, 750));
        Profile.setOpaque(false);
        Profile.setPreferredSize(new java.awt.Dimension(1320, 750));
        Profile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FirstName.setBackground(new java.awt.Color(255, 255, 255));
        FirstName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        FirstName.setForeground(new java.awt.Color(0, 138, 188));
        FirstName.setBorder(null);
        Profile.add(FirstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 260, 40));

        MiddleName.setBackground(new java.awt.Color(255, 255, 255));
        MiddleName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        MiddleName.setForeground(new java.awt.Color(0, 138, 188));
        MiddleName.setBorder(null);
        MiddleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiddleNameActionPerformed(evt);
            }
        });
        Profile.add(MiddleName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 260, 30));

        LastName.setBackground(new java.awt.Color(255, 255, 255));
        LastName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LastName.setForeground(new java.awt.Color(0, 138, 188));
        LastName.setBorder(null);
        Profile.add(LastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 260, 40));

        UserNameAdmin.setBackground(new java.awt.Color(255, 255, 255));
        UserNameAdmin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        UserNameAdmin.setForeground(new java.awt.Color(0, 138, 188));
        UserNameAdmin.setBorder(null);
        Profile.add(UserNameAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, 260, 40));

        PasswordAdmin.setBackground(new java.awt.Color(255, 255, 255));
        PasswordAdmin.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        PasswordAdmin.setForeground(new java.awt.Color(0, 138, 188));
        PasswordAdmin.setBorder(null);
        Profile.add(PasswordAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 260, 30));

        EMail.setBackground(new java.awt.Color(255, 255, 255));
        EMail.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        EMail.setForeground(new java.awt.Color(0, 138, 188));
        EMail.setBorder(null);
        Profile.add(EMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 490, 600, 40));

        CompanyID.setBackground(new java.awt.Color(255, 255, 255));
        CompanyID.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CompanyID.setForeground(new java.awt.Color(0, 138, 188));
        CompanyID.setBorder(null);
        Profile.add(CompanyID, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 260, 30));

        CompanyName.setBackground(new java.awt.Color(255, 255, 255));
        CompanyName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CompanyName.setForeground(new java.awt.Color(0, 138, 188));
        CompanyName.setBorder(null);
        Profile.add(CompanyName, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 310, 260, 30));

        CompantType.setBackground(new java.awt.Color(255, 255, 255));
        CompantType.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        CompantType.setForeground(new java.awt.Color(0, 138, 188));
        CompantType.setBorder(null);
        Profile.add(CompantType, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 240, 260, 30));

        SaveButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/Save.png"))); // NOI18N
        SaveButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SaveButtonMouseClicked(evt);
            }
        });
        Profile.add(SaveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 580, -1, -1));

        InformationBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Settings/Information.png"))); // NOI18N
        Profile.add(InformationBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jTabbedPane1.addTab("tab2", Profile);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, 770));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/figma_design/Admin/Dashboard/Dashboard Admin.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(1496, 1032));
        background.setMinimumSize(new java.awt.Dimension(1496, 1032));
        background.setPreferredSize(new java.awt.Dimension(1496, 1032));
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 1500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NavDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavDashboardMouseClicked
        // TODO add your handling code here:
        Choose = 1;
        jTabbedPane1.setSelectedIndex(0);
        NavDashboard.setForeground(blue);
        NavBills.setForeground(gray);
        NavSettings.setForeground(gray);
        NavDashboard.setText("Dashboard");
    }//GEN-LAST:event_NavDashboardMouseClicked

    private void NavDashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavDashboardMouseEntered

        if (Choose == 1) {
        } else {
            String underline = "<HTML><u>Dashboard</u></HTML>";
            NavDashboard.setText(underline);
        }
    }//GEN-LAST:event_NavDashboardMouseEntered

    private void NavDashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavDashboardMouseExited

        NavDashboard.setText("Dashboard");
    }//GEN-LAST:event_NavDashboardMouseExited

    private void NavBillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBillsMouseClicked

        Choose = 2;
        jTabbedPane1.setSelectedIndex(2);
        NavBills.setForeground(blue);
        NavDashboard.setForeground(gray);
        NavSettings.setForeground(gray);
        NavBills.setText("Bills");
    }//GEN-LAST:event_NavBillsMouseClicked

    private void NavBillsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBillsMouseEntered

        if (Choose == 2) {
        } else {
            String underline = "<HTML><u>Bills</u></HTML>";
            NavBills.setText(underline);
        }
    }//GEN-LAST:event_NavBillsMouseEntered

    private void NavBillsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavBillsMouseExited

        NavBills.setText("Bills");
    }//GEN-LAST:event_NavBillsMouseExited

    private void NavSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSettingsMouseClicked

        Choose = 3;

        jTabbedPane1.setSelectedIndex(3);
        NavDashboard.setForeground(gray);
        NavBills.setForeground(gray);
        NavSettings.setForeground(blue);
        NavSettings.setText("Settings");
        NewPasswordLabel.setVisible(false);
        NewPasswordTextField.setVisible(false);
        DoneButton.setVisible(false);
    }//GEN-LAST:event_NavSettingsMouseClicked

    private void NavSettingsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSettingsMouseEntered

        if (Choose == 3) {
        } else {
            String underline = "<HTML><u>Settings</u></HTML>";
            NavSettings.setText(underline);

        }
    }//GEN-LAST:event_NavSettingsMouseEntered

    private void NavSettingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NavSettingsMouseExited

        NavSettings.setText("Settings");
    }//GEN-LAST:event_NavSettingsMouseExited

    private void ArchieveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ArchieveMouseClicked

             jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_ArchieveMouseClicked

    private void SearchBillsTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBillsTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SearchBillsTextFieldActionPerformed

    private void UnpaidRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnpaidRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnpaidRadioButtonActionPerformed

    private void LogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogOutMouseClicked
        
        this.dispose();
        Login Frame = new Login();
        Frame.setVisible(true);
    }//GEN-LAST:event_LogOutMouseClicked

    private void PasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PasswordMouseClicked
        
        NewPasswordLabel.setVisible(true);
        NewPasswordTextField.setVisible(true);
        DoneButton.setVisible(true);
    }//GEN-LAST:event_PasswordMouseClicked

    private void DoneButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneButtonMouseClicked
        
        NewPasswordLabel.setVisible(false);
        NewPasswordTextField.setVisible(false);
        DoneButton.setVisible(false);
    }//GEN-LAST:event_DoneButtonMouseClicked

    private void ProfileInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileInfoMouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_ProfileInfoMouseClicked

    private void MiddleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiddleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MiddleNameActionPerformed

    private void SaveButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaveButtonMouseClicked
        
         jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_SaveButtonMouseClicked

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
                new Administrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Archieve;
    private javax.swing.JLabel ArchieveSearch;
    private javax.swing.JTextField ArchieveSearchTextField;
    private javax.swing.JPanel ArchievedComplaints;
    private javax.swing.JPanel Bills;
    private javax.swing.JTable BillsTable;
    private javax.swing.JTextField CompantType;
    private javax.swing.JTextField CompanyID;
    private javax.swing.JTextField CompanyName;
    private javax.swing.JLabel ComplaintsNumberCard;
    private javax.swing.JTable ComplaintsTable;
    private javax.swing.JLabel CustomerIdLabl;
    private javax.swing.JTextField CustomerIdTextField;
    private javax.swing.JPanel Dashboard;
    private javax.swing.JTable DashboardTable;
    private javax.swing.JLabel DoneButton;
    private javax.swing.JTextField EMail;
    private javax.swing.JTextField FirstName;
    private javax.swing.JLabel InformationBackground;
    private javax.swing.JTextField LastName;
    private javax.swing.JLabel LogOut;
    private javax.swing.JTextField MiddleName;
    private javax.swing.JPanel NavBar;
    private javax.swing.JLabel NavBills;
    private javax.swing.JLabel NavDashboard;
    private javax.swing.JLabel NavSettings;
    private javax.swing.JLabel NewPasswordLabel;
    private javax.swing.JTextField NewPasswordTextField;
    private javax.swing.JLabel NunberOfComplaints;
    private javax.swing.JLabel Password;
    private javax.swing.JTextField PasswordAdmin;
    private javax.swing.JPanel Profile;
    private javax.swing.JLabel ProfileInfo;
    private javax.swing.JLabel SaveButton;
    private javax.swing.JLabel Search;
    private javax.swing.JTextField SearchBillsTextField;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.JTextField SearchTextField;
    private javax.swing.JPanel Settings;
    private javax.swing.JLabel TotalCostLabel;
    private javax.swing.JTextField TotalCostTextField;
    private javax.swing.JLabel TotalSolvedComplaints;
    private javax.swing.JLabel TotalSolvedComplaintsCard;
    private javax.swing.JPanel TrickeyPanel;
    private javax.swing.JRadioButton UnpaidRadioButton;
    private com.toedter.calendar.JDateChooser UploadedDate;
    private javax.swing.JLabel UplodedDateLabel;
    private javax.swing.JLabel UserName;
    private javax.swing.JTextField UserNameAdmin;
    private javax.swing.JLabel background;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panelBarChart;
    // End of variables declaration//GEN-END:variables
}
