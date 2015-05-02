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
       return "SELECT job_date,  client_name, ven_name, ven_address, ven_city, ven_state, ven_zip, ven_phone\n" +
            "FROM rhorne8db.job, rhorne8db.client, rhorne8db.venue\n" +
            "where client_id = job_cid\n" +
            "and ven_id = job_vid;;";
    }
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
}
