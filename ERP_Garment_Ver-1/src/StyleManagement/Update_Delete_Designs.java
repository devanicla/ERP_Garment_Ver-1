
package StyleManagement;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoSqlQuery;

import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;
/**
 *
 * @author Dinushka
 */
public class Update_Delete_Designs extends javax.swing.JInternalFrame {






    /**
     * Creates new form SalesDesignInquiry
     */
    public Update_Delete_Designs() {
        
      initComponents();
     
      
      generate_stlid();
      datePicker2.setDateToToday();
      datePicker3.setDateToToday();
     
      
      
        
        
        
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GenderButtonGroup = new javax.swing.ButtonGroup();
        Status = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        styleDes1 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        DeleteCreateDesign = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        ViewAll_Delete = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        DatePickerSettings dateSettings12= new DatePickerSettings();
        dateSettings12.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings12.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker2 = new com.github.lgooddatepicker.components.DatePicker(dateSettings12);
        jLabel16 = new javax.swing.JLabel();
        Editbtn1 = new javax.swing.JButton();
        ResetViewUpdateDesign1 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        DatePickerSettings dateSettings3 = new DatePickerSettings();
        dateSettings3.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings3.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker3 = new com.github.lgooddatepicker.components.DatePicker(dateSettings3);
        Editbtn = new javax.swing.JButton();
        ResetViewUpdateDesign = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setResizable(true);
        setTitle("Update||Delete Designs");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setText("Style ID");
        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 24, -1, -1));

        jLabel24.setText("Style Description");
        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 82, -1, -1));

        styleDes1.setColumns(20);
        styleDes1.setRows(5);
        jScrollPane3.setViewportView(styleDes1);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 94, 170, 100));

        jLabel25.setText("Designer");
        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 204, -1, -1));
        jPanel10.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 196, 131, 30));

        jLabel26.setText("Categories");
        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 24, -1, -1));

        jLabel27.setText("Size");
        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 24, -1, -1));

        jLabel28.setText("Gender");
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 24, -1, -1));

        jLabel29.setText("Type");
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 24, -1, -1));

        jLabel30.setText("COLOR");
        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(476, 126, -1, -1));

        jLabel31.setText("Color Information");
        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 126, -1, -1));

        jLabel32.setText("Collection");
        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 126, -1, -1));

        jLabel33.setText("Status");
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 80, -1, -1));

        jButton8.setText("SEARCH");
        jButton8.setBackground(new java.awt.Color(255, 255, 0));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 153));
        jPanel10.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 576, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Style ID", "Style Description", "Size", "Gender", "Type", "Collection", "Color", "Designer", "Status", "Date"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        jPanel10.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 261, 924, 153));

        jButton9.setText("UPDATE ");
        jButton9.setBackground(new java.awt.Color(255, 255, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 102));
        jPanel10.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1012, 576, -1, -1));

        jButton10.setText("DELETE DESIGN");
        jButton10.setBackground(new java.awt.Color(255, 255, 0));
        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 102));
        jPanel10.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1127, 693, -1, -1));

        jButton11.setText("RESET");
        jButton11.setBackground(new java.awt.Color(255, 255, 0));
        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 102));
        jPanel10.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 759, -1, -1));

        jLabel36.setText("Date");
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 204, -1, -1));

        jButton12.setText("DELETE");
        jButton12.setBackground(new java.awt.Color(255, 255, 0));
        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 153));
        jPanel10.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1138, 576, -1, -1));

        DeleteCreateDesign.setText("Delete");
        DeleteCreateDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteCreateDesignActionPerformed(evt);
            }
        });
        jPanel10.add(DeleteCreateDesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(872, 490, -1, -1));

        Reset.setText("Reset");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel10.add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(968, 490, -1, -1));

        jButton16.setText("Report");
        jPanel10.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 490, -1, -1));

        ViewAll_Delete.setText("View All");
        ViewAll_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewAll_DeleteActionPerformed(evt);
            }
        });
        jPanel10.add(ViewAll_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(994, 261, -1, -1));
        jPanel10.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 18, 131, 29));
        jPanel10.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(524, 121, 131, 27));
        jPanel10.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 121, 104, 27));
        jPanel10.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 18, 104, 29));
        jPanel10.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 18, 93, 29));
        jPanel10.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 72, 93, 32));

        datePicker2.setEnabled(false);
        jPanel10.add(datePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(799, 203, -1, -1));

        jLabel16.setToolTipText("You Can't Delete");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 18, 166, 33));

        Editbtn1.setText("Delete");
        Editbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Editbtn1ActionPerformed(evt);
            }
        });
        jPanel10.add(Editbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 450, -1, -1));

        ResetViewUpdateDesign1.setText("Reset");
        ResetViewUpdateDesign1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetViewUpdateDesign1ActionPerformed(evt);
            }
        });
        jPanel10.add(ResetViewUpdateDesign1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, -1, -1));

        jButton20.setText("Print");
        jPanel10.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 450, -1, -1));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 1270, 490));

        jTabbedPane1.addTab("ViewAll || Delete Designs", jPanel5);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel4.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(699, 156, -1, -1));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 255)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Search by");
        jPanel8.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, -1, -1));

        jLabel15.setText("Style ID");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 48, -1));

        jButton6.setText("ViewAll");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 56, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 180, 180));

        jLabel20.setText("Style ID");
        jPanel7.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel21.setText("Style Description");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane7.setViewportView(jTextArea2);

        jPanel7.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, -1, -1));

        jLabel22.setText("Designer");
        jPanel7.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));
        jPanel7.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 166, 30));

        jLabel34.setText("Categories");
        jPanel7.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 101, -1, -1));

        jLabel43.setText("Size");
        jPanel7.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(672, 101, -1, -1));

        jLabel37.setText("Gender");
        jPanel7.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 19, -1, -1));

        jLabel38.setText("Type");
        jPanel7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(629, 64, -1, -1));

        jLabel39.setText("Status");
        jPanel7.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 20, -1, -1));

        jLabel40.setText("Date");
        jPanel7.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(631, 156, -1, -1));

        jLabel41.setText("Collection");
        jPanel7.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 80, -1, -1));

        jLabel42.setText("Colour Information");
        jPanel7.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 150, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Style ID", "Style Description", "Size", "Gender", "Type", "Collection", "Color", "Designer", "Status", "Date"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 211, 1010, 184));
        jPanel7.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 61, 139, -1));
        jPanel7.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 13, 139, -1));
        jPanel7.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 98, 139, -1));
        jPanel7.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 13, 112, -1));
        jPanel7.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1079, 75, 112, -1));
        jPanel7.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1084, 143, 107, -1));

        datePicker3.setEnabled(false);
        jPanel7.add(datePicker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 154, 140, 30));

        Editbtn.setText("Update");
        Editbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbtnActionPerformed(evt);
            }
        });
        jPanel7.add(Editbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 300, -1, -1));

        ResetViewUpdateDesign.setText("Reset");
        ResetViewUpdateDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetViewUpdateDesignActionPerformed(evt);
            }
        });
        jPanel7.add(ResetViewUpdateDesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 300, -1, -1));

        jButton19.setText("Print");
        jPanel7.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 300, -1, -1));

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        jLabel18.setToolTipText("You Can't Delete");
        jPanel7.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 166, 33));

        jLabel1.setToolTipText("Style ID");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 160, 30));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1295, 501));

        jTabbedPane1.addTab("View || Update Designs", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1320, 560));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int row =jTable1.getSelectedRow();
        String id = jTable1.getValueAt(row,0).toString();
        String des = jTable1.getValueAt(row,1).toString();
        String size = jTable1.getValueAt(row,2).toString();
        String gender = jTable1.getValueAt(row,3).toString();
        String type = jTable1.getValueAt(row,4).toString();
        String collection = jTable1.getValueAt(row,5).toString();
        String colour = jTable1.getValueAt(row,6).toString();
        String designer = jTable1.getValueAt(row,7).toString();
        String status = jTable1.getValueAt(row,8).toString();
        String date = jTable1.getValueAt(row,9).toString();

        jLabel16.setText(id);
        jTextArea2.setText(des);
        jTextField8.setText(designer);
        jTextField15.setText(gender);
        jTextField14.setText(type);
        jTextField16.setText(size);
        datePicker3.setText(date);
        jTextField17.setText(status);
        jTextField18.setText(collection);
        jTextField19.setText(colour);
    }//GEN-LAST:event_jTable1MouseClicked

    private void ResetViewUpdateDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetViewUpdateDesignActionPerformed
        // TODO add your handling code here:
        clearDeleteDesign();
    }//GEN-LAST:event_ResetViewUpdateDesignActionPerformed

    private void EditbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbtnActionPerformed
        // TODO add your handling code here:

        UpdateAddedDesigns();
        clearUpdateDesign();
        TableLoad3();
    }//GEN-LAST:event_EditbtnActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        TableLoad3();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int row =jTable2.getSelectedRow();
        String id = jTable2.getValueAt(row,0).toString();
        String des = jTable2.getValueAt(row,1).toString();
        String size = jTable2.getValueAt(row,2).toString();
        String gender = jTable2.getValueAt(row,3).toString();
        String type = jTable2.getValueAt(row,4).toString();
        String collection = jTable2.getValueAt(row,5).toString();
        String colour = jTable2.getValueAt(row,6).toString();
        String designer = jTable2.getValueAt(row,7).toString();
        String status = jTable2.getValueAt(row,8).toString();
        String date = jTable2.getValueAt(row,9).toString();

        jLabel1.setText(id);
        styleDes1.setText(des);
        jTextField4.setText(size);
        jTextField5.setText(colour);
        jTextField6.setText(designer);
        jTextField10.setText(gender);
        jTextField9.setText(collection);
        jTextField11.setText(type);
        jTextField12.setText(status);
        datePicker2.setText(date);
    }//GEN-LAST:event_jTable2MouseClicked

    private void DeleteCreateDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteCreateDesignActionPerformed
        // TODO add your handling code here:

        DeleteDesigns();

        Table2Load();
    }//GEN-LAST:event_DeleteCreateDesignActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_ResetActionPerformed

    private void ViewAll_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewAll_DeleteActionPerformed
        // TODO add your handling code here:

        Table2Load();
        
    }//GEN-LAST:event_ViewAll_DeleteActionPerformed

    private void Editbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Editbtn1ActionPerformed
        // TODO add your handling code here:
        DeleteDesigns();
        Table2Load();
        
    }//GEN-LAST:event_Editbtn1ActionPerformed

    private void ResetViewUpdateDesign1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetViewUpdateDesign1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetViewUpdateDesign1ActionPerformed

        public void UpdateAddedDesigns(){
            
            
        String id,des,designer,gender,type,size,date,status,collection,colour;
        id=jLabel1.getText();
        des=jTextArea2.getText();
        designer=jTextField8.getText();
        gender=jTextField15.getText();
        type=jTextField14.getText();
        size=jTextField16.getText();
        date=datePicker3.getText();
        status=jTextField17.getText();
        collection=jTextField18.getText();
        colour=jTextField19.getText();
        
         int reply = JOptionPane.showConfirmDialog(null, "Are you sure you want to Update?", "Update?", 
                            JOptionPane.YES_NO_OPTION);
        
          if (reply == JOptionPane.YES_OPTION){

        boolean x = autoSqlQuery.execute("UPDATE `garmentsystem`.`T_Design_table`\n" +
"SET\n" +
"`StyleId` = '"+id+"',\n" +
"`StyleDesc` = '"+des+"',\n" +
"`Size` = '"+size+"',\n" +
"`Gender` = '"+gender+"',\n" +
"`Type` = '"+type+"',\n" +
"`Collection` = '"+collection+"',\n" +
"`Color` = '"+colour+"',\n" +
"`Designer` = '"+designer+"',\n" +
"`Status` = '"+status+"',\n" +
"`Date` = '"+date+"'\n" +
"WHERE `StyleId` = '"+id+"';");
        
        try
        {
            if (x==true)
            {   TableLoad3();
                clearUpdateDesign();
               
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        }
          
        }

        private void generate_stlid(){
    AutoIdGenerator sid = new AutoIdGenerator();
    jLabel1.setText(sid.generate("STY",Integer.toString(MainWindow.userid)));
    }
    
    private void Table2Load(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.T_Design_table");
            jTable2.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));
        
    }
    
    private void TableLoad3(){
        AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery("SELECT * FROM garmentsystem.T_Design_table");
            jTable1.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

        
    }
    
    
   
    
    public void clearUpdateDesign(){
        
        jLabel18.setText("");
        jTextArea2.setText("");
        jTextField8.setText("");
        jTextField15.setText("");
        jTextField14.setText("");
        jTextField16.setText("");
        jTextField17.setText("");
        jTextField18.setText("");
        jTextField19.setText("");
        
        
    }
    public void clearDeleteDesign(){
        
        jLabel16.setText("");
        styleDes1.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField10.setText("");
        jTextField6.setText("");
        jTextField12.setText("");
        jTextField11.setText("");
        jTextField9.setText("");
        
    }
       private void DeleteDesigns()
    {
        String id =jLabel16.getText();
        
        boolean x = autoSqlQuery.execute("DELETE FROM `garmentsystem`.`T_Design_table`\n" +
"WHERE StyleId = '"+id+"';");
        
        try
        {
            if (x==true)
            {
                clearDeleteDesign();
                Table2Load();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteCreateDesign;
    private javax.swing.JButton Editbtn;
    private javax.swing.JButton Editbtn1;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JButton Reset;
    private javax.swing.JButton ResetViewUpdateDesign;
    private javax.swing.JButton ResetViewUpdateDesign1;
    private javax.swing.ButtonGroup Status;
    private javax.swing.JButton ViewAll_Delete;
    private com.github.lgooddatepicker.components.DatePicker datePicker2;
    private com.github.lgooddatepicker.components.DatePicker datePicker3;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextArea styleDes1;
    // End of variables declaration//GEN-END:variables

    //private void AddDesign() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//
