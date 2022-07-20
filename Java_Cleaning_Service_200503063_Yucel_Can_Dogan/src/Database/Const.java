package Database;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author canba
 */
public class Const {

    // TABLE_NAMES: 
    // Don't forget to upgrade database schema at documentation --> IMPORTANT 
    public static final String MITARBEITER_TABLE = "cleanapp.mitarbeiter";
    public static final String CUSTOMER_TABLE = "cleanapp.customer";
    public static final String RETURNMIT_TABLE = "cleanapp.returnmit";
    public static final String TASK_TABLE = "cleanapp.task";

    // COLUMN_NAMES:
    // MITARBEITER_TABLE, COLUMNS: 
    // I don't write idmitarbeiter --> IMPORTANT
    public static final String MITARBEITER_ID = "mitID";
    public static final String MITARBEITER_NAME = "mitName";
    public static final String MITARBEITER_SNAME = "mitSname";
    public static final String MITARBEITER_MAIL = "mitMail";
    public static final String MITARBEITER_AVA = "mitAva";

    // CUSTOMER_TABLE, COLUMNS: 
    // I don't write id --> IMPORTANT
    public static final String CUSTOMER_ID = "cust_id";
    public static final String CUSTOMER_NAME = "name";
    public static final String CUSTOMER_ADDRESS = "address";
    public static final String CUSTOMER_MOBILE = "mobile";

    // RETURNMIT_TABLE, COLUMNS: 
    // I don't write ID --> IMPORTANT
    public static final String RETURNMIT_IDMIT = "idMit";
    public static final String RETURNMIT_IDCUST = "idCust";
    public static final String RETURNMIT_RETURNDATE = "returnDate";
    public static final String RETURNMIT_ELAPDATE = "elapDate";
    public static final String RETURNMIT_KOST = "kost";

    // TASK_TABLE, COLUMNS: 
    // I don't write id --> IMPORTANT
    public static final String TASK_MITID = "mitID";
    public static final String TASK_CUSTID = "cust_id";
    public static final String TASK_FEE = "fee";
    public static final String TASK_DATE = "date";
    public static final String TASK_DUE = "due";

}
