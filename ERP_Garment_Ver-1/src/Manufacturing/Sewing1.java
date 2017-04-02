
package Manufacturing;
 
import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;




/**
 *
 * @author Dinushka
 */
public class Sewing1 extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesDesignInquiry
     */
    public Sewing1() {
        initComponents();
        generate_cdi();
      
   
    }
  
     
    
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myGroup = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jTextFieldCustomerId1 = new javax.swing.JTextField();
        jTextFieldCustomerName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCompanyName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Sewing Details");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Sewing ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 130, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Style ID");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        jTextField11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField11MouseClicked(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 110, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Damages");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 380, -1, 20));
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 370, 110, 30));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("Add");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        jLabel7.setText("pcs");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(676, 380, 20, 20));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 630, 240));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Total No of Qualified pieces");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, -1, 20));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, 110, 30));

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Item", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 80, -1));

        jTextField12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField12MouseClicked(evt);
            }
        });
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel25.setText("Schedule ID");
        jPanel6.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 30, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 740, 320));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 830, 520));

        jTabbedPane1.addTab("ADD Sewing Details", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Sewing ID", "Style ID", "Schedule ID" }));
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox4MouseClicked(evt);
            }
        });
        jPanel3.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 110, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Search By");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Sewing ID");
        jLabel20.setEnabled(false);
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        jTextField7.setEnabled(false);
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 140, -1));

        jTextField13.setEnabled(false);
        jPanel3.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 80, 140, -1));

        jTextField37.setEnabled(false);
        jPanel3.add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 140, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel56.setText("Schedule ID");
        jLabel56.setEnabled(false);
        jPanel3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setText("Style ID");
        jLabel26.setEnabled(false);
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 710, 330));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCustomerId1.setEditable(false);
        jTextFieldCustomerId1.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerId1ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextFieldCustomerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 150, -1));

        jTextFieldCustomerName1.setName("Customer Name"); // NOI18N
        jPanel7.add(jTextFieldCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Sewing ID");
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Style ID");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Schedule ID");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, 20));

        jTextFieldCompanyName1.setName("Company name"); // NOI18N
        jPanel7.add(jTextFieldCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 150, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Qualified pieces");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, 20));

        jTextFieldPhone1.setName("Phone number"); // NOI18N
        jPanel7.add(jTextFieldPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 150, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Damages");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, 20));

        jTextFieldEmail1.setName("Email"); // NOI18N
        jPanel7.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 150, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, -1, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 410, 450));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked

    }//GEN-LAST:event_jComboBox4MouseClicked

    private void jTextFieldCustomerId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerId1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String id = jTextFieldCustomerId1.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`sewing`\n" +
"WHERE Sewing_ID='"+id+"';");
       if(x==true)
            JOptionPane.showMessageDialog(null,"Successfully Deleted");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String sewid=jTextFieldCustomerId1.getText();
        String style=jTextFieldCustomerName1.getText();
        String sch=jTextFieldCompanyName1.getText();
        String damage=jTextFieldPhone1.getText();
        String pcs=jTextFieldEmail1.getText();
        
         if(sewid.isEmpty()||style.isEmpty()||sch.isEmpty()||damage.isEmpty()||pcs.isEmpty()){
            JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        else{
         try
       {
        
        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`sewing`\n" +
"SET\n" +
"`Style_ID` = '"+style+"',\n" +
"`Sewing_Sch_ID` = '"+sch+"',\n" +
"`damages` = '"+damage+"',\n" +
"`qualified_pcs` = '"+pcs+"'\n" +
"WHERE `Sewing_ID` = '"+sewid+"';");
        
        JOptionPane.showMessageDialog(null, "Updated Successfully");
       }
        catch(Exception e){
                System.out.println(e);
                
        }
         }
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
        
        if(jTextField7.getText()!=null)
        {
            String search=jTextField7.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.sewing WHERE Sewing_ID ='"+search+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        else if(jTextField13.getText()!=null)
        {
            String search=jTextField13.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.sewing WHERE Style_ID ='"+search+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
         else if(jTextField37.getText()!=null)
        {
            String search=jTextField37.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.sewing WHERE Sewing_Sch_ID ='"+search+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
        }
        }
        catch(Exception e){
                System.out.println(e);
    }                                 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void generate_cdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1.setText(aid.generate("SEW-",Integer.toString(MainWindow.userid)));
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String id=jTextField1.getText();
        String style=jTextField11.getText();
        String sch=jTextField12.getText();
        String tot=jTextField10.getText();
        String waste=jTextField2.getText();
               
        
         if(id.isEmpty()||style.isEmpty()||sch.isEmpty()||tot.isEmpty()||waste.isEmpty()){
            JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        else{
        try{
       boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`sewing`\n" +
"(`Sewing_ID`,\n" +
"`Style_ID`,\n" +
"`Sewing_Sch_ID`,\n" +
"`damages`,\n" +
"`qualified_pcs`)\n"+
"VALUES\n" +
"('"+id+"',\n" +
"'"+style+"',\n" +
"'"+sch+"',\n" +
"'"+tot+"',\n" +
"'"+waste+"');");
       
       JOptionPane.showMessageDialog(null,"Successful");
      
       
       }
       catch(Exception e){
           System.out.println(e);
       }
         }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField11MouseClicked
        jTextField12.setEnabled(false);
        jTextField12.setText("");
        jTextField11.setEnabled(true);
    }//GEN-LAST:event_jTextField11MouseClicked

    private void jTextField12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField12MouseClicked
        jTextField11.setEnabled(false);
        jTextField11.setText("");
        jTextField12.setEnabled(true);
    }//GEN-LAST:event_jTextField12MouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
         try{
        int r=jTable4.getSelectedRow();
        
       
        String schid=jTable4.getValueAt(r, 0).toString();
        String styleID=jTable4.getValueAt(r, 1).toString();
        
        jTextField11.setText(styleID);
        jTextField12.setText(schid);
//        int qty=Integer.valueOf(jTable4.getValueAt(r, 2).toString());
//        int tot=Integer.valueOf( jTextField10.getText());
//        String col=Integer.toString(tot-qty);
//        jTextField2.setText(col);
       
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
           try{
        
        if(jTextField11.getText()!=null)
        {
            String search=jTextField11.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.r_Sewing_Schedule WHERE Style_ID ='"+search+"'");
            jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        }
        if(jTextField12.getText()!=null)
        {
            String search=jTextField12.getText();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.r_Sewing_Schedule WHERE Schedue_ID ='"+search+"'");
            jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        }
        }
        catch(Exception e){
                System.out.println(e);
                
         }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        String search=jComboBox4.getSelectedItem().toString();
        System.out.println(search);
        if(search.equals("Sewing ID"))
        {
            jLabel20.setEnabled(true);
            jTextField7.setEnabled(true);
            jButton1.setEnabled(true);
            
        }
        
        else if (search.equals("Style ID"))
        {
            jLabel26.setEnabled(true);
            jTextField13.setEnabled(true);
            jButton1.setEnabled(true);
        }
        else if (search.equals("Schedule ID"))
        {
            jLabel56.setEnabled(true);
            jTextField37.setEnabled(true);
            jButton1.setEnabled(true);
        }
        
         else
            JOptionPane.showMessageDialog(null, "Select a category");
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
        int r=jTable1.getSelectedRow();
        String sewid=jTable1.getValueAt(r, 0).toString();
        String stid=jTable1.getValueAt(r, 1).toString();
        String schid=jTable1.getValueAt(r, 2).toString();
        String damages=jTable1.getValueAt(r, 3).toString();
        String pcs=jTable1.getValueAt(r, 4).toString();
       
        
        
        
        jTextFieldCustomerId1.setText(sewid);
        jTextFieldCustomerName1.setText(stid);
        jTextFieldCompanyName1.setText(schid);
        jTextFieldPhone1.setText(damages);
        jTextFieldEmail1.setText(pcs);
        
        
        
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jTable1MouseClicked

   
        
       
        
    
    
      
    
    
    
    
    
    

        
    
    
   


    
    
 
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextFieldCompanyName1;
    private javax.swing.JTextField jTextFieldCustomerId1;
    private javax.swing.JTextField jTextFieldCustomerName1;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.ButtonGroup myGroup;
    // End of variables declaration//GEN-END:variables

    
    
}
