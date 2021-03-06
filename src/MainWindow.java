
import java.sql.SQLException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelListener;
import javax.swing.event.TableModelEvent;
import javax.swing.plaf.basic.BasicListUI;
import java.awt.event.MouseEvent;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Robert
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow

     */
    
    Coordinator c;
    QueryTableModel query_table;
    
    public MainWindow()  {
        query_table = new QueryTableModel();
        
        c = new Coordinator(query_table);
        
        System.out.println("Coordinator created");
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        job_jPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        job_table = new javax.swing.JTable();
        search_all_jobs_Button = new javax.swing.JButton();
        show_all_jobs_jLabel = new javax.swing.JLabel();
        search_only_bartenders_jLabel1 = new javax.swing.JLabel();
        search_only_bartenders_jButton1 = new javax.swing.JButton();
        header_label2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        job_text_area = new javax.swing.JTextArea();
        invoice_jPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        invoice_table = new javax.swing.JTable();
        search_all_invoices_Button = new javax.swing.JButton();
        search_all_invoices_jLabel = new javax.swing.JLabel();
        show_open_invoices_jLabel = new javax.swing.JLabel();
        search_open_invoices_jButton = new javax.swing.JButton();
        header_label1 = new javax.swing.JLabel();
        emp_jPanel = new javax.swing.JPanel();
        search_all_employees_Button = new javax.swing.JButton();
        search_all_employees_jLabel = new javax.swing.JLabel();
        search_only_bartenders_jLabel = new javax.swing.JLabel();
        search_only_bartenders_jButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emp_table = new javax.swing.JTable();
        header_label = new javax.swing.JLabel();
        client_jPanel = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        client_table = new javax.swing.JTable();
        search_all_clients_Button = new javax.swing.JButton();
        show_all_jobs_jLabel1 = new javax.swing.JLabel();
        header_label3 = new javax.swing.JLabel();
        client_text_field_1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        client_text_field_2 = new javax.swing.JTextField();
        client_text_field_3 = new javax.swing.JTextField();
        client_text_field_4 = new javax.swing.JTextField();
        client_text_field_5 = new javax.swing.JTextField();
        add_client_button = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        job_table.setModel(query_table);
        job_table.setFillsViewportHeight(true);
        jScrollPane3.setViewportView(job_table);
        job_table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                table_clicked();
            }
        });

        search_all_jobs_Button.setText("Search");
        search_all_jobs_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_all_jobs_ButtonActionPerformed(evt);
            }
        });

        show_all_jobs_jLabel.setText("Show All Jobs");

        search_only_bartenders_jLabel1.setText("Show Only Bartenders");

        search_only_bartenders_jButton1.setText("Search");
        search_only_bartenders_jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_only_bartenders_jButton1ActionPerformed(evt);
            }
        });

        header_label2.setBackground(new java.awt.Color(255, 255, 255));
        header_label2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        header_label2.setText("MARTOONIS DB ");

        job_text_area.setColumns(20);
        job_text_area.setRows(5);
        jScrollPane5.setViewportView(job_text_area);

        javax.swing.GroupLayout job_jPanelLayout = new javax.swing.GroupLayout(job_jPanel);
        job_jPanel.setLayout(job_jPanelLayout);
        job_jPanelLayout.setHorizontalGroup(
            job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, job_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header_label2)
                .addGap(264, 264, 264))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, job_jPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_only_bartenders_jLabel1)
                    .addComponent(show_all_jobs_jLabel))
                .addGap(18, 18, 18)
                .addGroup(job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_all_jobs_Button)
                    .addComponent(search_only_bartenders_jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 774, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );
        job_jPanelLayout.setVerticalGroup(
            job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(job_jPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(header_label2)
                .addGroup(job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(job_jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_all_jobs_Button)
                            .addComponent(show_all_jobs_jLabel))
                        .addGap(45, 45, 45)
                        .addGroup(job_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_only_bartenders_jLabel1)
                            .addComponent(search_only_bartenders_jButton1)))
                    .addGroup(job_jPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Jobs", job_jPanel);

        invoice_table.setModel(query_table);
        invoice_table.setFillsViewportHeight(true);
        jScrollPane4.setViewportView(invoice_table);

        search_all_invoices_Button.setText("Search");
        search_all_invoices_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_all_invoices_ButtonActionPerformed(evt);
            }
        });

        search_all_invoices_jLabel.setText("Show All Invoices");

        show_open_invoices_jLabel.setText("Show Open Invoices");

        search_open_invoices_jButton.setText("Search");
        search_open_invoices_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_open_invoices_jButtonActionPerformed(evt);
            }
        });

        header_label1.setBackground(new java.awt.Color(255, 255, 255));
        header_label1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        header_label1.setText("MARTOONIS DB ");

        javax.swing.GroupLayout invoice_jPanelLayout = new javax.swing.GroupLayout(invoice_jPanel);
        invoice_jPanel.setLayout(invoice_jPanelLayout);
        invoice_jPanelLayout.setHorizontalGroup(
            invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoice_jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(show_open_invoices_jLabel)
                    .addComponent(search_all_invoices_jLabel))
                .addGap(18, 18, 18)
                .addGroup(invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_all_invoices_Button)
                    .addComponent(search_open_invoices_jButton))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, invoice_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header_label1)
                .addGap(321, 321, 321))
        );
        invoice_jPanelLayout.setVerticalGroup(
            invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoice_jPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(header_label1)
                .addGap(79, 79, 79)
                .addGroup(invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoice_jPanelLayout.createSequentialGroup()
                        .addGroup(invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_all_invoices_Button)
                            .addComponent(search_all_invoices_jLabel))
                        .addGap(45, 45, 45)
                        .addGroup(invoice_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(show_open_invoices_jLabel)
                            .addComponent(search_open_invoices_jButton)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Invoices", invoice_jPanel);

        search_all_employees_Button.setText("Search");
        search_all_employees_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_all_employees_ButtonActionPerformed(evt);
            }
        });

        search_all_employees_jLabel.setText("Show All Employees");

        search_only_bartenders_jLabel.setText("Show Only Bartenders");

        search_only_bartenders_jButton.setText("Search");
        search_only_bartenders_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_only_bartenders_jButtonActionPerformed(evt);
            }
        });

        emp_table.setModel(query_table);
        emp_table.setFillsViewportHeight(true);
        emp_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                emp_tableMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(emp_table);

        header_label.setBackground(new java.awt.Color(255, 255, 255));
        header_label.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        header_label.setText("MARTOONIS DB ");

        javax.swing.GroupLayout emp_jPanelLayout = new javax.swing.GroupLayout(emp_jPanel);
        emp_jPanel.setLayout(emp_jPanelLayout);
        emp_jPanelLayout.setHorizontalGroup(
            emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp_jPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_only_bartenders_jLabel)
                    .addComponent(search_all_employees_jLabel))
                .addGap(18, 18, 18)
                .addGroup(emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(search_all_employees_Button)
                    .addComponent(search_only_bartenders_jButton))
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, emp_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header_label)
                .addGap(259, 259, 259))
        );
        emp_jPanelLayout.setVerticalGroup(
            emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(emp_jPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(header_label)
                .addGap(53, 53, 53)
                .addGroup(emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(emp_jPanelLayout.createSequentialGroup()
                        .addGroup(emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_all_employees_Button)
                            .addComponent(search_all_employees_jLabel))
                        .addGap(45, 45, 45)
                        .addGroup(emp_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_only_bartenders_jLabel)
                            .addComponent(search_only_bartenders_jButton)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(378, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Employee", emp_jPanel);

        client_table.setModel(query_table);
        client_table.setFillsViewportHeight(true);
        jScrollPane6.setViewportView(client_table);
        client_table.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            public void valueChanged(ListSelectionEvent event) {
                table_clicked();
            }
        });

        search_all_clients_Button.setText("Search");
        search_all_clients_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_all_clients_ButtonActionPerformed(evt);
            }
        });

        show_all_jobs_jLabel1.setText("Show All Clients");

        header_label3.setBackground(new java.awt.Color(255, 255, 255));
        header_label3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        header_label3.setText("MARTOONIS DB ");

        client_text_field_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_text_field_1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Street NO");

        jLabel3.setText("City");

        jLabel4.setText("State");

        jLabel5.setText("Zipcode");

        client_text_field_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_text_field_2ActionPerformed(evt);
            }
        });

        client_text_field_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_text_field_3ActionPerformed(evt);
            }
        });

        client_text_field_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_text_field_4ActionPerformed(evt);
            }
        });

        client_text_field_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                client_text_field_5ActionPerformed(evt);
            }
        });

        add_client_button.setText("Add");
        add_client_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_client_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout client_jPanelLayout = new javax.swing.GroupLayout(client_jPanel);
        client_jPanel.setLayout(client_jPanelLayout);
        client_jPanelLayout.setHorizontalGroup(
            client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_jPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(show_all_jobs_jLabel1)
                .addGap(60, 60, 60)
                .addComponent(search_all_clients_Button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 774, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(client_jPanelLayout.createSequentialGroup()
                        .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(client_text_field_1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(client_text_field_2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(96, 96, 96)
                        .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(client_text_field_3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104)
                        .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(client_text_field_4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)
                        .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(client_text_field_5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addComponent(add_client_button, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(68, 68, 68))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, client_jPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(header_label3)
                .addGap(264, 264, 264))
        );
        client_jPanelLayout.setVerticalGroup(
            client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(client_jPanelLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(header_label3)
                .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(client_jPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(search_all_clients_Button)
                            .addComponent(show_all_jobs_jLabel1)))
                    .addGroup(client_jPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(client_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(client_text_field_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_text_field_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_text_field_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_text_field_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(client_text_field_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(add_client_button)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Clients", client_jPanel);

        jScrollPane2.setViewportView(jTextPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(540, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(226, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(563, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emp_tableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emp_tableMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_emp_tableMouseReleased
     
    private void table_clicked(){
        c.job_table_clicked(job_table);
    }
    private void search_only_bartenders_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_only_bartenders_jButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Button pressed");
        c.make_query(SQL_query.get_show_bartender_query_string());
    }//GEN-LAST:event_search_only_bartenders_jButtonActionPerformed

    private void search_all_employees_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_all_employees_ButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Button pressed");
        c.make_query(SQL_query.get_all_employee_query_string());
    }//GEN-LAST:event_search_all_employees_ButtonActionPerformed

    private void search_open_invoices_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_open_invoices_jButtonActionPerformed
        // TODO add your handling code here:
        c.make_query(SQL_query.show_open_invoices_query_string());
    }//GEN-LAST:event_search_open_invoices_jButtonActionPerformed

    private void search_all_invoices_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_all_invoices_ButtonActionPerformed
        // TODO add your handling code here:
        c.make_query(SQL_query.show_all_invoices_query_string());
    }//GEN-LAST:event_search_all_invoices_ButtonActionPerformed

    private void search_only_bartenders_jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_only_bartenders_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_search_only_bartenders_jButton1ActionPerformed

    private void search_all_jobs_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_all_jobs_ButtonActionPerformed
        // TODO add your handling code here:
        c.make_query(SQL_query.show_all_jobs_query_string());
    }//GEN-LAST:event_search_all_jobs_ButtonActionPerformed

    private void search_all_clients_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_all_clients_ButtonActionPerformed
        c.make_query(SQL_query.show_all_clients_query_string());
    }//GEN-LAST:event_search_all_clients_ButtonActionPerformed

    private void client_text_field_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_text_field_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_text_field_1ActionPerformed

    private void client_text_field_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_text_field_2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_text_field_2ActionPerformed

    private void client_text_field_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_text_field_3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_text_field_3ActionPerformed

    private void client_text_field_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_text_field_4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_text_field_4ActionPerformed

    private void client_text_field_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_client_text_field_5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_client_text_field_5ActionPerformed

    private void add_client_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_client_buttonActionPerformed
        // TODO add your handling code here:
        
        ArrayList<String> new_client_text = new ArrayList<>();
        
        String client_text_field_1_string = client_text_field_1.getText();
        String client_text_field_2_string = client_text_field_2.getText();
        String client_text_field_3_string = client_text_field_3.getText();
        String client_text_field_4_string = client_text_field_4.getText();
        String client_text_field_5_string = client_text_field_5.getText();
        
        new_client_text.add(client_text_field_1_string);
        new_client_text.add(client_text_field_2_string);
        new_client_text.add(client_text_field_3_string);
        new_client_text.add(client_text_field_4_string);
        new_client_text.add(client_text_field_5_string);
        c.add_new_client(new_client_text);
        
    
    }//GEN-LAST:event_add_client_buttonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_client_button;
    private javax.swing.JPanel client_jPanel;
    private javax.swing.JTable client_table;
    private javax.swing.JTextField client_text_field_1;
    private javax.swing.JTextField client_text_field_2;
    private javax.swing.JTextField client_text_field_3;
    private javax.swing.JTextField client_text_field_4;
    private javax.swing.JTextField client_text_field_5;
    private javax.swing.JPanel emp_jPanel;
    private javax.swing.JTable emp_table;
    private javax.swing.JLabel header_label;
    private javax.swing.JLabel header_label1;
    private javax.swing.JLabel header_label2;
    private javax.swing.JLabel header_label3;
    private javax.swing.JPanel invoice_jPanel;
    private javax.swing.JTable invoice_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JPanel job_jPanel;
    private javax.swing.JTable job_table;
    private javax.swing.JTextArea job_text_area;
    private javax.swing.JButton search_all_clients_Button;
    private javax.swing.JButton search_all_employees_Button;
    private javax.swing.JLabel search_all_employees_jLabel;
    private javax.swing.JButton search_all_invoices_Button;
    private javax.swing.JLabel search_all_invoices_jLabel;
    private javax.swing.JButton search_all_jobs_Button;
    private javax.swing.JButton search_only_bartenders_jButton;
    private javax.swing.JButton search_only_bartenders_jButton1;
    private javax.swing.JLabel search_only_bartenders_jLabel;
    private javax.swing.JLabel search_only_bartenders_jLabel1;
    private javax.swing.JButton search_open_invoices_jButton;
    private javax.swing.JLabel show_all_jobs_jLabel;
    private javax.swing.JLabel show_all_jobs_jLabel1;
    private javax.swing.JLabel show_open_invoices_jLabel;
    // End of variables declaration//GEN-END:variables
}
