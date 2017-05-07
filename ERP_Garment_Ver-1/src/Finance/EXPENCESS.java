
package Finance;

import MainSystem.AutoDB_Connect;
import static MainSystem.AutoDB_Connect.DB_connection;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.sun.glass.events.KeyEvent;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class EXPENCESS extends javax.swing.JInternalFrame {



    /**
     * Creates new form SalesDesignInquiry
     */
    public EXPENCESS() {
        initComponents();
       datePicker1date.setDateToToday();
       Tableload();
       
        ExTotal();
       
     
    }
    
    public void ExTotal()
    {
         try {
             PreparedStatement statement  =DB_connection.prepareStatement("SELECT SUM(Amount) FROM garmentsystem.F_EXPENES;");
             ResultSet  results = statement.executeQuery();
                results.next();
                String sum = results.getString(1);
                System.out.println(sum);
                ExTotal.setText(sum);
            }
            
            catch (SQLException ex) 
                
             {
                System.out.println(ex.getMessage());
            }
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
        jPanel10 = new javax.swing.JPanel();
        ADDjButton2 = new javax.swing.JButton();
        EDITjButton3 = new javax.swing.JButton();
        SEARHjButton4 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jComboBox3type = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1bill = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1description = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jTextField2amt = new javax.swing.JTextField();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1date = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        editE = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        ExTotal = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setResizable(true);
        setTitle("Bank Details");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ADDjButton2.setText("ADD");
        ADDjButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADDjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDjButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(ADDjButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        EDITjButton3.setText("UPDATE");
        EDITjButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EDITjButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITjButton3ActionPerformed(evt);
            }
        });
        jPanel10.add(EDITjButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        SEARHjButton4.setText("SEARH");
        SEARHjButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SEARHjButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SEARHjButton4ActionPerformed(evt);
            }
        });
        jPanel10.add(SEARHjButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, -1, -1));

        jLabel19.setText("Expences Type");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 120, -1));

        jComboBox3type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Expence", "Description Expences", "Administration Expences", "Other Expences", "Financial Expences", " ", " " }));
        jComboBox3type.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox3type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3typeActionPerformed(evt);
            }
        });
        jPanel10.add(jComboBox3type, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 170, 30));

        jLabel1.setText("Bill No");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, -1));
        jPanel10.add(jTextField1bill, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 170, 30));

        jLabel2.setText("Date");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 60, -1));

        jLabel3.setText("Description");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, -1));

        jTextArea1description.setColumns(20);
        jTextArea1description.setRows(5);
        jScrollPane1.setViewportView(jTextArea1description);

        jPanel10.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 260, 60));

        jLabel4.setText("Amount");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 90, -1));

        jTextField2amt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2amtKeyTyped(evt);
            }
        });
        jPanel10.add(jTextField2amt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 30));
        jPanel10.add(datePicker1date, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 170, 30));

        jButton1.setText("Demo");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jButton2.setText("Reset All");
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));
        jPanel10.add(editE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 170, 30));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 550));

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Total");
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 140, 50, -1));

        ExTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExTotalActionPerformed(evt);
            }
        });
        jPanel11.add(ExTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 150, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 590, 90));

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 630, 210));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jTabbedPane1.addTab("Expences", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ADDjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDjButton2ActionPerformed
        AddExpences();
        Tableload();        // TODO add your handling code here:
        
    }//GEN-LAST:event_ADDjButton2ActionPerformed

    private void EDITjButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITjButton3ActionPerformed
         EditExp();
        TextBoxClear();
        Tableload();
    }//GEN-LAST:event_EDITjButton3ActionPerformed
private void Tableload()
 {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT `F_EXPENES`.`Bill_No`,\n" +
"    `F_EXPENES`.`Expences_Type`,\n" +
"    `F_EXPENES`.`Date`,\n" +
"    `F_EXPENES`.`Discription`,\n" +
"    `F_EXPENES`.`Amount`\n" +
"FROM `garmentsystem`.`F_EXPENES`;");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
 }

 public void AddExpences()
 {
       if(validation.ValidationCheck(jTextField1bill, true, 0, '@')
               &&validation.ValidationCheck(jTextField2amt, true,0,'1'))
       {
     String Billno = jTextField1bill.getText();
     String exType = jComboBox3type.getSelectedItem().toString();
     String date = datePicker1date.getText();
     String desc = jTextArea1description.getText();
     float amt = Float.parseFloat(jTextField2amt.getText());
     
     boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`F_EXPENES`\n" +
"(`Bill_No`,\n" +
"`Expences_Type`,\n" +
"`Date`,\n" +
"`Discription`,\n" +
"`Amount`)\n" +
"VALUES\n" +
"('"+Billno+"',\n" +
"'"+exType+"',\n" +
"'"+date+"',\n" +
"'"+desc+"',\n" +
""+amt+");");
     
      try
        {
            if(x==true)
            {
                Tableload();
                TextBoxClear();
                JOptionPane.showMessageDialog(null,"Successfully Added");
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex);
        }    
 }
 }
 
  private void TextBoxClear()
  {
      jTextField1bill.setText("");
      jComboBox3type.setSelectedIndex(0);
      datePicker1date.setDateToToday();
      jTextArea1description.setText("");
      jTextField2amt.setText("");
  }
  /**/
    private void ExTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExTotalActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         int row =jTable1.getSelectedRow();
        String Billno = jTable1.getValueAt(row,0).toString();
        String exType = jTable1.getValueAt(row,1).toString();
        String date = jTable1.getValueAt(row,2).toString();
        String desc = jTable1.getValueAt(row,3).toString();
        String amt = jTable1.getValueAt(row,4).toString();
        
      jTextField1bill.setText(Billno);
      editE.setText(exType);
      datePicker1date.setText(date);
      jTextArea1description.setText(desc);
      jTextField2amt.setText(amt); 
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void SEARHjButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SEARHjButton4ActionPerformed
        // TODO add your handling code here:
        searchexpen();
    }//GEN-LAST:event_SEARHjButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         TextBoxClear();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox3typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3typeActionPerformed

        if(jComboBox3type.getSelectedItem().equals("Description Expences"))
        {
            generate_Descriptoin();
        }
        else if(jComboBox3type.getSelectedItem().equals("Administration Expences"))
        {
            generate_Administration();
        }
        else if(jComboBox3type.getSelectedItem().equals("Other Expences"))
        {
            generate_Other();
        }
        else if(jComboBox3type.getSelectedItem().equals("Financial Expences"))
        {
            generate_Finacial();
        }
        


    }//GEN-LAST:event_jComboBox3typeActionPerformed

    private void jTextField2amtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2amtKeyTyped
         char c=evt.getKeyChar();
      {
          if(!(Character.isDigit(c) || (c==KeyEvent.VK_BACKSPACE) ))
          {
              evt.consume();
              JOptionPane.showMessageDialog(this,"You can't enter Characters");
          }
      }
    }//GEN-LAST:event_jTextField2amtKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
      jComboBox3type.setSelectedItem("Financial Expences");
      jTextArea1description.setText("sunimal");
      jTextField2amt.setText("8000");
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
     private void generate_Descriptoin(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1bill.setText(aid.generate("DES",Integer.toString(MainWindow.userid)));
    }
    
    private void generate_Administration(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1bill.setText(aid.generate("ADM",Integer.toString(MainWindow.userid)));
    }
     private void generate_Other(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1bill.setText(aid.generate("OTH",Integer.toString(MainWindow.userid)));
    }
      private void generate_Finacial(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextField1bill.setText(aid.generate("FIN",Integer.toString(MainWindow.userid)));
    }
     
    private void searchexpen()
    {
        String exType = jComboBox3type.getSelectedItem().toString();
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM  `garmentsystem`.`F_EXPENES` WHERE `Expences_Type` = '"+exType+"'");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));  
    }
   public void  EditExp()
  {
//              if(validation.ValidationCheck(jTextField2amt, true,0,'1'))
      {
      String Billno = jTextField1bill.getText();
      String exType = jComboBox3type.getSelectedItem().toString();
      String date = datePicker1date.getText();
      String desc = jTextArea1description.getText();
      float amt =Float.parseFloat(jTextField2amt.getText());
      
       boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`F_EXPENES`\n" +
"SET\n" +
"`Bill_No` = '"+Billno+"',\n" +
"`Expences_Type` = '"+exType+"',\n" +
"`Date` = '"+date+"',\n" +
"`Discription` = '"+desc+"',\n" +
"`Amount` = "+amt+"\n" +
"WHERE `Bill_No` = '"+Billno+"';");
         try
        {
            if (x==true)
            {
               TextBoxClear();
               Tableload();
               JOptionPane.showMessageDialog(null,"Successfully Updated");
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
      
  }
  } 
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDjButton2;
    private javax.swing.JButton EDITjButton3;
    private javax.swing.JTextField ExTotal;
    private javax.swing.JButton SEARHjButton4;
    private com.github.lgooddatepicker.components.DatePicker datePicker1date;
    private javax.swing.JTextField editE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3type;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1description;
    private javax.swing.JTextField jTextField1bill;
    private javax.swing.JTextField jTextField2amt;
    // End of variables declaration//GEN-END:variables

   
  

  

   
}
