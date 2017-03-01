
package Distribution;

import Sales.*;
import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import static MainSystem.AutoSQLQuery.db_con;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import MainSystem.DB_Connect;
import MainSystem.MainWindow;


/**
 *
 * @author Dinushka
 */
public class Vehicle extends javax.swing.JInternalFrame {
DefaultTableModel model;
int RowCountjTable2;
CustomerModel customerModel;


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
    public Vehicle() {
        initComponents();

  
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
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jTextFieldCustomerId1 = new javax.swing.JTextField();
        jTextFieldCustomerName1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldCompanyName1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldPhone1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldEmail1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jTextFieldAddress1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanelcustomerSearch2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTextFieldSearchCustomerId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Distribution Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldCustomerId1.setEditable(false);
        jTextFieldCustomerId1.setName("Customer ID"); // NOI18N
        jTextFieldCustomerId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCustomerId1ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextFieldCustomerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 110, -1));

        jTextFieldCustomerName1.setName("Customer Name"); // NOI18N
        jPanel5.add(jTextFieldCustomerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jLabel8.setText("Customer ID");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 52, -1, -1));

        jLabel13.setText("Customer Name");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jButton7.setText("Reset All");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jLabel15.setText("Company Name");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jTextFieldCompanyName1.setName("Company name"); // NOI18N
        jPanel5.add(jTextFieldCompanyName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jLabel16.setText("Phone");
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jTextFieldPhone1.setName("Phone number"); // NOI18N
        jPanel5.add(jTextFieldPhone1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        jLabel17.setText("E-Mail");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jTextFieldEmail1.setName("Email"); // NOI18N
        jPanel5.add(jTextFieldEmail1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, -1));

        jLabel18.setText("Address");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jTextFieldAddress1.setName("Address"); // NOI18N
        jPanel5.add(jTextFieldAddress1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 210, -1));

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

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 410, 520));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 10, 760, 530));

        jLabel1.setText("Vehicle ID");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setText("Type");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 50, 20));

        jLabel3.setText("Lyson No");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel4.setText("Milage");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jLabel5.setText("Driver ID");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel6.setText("Driver's name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 160, -1));
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 160, -1));
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 160, -1));
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 160, 20));
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 160, -1));
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 170, 20));

        jButton1.setText("ADD");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, -1, -1));

        jButton4.setText("Clear All");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        jLabel7.setText("Engine no");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel10.setText("Servise Duration");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 160, -1));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 160, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jTabbedPane1.addTab("ADD Vehicle", jPanel3);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelcustomerSearch2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelcustomerSearch2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        jPanelcustomerSearch2.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 770, 330));
        jPanelcustomerSearch2.add(jTextFieldSearchCustomerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 60, -1));

        jLabel9.setText("Vehical ID");
        jPanelcustomerSearch2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("View All");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch2.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanelcustomerSearch2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanel1.add(jPanelcustomerSearch2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 830, 510));

        jTabbedPane1.addTab("Search & Edit || Delete", jPanel1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    boolean result=customerModel.EditCustomer(CustomerId, jTextFieldCustomerName1, jTextFieldCompanyName1,jTextFieldPhone1, jTextFieldEmail1, jTextFieldAddress1);
    
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldCustomerId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCustomerId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCustomerId1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
    
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked

    }//GEN-LAST:event_jTable4MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    }//GEN-LAST:event_jButton5ActionPerformed
    
    
    private void clearSearch(){
            jTextFieldCustomerId1.setText("");
            jTextFieldCustomerName1.setText("");
            jTextFieldCompanyName1.setText("");
            jTextFieldPhone1.setText("");
            jTextFieldEmail1.setText("");
            jTextFieldAddress1.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelcustomerSearch2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextFieldAddress1;
    private javax.swing.JTextField jTextFieldCompanyName1;
    private javax.swing.JTextField jTextFieldCustomerId1;
    private javax.swing.JTextField jTextFieldCustomerName1;
    private javax.swing.JTextField jTextFieldEmail1;
    private javax.swing.JTextField jTextFieldPhone1;
    private javax.swing.JTextField jTextFieldSearchCustomerId;
    // End of variables declaration//GEN-END:variables
}
