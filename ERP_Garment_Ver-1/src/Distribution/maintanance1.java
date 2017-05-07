package Distribution;



import MainSystem.AutoDB_Connect;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;
import com.github.lgooddatepicker.components.DatePickerSettings;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class maintanance1 extends javax.swing.JInternalFrame {
DefaultTableModel model;



    /**
     * Creates new form SalesDesignInquiry
     */
    public maintanance1() {
        initComponents();

        generate_MaintainceID();
        TabelLoad();
        
     
        datePicker1.setDateToToday();
        
         FillComboMaterial();
        
         AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Maintaince");
        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Maintaince");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        
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
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jTextField7 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        vehicleCombo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanelcustomerSearch = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Maintanance Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 860, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 910, 500));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Maintaince ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel2.setText("Vehical ID");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel4.setText("Garaj Name");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel5.setText("Address");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel6.setText("Phone");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 50, 20));

        jLabel3.setText("Maintaince Discription");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel7.setText("Cost");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel11.setText("Date");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        jButton1.setText("ADD");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jButton4.setText("Clear All");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        datePicker1.setEnabled(false);
        jPanel6.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, -1, -1));
        jPanel6.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, -1));
        jPanel6.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 140, -1));
        jPanel6.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 140, -1));
        jPanel6.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, -1));
        jPanel6.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));

        vehicleCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleComboActionPerformed(evt);
            }
        });
        jPanel6.add(vehicleCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, -1));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 390, 500));

        jTabbedPane1.addTab("ADD Maintanance Details", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Maintaince ID");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanelcustomerSearch.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("View All");
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 20, -1, -1));

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

        jPanelcustomerSearch.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 810, 380));

        jPanelcustomerSearch.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, -1));

        jButton6.setText("Full Report");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jButton7.setText("Search Rport");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        jPanel3.add(jPanelcustomerSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 860, 510));

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setText("Date");
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel8.setText("Cost");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel10.setText("Maintaince Discription");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel13.setText("Phone");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 50, 20));

        jLabel14.setText("Address");
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel15.setText("Garaj Name");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        jLabel16.setText("Vehical ID");
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        jLabel17.setText("Maintaince ID");
        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 140, -1));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 140, -1));
        jPanel7.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 140, -1));
        jPanel7.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 140, -1));
        jPanel7.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 140, -1));
        jPanel7.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 140, -1));

        jButton2.setText("Delete");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jButton3.setText("Update");
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jTextField14.setEditable(false);
        jPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 140, -1));
        jPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 140, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, 420, 510));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       mataintanance1();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        tableLoad();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
            search();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           TextBoxClear();
        generate_MaintainceID();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     try{
            int r=jTable1.getSelectedRow();
            String Mid= jTable1.getValueAt(r, 0).toString();
            String VID=jTable1.getValueAt(r, 1).toString();
            String dname =jTable1.getValueAt(r, 2).toString();
            String address=jTable1.getValueAt(r, 3).toString();
            String phone=jTable1.getValueAt(r, 4).toString();
            String discription=jTable1.getValueAt(r, 5).toString();
            String cost=jTable1.getValueAt(r, 6).toString();
            String date=jTable1.getValueAt(r, 7).toString();
            boolean type = false;
            
            System.err.print(type);
            
            
              jTextField2.setText(Mid);
              jTextField14.setText(VID);
              jTextField8.setText(dname);
              jTextField9.setText(address);
              jTextField10.setText(phone);
              jTextField11.setText(discription);
              jTextField12.setText(cost);
              jTextField15.setText(date);
        
        }
        
         catch(Exception ex)
        {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       DeleteDesigns();
        tableLoad();
        clearDeleteDesign();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UpdateAddedMaintanance();
        UpdateAddedMaintanance();
        tableLoad();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void vehicleComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleComboActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Distribution\\Reports\\report5.jrxml";
        System.err.println(FileLocation);
        //./Reports/ipr.jrxml
        String SQL="SELECT * FROM garmentsystem.C_Maintaince";
        autoReport.Query2Report(FileLocation, SQL);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String FileLocation=System.getProperty("user.dir")+"\\src\\Distribution\\Reports\\report6.jrxml";
        autoReport.Table2Report(FileLocation, jTable1);
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private void FillComboMaterial()
    {
         try
        {
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Maintaince");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String Mid = AutoDB_Connect.DB_ResultSet.getString("MaintainceID");
                jComboBox1.addItem(Mid);
             
            }
             AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Vehiclel");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String VID = AutoDB_Connect.DB_ResultSet.getString("VehicalID");
                vehicleCombo.addItem(VID);
            }
         
        }
        catch (SQLException ex)
        {
            System.out.println(ex);
        }
    }
    
     private void generate_MaintainceID(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1.setText(aid.generate("MAIN",Integer.toString(MainWindow.userid)));
    }
    
    private void TabelLoad()
    {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Maintaince");
        jTable3.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }
    
    private void TextBoxClear()
    {
        jTextField1.setText("");
        vehicleCombo.setSelectedItem(0);
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField3.setText("");
        jTextField7.setText("");
        datePicker1.setText("");
       
        
    }
    
    private void mataintanance1()
    {
//        System.out.println(jTextField1.getText());
//        System.out.println(vehicleCombo.getSelectedItem());
//        System.out.println(jTextField4.getText());
//        System.out.println(jTextField5.getText());
//        System.out.println(jTextField6.getText());
//        System.out.println(jTextField3.getText());
//        System.out.println(jTextField7.getText());
//        System.out.println(datePicker1.getText());

        
        String Mid = jTextField1.getText();
        String VID= (String) vehicleCombo.getSelectedItem();
        String Dname = jTextField4.getText();
        String address = jTextField5.getText();
        String phone = jTextField6.getText();
        String discription = jTextField3.getText();
        String cost = jTextField7.getText();
        String date = datePicker1.getText();
        
          if(Mid.isEmpty()||VID.isEmpty()||discription.isEmpty()||cost.isEmpty()
        ||Dname.isEmpty()||address.isEmpty()||phone.isEmpty())
        {
       JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
          else{
               if(validation.isDigit(cost)&&validation.isDigit(phone)&&validation.isAlphanumeric(address)&&validation.isLetter(Dname))
               {
        
           boolean x= autoSqlQuery.executeAutoADD(new String[]  {   "MaintainceID="+Mid,
                                                                    "VehicalID="+VID,
                                                                    "Maintainc_discription="+discription,
                                                                    "Cost="+cost,
                                                                    "Date="+date,
                                                                    "Arage_name="+Dname,
                                                                    "Address="+address,
                                                                    "Phone="+phone,
                                                                     }, "C_Maintaince");
      
        try
        {
            if(x==true)
            {
                JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED");
                TabelLoad();
                TextBoxClear();
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
          }
          }
          }
    private void search()
    {
        String Mid = jComboBox1.getSelectedItem().toString();
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.C_Maintaince WHERE MaintainceID='"+Mid+"'");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    
    }
       private void tableLoad(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.C_Maintaince");
            jTable1.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

       }
        /*private void tabelLoad(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.C_Maintaince");
            jTable1.setModel(DbUtils.resultSetToTableModel
        (AutoDB_Connect.DB_ResultSet));

        
    }*/
     private void DeleteDesigns()
    {
                int reply = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to Delete?", "Delete?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
        String Mid =jTextField2.getText();
        
        boolean x = autoSqlQuery.execute
        ("DELETE FROM `garmentsystem`.`C_Maintaince` WHERE MaintainceID = '"+Mid+"';");
        
        try
        {
            if (x==true)
            {
                clearDeleteDesign();
                tableLoad();
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    }
     public void clearDeleteDesign(){
        
        jTextField2.setText("");
        jTextField14.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
        jTextField15.setText("");
       
        
    }
      public void UpdateAddedMaintanance(){
          
            
        String Mid,VID,discription,cost,date,Dname,address,phone;
        Mid = jTextField2.getText();
        VID = jTextField14.getText();
        discription = jTextField11.getText();
        cost = jTextField12.getText();
        date = jTextField10.getText();
        Dname = jTextField8.getText();
        address = jTextField9.getText();
        phone = jTextField15.getText();
             
       
        
        if(Mid.isEmpty()||VID.isEmpty()||discription.isEmpty()||cost.isEmpty()||date.
        isEmpty()||Dname.isEmpty()||address.isEmpty()||phone.isEmpty())
        {
       JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        }
        
        else{
            if(validation.isDigit(cost)&&validation.isDigit(phone)&&validation.isLetter(address)&&validation.isLetter(Dname))
               {
            
            try{
            
        
        
         int reply = JOptionPane.showConfirmDialog(null, 
                 "Are you sure you want to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){
              

                boolean x = autoSqlQuery.execute
        ("UPDATE `garmentsystem`.`C_Maintaince`\n" +
            "SET\n" +
             "`MaintainceID` = '"+Mid+"',\n" +
            "`VehicalID` = '"+VID+"',\n" +
            "`Maintainc_discription` = '"+discription+"',\n" +
            "`Cost` = '"+cost+"',\n" +
            "`Date` = '"+date+"',\n" +
            "`Arage_name` = '"+Dname+"',\n" +
            "`Address` = '"+address+"',\n" +
            "`Phone` = '"+phone+"'\n" +
             "WHERE `MaintainceID` = '"+Mid+"';");
              
               
       
            if(x==true){
               clearUpdatMaintanance();
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY UPDATED");
             }
             else
             {
              
              
             }
        }
            }
        
        catch(Exception ex)
        {
            System.out.println(ex);
        }
       
    }
    }
        }
    public void clearUpdatMaintanance(){
        
        jTextField2.setText("");
        jTextField14.setText("");
        jTextField8.setText("");
        jTextField9.setText("");
        jTextField10.setText("");
        jTextField11.setText("");
        jTextField12.setText("");
         jTextField15.setText("");
        
        
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanelcustomerSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JComboBox<String> vehicleCombo;
    // End of variables declaration//GEN-END:variables

    private void AddMaintanance() {
       
    }
}
