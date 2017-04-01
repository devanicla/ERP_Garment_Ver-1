
package StyleManagement;

import MainSystem.AutoDB_Connect;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
/**
 *
 * @author Dinushka
 */
public class Design_Cost_Estimate extends javax.swing.JInternalFrame {





    /**
     * Creates new form SalesDesignInquiry
     */
    public Design_Cost_Estimate() {
        
        initComponents();
        TableLoad();
        TableLoad2();
        datePicker1.setDateToToday();
        FillTextCombo();
        AccessoryIDFillCombo();
        AutoFill();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Other = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldQuantatiy = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextFieldColour = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Acc = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldCost = new javax.swing.JTextField();
        jTextFieldFinalCost = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        AccNumber = new javax.swing.JComboBox<>();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel15 = new javax.swing.JLabel();
        Styleid = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton24 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel18 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("BILL_OF_MATERIAL FORM");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 204, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("BILLING INFORMATION FOR FINISHED DESIGN ITEM");
        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 390, -1));

        jLabel28.setText("Lace");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(1354, 34, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel8.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1333, 180, 179, -1));
        jPanel8.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(1333, 207, 179, -1));
        jPanel8.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1333, 266, 126, -1));

        jButton5.setText("OK");
        jPanel8.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1465, 265, -1, -1));

        jButton15.setText("ADD");
        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        jButton16.setText("Reset");
        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 450, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "StyleId", "StyleDes", "Accessories", "Quantity", "Colour", "Cost", "Final Cost"
            }
        ));
        jTable2.setColumnSelectionAllowed(true);
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel8.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 800, 150));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Add  Row");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 23, 110, 30));

        jLabel5.setText("Accessories");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 64, -1));

        jLabel6.setText("Quantity");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 100, -1, -1));

        jTextFieldQuantatiy.setToolTipText("Add Quantity");
        jPanel6.add(jTextFieldQuantatiy, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 100, 30));

        jButton3.setText("Delete Row");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 73, 110, 30));

        jButton9.setText("Clear");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 110, 30));

        jTextFieldColour.setToolTipText("Add Colour");
        jPanel6.add(jTextFieldColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 100, 30));

        jLabel17.setText("Colour");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

        Acc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", " " }));
        Acc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(Acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 100, 30));

        jLabel2.setText("Cost");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 180, -1, -1));

        jLabel3.setText("Final Cost");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 64, -1));

        jTextFieldCost.setToolTipText("Auto fill cost");
        jTextFieldCost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCostActionPerformed(evt);
            }
        });
        jPanel6.add(jTextFieldCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, 100, 30));

        jTextFieldFinalCost.setToolTipText("Auto calculate");
        jPanel6.add(jTextFieldFinalCost, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 100, 30));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Number", "Accessories", "Quantity", "Colour", "Cost", "Final Cost"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable3MousePressed(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        jPanel6.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 17, 437, 208));

        jLabel12.setText("Number");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Update");
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 110, 30));

        AccNumber.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        AccNumber.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(AccNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 100, 30));

        jButton17.setText("DEMO");
        jButton17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 110, 30));

        jPanel8.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 890, 270));

        jButton18.setText("Print");
        jButton18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel8.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 450, -1, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("Date");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        datePicker1.setEnabled(false);
        datePicker1.setToolTipText("Enter the Date");
        jPanel7.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 179, -1));

        jLabel15.setText("Style ID");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        Styleid.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Styleid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StyleidMouseClicked(evt);
            }
        });
        Styleid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StyleidActionPerformed(evt);
            }
        });
        jPanel7.add(Styleid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 179, -1));

        jLabel4.setText("Number");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel7.setText("Accessories");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel8.setText("FinalCost");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel9.setText("Quantity");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel10.setText("Colour");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel16.setText("Cost");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 180, 30));
        jPanel7.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 180, 30));
        jPanel7.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 180, 30));
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 180, 30));
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 180, 30));
        jPanel7.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 180, 30));

        jPanel8.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 330, 410));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 36, 1260, 490));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1320, 540));

        jTabbedPane1.addTab("ADD Bill", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setText("View Detail");
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 12, -1, -1));

        jLabel31.setText("Style ID");
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jButton24.setText("Print");
        jButton24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(873, 379, -1, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "StyleId", "StyleDes", "Accessories", "Quantity", "Colour", "Cost", "Final Cost"
            }
        ));
        jScrollPane5.setViewportView(jTable4);
        jTable4.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jPanel5.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(391, 83, 806, 195));

        jLabel14.setText("Date");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 72, -1, -1));

        datePicker2.setEnabled(false);
        jPanel5.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 70, 179, -1));

        jLabel18.setText("Style ID");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 111, -1, -1));
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 108, 179, -1));

        jLabel19.setText("Style Description");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 156, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane6.setViewportView(jTextArea2);

        jPanel5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 182, 179, -1));

        jLabel11.setText("Accessories");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 292, 69, -1));
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 289, 178, -1));

        jLabel20.setText("Quantity");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 344, -1, -1));
        jPanel5.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 341, 178, -1));

        jLabel21.setText("Colour");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 383, -1, -1));
        jPanel5.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 380, 178, -1));

        jLabel22.setText("Cost");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 29, -1, -1));
        jPanel5.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 26, 179, -1));

        jLabel23.setText("Final Cost");
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(662, 29, 80, 20));

        jButton4.setText("ViewAll");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 170, 30));
        jPanel5.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(752, 26, 179, -1));

        jButton1.setText("Update");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 379, -1, -1));

        jButton23.setText("Delete");
        jButton23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 71, -1));

        jButton11.setText("Reset");
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel5.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton19.setText("Demo");
        jPanel5.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 380, -1, -1));

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, 1232, 430));

        jPanel3.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1290, 510));

        jTabbedPane1.addTab("Search & Update || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StyleidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StyleidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StyleidActionPerformed

    private void StyleidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StyleidMouseClicked

       
    }//GEN-LAST:event_StyleidMouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:

        AddDesignCost();
        TableLoad();
        TextBoxClear();
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        
        if(SwingUtilities.isRightMouseButton(evt))
        {
            
        int row =jTable3.getSelectedRow();
        String Num=jTable3.getValueAt(row,0).toString();
        String Accessories = jTable3.getValueAt(row,2).toString();
        String Quantity  = jTable3.getValueAt(row,3).toString();
        String colour = jTable3.getValueAt(row,4).toString();
        String cost = jTable3.getValueAt(row,5).toString();
        String finalcost = jTable3.getValueAt(row,6).toString();

        AccNumber.addItem(Num);
        Acc.addItem(Accessories);
        jTextFieldFinalCost.setText(finalcost);
        jTextFieldColour.setText(colour);
        jTextFieldCost.setText(cost);
        jTextFieldQuantatiy.setText(Quantity);
        
        }
        else if(SwingUtilities.isLeftMouseButton(evt))
        {
            int row =jTable3.getSelectedRow();
            String Num=jTable3.getValueAt(row,0).toString();
            String Accessories = jTable3.getValueAt(row,2).toString();
            String Quantity  = jTable3.getValueAt(row,3).toString();
            String colour = jTable3.getValueAt(row,4).toString();
            String cost = jTable3.getValueAt(row,5).toString();
            String finalcost = jTable3.getValueAt(row,6).toString();
            
            jTextField3.setText(Num);
            jTextField4.setText(Accessories);
            jTextField5.setText(Quantity);
            jTextField6.setText(colour);
            jTextField7.setText(cost);
            jTextField2.setText(finalcost);
        
        
        }
        
       
    }//GEN-LAST:event_jTable3MouseClicked

    private void AccessoryIDFillCombo()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`Accessory_Table`");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String id = AutoDB_Connect.DB_ResultSet.getString("accessory_id");
                AccNumber.addItem(id);
                
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    
    private void AutoFill()
    {
        String id = Acc.getSelectedItem().toString();
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`Accessory_Table` "
                + "where accessory_id like '"+id+"'");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
           String cost = AutoDB_Connect.DB_ResultSet.getString("accessory_cost");
           String type = AutoDB_Connect.DB_ResultSet.getString("accessory_type");
                Acc.setSelectedItem(type);
                jTextFieldCost.setText(cost);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

    TextBoxClearacc();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        DeleteBilling();
        TableLoad2();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        AddRowDesignCost();
        TableLoad2();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        TextBoxClear();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jTable3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTable3MousePressed

    private void jTextFieldCostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCostActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldCostActionPerformed
    
    
       
    
    
      public void AddDesignCost()
    
    {
        
        String Number=AccNumber.getSelectedItem().toString();
        String id = Styleid.getSelectedItem().toString();
        String acc = Acc.getSelectedItem().toString();
        String Qty=jTextFieldQuantatiy.getText();
        String Color=jTextFieldColour.getText();
        String cost=jTextFieldCost.getText();
        String FinalCost=jTextFieldFinalCost.getText();
        String date = datePicker1.getText();
        
        if(Number.isEmpty()||id.isEmpty()||acc.isEmpty()||Qty.
        isEmpty()||Color.isEmpty()||cost.isEmpty()||date.isEmpty()
       ||FinalCost.isEmpty()){
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        
        }
        
        
                else{
                    
                 try
                    {
        
        
         boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem"
                 + "`.`T_Bill_Of_Material`\n" +
"(`Number`,\n" +
"`StyleID`,\n" +
"`Accesories`,\n" +
"`Quantity`,\n" +
"`Colour`,\n" +
"`Cost`,\n" +
"`Final_Cost`,\n" +
"`Date`)\n" +
"VALUES\n" +
"('"+Number+"',\n" +
"'"+id+"',\n" +
"'"+acc+"',\n" +
"'"+Qty+"',\n" +
"'"+Color+"',\n" +
"'"+cost+"',\n" +
"'"+FinalCost+"',\n" +
"'"+date+"');");

        
      
       
            if(x==true)
            {
                JOptionPane.showMessageDialog(null,"Successfully Added"
                        + " to the Bill of Material");
                
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
                }
        
    }
      
    

    private void TableLoad()
    {

             AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`T_Bill_Of_Material`");
            jTable2.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

    }
    
    private void TableLoad2()
    {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`T_Billing_Add_Designs`");
            jTable3.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

    }
   
    private void TextBoxClear(){
            Styleid.setSelectedIndex(0);
            datePicker1.setText("");
            
        
    }
    
     private void TextBoxClearacc(){
            AccNumber.setSelectedIndex(0);
            Acc.setSelectedIndex(0);
            jTextFieldColour.setText("");
            jTextFieldQuantatiy.setText("");
            jTextFieldCost.setText("");
            jTextFieldFinalCost.setText("");
            Styleid.setSelectedIndex(0);
            datePicker1.setText("");
            
        
    }
    
    private void FillTextCombo()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`T_Design_table`");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String id = AutoDB_Connect.DB_ResultSet.getString("StyleId");
                Styleid.addItem(id);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
        
        
    }
    
       private void FillAcceCombo()
    {
        String id = Acc.getSelectedItem().toString();
        String acc= Acc.getSelectedItem().toString();
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`Accessory_Table` "
                + "where accessory_id like '"+id+"'");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                AutoDB_Connect.DB_ResultSet.getString("accessory_id");
                Styleid.addItem(acc);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
        
        
    }
    
    
     public void AddRowDesignCost()
    
    {
        
        String Num = AccNumber.getSelectedItem().toString();
        String stid =Styleid.getSelectedItem().toString();
        String acc = Acc.getSelectedItem().toString();
        String Qty=jTextFieldQuantatiy.getText();
        String Color=jTextFieldColour.getText();
        String Cost=jTextFieldCost.getText();
        String Final_Cost =jTextFieldFinalCost.getText();
        
        
        
        
        
        
        boolean  x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`T_Billing_Add_Designs`\n" +
"(`Number`,\n" +
"`StyleID`,\n" +
"`Accesories`,\n" +
"`Quantity`,\n" +
"`Colour`,\n" +
"`Cost`,\n" +
"`Final_Cost`)\n" +
"VALUES\n" +
"('"+Num+"',\n" +
"'"+stid+"',\n" +
"'"+acc+"',\n" +
"'"+Qty+"',\n" +
"'"+Color+"',\n" +
"'"+Cost+"',\n" +
"'"+Final_Cost+"');");
        
        try
        {
            if(x==true)
            {
                JOptionPane.showMessageDialog(null,"Successfully Added");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
      
    }
     private void DeleteBilling()
    {
        String Num =AccNumber.getSelectedItem().toString();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`T_Design_table`\n" +
"WHERE StyleId = '"+Num+"';");
        
        try
        {
            if (x==true)
            {
                TableLoad2();
                JOptionPane.showConfirmDialog(null,"Are you sure?");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }
     

    
        
    
    
    
        
     
   
        
    
   
    

    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Acc;
    private javax.swing.JComboBox<String> AccNumber;
    private javax.swing.ButtonGroup Other;
    private javax.swing.JComboBox<String> Styleid;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldColour;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldFinalCost;
    private javax.swing.JTextField jTextFieldQuantatiy;
    // End of variables declaration//GEN-END:variables
}
