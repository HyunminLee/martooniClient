
import java.awt.event.MouseAdapter;
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
public class QueryTable extends JTable{
    public QueryTable(){
        super();
    }
    public void add_listeners(){
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                
            }
        });
        
    }
}
