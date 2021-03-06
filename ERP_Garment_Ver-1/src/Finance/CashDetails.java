package Finance;

import MainSystem.AutoDB_Connect;
import static MainSystem.AutoDB_Connect.DB_PreparedStatement;
import static MainSystem.AutoDB_Connect.DB_connection;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePickerSettings;
import com.sun.glass.events.KeyEvent;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Dinushka
 */
public class CashDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form SalesDesignInquiry
     */
    public CashDetails() {
        initComponents();

        Tableload();
        datePicker1.setDateToToday();
        CashTotal();

    }

    public void CashTotal() {
        try {
            PreparedStatement statement = DB_connection.prepareStatement("SELECT SUM(Amount) from CASH_DETAILS");
            ResultSet results = statement.executeQuery();
            results.next();
            String sum = results.getString(1);
            System.out.println(sum);
            txtCashtot.setText(sum);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        //       txtCashtot = "SELECT SUM(Amount) from CASH_DETAILS"
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
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        EDIT = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButton1 = new javax.swing.JButton();
        editid = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtCashtot = new javax.swing.JTextField();

        setResizable(true);
        setTitle("Cash Details");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(null);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("CASH DETAILS");
        jPanel7.add(jLabel11);
        jLabel11.setBounds(10, 10, 140, 15);

        jLabel18.setText("Cash Id");
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel18);
        jLabel18.setBounds(10, 100, 46, 15);
        jPanel7.add(jTextField3);
        jTextField3.setBounds(170, 90, 180, 30);

        jLabel19.setText("Cash Type");
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel7.add(jLabel19);
        jLabel19.setBounds(10, 50, 70, 15);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Payabels", "Reservable", " " }));
        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel7.add(jComboBox2);
        jComboBox2.setBounds(170, 40, 180, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Description");
        jPanel7.add(jLabel1);
        jLabel1.setBounds(10, 180, 69, 15);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel7.add(jScrollPane1);
        jScrollPane1.setBounds(170, 180, 260, 90);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Amount");
        jPanel7.add(jLabel2);
        jLabel2.setBounds(10, 290, 60, 15);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });
        jPanel7.add(jTextField1);
        jTextField1.setBounds(170, 280, 150, 30);

        ADD.setText("ADD");
        ADD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel7.add(ADD);
        ADD.setBounds(80, 380, 70, 23);

        EDIT.setText("UPDATE");
        EDIT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EDIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITActionPerformed(evt);
            }
        });
        jPanel7.add(EDIT);
        EDIT.setBounds(160, 380, 80, 23);

        jButton4.setText("SEARCH");
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton4);
        jButton4.setBounds(250, 380, 90, 23);

        jButton5.setText("Demo");
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton5);
        jButton5.setBounds(540, 380, 70, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Date");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(10, 140, 60, 15);
        jPanel7.add(datePicker1);
        datePicker1.setBounds(170, 130, 180, 30);

        jButton1.setText("Reset All");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton1);
        jButton1.setBounds(420, 380, 110, 23);
        jPanel7.add(editid);
        editid.setBounds(380, 40, 180, 30);

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 540));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane2.setViewportView(jTable1);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 640, 100));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Total");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 60, -1));
        jPanel2.add(txtCashtot, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 140, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 670, 250));

        jTabbedPane1.addTab("Cash", jPanel1);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:

        int row = jTable1.getSelectedRow();
        String chtype = jTable1.getValueAt(row, 1).toString();
        String chno = jTable1.getValueAt(row, 0).toString();
        String date = jTable1.getValueAt(row, 2).toString();
        String Des = jTable1.getValueAt(row, 3).toString();
        String amount = jTable1.getValueAt(row, 4).toString();

        jTextField3.setText(chno);
        editid.setText(chtype);
        datePicker1.setText(date);
        jTextArea1.setText(Des);
        jTextField1.setText(amount);


    }//GEN-LAST:event_jTable1MouseClicked

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        // TODO add your handling code here:
        Addcash();
        Tableload();
        CashTotal();
    }//GEN-LAST:event_ADDActionPerformed

    private void EDITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITActionPerformed
        // TODO add your handling code here:
        Editcash();
        TextBoxClear();
        Tableload();
        CashTotal();
    }//GEN-LAST:event_EDITActionPerformed
/**/
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        CashIDSearch();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TextBoxClear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        if (jComboBox2.getSelectedItem().equals("Payabels")) {
            generate_Payabels();
        } else if (jComboBox2.getSelectedItem().equals("Reservable")) {
            generate_Resevable();
        }


    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        {
            if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACKSPACE))) {
                evt.consume();
                JOptionPane.showMessageDialog(this, "You can't enter Characters");
            }
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        jComboBox2.setSelectedItem("Paybales");
        jTextArea1.setText("sunil");
        jTextField1.setText("250000");


    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

    private void generate_Payabels() {
        AutoIdGenerator aid = new AutoIdGenerator();
        jTextField3.setText(aid.generate("PAY", Integer.toString(MainWindow.userid)));
    }

    private void generate_Resevable() {
        AutoIdGenerator aid = new AutoIdGenerator();
        jTextField3.setText(aid.generate("RES", Integer.toString(MainWindow.userid)));
    }

    public void Addcash() {
        if (validation.ValidationCheck(jTextField3, true, 0, '@')
                && validation.ValidationCheck(jTextArea1, true, 0, '@')
                && validation.ValidationCheck(jTextField1, true, 0, '1')) {
            
            
            String chno = jTextField3.getText();
            String chtype = jComboBox2.getSelectedItem().toString();
            String date = datePicker1.getText();
            String Des = jTextArea1.getText();
            float amount = Float.parseFloat(jTextField1.getText());

            boolean x = autoSqlQuery.execute("INSERT INTO `garmentsystem`.`CASH_DETAILS`\n"
                    + "(`Type`,\n"
                    + "`Cash_ID`,\n"
                    + "`Date`,\n"
                    + "`Description`,\n"
                    + "`Amount`)\n"
                    + "VALUES\n"
                    + "('" + chtype + "',\n"
                    + "'" + chno + "',\n"
                    + "'" + date + "',\n"
                    + "'" + Des + "',\n"
                    + "" + amount + ");");

            try {
                if (x == true) {
                    Tableload();
                    TextBoxClear();
                    JOptionPane.showMessageDialog(null, "Successfully Added");
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public void TextBoxClear() {
        jTextField3.setText("");
        jComboBox2.setSelectedItem(0);
        datePicker1.setDateToToday();
        jTextArea1.setText("");
        jTextField1.setText("");
        editid.setText("");
    }

    public void Editcash() {
       
        String chno = jTextField3.getText();
            String chtype = jComboBox2.getSelectedItem().toString();
            String date = datePicker1.getText();
            String Des = jTextArea1.getText();
            float amount = Float.parseFloat(jTextField1.getText());
            
      
       boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`CASH_DETAILS`\n" +
"SET\n" +
"`Cash_ID` = '"+chno+"',\n" +
"`Type` = '"+chtype+"',\n" +
"`Date` = '"+date+"',\n" +
"`Description` = '"+Des+"',\n" +
"`Amount` = '"+amount+"'\n" +
"WHERE `Cash_ID` = '"+chno+"';");
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

        /* String bank = jComboBox2b_name.getSelectedItem().toString();
            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM  `garmentsystem`.`F_DEPOSIT DETAILS` WHERE BankName = '"+bank+"'");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet)); */
    

    public void CashIDSearch() {
        String chtype = jComboBox2.getSelectedItem().toString();
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * "
                + "FROM  `garmentsystem`.`CASH_DETAILS` WHERE Type = '" + chtype + "'");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }

    private void Tableload() {
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`CASH_DETAILS`;");
        jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JButton EDIT;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JTextField editid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField txtCashtot;
    // End of variables declaration//GEN-END:variables

}
