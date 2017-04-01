
package Distribution;

import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import static MainSystem.MainWindow.autoSqlQuery;
import MainSystem.MainWindow;
import com.github.lgooddatepicker.components.DatePickerSettings;


import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dinushka
 */
public class Distribution extends javax.swing.JInternalFrame {


    /**
     * Creates new form SalesDesignInquiry
     */
    public Distribution() {
        initComponents();
        generate_distributionid();
        TabelLoad();
        datePicker1.setDateToToday();

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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        dis_id = new javax.swing.JTextField();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSearchDIS = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        DatePickerSettings dateSettings2 = new DatePickerSettings();
        dateSettings2.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings2.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings2);
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        dis_id1 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Distribution Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 760, 530));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Vehicle ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, -1));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jLabel2.setText("Date");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel3.setText("Distribution Cost");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel4.setText("Distribution Milage");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        jTextField1.setName("vid"); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, -1));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 130, -1));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, -1));

        jButton1.setText("ADD");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jButton4.setText("Clear All");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, -1, -1));

        jLabel8.setText("Distribution ID");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        dis_id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(dis_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, -1));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel5.setText("Driver's ID");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 130, -1));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, -1));

        jLabel6.setText("Helper ID");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, 20));

        jTabbedPane1.addTab("ADD Distribution", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSearchDIS.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jSearchDIS.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Distribution Date");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jSearchDIS.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("View All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jSearchDIS.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.setFocusable(false);
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jSearchDIS.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jSearchDIS.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 450, 320));
        jSearchDIS.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jPanel3.add(jSearchDIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 680, 470));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Distribution ID");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        dis_id1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel5.add(dis_id1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 130, -1));

        jTextField6.setName("vid"); // NOI18N
        jPanel5.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Vehicle ID");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 70, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Driver's ID");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 130, -1));
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Helper ID");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 60, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Date");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Distribution Cost");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));
        jPanel5.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 130, -1));
        jPanel5.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 130, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Distribution Milage");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));
        jPanel5.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 130, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 470, 470));

        jTabbedPane1.addTab("Search & Update || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));
        jTabbedPane1.getAccessibleContext().setAccessibleName("ADD Discription");

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
         

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       search();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AddDistribution();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         TextBoxClear();
        generate_distributionid();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JTextField dis_id;
    private javax.swing.JTextField dis_id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel jSearchDIS;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

    private void generate_distributionid() {
       
       AutoIdGenerator aid = new AutoIdGenerator();
        dis_id.setText(aid.generate("DIS",Integer.toString(MainWindow.userid)));
    }

    private void TabelLoad() {
         AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Distribution");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
       
    }
    
        private void TextBoxClear()
    {
        dis_id.setText("");
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        datePicker1.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
       
        
    }
         private void AddDistribution()
    {
        String id =  dis_id.getText();
        String VID = jTextField1.getText();
        String DID = jTextField2.getText();
        String HID = jTextField5.getText();
        String date = datePicker1.getText();
        String Dis_cost = jTextField3.getText();
        String Milage = jTextField4.getText();
        
        boolean x =autoSqlQuery.execute("INSERT INTO `garmentsystem`.`C_Distribution`\n" +
"(`DistributionID`,\n" +
"`VehicalId`,\n" +
"`Driver's_ID`,\n" +
"`Helper's_ID`,\n" +
"`Date`,\n" +
"`Distribution_cost`,\n" +
"`Distribution_milage`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+VID+"',\n" +
"'"+DID+"',\n" +
"'"+HID+"',\n" +
"'"+date+"',\n" +
"'"+Dis_cost+"',\n" +
"'"+Milage+"');");   
        try
        {
            if(x==true)
            {
                TabelLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
 private void search()
 {
     String date=datePicker2.getText();

        jTable2.setModel(DbUtils.resultSetToTableModel(autoSqlQuery.executeAutoSearchDate("C_Distribution","Date", date)));
 
 }
}
