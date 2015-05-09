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
    static final String userName="rhorne8";//will have to change when db is moved to triton
    static final String password="Cosc*7dm4";//put your MySQL password
    private static Connection connection=null;
    ResultSetMetaData meta_rs;
    ResultSet rs;
    String query_statement;
    
    
    public SQL_query(){
        
        
        System.out.println("SQL_query: Constructing new SQL_query object");
        Object newInstance;
        
        try{
            newInstance = Class.forName("com.mysql.jdbc.Driver").newInstance();
            connection = DriverManager.getConnection("jdbc:mysql://localhost:5030/rhorne8db", userName, password);
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
        System.out.println("SQL_query: SQL_query-DriverManager.getConnection - success!");
    }
    //query strings
    public static String get_all_employee_query_string() {
        return "select *  from Contractor;";
    }
    public static String get_show_bartender_query_string() {
       return "select *  from Contractor where con_bartender = 1;";
    }
    public static String show_open_invoices_query_string() {
       return "SELECT job_id , client_name,invoice_owed, invoice_received, (invoice_owed - invoice_received) AS AMT OWED " +
            "FROM  Invoice, Client, Job " +
            "WHERE invoice_cid = client_id " +
            "AND invoice_jid = job_id " +
            "AND (invoice_received < invoice_owed);";
    }
    public static String show_all_invoices_query_string() {
       return "SELECT job_id, client_name,invoice_owed, invoice_received, invoice_owed - invoice_received " +
            "FROM  Invoice, Client, Job " +
            "WHERE invoice_cid = client_id " +
            "AND invoice_jid = job_id;";
    }
    public static String show_all_jobs_query_string() {
       return "SELECT job_id, job_date, client_name, ven_name, ven_address, ven_city, ven_state, ven_zip, ven_phone \n" +
        "FROM Client, Job, Venue \n" +
        "where client_id = job_cid\n" +
        "and ven_id = job_vid;";
    }
    public static String show_all_clients_query_string(){
        return "select * from Client;";
    }
    public static String show_all_clients_email_query_string() {
       return "SELECT client_id, client_name, `client_address` , `client_city`, `client_state`, `client_zip` , `clip_phone` " +
            "`clie_email` " +
            "FROM  Client, ClientEmails`, ClientPhones`" +
            "WHERE client_id = clie_id " +
            "AND client_id = clip_id;";
    }
    public static String get_job_info_contractor(int job_id){
        return "SELECT con_fname,con_lname,conp_phone,conmail_mail " +
            "FROM Contractor,ContractorEmail,ContractorPhones,JobWorkers " +
            "WHERE con_cid = conmail_cid " +
            "AND con_cid = conp_cid " +
            "AND con_cid = jw_cid " +
            "AND jw_jid =" + job_id + ";";
            
    }
    /*
    public static String get_job_info_glassware(int job_id){
        
    }
    */
    public void make_query(String query_string) throws SQLException{
        
        Statement statement = null;
        
        try{
            // Please use your database name here
            String[] results; 

            System.out.println("SQL_query: creating statement");
            
            statement = connection.createStatement();
            
            System.out.println("SQL_query: executing query");
            
            rs = statement.executeQuery(query_string);
            
            System.out.println("SQL_query: Attempting to get metadata");
            
            meta_rs = rs.getMetaData();

            System.out.println("SQL_query: got metadata");

            
            //now to pass results and results meta data


            System.out.println("SQL_query: Connected to db");


            //printTest(rs);
        }
        catch(SQLException e){
            System.err.println("SQL_query: SQL Exception Caught");
            System.err.println("SQLState: " +
                    ((SQLException)e).getSQLState());
            e.printStackTrace();
        }
        finally{
            if(statement != null){
                //statement.close();
            }
        }
    }
    
    public void make_update(String s){
        try{
            
            Statement statement = connection.createStatement();
        
            System.out.println("SQL_query: Attempting Update");
        
            statement.executeUpdate(s);
                
            System.out.println("SQL_query: Update executed");
                
        }
        catch(SQLException e){
            System.err.println("SQL_query/make update: SQL Exception Caught");
            System.err.println("SQLState: " +
                    ((SQLException)e).getSQLState());
            e.printStackTrace();
        };
        
    }
    
    public ResultSet getResultSet()throws SQLException{
        System.out.println("SQL_query: returning resultset");
        return rs;
    }
    public ResultSetMetaData getResultSetMetaData()throws SQLException{
        System.out.println("SQL_query: returning resultset metadata");
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
