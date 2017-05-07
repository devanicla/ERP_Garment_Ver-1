package Maintance;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePickerSettings;
import static java.awt.Event.INSERT;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.JTextField;

public class JobInspectingAndEstimation extends javax.swing.JInternalFrame {

    public JobInspectingAndEstimation() {
        initComponents();
        TableLoad1();
        TextBoxClear1();
        TableLoad2();
        TextBoxClear2();
        datePicker2.setDateToToday();
        datePicker3.setDateToToday();
        generate_Machine_ID();
        //generate_Technician_ID();
        FillTextCombo1();
        FillTextCombo3();
       
        
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
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldMachineID = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButtonADDCustomer = new javax.swing.JButton();
        jButtonResetAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldTechnicianName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jButtonDemo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jTextFieldDescription1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        DatePickerSettings dateSettings3 = new DatePickerSettings();
        dateSettings3.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings3.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings3);
        jLabel20 = new javax.swing.JLabel();
        jTextFieldMchinePart1 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldTechnicianID1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldTechnicianName1 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButtonADD1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSearchCustomerId = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jTextFieldDepartment1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Job Inspecting And Estimation ");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldMachineID.setEditable(false);
        jTextFieldMachineID.setName("Customer ID"); // NOI18N
        jTextFieldMachineID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMachineIDActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMachineID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));
        jTextFieldMachineID.getAccessibleContext().setAccessibleName("");

        jTextFieldDescription.setName("Customer Name"); // NOI18N
        jPanel2.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));
        jTextFieldDescription.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Machine ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel3.setText("Description");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setText("Date");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jButtonADDCustomer.setText("ADD ");
        jButtonADDCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADDCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDCustomerActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADDCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, -1, -1));

        jButtonResetAll.setText("Reset All");
        jButtonResetAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jLabel4.setText("Department");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jLabel5.setText("Machine Part");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setText("Technician ID");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel12.setText("Technician Name");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldTechnicianName.setName("Address"); // NOI18N
        jPanel2.add(jTextFieldTechnicianName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));
        jTextFieldTechnicianName.getAccessibleContext().setAccessibleName("");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Inventory", "Maintenance", "Finance" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 130, -1));

        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 120, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TechnicianID" }));
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 140, -1));

        jButtonDemo.setText("Demo");
        jButtonDemo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonDemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDemoActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonDemo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 510, 520));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 470, 300));

        jTabbedPane1.addTab("ADD ", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDescription1.setName("Customer Name"); // NOI18N
        jPanel6.add(jTextFieldDescription1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel11.setText("Description");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel14.setText("Date");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        datePicker3.setDoubleBuffered(false);
        datePicker3.setName("dateSettings");
        jPanel6.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, -1, -1));

        jLabel20.setText("Machine Part");
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextFieldMchinePart1.setName("Phone number"); // NOI18N
        jPanel6.add(jTextFieldMchinePart1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jLabel21.setText("Technician ID");
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldTechnicianID1.setName("Email"); // NOI18N
        jPanel6.add(jTextFieldTechnicianID1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));

        jLabel22.setText("Technician Name");
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldTechnicianName1.setName("Address"); // NOI18N
        jPanel6.add(jTextFieldTechnicianName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

        jButton4.setText("Edit");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, -1, -1));

        jButtonADD1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonADD1.setText("Delete");
        jButtonADD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADD1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButtonADD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, -1, -1));

        jLabel9.setText("Machine ID");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        jPanel6.add(jTextFieldSearchCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jButton1.setText("Print Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 30, 510, 520));

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Reset");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jButton9.setText("View All");
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, -1, -1));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanelcustomerSearch.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel19.setText("Department");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jTextFieldDepartment1.setName("Company name"); // NOI18N
        jPanelcustomerSearch.add(jTextFieldDepartment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 110, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 580, 510));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonADDCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDCustomerActionPerformed
        JobInspectionAdd();
        TableLoad1();
        generate_Machine_ID();
       // generate_Technician_ID();
        FillTextCombo1();
        FillTextCombo3();
       
    }//GEN-LAST:event_jButtonADDCustomerActionPerformed

    private void jTextFieldMachineIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMachineIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMachineIDActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed
        TextBoxClear1();
    }//GEN-LAST:event_jButtonResetAllActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        TextBoxClear2();

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       MachSearch();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      TableLoad2();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        EditJobInspection();
        TableLoad2();

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButtonADD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADD1ActionPerformed
        DeleteJobInspection();
        TextBoxClear2();
    }//GEN-LAST:event_jButtonADD1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        String m_id = jTable1.getValueAt(row, 0).toString();
        String description = jTable1.getValueAt(row, 1).toString();
        String dep = jTable1.getValueAt(row, 2).toString();
        String m_pa = jTable1.getValueAt(row, 3).toString();
        String t_id = jTable1.getValueAt(row, 4).toString();
        String t_name = jTable1.getValueAt(row, 5).toString();
        String date = jTable1.getValueAt(row, 6).toString();

        jTextFieldMachineID.setText(m_id);
        jTextFieldDescription.setText(description);
        jComboBox1.setSelectedItem(dep);
        jComboBox2.setSelectedItem(m_pa);
        jComboBox3.getSelectedItem().toString();
        jTextFieldTechnicianName.setText(t_name);
        datePicker3.setText(date);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        int row = jTable3.getSelectedRow();
        String m_id = jTable3.getValueAt(row, 0).toString();
        String description = jTable3.getValueAt(row, 1).toString();
        String dep = jTable3.getValueAt(row, 2).toString();
        String m_pa = jTable3.getValueAt(row, 3).toString();
        String t_id = jTable3.getValueAt(row, 4).toString();
        String t_name = jTable3.getValueAt(row, 5).toString();
        String date = jTable3.getValueAt(row, 6).toString();

        jTextFieldSearchCustomerId.setText(m_id);
        jTextFieldDescription1.setText(description);
        jTextFieldDepartment1.setText(dep);
        jTextFieldMchinePart1.setText(m_pa);
        jTextFieldTechnicianID1.setText(t_id);
        jTextFieldTechnicianName1.setText(t_name);
        datePicker3.setText(date);
    }//GEN-LAST:event_jTable3MouseClicked

    private void jButtonDemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDemoActionPerformed
       jTextFieldDescription.setText("Good");
       jComboBox1.setSelectedItem("Finance");
       jComboBox3.setSelectedItem("7");
       jTextFieldTechnicianName.setText("Kamal");
  
        

    }//GEN-LAST:event_jButtonDemoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generate_Machine_ID() {
        AutoIdGenerator m_id = new AutoIdGenerator();
        jTextFieldMachineID.setText(m_id.generate("ACC", Integer.toString(MainWindow.userid)));
    }

    //private void generate_Technician_ID() {
        //AutoIdGenerator t_id = new AutoIdGenerator();
      //  jComboBox3.setSelected(t_id.generate("ACC", Integer.toString(MainWindow.userid)));
    //}

    private void TableLoad1() {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`JobIspection_Estimation`");

        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

    }

    private void TableLoad2() {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`JobIspection_Estimation`");

        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

    }

    public void JobInspectionAdd() {

        String m_id = jTextFieldMachineID.getText();
        String description = jTextFieldDescription.getText();
        String dep = jComboBox1.getSelectedItem().toString();
        String m_pa = jComboBox2.getSelectedItem().toString();
        String t_id = jComboBox3.getSelectedItem().toString();
        String t_name = jTextFieldTechnicianName.getText();
        String date = datePicker3.getText();

        
          if(m_id.isEmpty()||t_name.isEmpty()||date.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"FIELDS ARE EMPTY");
    
    }else{
        
        boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`JobIspection_Estimation` \n"
                + "(`MachineID`,\n"
                + "`Description`,\n"
                + "`Department`,\n"
                + "`MachinePart`,\n"
                + "`TechnianID`,\n"
                + "`TechnicianName`,"
                + "`Date`) values \n"
                + "('" + m_id + "',\n"
                + "'" + description + "',\n"
                + "'" + dep + "',\n"
                + "'" + m_pa + "',\n"
                + "'" + t_id + "',\n"
                + "'" + t_name + "',\n"
                + "'" + date + "');");

        try {
            if (x == true) {
                TableLoad1();
                TextBoxClear1();
                JOptionPane.showMessageDialog(null, "Susseccfuly Added");

            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
    }
    
    
    
    private void DeleteJobInspection() {
        String m_id = jTextFieldSearchCustomerId.getText();
        
                if(m_id.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"FIELDS ARE EMPTY");
    
    }else{

        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`JobIspection_Estimation`\n"
                + "WHERE MachineID LIKE '" + m_id + "';");

        try {
            if (x == true) {
                TextBoxClear2();
                TableLoad2();
                JOptionPane.showMessageDialog(null, "Susseccfuly Deleted");
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    }
      public void MachSearch() {
        {
            String dep = jTextFieldDepartment1.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.JobIspection_Estimation WHERE Department = '" + dep + "'");
            jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        }

    }

    public void EditJobInspection() {

        String m_id = jTextFieldSearchCustomerId.getText();
        String description = jTextFieldDescription1.getText();
        String dep = jTextFieldDepartment1.getText();
        String m_pa = jTextFieldMchinePart1.getText();
        String t_id = jTextFieldTechnicianID1.getText();
        String t_name = jTextFieldTechnicianName1.getText();
        String date = datePicker3.getText();
                
             if(m_id.isEmpty()||description.isEmpty()||dep.isEmpty()||m_pa.isEmpty()||t_id.isEmpty()||t_name.isEmpty()||date.isEmpty()){
            
            JOptionPane.showMessageDialog(null,"FIELDS ARE EMPTY");
    
    }else{
         
        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`JobIspection_Estimation`\n"
                + "SET \n"
                + "`Description` = '" + description + "',\n"
                + "`Department` = '" + dep + "',\n"
                + "`MachinePart` = '" + m_pa + "',\n"
                + "`TechnianID` = '" + t_id + "',\n"
                + "`TechnicianName` = '" + t_name + "',\n"
                + "`Date` = '" + date + "'\n"
                + "WHERE `MachineID` = '" + m_id + "';");

        try {
            if (x == true) {
                TableLoad2();
                TextBoxClear2();
                JOptionPane.showMessageDialog(null, "Susseccfuly Update");

            }
        } catch (Exception ex) {
            System.out.println(ex);

        }
    }
    }

    private void FillTextCombo1() {
        try {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("select  part_id from MachineParts_Table   ");

            while (AutoDB_Connect.DB_ResultSet.next()) {
                String m_pa = AutoDB_Connect.DB_ResultSet.getString("part_id");
                jComboBox2.addItem(m_pa);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

      private void FillTextCombo3() {
        try {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("select * from emp_table  where position = 'Technician'");

            while (AutoDB_Connect.DB_ResultSet.next()) {
                String t_id = AutoDB_Connect.DB_ResultSet.getString("emp_id");
                jComboBox3.addItem(t_id);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }
    
    
    
    
    
    
    
    private void TextBoxClear1() {

        jTextFieldMachineID.setText("");
        jTextFieldDescription.setText("");
         //jComboBox1.setSelectedIndex(0);

        // jComboBox2.setSelectedIndex(0);
        //jComboBox3.setText("");
        jTextFieldTechnicianName.setText("");
        datePicker2.setDateToToday();
    }

    private void TextBoxClear2() {

        jTextFieldSearchCustomerId.setText("");
        jTextFieldDescription1.setText("");
        jTextFieldDepartment1.setText("");

        jTextFieldMchinePart1.setText("");
        jTextFieldTechnicianID1.setText("");
        jTextFieldTechnicianName1.setText("");
        datePicker3.setDateToToday();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonADD1;
    private javax.swing.JButton jButtonADDCustomer;
    private javax.swing.JButton jButtonDemo;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextFieldDepartment1;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldDescription1;
    private javax.swing.JTextField jTextFieldMachineID;
    private javax.swing.JTextField jTextFieldMchinePart1;
    private javax.swing.JTextField jTextFieldSearchCustomerId;
    private javax.swing.JTextField jTextFieldTechnicianID1;
    private javax.swing.JTextField jTextFieldTechnicianName;
    private javax.swing.JTextField jTextFieldTechnicianName1;
    // End of variables declaration//GEN-END:variables

}
