
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class QueryTable extends JTable{
    
    public QueryTableModel table_model;
    
    public QueryTable(){
    
        super();
        this.table_model = (QueryTableModel)this.getModel();
        this.rowSelectionAllowed = true;
    }
    
    public void add_employee_table_listeners(){
        
    }
    public void add_invoice_table_listeners(){
        
    }
    
    public void job_table_clicked(){
        System.out.println("Job TABLE Clicked");
    }
}
