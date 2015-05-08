
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import java.util.*;
import java.awt.*;
import java.awt.event.*;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class QueryTableModel extends AbstractTableModel{
    
    ResultSet rs;
    ResultSetMetaData rs_meta;
    ArrayList<String[]> table_data;
    String[] headers;
    int col_count;
    ListSelectionModel list_selection_model;
    
    public QueryTableModel(){
        super();
        this.addTableModelListener(new QueryTableModelListener(this));
        
        
        
        //setup default table info
        table_data = new ArrayList<>(4);
        col_count =4;
        headers = new String[4];
    }
    
    @Override
    public Object getValueAt(int row, int col) { 
        //System.out.println("getValueat being called for row " + row + " and col " + col );
        return ((String[]) table_data.get(row))[col];
    }
    @Override
    public int getRowCount(){
        return table_data.size();
    }
    @Override
    public int getColumnCount(){
       return col_count;
    }
    
    @Override
    public String getColumnName(int i){
        return headers[i];
    }
    public void update_upon_query(ResultSet rs, ResultSetMetaData rs_meta){
        //get number of columns for table
        
        table_data = new ArrayList<>();
        
        try{
            
            //System.out.println("QueryTableModel: update_upon_query SUCCESS");
            col_count = rs_meta.getColumnCount();

            //System.out.println("Column count success");

            //get column names from meta data
            headers = new String[col_count];
            
            System.out.println("Headers: ");
            
            for(int i = 0; i < col_count; i++){
                headers[i] = rs_meta.getColumnName(i + 1);
                System.out.print(headers[i] + "     ");
            }

            //now add data from result set to our arraylist
            while(rs.next()){
                String[] td = new String[col_count];

                for(int i = 0 ; i< col_count; i++){
                    //remeber that SQL starts its records at 1, NOT 0!!!!!!!!!!!!!!
                    td[i] = rs.getString(i + 1);
                    System.out.print(td[i] + "     ");

                }
                System.out.println("");
                //add our new string array to the array list
                table_data.add(td);
            }

            table_changed();
        }
        catch(SQLException e){
            System.err.println("!!!");
        }
        
    }
    
    public class QueryTableModelListener implements TableModelListener{
        QueryTableModel q;
        
        public QueryTableModelListener(QueryTableModel q){
            this.q = q;
        }
        @Override
        public void tableChanged(TableModelEvent e){
            System.out.println("Table event was called");
        }
    }
    @Override
    public boolean isCellEditable(int row, int column){
        return true;
    }
    
    public String[] get_headers(){
        return headers;
    }
    public void table_changed(){
        System.out.println("Columns :" + getColumnCount());
        System.out.println("Rows :" + getRowCount());
        fireTableChanged(null);
    }
}

