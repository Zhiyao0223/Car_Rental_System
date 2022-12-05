package car_rental;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfTemplate;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Graphics2D;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class StaffReportPage extends javax.swing.JFrame implements ValidateProcess, FileProcess {
    Admin admin;
    int currentTab;

    public StaffReportPage(Admin admin) {
        initComponents();
        
        // Set GUI middle of screen
        this.setLocationRelativeTo(null);
        
        // Initialise variable
        this.admin = admin;
        currentTab = -1;
        
        resetTable();
    
        // Set table value at center at active tab
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
    
        adminTable.setDefaultRenderer(String.class, centerRenderer);
        bookingTable.setDefaultRenderer(String.class, centerRenderer);
        carTable.setDefaultRenderer(String.class, centerRenderer);
        paymentTable.setDefaultRenderer(String.class, centerRenderer);
        userTable.setDefaultRenderer(String.class, centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        reportBtn = new javax.swing.JButton();
        tabs = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        adminTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        bookingTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        paymentTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("< Back");
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Reports");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn)
                .addGap(452, 452, 452)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(backBtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Search : ");

        searchBar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        searchBar.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        searchBar.setAlignmentX(1.0F);
        searchBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        reportBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        reportBtn.setText("Generate Report");
        reportBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        reportBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });

        tabs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabs.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsStateChanged(evt);
            }
        });

        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        adminTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        adminTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Admin ID", "Username", "Name", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        adminTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(adminTable);

        tabs.addTab("Admin", jScrollPane2);

        jScrollPane3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bookingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rent ID", "User ID", "Car ID", "Start Date", "End Date", "Total Cost"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        bookingTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(bookingTable);

        tabs.addTab("Booking", jScrollPane3);

        jScrollPane4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car ID", "Car Brand", "Car Model", "Year Made", "Gear", "Cost per hour", "Cost per day", "Cost per week", "Mileage", "Location", "Available Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(carTable);

        tabs.addTab("Cars", jScrollPane4);

        jScrollPane5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        paymentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Payment ID", "Rent ID", "Method", "Date", "Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        paymentTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane5.setViewportView(paymentTable);

        tabs.addTab("Payment", jScrollPane5);

        jScrollPane6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User ID", "Username", "Password", "Phone Number", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane6.setViewportView(userTable);

        tabs.addTab("User", jScrollPane6);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(627, 627, 627))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(tabs, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
                .addGap(21, 21, 21)
                .addComponent(reportBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        new StaffMainPage(admin).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        new StaffReportDetailPage(admin).setVisible(true);
    }//GEN-LAST:event_reportBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        // Check if empty search bar
        if (searchBar.getText().trim().length() == 0) {
            filter(null);
        }
        // Filter search bar
        else {
            filter(searchBar.getText());
        }
    }//GEN-LAST:event_searchBarKeyReleased

    private void tabsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsStateChanged
        resetTable();
        currentTab = tabs.getSelectedIndex();
        filter("");
    }//GEN-LAST:event_tabsStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adminTable;
    private javax.swing.JButton backBtn;
    private javax.swing.JTable bookingTable;
    private javax.swing.JTable carTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable paymentTable;
    private javax.swing.JButton reportBtn;
    private javax.swing.JTextField searchBar;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    
    // Filter table
    private void filter(String query) {  
        DefaultTableModel model = getModel(-1);
        
        // Check if just switch tab, if is reset previous tab filter
        if (tabs.getSelectedIndex() != currentTab) {
            model = getModel(currentTab);
            query = null;
        }
        
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        
        switch (tabs.getSelectedIndex()) {
            case 0:
                adminTable.setRowSorter(tr);
                break;
            case 1:
                bookingTable.setRowSorter(tr);
                break;
            case 2:
                 carTable.setRowSorter(tr);
                break;
            case 3:
                paymentTable.setRowSorter(tr);
                break;
            default:
                userTable.setRowSorter(tr);
        }
        
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
    
    
    // Get model
    private DefaultTableModel getModel(int index) {      
        if (index == -1) index = tabs.getSelectedIndex();

        // Check active tabs
        switch (index) {
            case 0:
                return (DefaultTableModel) adminTable.getModel();
            case 1:
                return (DefaultTableModel) bookingTable.getModel();
            case 2:
                return (DefaultTableModel) carTable.getModel();
            case 3:
                return (DefaultTableModel) paymentTable.getModel();
            default:
                return (DefaultTableModel) userTable.getModel();
        }
    }
    
    
    // Initialise table content
    private void resetTable() {
        // Check if just create frame
        if (currentTab == -1) {
            currentTab = 0;
        }
        
        // Reset search bar
        searchBar.setText("");
        
        // Initialise header and get table model
        String[] header;  
        DefaultTableModel model = getModel(-1);
        model.setRowCount(0);
        
        // Check active tabs
        String path = null;
        switch (tabs.getSelectedIndex()) {
            case 0:
                path = "admin.txt";
                header = new String[] {"Admin ID", "Username", "Name", "Password"};
                break;
            case 1:
                path = "booking.txt";
                header = new String[] {"Rent ID,", "User ID", "Car ID", "Start Date", "End Date", "Total Cost"};
                break;
            case 2:
                path = "cars.txt";
                header = new String[] {"Car ID", "Brand", "Model", "Year", "Gear", "Cost (Hour)", "Cost (Day)", "Cost (Week)", "Mileage", "Location", "Available Status"};
                break;
            case 3:
                path = "payment.txt";
                header = new String[] {"Payment ID", "Rent ID", "Method", "Date", "Time"};
                break;
            default:
                path = "user.txt";
                header = new String[] {"User ID", "Username", "Password", "Phone No", "Email"};
        }
        
        // Get file data
        List <String[]> lineArray = readFile(path);

        // Set header
        model.setColumnIdentifiers(header);

        // Append line array into table
        for (String[] loopArray : lineArray) {
            model.addRow(loopArray);
        }
    }
}
