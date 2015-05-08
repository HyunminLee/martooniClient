
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JTable;

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
    
    
    public void make_query(String s) throws SQLException{
        
        System.out.println("Coordinator: Trying to query database");
        
        
            System.out.println("Coordinator: making query");
            
            sql_query.make_query(s);
            
            System.out.println("Coordinator: Database responded");
            
            ResultSet rs = sql_query.getResultSet();
            
            ResultSetMetaData rs_meta = sql_query.getResultSetMetaData();
            
            q.update_upon_query(rs, rs_meta);
            
            System.out.println("Coordinator: Updating table");
        
        
        
        //call update table
        
        
    }
    
    public void job_table_clicked(JTable job_table){
        
        int job_id = Integer.parseInt((String)(q.getValueAt(job_table.getSelectedRow(), 0)));
        System.out.println("JOB ID = " + job_id);
        //sql_query
    }
    public void table_clicked(JTable t){
        
        int id = Integer.parseInt((String)(q.getValueAt(t.getSelectedRow(), 0)));
        System.out.println("ROW Number = " + id);
        //sql_query
    }
    public void add_new_client(ArrayList new_client_text){
        
        sql_query.make_update(sql_query.add_new_client(new_client_text, q.get_headers()));
        q.table_changed();
    }
}
