
package StyleManagement;

import MainSystem.AutoIdGenerator;
import MainSystem.AutoDB_Connect;
import MainSystem.AutoValidation;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.autoReport;
import static MainSystem.MainWindow.autoSqlQuery;
import static MainSystem.MainWindow.autogetimage;
import static MainSystem.MainWindow.validation;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JOptionPane;
/**
 *
 * @author Dinushka
 */
public class CreateDesign extends javax.swing.JInternalFrame {
    
    

AutoValidation val = new AutoValidation();
boolean result;





    /**
     * Creates new form SalesDesignInquiry
     */
    public CreateDesign() {
        
    initComponents();
        
    TableLoad();
    generate_stlid();
    FillTextCombo1();
    FillTextComboDesigner();
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

        GenderButtonGroup = new javax.swing.ButtonGroup();
        Status = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabelImage = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        stylesize = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        styletype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Styledes = new javax.swing.JTextArea();
        D_stid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        start = new javax.swing.JRadioButton();
        inprogress = new javax.swing.JRadioButton();
        finished = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        DatePickerSettings dateSettings1 = new DatePickerSettings();
        dateSettings1.setFormatForDatesCommonEra("yyyy-MM-dd");
        dateSettings1.setFormatForDatesBeforeCommonEra("uuuu-MM-dd");
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker(dateSettings1);
        jLabel9 = new javax.swing.JLabel();
        stylecollection = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        stylecolour = new javax.swing.JComboBox<>();
        AddDesign = new javax.swing.JButton();
        ResetAll = new javax.swing.JButton();
        Generate = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        styledesigner = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        addnewcolour = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Demo = new javax.swing.JButton();
        AddImage = new javax.swing.JButton();

        setResizable(true);
        setTitle("Creating Designs");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 255)));
        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Style ID", "Style Description", "Style Size", "Gender", "Type", "Collection", "Color", "Designer", "Status", "Date"
            }
        ));
        jTable6.setColumnSelectionAllowed(true);
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable6);

        jPanel6.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, 610, 250));

        jPanel1.add(jPanel6, "card4");

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImage.setText("Selected Image will be Displayed here");
        jLabelImage.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabelImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 240));

        jButton4.setText("Select an Image");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, -1, -1));

        jPanel1.add(jPanel5, "card3");

        jPanel4.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 620, 260));

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Style ID");
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel2.setText("Style Description");
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel3.setText("Designer");
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel4.setText("Categories");
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel5.setText("Size");
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        stylesize.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Size", "MS", "M", "L", "XL", "2XL", "3XL", "4XL" }));
        stylesize.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stylesize.setToolTipText("Size Please");
        jPanel14.add(stylesize, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 230, 30));

        jLabel6.setText("Gender");
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        GenderButtonGroup.add(male);
        male.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        male.setSelected(true);
        male.setText("Male");
        male.setToolTipText("Click Me");
        jPanel14.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 230, 30));

        GenderButtonGroup.add(female);
        female.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female.setText("Female");
        female.setToolTipText("Click Me");
        jPanel14.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 230, 30));

        jLabel7.setText("Type");
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        styletype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Shirt", "Trouser", "Short", "Blouse", "Skirt", "Elephant Pant", "Frock", "Three Quater", " " }));
        styletype.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        styletype.setToolTipText("Type Please");
        jPanel14.add(styletype, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 220, 30));

        Styledes.setColumns(20);
        Styledes.setRows(5);
        Styledes.setName("StyleDescription"); // NOI18N
        Styledes.setToolTipText("Description Please");
        jScrollPane1.setViewportView(Styledes);

        jPanel14.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 230, 110));

        D_stid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 255, 255)));
        D_stid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        D_stid.setToolTipText("System Generated ID");
        jPanel14.add(D_stid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 230, 30));

        jLabel8.setText("Status");
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        Status.add(start);
        start.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        start.setSelected(true);
        start.setText("Start");
        start.setToolTipText("Click Me");
        jPanel14.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 130, 30));

        Status.add(inprogress);
        inprogress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inprogress.setText("In Progress");
        inprogress.setToolTipText("Click Me");
        jPanel14.add(inprogress, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 70, 110, 30));

        Status.add(finished);
        finished.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finished.setText("Finished");
        finished.setToolTipText("Click Me");
        jPanel14.add(finished, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 80, 30));

        jLabel13.setText("Date");
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 340, 30, 20));

        datePicker1.setName("");
        datePicker1.setEnabled(false);
        datePicker1.setToolTipText("Enter the Date");
        jPanel14.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, 160, 30));

        jLabel9.setText("Collection");
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        stylecollection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Collection", "Men", "Women", "Teenagers", "Children", " " }));
        stylecollection.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stylecollection.setToolTipText("Collection Please");
        jPanel14.add(stylecollection, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 160, 30));

        jLabel10.setText("Colour Information");
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel14.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        stylecolour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Color", "Red", "Blood Red", "Magenta", "Blue", "Light Blue", "Sky Blue", "Peacock Blue", "Green", "Tamil Green", "Light Green", "Orange", "Light Orange", "Pink", "Rose Pink", "Beige", "Brown", "Desert Brown" }));
        stylecolour.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        stylecolour.setToolTipText("Color Please");
        stylecolour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stylecolourActionPerformed(evt);
            }
        });
        jPanel14.add(stylecolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, 160, 30));

        AddDesign.setText("Add Design");
        AddDesign.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddDesign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddDesignActionPerformed(evt);
            }
        });
        jPanel14.add(AddDesign, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 490, -1, -1));

        ResetAll.setText("Reset All");
        ResetAll.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetAllActionPerformed(evt);
            }
        });
        jPanel14.add(ResetAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 490, -1, -1));

        Generate.setText("Generate");
        Generate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Generate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerateActionPerformed(evt);
            }
        });
        jPanel14.add(Generate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 490, -1, -1));
        jPanel14.add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, -20, -1, -1));

        styledesigner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Designer" }));
        styledesigner.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        styledesigner.setToolTipText("Name of the Designer");
        styledesigner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                styledesignerActionPerformed(evt);
            }
        });
        jPanel14.add(styledesigner, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 230, 30));

        jPanel4.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 670, 530));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Add a New Color");
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 45, -1, -1));

        addnewcolour.setName("NewColour"); // NOI18N
        addnewcolour.setToolTipText("New Colour");
        jPanel2.add(addnewcolour, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, 30));

        jButton1.setText("Add A New Colour");
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, -1, -1));

        Demo.setText("Demo");
        Demo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Demo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DemoActionPerformed(evt);
            }
        });
        jPanel2.add(Demo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 213, 80, -1));

        AddImage.setText("Add Image");
        AddImage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        AddImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddImageActionPerformed(evt);
            }
        });
        jPanel2.add(AddImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, -1, -1));

        jPanel4.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 300, 620, 250));

        jTabbedPane1.addTab("Create Designs", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 580));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddDesignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddDesignActionPerformed
       
           
        AddDesign();
        TableLoad();
        TextBoxClear2CreateDesign();
        jPanel1.setVisible(true);
    }//GEN-LAST:event_AddDesignActionPerformed

    private void ResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetAllActionPerformed
        // TODO add your handling code here:
        TextBoxClear2CreateDesign();
        
        //regenerate a new number
        generate_stlid();
        datePicker1.setDateToToday();
        
        
       
        
    }//GEN-LAST:event_ResetAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        AddNewColour();
        TextBoxClear2CreateDesign();
       
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable6MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        autogetimage.load();
        jLabelImage.setIcon(autogetimage.getImageIcon());  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void AddImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddImageActionPerformed
        
        jPanel6.setVisible(false);
        jPanel5.setVisible(true);
    }//GEN-LAST:event_AddImageActionPerformed

    private void GenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerateActionPerformed
        // TODO add your handling code here:
        //Report generating code
        String FileLocation=System.getProperty
        ("user.dir")+"\\src\\StyleManagement\\Reports\\CreateDesign.jrxml";
        autoReport.Table2Report(FileLocation, jTable6);
    }//GEN-LAST:event_GenerateActionPerformed

    private void stylecolourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stylecolourActionPerformed
        // TODO add your handling code here:
        //To load new colours from db
        FillTextCombo1();
    }//GEN-LAST:event_stylecolourActionPerformed

    private void styledesignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_styledesignerActionPerformed
        // TODO add your handling code here:
        //Employees from EMP table to select StyleDesigner
        FillTextComboDesigner();
    }//GEN-LAST:event_styledesignerActionPerformed

    private void DemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DemoActionPerformed
        // TODO add your handling code here:
        //Demo Button to load data
        
        Styledes.setText("Winter");
        male.setSelected(true);
        styledesigner.setSelectedItem("Surosh Chavi");
        stylesize.setSelectedItem("XL");
        stylecollection.setSelectedItem("Men");
        stylecolour.setSelectedItem("Red");
        start.setSelected(true);
        styletype.setSelectedItem("Trouser");
        datePicker1.setDateToToday();
    }//GEN-LAST:event_DemoActionPerformed

        
        private void generate_stlid(){
    AutoIdGenerator sid = new AutoIdGenerator();
    D_stid.setText(sid.generate("STY",Integer.toString(MainWindow.userid)));
    }
    private void TableLoad()
    {

            AutoDB_Connect.DB_ResultSet = autoSqlQuery.executeQuery
        ("SELECT * FROM `garmentsystem`.`T_Design_table`");
   jTable6.setModel(DbUtils.resultSetToTableModel(AutoDB_Connect.DB_ResultSet));

    }
    
   
    
   
    
    
    private void TextBoxClear2CreateDesign()
    {
        generate_stlid();
        D_stid.setText("");
        Styledes.setText("");
        styledesigner.setSelectedItem("Select Designer");
        stylesize.setSelectedItem("Select Size");
        male.setSelected(false);
        female.setSelected(false);
        styletype.setSelectedItem("Select Type");
        start.setSelected(false);
        inprogress.setSelected(false);
        finished.setSelected(false);
        datePicker1.setText("");
        stylecollection.setSelectedItem("Select Collection");
        stylecolour.setSelectedItem("Select Color");
        addnewcolour.setText("");
       
        
       
    }
    public void AddDesign()
    
    {
        
        
        //Assigning values
        String id = D_stid.getText();
        String des =  Styledes.getText();
        String designer = styledesigner.getSelectedItem().toString();
        String size = stylesize.getSelectedItem().toString();
        String Type =  styletype.getSelectedItem().toString();
        male.setActionCommand("Male");
        female.setActionCommand("Female");
        String gender =GenderButtonGroup.getSelection().getActionCommand();
        start.setActionCommand("Start");
        inprogress.setActionCommand("In Progress");
        finished.setActionCommand("Finished");        
        String status = Status.getSelection().getActionCommand();
        String date = datePicker1.getText();
        String collection = stylecollection.getSelectedItem().toString();
        String color = stylecolour.getSelectedItem().toString();  
        
        if(des.isEmpty()||designer.isEmpty()||size.isEmpty()||Type.
        isEmpty()||gender.isEmpty()||status.isEmpty()||date.isEmpty()
       ||collection.isEmpty()||color.isEmpty()){
        JOptionPane.showMessageDialog(null, "WARNING FIELDS ARE EMPTY");
        
        }
        
        else{
                if(des.length()>10){
            
            JOptionPane.showMessageDialog(null, "WARNING YOU CAN'T ENTER MORE "
                    + "IN THE STYLE DESCRIPTION FIELD");
                }
                else if(!des.matches("[a-zA-Z]+")){
                    
            JOptionPane.showMessageDialog(null, "WARNING YOU "
                    + "CAN ENTER ONLY ALPHABETS");
                    
                }
                
                else{
         //Sql Query
             try
        {  
        
        boolean x =autoSqlQuery.executeAutoADD(new String[]{"StyleId="+id,
                                                            "StyleDesc="+des,
                                                            "Size="+size,
                                                            "Gender="+gender,
                                                            "Type="+Type,
                                                       "Collection="+collection,
                                                            "Color="+color,
                                                          "Designer="+designer,
                                                            "Status="+status,
                                                            "Date="+date,
                                                          }, "T_Design_table");
            
             
             if(x==true){
               TextBoxClear2CreateDesign();
               JOptionPane.showMessageDialog(null,"SUCCESSFULLY ADDED");
             }
             else
             {
              
              
             }
        }
        
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
         
       
                }
            }
    }
    
    
        public void AddNewColour()
    {
        
        if(validation.ValidationCheck(addnewcolour, true,0,'a')){
            
        
        String colour = addnewcolour.getText();
        
        boolean  x = autoSqlQuery.execute( "INSERT INTO `garmentsystem`."
               + "`T_New_Colour_table`\n" +
                "(`NewColour`)\n" +
                "VALUES\n" +
                "('"+colour+"');");
      
        try
        {
            if(x==true)
            {
                
                TextBoxClear3();
                JOptionPane.showMessageDialog(null,"Successfully Added");
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        }
    }
             
             private void FillTextCombo1()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.T_New_Colour_table");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String colour = AutoDB_Connect.DB_ResultSet.getString
        ("NewColour");
                stylecolour.addItem(colour);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
             
             private void FillTextComboDesigner()
    {
        try
        {
            AutoDB_Connect.DB_ResultSet=autoSqlQuery.executeQuery
        ("SELECT * FROM garmentsystem.emp_table");
            
            while(AutoDB_Connect.DB_ResultSet.next())
            {
                String designer = AutoDB_Connect.DB_ResultSet.getString
                ("f_name");
                styledesigner.addItem(designer);
            }
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
        
        
        
    }
    private void TextBoxClear3()
    {
       
        addnewcolour.setText("");
       
        
       
    }
    
    
    
     
     
    
      
     

      
        
        
    
       

    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddDesign;
    private javax.swing.JButton AddImage;
    private javax.swing.JLabel D_stid;
    private javax.swing.JButton Demo;
    private javax.swing.ButtonGroup GenderButtonGroup;
    private javax.swing.JButton Generate;
    private javax.swing.JButton ResetAll;
    private javax.swing.ButtonGroup Status;
    private javax.swing.JTextArea Styledes;
    private javax.swing.JTextField addnewcolour;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JRadioButton female;
    private javax.swing.JRadioButton finished;
    private javax.swing.JRadioButton inprogress;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable6;
    private javax.swing.JRadioButton male;
    private javax.swing.JRadioButton start;
    private javax.swing.JComboBox<String> stylecollection;
    private javax.swing.JComboBox<String> stylecolour;
    private javax.swing.JComboBox<String> styledesigner;
    private javax.swing.JComboBox<String> stylesize;
    private javax.swing.JComboBox<String> styletype;
    // End of variables declaration//GEN-END:variables

    //private void AddDesign() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
//
