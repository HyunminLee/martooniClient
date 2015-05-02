
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class Coordinator {
    SQL_query sql_query;
    QueryTableModel q;
    
    
    public Coordinator(QueryTableModel q){
        this.q = q;
        sql_query = new SQL_query();
    }
    
    
    public void make_query(String s){
        
        System.out.println("Trying to query database");
        
        try{
            sql_query.make_query(s);
            
            System.out.println("Database responded");
            
            update_q_table(sql_query.getResultSet(), sql_query.getResultSetMetaData());
            
            System.out.println("Updating table");
        }
        catch(SQLException e){
            System.err.println("SQL Exception caught");
        }
        catch(ClassNotFoundException e){ 
            System.err.println("ClassNotFoundException");
        }
        catch(InstantiationException e){
            System.err.println("InstantiationException");
        }
        catch(IllegalAccessException e){
            System.err.println("IllegalAccessException");
        }
        
        //call update table
        
        
    }
    public void update_q_table(ResultSet rs, ResultSetMetaData rs_meta)throws SQLException,ClassNotFoundException,InstantiationException,IllegalAccessException{
        System.out.println("Calling update_upon_query method");
        q.update_upon_query(rs, rs_meta);
        System.out.println("Called update_upon_query method");
        
    }
    
    
}
