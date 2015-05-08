/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQL_query {
    static final String userName="root";//will have to change when db is moved to triton
    static final String password="";//put your MySQL password
    private static Connection connection=null;
    ResultSetMetaData meta_rs;
    ResultSet rs;
    String query_statement;
    
    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.lang.InstantiationException
     * @throws java.lang.IllegalAccessException
     * @throws java.sql.SQLException
     */
    public SQL_query(){
        
        
        System.out.println("Constructing new SQL_query object");
        Object newInstance;
        
        try{
            newInstance = Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/rhorne8db", userName, password);
        }
        catch(SQLException e){
            System.err.println("SQL Exception caught");
        }
        catch(ClassNotFoundException e){
            System.err.println("Class was not found");
        }
        catch(InstantiationException e){
            System.err.println("InstantiationException");
        }
        
        catch(IllegalAccessException e){
            System.err.println("IllegalAccessException");
        }
        System.out.println("SQL_query-DriverManager.getConnection - success!");
    }
    //query strings
    public static String get_all_employee_query_string() {
        return "select con_fname, con_lname, con_ssn, con_address  from rhorne8db.contractor;";
    }
    public static String get_show_bartender_query_string() {
       return "select *  from rhorne8db.contractor where con_bartender = 1;";
    }
    public static String show_open_invoices_query_string() {
       return "SELECT job_id , client_name,invoice_owed, invoice_received, (invoice_owed - invoice_received) AS `AMOUNT DUE` " +
            "FROM  rhorne8db.invoice, rhorne8db.client, rhorne8db.job\n" +
            "WHERE invoice_cid = client_id\n" +
            "AND invoice_jid = job_id\n" +
            "AND (invoice_received < invoice_owed);";
    }
    public static String show_all_invoices_query_string() {
       return "SELECT job_id, client_name,invoice_owed, invoice_received, (invoice_owed - invoice_received) AS `AMOUNT DUE`" +
            "FROM  rhorne8db.invoice, rhorne8db.client, rhorne8db.job\n" +
            "WHERE invoice_cid = client_id\n" +
            "AND invoice_jid = job_id;";
    }
    public static String show_all_jobs_query_string() {
       return "SELECT job_id, job_date, client_name, ven_name, ven_address, ven_city, ven_state, ven_zip, ven_phone\n" +
            "FROM rhorne8db.job, rhorne8db.client, rhorne8db.venue\n" +
            "where client_id = job_cid\n" +
            "and ven_id = job_vid;";
    }
    public static String show_all_clients_query_string(){
        return "select * from rhorne8db.client;";
    }
    public static String show_all_clients_email_query_string() {
       return "SELECT client_id, client_name AS Name, `client_address` AS `Street NO`, `client_city` AS `City`, `client_state` AS `STATE`, `client_zip` AS `ZIPCODE` , `clip_phone` AS `PHONE`,\n" +
            "`clie_email` AS `EMAIL`\n" +
            "FROM `rhorne8db`.`client`, `rhorne8db`.`clientemails`, `rhorne8db`.`clientphones`\n" +
            "WHERE client_id = clie_id \n" +
            "AND client_id = clip_id;";
    }
    public static String get_job_info_contractor(int job_id){
        return "SELECT con_fname,con_lname,conp_phone,conmail_mail \n" +
            "FROM contractor,contractoremail,contractorphones,jobworkers\n" +
            "WHERE con_cid = conmail_cid\n" +
            "AND con_cid = conp_cid\n" +
            "AND con_cid = jw_cid\n" +
            "AND jw_jid =" + job_id + ";";
            
    }
    /*
    public static String get_job_info_glassware(int job_id){
        
    }
    */
    public void make_query(String query_string){
        try{
        // Please use your database name here
        String[] results; 
        
        
        Statement statement = connection.createStatement();
        
        rs = statement.executeQuery(query_string);
        meta_rs = rs.getMetaData();
        
        //now to pass results and results meta data
         
        
        System.out.println("Connected to db");
        
        
        printTest(rs);
        }
        catch(SQLException e){};
    }
    
    public void make_update(String s){
        try{
            
            Statement statement = connection.createStatement();
        
            System.out.println("Attempting Update");
        
            statement.executeUpdate(s);
                
            System.out.println("Update executed");
                
        }
        catch(SQLException e){};
        
    }
    
    public ResultSet getResultSet(){
        System.out.println("returning resultset");
        return rs;
    }
    public ResultSetMetaData getResultSetMetaData(){
        System.out.println("returning resultset metadata");
        return meta_rs;
    }
    public int getColumnCount()throws SQLException{
        
        return meta_rs.getColumnCount();
    }
    public void printTest(ResultSet r)throws SQLException{
        while(r.next()){
                System.out.print(r.getString("con_fname"));
                System.out.print("    ");
                System.out.print(r.getString("con_lname"));
                System.out.print("    ");
                System.out.print(r.getString("con_ssn"));
                System.out.print("    ");
                System.out.print(r.getString("con_address"));
                System.out.println();
        }
        r.beforeFirst();
        
    }
    public String add_new_client(ArrayList new_client_text, String[] headers){
        String update = null;
        
        update = "INSERT INTO rhorne8db.Client ("  + headers[1] + "," + headers[2] +"," + headers[3] + "," + headers[4] + ","
                + headers[5] + ")" + " VALUES (\""+ new_client_text.get(0) + "\",\""  + new_client_text.get(1) + "\",\""  + new_client_text.get(2) + "\",\""  
                + new_client_text.get(3) + "\",\""  + new_client_text.get(4) + "\");" ;
        
        System.out.println(update);
        return update;
        
    }
}
