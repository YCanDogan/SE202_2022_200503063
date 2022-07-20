/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cleaning_service.Customer;
import java_cleaning_service.MitarbeiterReg;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author canba
 */
public class DatabaseHandler extends Configs {

    public Connection sqlConn = null;
    public PreparedStatement pst = null;
    public ResultSet rs = null;

    public PreparedStatement pst_1 = null;
    public PreparedStatement pst_2 = null;
    public PreparedStatement pst_3 = null;
    public PreparedStatement pst_4 = null;
    public PreparedStatement pst_5 = null;

    // CONNECTION: 
    // delete throws part, it could funktionieren.
    public Connection getDbConn() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        sqlConn = DriverManager.getConnection(dataConn, username, password);

        return sqlConn;
    }

    // WRITE: 
    // ADD MITARBEITER: 
    public void addMitarbieter(String id, String name, String sName, String mail, String ava) throws ClassNotFoundException, SQLException {
        String insert = "INSERT INTO " + Const.MITARBEITER_TABLE + "(" + Const.MITARBEITER_ID + "," + Const.MITARBEITER_NAME
                + "," + Const.MITARBEITER_SNAME + "," + Const.MITARBEITER_MAIL + "," + Const.MITARBEITER_AVA + ")"
                + "VALUES(?,?,?,?,?)";

        pst = getDbConn().prepareStatement(insert);

        pst.setString(1, id);
        pst.setString(2, name);
        pst.setString(3, sName);
        pst.setString(4, mail);
        pst.setString(5, ava);

        pst.executeUpdate();

    }

    // ADD CUSTOMER: 
    public void addCustomer(String id, String name, String address, String mobile) throws ClassNotFoundException, SQLException {
        String insert = "INSERT INTO " + Const.CUSTOMER_TABLE + "(" + Const.CUSTOMER_ID + "," + Const.CUSTOMER_NAME
                + "," + Const.CUSTOMER_ADDRESS + "," + Const.CUSTOMER_MOBILE + ")"
                + "VALUES(?,?,?,?)";

        pst = getDbConn().prepareStatement(insert);

        pst.setString(1, id);
        pst.setString(2, name);
        pst.setString(3, address);
        pst.setString(4, mobile);

        pst.executeUpdate();

    }

    // DELETE: 
    // DELETE MITARBEITER:
    public void deleteMitarbeiter(String id) throws SQLException, ClassNotFoundException {

        getDbConn();
        String delete = "DELETE FROM " + Const.MITARBEITER_TABLE + "WHERE" + Const.MITARBEITER_ID + "= " + "?";
        pst = sqlConn.prepareStatement("DELETE FROM cleanapp.mitarbeiter WHERE mitID = ?");

        pst.setString(1, id);

        pst.executeUpdate();

    }

    // READ: 
    // READ MITARBEITER:
    // UPDATE: 
    // UPDATE MITARBEITER:
    // UPDATE DATABASE :
    // UPDATE DATABASE_MITARBEITER:
    public void updateDatabaseMitarbeiter(String id, String name, String sName, String mail, String ava, javax.swing.JTable jTableMit) {

        int q = 0;
        int i = 0;
        int a = 0;
        int deleteItem = 0;

        try {

            getDbConn();
            String updateDb = "SELECT * FROM" + " " + Const.MITARBEITER_TABLE;
            pst = sqlConn.prepareStatement(updateDb);

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) jTableMit.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (i = 1; i <= q; i++) {

                    columnData.add(rs.getShort(id));
                    columnData.add(rs.getShort(name));
                    columnData.add(rs.getShort(sName));
                    columnData.add(rs.getShort(mail));
                    columnData.add(rs.getShort(ava));

                }

                RecordTable.addRow(columnData);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();

        }
    }

    // UPDATE DATABASE_CUSTOMER:
    public void updateDatabaseCustomer(String id, String name, String address, String mobile, javax.swing.JTable jTableMit) {

        int q = 0;
        int i = 0;
        int a = 0;
        int deleteItem = 0;

        try {

            getDbConn();
            String updateDb = "SELECT * FROM" + " " + Const.CUSTOMER_TABLE;
            pst = sqlConn.prepareStatement(updateDb);

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();

            q = stData.getColumnCount();

            DefaultTableModel RecordTable = (DefaultTableModel) jTableMit.getModel();
            RecordTable.setRowCount(0);

            while (rs.next()) {
                Vector columnData = new Vector();

                for (i = 1; i <= q; i++) {

                    columnData.add(rs.getShort(id));
                    columnData.add(rs.getShort(name));
                    columnData.add(rs.getShort(address));
                    columnData.add(rs.getShort(mobile));

                }

                RecordTable.addRow(columnData);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Customer.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();

        }
    }

    // TABLE_UPDATE:
    // MITARBEITER TABLE_UPDATE: 
    public void tableUpdateMitarbeiter(javax.swing.JTable jTableMit) throws ClassNotFoundException, SQLException {

        int c;
        getDbConn();
        String updateDb = "SELECT * FROM" + " " + Const.MITARBEITER_TABLE;
        pst = sqlConn.prepareStatement(updateDb);

        rs = pst.executeQuery();
        ResultSetMetaData Rd = rs.getMetaData();
        c = Rd.getColumnCount();

        DefaultTableModel df = (DefaultTableModel) jTableMit.getModel();
        df.setRowCount(0);

        while (rs.next()) {

            Vector v2 = new Vector();

            for (int i = 1; i <= c; i++) {

                v2.add(rs.getString("mitID"));
                v2.add(rs.getString("mitName"));
                v2.add(rs.getString("mitSname"));
                v2.add(rs.getString("mitMail"));
                v2.add(rs.getString("mitAva"));

            }
            df.addRow(v2);
        }
    }

    // TABLE_UPDATE CUSTOMER: 
    public void tableUpdateCustomer(javax.swing.JTable jTableMit) throws ClassNotFoundException, SQLException {

        int c;
        getDbConn();
        String updateDb = "SELECT * FROM" + " " + Const.CUSTOMER_TABLE;
        pst = sqlConn.prepareStatement(updateDb);

        rs = pst.executeQuery();
        ResultSetMetaData Rd = rs.getMetaData();
        c = Rd.getColumnCount();

        DefaultTableModel df = (DefaultTableModel) jTableMit.getModel();
        df.setRowCount(0);

        while (rs.next()) {

            Vector v2 = new Vector();

            for (int i = 1; i <= c; i++) {

                v2.add(rs.getString("cust_id"));
                v2.add(rs.getString("name"));
                v2.add(rs.getString("address"));
                v2.add(rs.getString("mobile"));

            }
            df.addRow(v2);
        }
    }

    // TABLE UPDATE RETURNMIT: 
    public void tableUpdateReturnmit(javax.swing.JTable jTableMit) throws ClassNotFoundException, SQLException {

        int c;
        getDbConn();
        String updateDb = "SELECT * FROM" + " " + Const.RETURNMIT_TABLE;
        pst = sqlConn.prepareStatement(updateDb);

        rs = pst.executeQuery();
        ResultSetMetaData Rd = rs.getMetaData();
        c = Rd.getColumnCount();

        DefaultTableModel df = (DefaultTableModel) jTableMit.getModel();
        df.setRowCount(0);

        while (rs.next()) {

            Vector v2 = new Vector();

            for (int i = 1; i <= c; i++) {

                v2.add(rs.getString("idMit"));
                v2.add(rs.getString("idCust"));
                v2.add(rs.getString("returnDate"));
                v2.add(rs.getString("elapDate"));
                v2.add(rs.getString("kost"));

            }
            df.addRow(v2);
        }
    }

    // returnMit Page: 
    // button1ActionPerformed: 
    public void button1ActionReturnMit(String mit_id, String cust_id, String datum, String duedatum, String kost) throws ClassNotFoundException, SQLException {

        // Database Connection
        getDbConn();

        // other codes for connection:
        this.pst = this.sqlConn.prepareStatement("insert into cleanapp.returnmit(idMit, idCust, returnDate, elapDate, kost)values(?, ?, ?, ?, ?)");

        this.pst.setString(1, mit_id);
        this.pst.setString(2, cust_id);
        this.pst.setString(3, datum);
        this.pst.setString(4, duedatum);
        this.pst.setString(5, kost);
        this.pst.executeUpdate();

        // Now we are going to update mitarbeiter table from cleanapp database.
        pst_1 = sqlConn.prepareStatement("UPDATE cleanapp.mitarbeiter SET mitAva = 'Yes' WHERE mitID = ?");
        pst_1.setString(1, mit_id);
        pst_1.executeUpdate();

        // delete from task table from cleanapp database: 
        pst_2 = sqlConn.prepareStatement("DELETE FROM cleanapp.task WHERE mitID = ?");
        pst_2.setString(1, mit_id);
        pst_2.executeUpdate();

    }

    /**
     *
     * @param txtMitID
     * @param txtCustID
     * @param txtDatum
     * @param txtDateElapsed
     * @param txtKost
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void mitIdKeyPressedReturnMit(javax.swing.JTextField txtMitID, javax.swing.JTextField txtCustID, javax.swing.JTextField txtDatum, javax.swing.JTextField txtDateElapsed, javax.swing.JTextField txtKost) throws ClassNotFoundException, SQLException {
        // get DB connection: 
        getDbConn();

        String mit_id = txtMitID.getText();

        this.pst = sqlConn.prepareStatement("SELECT mitID, cust_id, due, DATEDIFF(NOW(), due) as elap from cleanapp.task WHERE mitID = ?");
        this.pst.setString(1, mit_id);

        rs = pst.executeQuery();

        if (rs.next() == false) {

            // Leider kann man das nicht machen
            //JOptionPane.showMessageDialog(this, "Mitarbeiter ID hat nicht gefunden.");
        } else {

            // Dikkkat --> Olmazsa deneme yanılma yap.
            // Vİdeoda custid yapıyor.
            String cust_id = rs.getString("cust_id");
            txtCustID.setText(cust_id.trim());

            String duedatum = rs.getString("due");
            txtDatum.setText(duedatum.trim());

            String elap = rs.getString("elap");
            int elaped = Integer.parseInt(elap);

            if (elaped > 0) {

                txtDateElapsed.setText(elap);

                int kost = elaped * 500;

                txtKost.setText(String.valueOf(kost));

            } else {

                txtDateElapsed.setText("0");
                txtKost.setText("0");

            }

        }

    }

    // ARBEIT CLASS: 
    // LoadCatWorker():
    public void loadCatWorkerArbeit(javax.swing.JComboBox<String> ArbtComboMitID) throws ClassNotFoundException, SQLException {
        getDbConn();

        pst = sqlConn.prepareStatement("SELECT * FROM cleanapp.mitarbeiter");

        rs = pst.executeQuery();

        ArbtComboMitID.removeAllItems();

        while (rs.next()) {

            // For my database IN video WRITE "2" --> IMPORTANT
            ArbtComboMitID.addItem(rs.getString(2));

        }

    }

    // ArbtbuttonOkActionPerformed(): 
    public void arbtbuttonOkArbeit(String mitID, String cust_id, String arbtKost, String date, String duedate) throws ClassNotFoundException, SQLException {
        getDbConn();

        this.pst_3 = sqlConn.prepareStatement("insert into task(mitID, cust_id, fee, date, due)values(?, ?, ?, ?, ?)");
        this.pst_3.setString(1, mitID);
        this.pst_3.setString(2, cust_id);
        this.pst_3.setString(3, arbtKost);
        this.pst_3.setString(4, date);
        this.pst_3.setString(5, duedate);
        this.pst_3.executeUpdate();

        pst_4 = sqlConn.prepareStatement("update mitarbeiter set mitAva = 'No' where mitID = ?");
        pst_4.setString(1, mitID);

        pst_4.executeUpdate();
    }

    // ArbtComboMitIDActionPerformed(java.awt.event.ActionEvent evt): 
    public void arbtComboMitIDArbeit(String mit_id, javax.swing.JTextField txtAva, com.toedter.calendar.JDateChooser ArbtdateDatum, com.toedter.calendar.JDateChooser ArbtdateDueDatum, javax.swing.JTextField ArbttxtArbKost, javax.swing.JTextField ArbttxtCustID, javax.swing.JTextField ArbttxtCustName) throws ClassNotFoundException, SQLException {

        getDbConn();

        this.pst_1 = sqlConn.prepareStatement("SELECT * FROM cleanapp.mitarbeiter WHERE mitID = ?");

        // Be careful, if doesn't work create new table for worker He writes for his code 1 --> IMPORTANT
        this.pst_1.setString(1, mit_id);

        rs = pst.executeQuery();

        if (rs.next() == false) {

            // Leider ich muss dies auch löschen
            //JOptionPane.showMessageDialog(this, "Es gibt keine Mitarbeiter...");
        } else {

            // very important connected with database 
            String aval = rs.getString("mitAva");
            txtAva.setText(aval.trim());

            if (aval.equals("Yes")) {

                ArbttxtCustID.setEnabled(true);
                ArbttxtCustName.setEnabled(true);
                ArbttxtArbKost.setEnabled(true);
                ArbtdateDatum.setEnabled(true);
                ArbtdateDueDatum.setEnabled(true);

            }
        }
    }

    // ArbttxtCustIDKeyPressed(): 
    public void arbttextCustIDKeyPressedArbeit(String cust_id, javax.swing.JTextField ArbttxtCustName) throws ClassNotFoundException, SQLException {
        getDbConn();

        pst_2 = sqlConn.prepareStatement("SELECT * FROM customer WHERE cust_id = ?");
        // after commenter line is important for other things 
        // such as mitarbeiter database creation: 

        pst_2.setString(1, cust_id);

        rs = pst_2.executeQuery();

        if (rs.next() == false) {
            // Ich werde das auch löschen auf gleiche Grund
            //JOptionPane.showMessageDialog(this, "Es gibt keine Customer...");

        } else {

            String custname = rs.getString("name");
            ArbttxtCustName.setText(custname.trim());

        }
    }

    // CUSTOMER REGISTIRATION: 
    // CustID():
    public void custIdCustomer(javax.swing.JTextField txtcustid) throws ClassNotFoundException, SQLException {
        getDbConn();
        Statement s = sqlConn.createStatement();

        ResultSet rs = s.executeQuery("SELECT Max(cust_id) FROM cleanapp.customer");
        rs.next();
        rs.getString("Max(cust_id)");

        if (rs.getString("Max(cust_id)") == null) {

            txtcustid.setText(String.format("C0001"));
        } else {
            long id = Long.parseLong(rs.getString("Max(cust_id)").substring(2, rs.getString("Max(cust_id)").length()));
            id++;

            txtcustid.setText("C0" + String.format("%03d", id));
        }

    }

    // MITARBEITER REGISTIRATION: 
    // MitId():
    public void mitIdMitarbeiter(javax.swing.JTextField txtMitId) throws ClassNotFoundException, SQLException {
        getDbConn();
        Statement s = sqlConn.createStatement();

        rs = s.executeQuery("SELECT Max(mitID) FROM cleanapp.mitarbeiter");
        rs.next();
        rs.getString("Max(mitID)");

        if (rs.getString("Max(mitID)") != null) {

            txtMitId.setText(String.format("M00001"));

        } else {
            long id = Long.parseLong(rs.getString("Max(mitID)").substring(2, rs.getString("Max(mitID)").length()));
            id++;

            txtMitId.setText("M0" + String.format("%03d", id));
        }
    }

    // MITARBEITER REGISTIRATOIN: 
    // JButtonMainEditActionPerformed(java.awt.event.ActionEvent evt): 
    public void mitUpdateEditMitarbeiter(String name, String sname, String mail, String ava, String id) throws ClassNotFoundException, SQLException {
        getDbConn();
        pst = sqlConn.prepareStatement("UPDATE mitID SET cleanapp.mitarbeiter SET mitName = ?, mitSname = ?, mitMail = ?, mitAva = ?, WHERE mitID = ?");

        pst.setString(1, name);
        pst.setString(2, sname);
        pst.setString(3, mail);
        pst.setString(4, ava);
        pst.setString(5, id);

        pst.executeUpdate();
    }

}
