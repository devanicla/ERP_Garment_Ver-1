/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Marketing;

import Sales.*;
import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.MainWindow;

import com.github.lgooddatepicker.components.DatePickerSettings;
import java.awt.Color;
import java.sql.SQLException;
import static MainSystem.MainWindow.autoSqlQuery;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dinushka
 */
public class MarketDesignInquiry extends javax.swing.JInternalFrame {
DefaultTableModel model;
DefaultTableModel model2;
DefaultTableModel model3;
int RowCountjTable1;
CustomerModel customerModeSDI;
String CustomerId;
String CustomerName;
MarketDesignInquiryModel marketDesignInquiryModel;
    /**
     * Creates new form SalesDesignInquiry
     */
    public MarketDesignInquiry() {
        initComponents();
        generate_mdi();
        datePicker2.setDateToToday();
         model = (DefaultTableModel) jTable1.getModel();
        model.removeRow(0);
        model2=(DefaultTableModel) jTable2.getModel();
        model3=(DefaultTableModel) jTable4.getModel();
        
        customerModeSDI = new CustomerModel();
        datePicker2.setDateToToday();
        marketDesignInquiryModel= new MarketDesignInquiryModel();
         datePicker1.setDateToToday();
         getEmployeeid();
        jTable5.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.ViewAll()));
        jTable5.setDefaultRenderer(Object.class, new MarketDesignInquiry.MyCellRenderer());

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
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldSalesDesignInquiryId1 = new javax.swing.JTextField();
        jButton22 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldMarketDesignInquiryId = new javax.swing.JTextField();
        jTextFieldEmploeeId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldSize = new javax.swing.JTextField();
        jTextFieldQuantatiy = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextFieldColour = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDescription = new javax.swing.JTextField();
        DatePickerSettings dateSettings = new DatePickerSettings();
        dateSettings.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings);
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy/MM/dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu/MM/dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldEmployeeName = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldSearchSDIID = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSearchCustomerID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSearchCustomerName = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButtonSearchCustomerID = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();

        setTitle("Market Design Inquiry Management");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(jTable5);

        jPanel7.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 1220, 360));
        jPanel7.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 80, -1));

        jLabel11.setText("Market Design Inquiry ID");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jButton8.setText("Search");
        jPanel7.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jButton18.setText("View All");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel7.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jLabel16.setText("Market Design Inquiry ID");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, -1, -1));

        jTextFieldSalesDesignInquiryId1.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldSalesDesignInquiryId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSalesDesignInquiryId1ActionPerformed(evt);
            }
        });
        jPanel7.add(jTextFieldSalesDesignInquiryId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 110, -1));

        jButton22.setText("Select to edit");
        jPanel7.add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 460, -1, -1));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1310, 520));

        jTabbedPane1.addTab("Main", jPanel6);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldMarketDesignInquiryId.setEditable(false);
        jTextFieldMarketDesignInquiryId.setName("Sales Design Inquiry ID"); // NOI18N
        jTextFieldMarketDesignInquiryId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMarketDesignInquiryIdActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldMarketDesignInquiryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, -1));

        jTextFieldEmploeeId.setEditable(false);
        jTextFieldEmploeeId.setName("Customer ID"); // NOI18N
        jPanel2.add(jTextFieldEmploeeId, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, -1));

        jLabel2.setText("Market Design Inquiry ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel3.setText("Employee ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {}
            }
            ,
            new String [] {
                "Size","Quantity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 130));

        jButton2.setText("Add  Row");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 90, -1));

        jLabel5.setText("Size");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        jLabel6.setText("Quantity");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, -1, -1));
        jPanel5.add(jTextFieldSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 70, -1));
        jPanel5.add(jTextFieldQuantatiy, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 70, -1));

        jButton3.setText("Delete Row");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 90, -1));

        jLabel17.setText("Colour");
        jPanel5.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, -1, -1));
        jPanel5.add(jTextFieldColour, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 70, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 720, 190));

        jLabel1.setText("Description");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jTextFieldDescription.setName("Description"); // NOI18N
        jPanel2.add(jTextFieldDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 380, 60));
        jPanel2.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, -1, -1));

        jLabel4.setText("Due Date");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel7.setText("Date");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));
        jPanel2.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, -1, -1));

        jButton4.setText("ADD Design Inquiry");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        jButton6.setText("Reset All");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 450, -1, -1));

        jButton7.setText("Generate New ID");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, 140, -1));

        jLabel15.setText("Employee Name");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jTextFieldEmployeeName.setEditable(false);
        jTextFieldEmployeeName.setName("Customer Name"); // NOI18N
        jPanel2.add(jTextFieldEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 770, 520));

        jTabbedPane1.addTab("ADD Market Design Inquiry ", jPanel1);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel8.setText("Market Design Inquiry ID");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jTextFieldSearchSDIID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchSDIIDActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldSearchSDIID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 100, -1));

        jLabel9.setText("Customer ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));
        jPanel3.add(jTextFieldSearchCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, -1));

        jLabel10.setText("Customer name");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jTextFieldSearchCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSearchCustomerNameActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldSearchCustomerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, 90, -1));

        jButton9.setText("Edit");
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 60, -1));

        jButton10.setText("Delete");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 170, -1, -1));

        jButton17.setText("Search");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jButtonSearchCustomerID.setText("Search");
        jButtonSearchCustomerID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchCustomerIDActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonSearchCustomerID, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jButton19.setText("Search");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 70, -1));

        jButton20.setText("View All");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, 70, -1));

        jButton21.setText("Reset All");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 120, -1, -1));

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
        jScrollPane4.setViewportView(jTable4);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 200, 160));

        jTabbedPane1.addTab("Search &  Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);
        jTabbedPane1.addTab("Edit", jPanel8);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      boolean result=marketDesignInquiryModel.AddMDI(jTextFieldMarketDesignInquiryId,jTextFieldEmploeeId,datePicker2,jTable1,jTextFieldDescription,datePicker1);
        if(result){
            JOptionPane.showMessageDialog(null,"Successfully To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
             generate_mdi();
             clear();
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed To Added Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        model.addRow(new Object[]{ jTextFieldSize.getText(),jTextFieldQuantatiy.getText(),jTextFieldColour.getText()});
         jTextFieldSize.setText("");
         jTextFieldQuantatiy.setText("");
         jTextFieldColour.setText("");
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldMarketDesignInquiryIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMarketDesignInquiryIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMarketDesignInquiryIdActionPerformed

    private void jTextFieldSearchSDIIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchSDIIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchSDIIDActionPerformed

    private void jTextFieldSearchCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSearchCustomerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSearchCustomerNameActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
    clear();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        generate_mdi();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        model.removeRow(RowCountjTable1);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        RowCountjTable1=jTable1.getSelectedRow();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       model.setRowCount(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.ViewAll()));
        clearSearch();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
    clearSearch();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
     jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchSDIID(jTextFieldSearchSDIID.getText())));  
     clearSearch();
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButtonSearchCustomerIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchCustomerIDActionPerformed
     jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchCustomerID(jTextFieldSearchCustomerID.getText())));    
     clearSearch();
    }//GEN-LAST:event_jButtonSearchCustomerIDActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
    jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.SearchCustomerName(jTextFieldSearchCustomerName.getText())));    
     clearSearch();
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
      int x=jTable2.getSelectedRow();
    String y=(String) jTable2.getValueAt(x,0);
    jTextFieldSearchSDIID.setText(y);
       
    AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM `garmentsystem`.`salesdesigninquiry_table1` where salesdesigninquiry_table_SalesDesignInquiryId='"+y+"';");
     jTable4.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet)); 
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        
        Boolean result =marketDesignInquiryModel.DeleteSDI(jTextFieldSearchSDIID.getText());
    if(result){
            JOptionPane.showMessageDialog(null,"Successfully Deleted Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
            jTable2.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.ViewAll()));
            model2.setRowCount(0);
             clear();
              
        }
        else{
            JOptionPane.showMessageDialog(null,"Failed Deleted Customer", "InfoBox", JOptionPane.INFORMATION_MESSAGE);
        
        }  
    clearSearch();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jTable5.setModel(DbUtils.resultSetToTableModel(marketDesignInquiryModel.ViewAll()));
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jTextFieldSalesDesignInquiryId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSalesDesignInquiryId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSalesDesignInquiryId1ActionPerformed
    private void generate_mdi(){
    AutoIdGenerator aid = new AutoIdGenerator();
    jTextFieldMarketDesignInquiryId.setText(aid.generate("mdi",Integer.toString(MainWindow.userid)));
    }
        private void clear(){
            generate_mdi();
            jTextFieldEmploeeId.setText("");
            jTextFieldEmployeeName.setText("");
            jTextFieldDescription.setText("");
            datePicker2.setDateToToday();
            datePicker1.setDateToToday();
            model.setRowCount(0);
    }
        private void clearSearch(){
            jTextFieldSearchSDIID.setText("");
            jTextFieldSearchCustomerID.setText("");
            jTextFieldSearchCustomerName.setText("");

    }
        private void getEmployeeid(){
        String tem=Integer.toString(MainWindow.userid);
        String tem1=null;
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT Employee_Name_tablecol FROM garmentsystem.employee_table where EmployeeId='"+tem+"';");
            try {
                AutoDB_Connect.DB_ResultSet.next();
                 tem1=(AutoDB_Connect.DB_ResultSet.getString("Employee_Name_tablecol"));
                 System.err.println(tem1);
            } catch (SQLException ex) {
                Logger.getLogger(SalesDesignInquiryModel.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        jTextFieldEmploeeId.setText(tem);
        jTextFieldEmployeeName.setText(tem1);
        
        
        
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonSearchCustomerID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldColour;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldEmploeeId;
    private javax.swing.JTextField jTextFieldEmployeeName;
    private javax.swing.JTextField jTextFieldMarketDesignInquiryId;
    private javax.swing.JTextField jTextFieldQuantatiy;
    private javax.swing.JTextField jTextFieldSalesDesignInquiryId1;
    private javax.swing.JTextField jTextFieldSearchCustomerID;
    private javax.swing.JTextField jTextFieldSearchCustomerName;
    private javax.swing.JTextField jTextFieldSearchSDIID;
    private javax.swing.JTextField jTextFieldSize;
    // End of variables declaration//GEN-END:variables

public class MyCellRenderer extends javax.swing.table.DefaultTableCellRenderer {
    @Override
    public java.awt.Component getTableCellRendererComponent(javax.swing.JTable table, java.lang.Object value, boolean isSelected, boolean hasFocus, int row, int column)
    {
        final java.awt.Component cellComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
     { 
         System.out.println(jTable5.getModel().getValueAt(row,6));
         if((jTable5.getModel().getValueAt(row,6).equals("true"))&&(jTable5.getModel().getValueAt(row,8).equals("false")))
         {
          cellComponent.setBackground(Color.CYAN);
          cellComponent.setForeground(Color.black);  
         }
         else if ((jTable5.getModel().getValueAt(row,6).equals("false"))&&(jTable5.getModel().getValueAt(row,8).equals("false")))
         {
         cellComponent.setBackground(Color.red);
         cellComponent.setForeground(Color.black);
         }
          else if ((jTable5.getModel().getValueAt(row,6).equals("pending"))&&(jTable5.getModel().getValueAt(row,8).equals("false")))
         {
         cellComponent.setBackground(Color.ORANGE);
         cellComponent.setForeground(Color.black);
         }   
           else if ((jTable5.getModel().getValueAt(row,6).equals("true"))&&(jTable5.getModel().getValueAt(row,8).equals("true")))
         {
         cellComponent.setBackground(Color.GREEN);
         cellComponent.setForeground(Color.black);
         }  
     }
        return cellComponent;
}
}
    
}
