
package Maintance;
import com.github.lgooddatepicker.components.DatePickerSettings;


public class MaintenancesRequest1 extends javax.swing.JInternalFrame {

        
  
        


    public MaintenancesRequest1() {
        initComponents();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldMaintenancesID = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jButtonADD = new javax.swing.JButton();
        jButtonResetAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDepartment = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMachinePart = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jTextFieldSearchDepartment = new javax.swing.JTextField();
        jTextFieldSearchMaintenancesID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldMaintainancesID = new javax.swing.JTextField();
        jTextFieldDepartment1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldMachine1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("MaintenancesRequest");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldMaintenancesID.setEditable(false);
        jTextFieldMaintenancesID.setName("Customer ID"); // NOI18N
        jTextFieldMaintenancesID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaintenancesIDActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMaintenancesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jTextFieldDescription.setName("Customer Name"); // NOI18N
        jPanel2.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel2.setText("Maintenances ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel3.setText("Description");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        datePicker2.setName(""); // NOI18N
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jButtonADD.setText("ADD ");
        jButtonADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonADDActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jButtonResetAll.setText("Reset All");
        jButtonResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetAllActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        jLabel4.setText("Department");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jTextFieldDepartment.setName("Company name"); // NOI18N
        jPanel2.add(jTextFieldDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 110, -1));

        jLabel5.setText("Machine part ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jTextFieldMachinePart.setName("Phone number"); // NOI18N
        jPanel2.add(jTextFieldMachinePart, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 110, -1));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 510, 520));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "MaintenancesID", "Description", "Department", "Machine/PartNo", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 130, 460, 90));

        jTabbedPane1.addTab("ADD ", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanelcustomerSearch.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 770, 330));

        jTextFieldSearchDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchDepartmentActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jTextFieldSearchDepartment, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 60, -1));
        jPanelcustomerSearch.add(jTextFieldSearchMaintenancesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel9.setText("Maintenances ID");
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel10.setText("Department");
        jPanelcustomerSearch.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jButton8.setText("View All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton9.setText("Reset All");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, -1, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 830, 510));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldMaintainancesID.setEditable(false);
        jTextFieldMaintainancesID.setName("Customer ID"); // NOI18N
        jTextFieldMaintainancesID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaintainancesIDActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldMaintainancesID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jTextFieldDepartment1.setName("Customer Name"); // NOI18N
        jPanel5.add(jTextFieldDepartment1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel8.setText("Maintenances ID");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel13.setText("Department");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton7.setText("Reset All");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel15.setText("Machine/Part No");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextFieldMachine1.setName("Company name"); // NOI18N
        jPanel5.add(jTextFieldMachine1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 20, 410, 520));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldSearchDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchDepartmentActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldMaintainancesIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaintainancesIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaintainancesIDActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
          
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         
  
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
    
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTextFieldMaintenancesIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaintenancesIDActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextFieldMaintenancesIDActionPerformed

    private void jButtonADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonADDActionPerformed

        
    }//GEN-LAST:event_jButtonADDActionPerformed

    private void jButtonResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetAllActionPerformed
    
    }//GEN-LAST:event_jButtonResetAllActionPerformed
    
            
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonADD;
    private javax.swing.JButton jButtonResetAll;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
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
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextFieldDepartment;
    private javax.swing.JTextField jTextFieldDepartment1;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldMachine1;
    private javax.swing.JTextField jTextFieldMachinePart;
    private javax.swing.JTextField jTextFieldMaintainancesID;
    private javax.swing.JTextField jTextFieldMaintenancesID;
    private javax.swing.JTextField jTextFieldSearchDepartment;
    private javax.swing.JTextField jTextFieldSearchMaintenancesID;
    // End of variables declaration//GEN-END:variables

   
}
