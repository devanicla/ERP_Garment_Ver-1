
package Sample;

import InventoryManagement.*;
import com.github.lgooddatepicker.components.DatePickerSettings;
import MainSystem.AutoIdGenerator;
import MainSystem.DB_Connect;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import MainSystem.MainWindow;
import static MainSystem.MainWindow.db_con;
import java.sql.PreparedStatement;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author Dinushka
 */
//public class Request_And_Create_Sample extends javax.swing.JInternalFrame {
//DefaultTableModel model;
//int RowCountjTable;





    /**
     * Creates new form SalesDesignInquiry
     */
/*
    public Request_And_Create_Sample() {
     
        initComponents();
        TableLoad();
        TableLoad2();
        */
        
       /* generate_mid();
        datePicker1.setDateToToday();
      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();

        setResizable(true);
        setTitle("Request and Create Sample");
        setMaximumSize(new java.awt.Dimension(1365, 620));
        setMinimumSize(new java.awt.Dimension(1365, 620));
        setPreferredSize(new java.awt.Dimension(1365, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1298, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 528, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1300, 530));

        jTabbedPane1.addTab("ADD Requesition  of Samples", jPanel1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1345, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Create Design", jPanel5);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Search & Edit || Delete", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPane1.addTab("Reports", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1350, 590));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents


     /*   private void generate_mid(){
    AutoIdGenerator aid = new AutoIdGenerator();
    idfield.setText(aid.generate("mat",Integer.toString(MainWindow.userid)));
    }
    private void TableLoad()
    {

            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Raw_Materials");
            jTable1.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
    private void TableLoad2()
    {

            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Raw_Materials");
            jTable2.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));

    }
    private void TextBoxClear(){
            generate_mid();
            namefield.setText("");
            costfield.setText("");
            quantityfield.setText("");
            reorderfield.setText("");
            datePicker2.setText("");
    }
    
    private void TextBoxClear2()
    {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        datePicker1.setText("");
    }
    
    public void AddMaterial()
    {
        
        
        String id = idfield.getText();
        String name = namefield.getText();
        String cost =  costfield.getText();
        String qty = quantityfield.getText();
        String value = valuefield.getText();
        String reorder = reorderfield.getText();
        String date = datePicker2.getText();
        
        DB_Connect.DB_ResultSet = db_con.executeQuery("INSERT INTO `garmentsystem`.`Raw_Materials`\n" +
"(`Material_id`,\n" +
"`Material_Name`,\n" +
"`Material_cost`,\n" +
"`Material_qty`,\n" +
"`Material_Value`,\n" +
"`Material_reorder`,\n" +
"`Material_date`)\n" +
"VALUES\n" +
"('"+id+"',\n" +
"'"+name+"',\n" +
"'"+cost+"',\n" +
"'"+qty+"',\n" +
"'"+value+"',\n" +
"'"+reorder+"',\n" +
"'"+date+"');");
      
    }
    
    public void EditMaterials()
    {
        String id,name,cost,qty,value,reorder,date;
        id=jTextField1.getText();
        name=jTextField2.getText();
        cost=jTextField3.getText();
        qty=jTextField4.getText();
        value=jTextField5.getText();
        reorder=jTextField6.getText();
        date=datePicker1.getText();
        
        boolean x = db_con.execute("UPDATE `garmentsystem`.`Raw_Materials`\n" +
"SET\n" +
"`Material_id` = '"+id+"',\n" +
"`Material_Name` = '"+name+"',\n" +
"`Material_cost` = '"+cost+"',\n" +
"`Material_qty` = '"+qty+"',\n" +
"`Material_Value` = '"+value+"',\n" +
"`Material_reorder` = '"+reorder+"',\n" +
"`Material_date` = '"+date+"'\n" +
"WHERE `Material_id` = '"+id+"'");
        
        try
        {
            if (x==true)
            {
                TextBoxClear2();
                TableLoad2();
            }
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        
        

    }
        /*
    
        public void MaterialNameSearch()
    {
            String matname = searchname.getText();
            DB_Connect.DB_ResultSet = db_con.executeQuery("SELECT * FROM garmentsystem.Raw_Materials WHERE Material_Name LIKE '"+matname+"%'");
            jTable2.setModel(DbUtils.resultSetToTableModel(DB_Connect.DB_ResultSet));       
    }
    
    public void ChangeMaterialTableHeader()
    {
        jTable1.getColumnModel().getColumn(0).setHeaderValue("Matrial ID");
        jTable1.getColumnModel().getColumn(1).setHeaderValue("Material Name");
        jTable1.getColumnModel().getColumn(2).setHeaderValue("Material Cost");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("Material Quantity");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("Material Re-Order Level");
        jTable1.getColumnModel().getColumn(5).setHeaderValue("Material Added Date");

    }
    

    
    private void clearSearch()
    {
        searchname.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
*/