
package ManufacturingPlanning;

import StyleManagement.*;
import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import MainSystem.MainWindow;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author Dinushka
 */
public class CuttingSchedule extends javax.swing.JInternalFrame {
DefaultTableModel model;
int RowCountjTable2;
Create_Design NewSalesDesignModel ;


        String LogNo;
        String CustomerId;
        String CustomerName;
        String CustomerCompanyName;
        String CustomerPhone;
        String CustomerEmail;
        String CustomerAddres;


    /**
     * Creates new form SalesDesignInquiry
     */
    public CuttingSchedule() {
        initComponents();
        generate_sdi();
      
    NewSalesDesignModel = new Create_Design();
     //jTable1.setModel(DbUtils.resultSetToTableModel(NewSalesDesignModel.viewAll()));
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
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField15 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel12 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel23 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jTextField19 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel4 = new javax.swing.JLabel();
        datePicker4 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jTextField13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Cuttng schedule");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 740, 450));

        jButton1.setText(" Select to Create New Product");
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 470, -1, -1));

        jTextField3.setText("jTextField3");
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 40, -1, -1));

        jButton2.setText("Filter by design id");
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 100, -1, -1));

        jLabel8.setText("Design Id");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 40, -1, -1));

        jButton3.setText("View All");
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 210, -1, -1));

        jButton5.setText("Search");
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 40, -1, -1));

        jTabbedPane1.addTab("Main ", jPanel5);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Style ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel7.setText("No of Lines");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        jButton4.setText("ADD schedule");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jLabel15.setText("No of Labourers");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jLabel16.setText("Room No");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 110, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 110, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 110, -1));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 110, -1));

        jLabel1.setText("Schedule ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, -1, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, 110, -1));

        jLabel21.setText("Quantity");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel2.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 110, -1));

        jLabel22.setText("Colour");
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 110, -1));

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Days"));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setText("End Date");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));
        jPanel7.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jLabel12.setText("Start Date");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel7.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, -1));

        jLabel23.setText("No of Days per Sample");
        jPanel7.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 110, -1));

        jLabel24.setText("Total No of Days");
        jPanel7.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, -1));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 350, 180));

        jLabel25.setText("Size");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 110, -1));

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Availability"));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("Width per sample");
        jPanel8.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));
        jPanel8.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 110, -1));

        jLabel27.setText("meters");
        jPanel8.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jLabel28.setText("Total width needed");
        jPanel8.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));
        jPanel8.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 110, -1));

        jLabel29.setText("meters");
        jPanel8.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jCheckBox1.setText("Stock available");
        jPanel8.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jCheckBox2.setText("Stock not available");
        jPanel8.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jLabel31.setText("One roll has 100 m");
        jLabel31.setOpaque(true);
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 350, 130));

        jLabel30.setText("Material ID");
        jPanel2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        jPanel2.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 110, -1));

        jLabel32.setText("Material Name");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        jPanel2.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 1260, 520));

        jTabbedPane1.addTab("ADD cutting schedule", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Start Date");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));
        jPanel3.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jLabel4.setText("End Date");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));
        jPanel3.add(datePicker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jLabel5.setText("Schedule ID");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, -1, -1));
        jPanel3.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 110, -1));

        jLabel6.setText("Room No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));
        jPanel3.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 110, -1));

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

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 350));

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText("Schedule ID");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));
        jPanel6.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 170, -1));

        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 170, 20));

        jLabel11.setText("Sample ID");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel14.setText("Start Date");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));
        jPanel6.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 170, -1));

        jLabel17.setText("End Date");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel6.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 170, -1));

        jLabel18.setText("No of Labourers");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));
        jPanel6.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 170, -1));

        jLabel19.setText("Room No");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));
        jPanel6.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 170, -1));

        jLabel20.setText("No of Lines");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));
        jPanel6.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 170, -1));

        jButton6.setText("Edit");
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, -1, -1));

        jButton8.setText("Delete");
        jPanel6.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, 550, 410));

        jTabbedPane1.addTab("Search &  Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
      //  boolean result=customerModel.AddCustomer(jTextFieldCustomerId, jTextFieldCustomerName, jTextFieldCompanyName,jTextFieldPhone,jTextFieldEmail,datePicker2);
     //   if(result)
     {
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             generate_sdi();
             clear();
        }
       // else
        {
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed
    private void generate_sdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
   // jTextFieldCustomerId.setText(aid.generate("cus",Integer.toString(MainWindow.userid)));
    }
    
    private void clear(){
            generate_sdi();

            
    }
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private com.github.lgooddatepicker.components.DatePicker datePicker4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}