package car_rental;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class StaffRentInfoPage extends javax.swing.JFrame implements ValidateProcess, FileProcess {
    Admin admin;
    int listPointer;

    public StaffRentInfoPage(Admin tmpAdmin) {
        initComponents();
        
        // Set GUI middle of screen
        this.setLocationRelativeTo(null);
        
        // Set Variable
        listPointer = 0;
        admin = tmpAdmin;
        
        // Import data from .txt file
        resetTable();
        
        // Set sorter
        DefaultTableModel model = (DefaultTableModel) rentTable.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        rentTable.setRowSorter(sorter);
        
        // Set table value at center at active tab
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment( SwingConstants.CENTER );
    
        rentTable.setDefaultRenderer(String.class, centerRenderer);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        editButton = new javax.swing.JButton();
        tabPanel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        rentTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rentIdField = new javax.swing.JTextField();
        userIdField = new javax.swing.JTextField();
        totalCostField = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        mostNextBtn = new javax.swing.JButton();
        mostBackBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        startDateField = new com.toedter.calendar.JDateChooser();
        endDateField = new com.toedter.calendar.JDateChooser();
        carIdField = new javax.swing.JComboBox<>();
        searchText = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 153, 255));

        backButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("< Back");
        backButton.setBorder(null);
        backButton.setBorderPainted(false);
        backButton.setContentAreaFilled(false);
        backButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backButton.setFocusPainted(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rent");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(642, 642, 642)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setText("Edit");
        editButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        tabPanel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabPanelStateChanged(evt);
            }
        });

        rentTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rent ID", "User ID", "Car ID", "Start Date", "End Date", "Total Cost (RM)"
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
        rentTable.setRowHeight(25);
        jScrollPane2.setViewportView(rentTable);
        rentTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        tabPanel.addTab("Table", jScrollPane2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Rent ID             :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("User ID              :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("End Date :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Car ID                :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Start Date  :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Total Cost  :");

        rentIdField.setEditable(false);
        rentIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rentIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        rentIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        rentIdField.setMargin(new java.awt.Insets(30, 30, 30, 30));

        userIdField.setEditable(false);
        userIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        userIdField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        totalCostField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalCostField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        totalCostField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nextBtn.setBackground(new java.awt.Color(0, 204, 204));
        nextBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextBtn.setText(">");
        nextBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        mostNextBtn.setBackground(new java.awt.Color(0, 204, 204));
        mostNextBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostNextBtn.setText(">>");
        mostNextBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostNextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostNextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostNextBtnActionPerformed(evt);
            }
        });

        mostBackBtn.setBackground(new java.awt.Color(0, 204, 204));
        mostBackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostBackBtn.setText("<<");
        mostBackBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostBackBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(0, 204, 204));
        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backBtn.setText("<");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        carIdField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carIdField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carIdField.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(mostBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(mostNextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(rentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                                .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(carIdField, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(userIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(endDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addGap(18, 18, 18)
                                            .addComponent(totalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))))))))
                .addGap(188, 188, 188))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostNextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(startDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(rentIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addComponent(userIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(endDateField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalCostField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel10)
                    .addComponent(carIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        tabPanel.addTab("List", jPanel3);

        searchText.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchText.setText("Search : ");

        searchBar.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        searchBar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchBar.setAlignmentX(1.0F);
        searchBar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchText)
                        .addGap(18, 18, 18)
                        .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(666, 666, 666)
                            .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabPanel)
                .addGap(18, 18, 18)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new StaffMainPage(admin).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void tabPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPanelStateChanged
        // Check active panel
        if (tabPanel.getSelectedIndex() == 1) {
            searchText.setVisible(false);
            searchBar.setVisible(false);
        }
        else {
            editButton.setVisible(true);
            searchText.setVisible(true);
            searchBar.setVisible(true);
            
            searchBar.setText("");
        }
    }//GEN-LAST:event_tabPanelStateChanged

    private void mostBackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostBackBtnActionPerformed
        if (listPointer == 0) {
            JOptionPane.showMessageDialog(null, "Eh this is first data already weh");
            return;
        }
        
        listPointer = 0;
        List <String[]> lineArray = readFile("booking.txt");
        setListTab(lineArray, 0);
    }//GEN-LAST:event_mostBackBtnActionPerformed

    private void mostNextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostNextBtnActionPerformed
        List <String[]> lineArray = readFile("booking.txt");
        
        if (listPointer == lineArray.size()-1) {
            JOptionPane.showMessageDialog(null, "Last data lorrr");
            return;
        }
        
        listPointer = lineArray.size()-1;
        setListTab(lineArray, listPointer);
    }//GEN-LAST:event_mostNextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        List <String[]> lineArray = readFile("booking.txt");
        
        if (listPointer == 0) {
            JOptionPane.showMessageDialog(null, "Eh this is first data already weh");
            return;
        }
        
        listPointer -= 1;
        setListTab(lineArray, listPointer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        List <String[]> lineArray = readFile("booking.txt");
        
        if (listPointer == lineArray.size()-1) {
            JOptionPane.showMessageDialog(null, "Last data lorrr");
            return;
        }
        
        listPointer += 1;
        setListTab(lineArray, listPointer);
    }//GEN-LAST:event_nextBtnActionPerformed

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

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // Get file data
        List <String[]> lineArray = readFile("booking.txt");        

        // Check tab
        if (tabPanel.getSelectedIndex() == 0) {
            // Switch to list tab for edit
            tabPanel.setSelectedIndex(1);

            // Set value in list tab
            setListTab(lineArray, rentTable.getSelectedRow());
            listPointer = rentTable.getSelectedRow();
            return;
        }

        // Display confirmation
        String confirmation = "Confirm Edit " + rentIdField.getText() + " ?";
        int input = JOptionPane.showConfirmDialog(null, confirmation);

        // Delete from file
        if (input == 0) {
            // Initialise array to store row data
            String[] newData = getListTab();
            
            // Return if invalid date format
            if (newData == null) {
                return;
            }

            // Validate data
            if (!(checkInt(newData[5]))) {
                JOptionPane.showMessageDialog(null, "Invalid data format. Please double check ya");
                return;
            }
            else if (!checkDate(newData[3], newData[4])) {
                return;
            }
            else if (!checkAvailableStatus(lineArray, listPointer , newData[2], newData[3], newData[4])) {
                return;
            }
            
            boolean editStatus = editFile(newData, "booking.txt");

            if (editStatus) {
                // Add edit record into log file
                new Log(admin, "booking.txt").writeLog(4);

                // Update table to latest
                JOptionPane.showMessageDialog(null, "Edit successfully");

                DefaultTableModel model = (DefaultTableModel) rentTable.getModel();
                model.setRowCount(0);

                resetTable();

                // Switch back table view
                tabPanel.setSelectedIndex(0);
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Add login record into log file
        new Log(admin, null).writeLog(2);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> carIdField;
    private javax.swing.JButton editButton;
    private com.toedter.calendar.JDateChooser endDateField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostBackBtn;
    private javax.swing.JButton mostNextBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField rentIdField;
    private javax.swing.JTable rentTable;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel searchText;
    private com.toedter.calendar.JDateChooser startDateField;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextField totalCostField;
    private javax.swing.JTextField userIdField;
    // End of variables declaration//GEN-END:variables

    
    // Initialise table content
    private void resetTable() {
        // Initialise header and get table model
        String[] header = {"Rent ID", "User ID", "Car ID", "Start Date", "End Date", "Total Cost"};  
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();
        
        // Get file data
        List <String[]> lineArray = readFile("booking.txt");

        // Set header
        model.setColumnIdentifiers(header);

        // Append line array into table
        for (String[] loopArray : lineArray) {
            model.addRow(loopArray);
        }
        
        addCarComboBox();
        setListTab(lineArray, 0);
        editButton.setVisible(true);

    }
    
    
    // Initialise value in second tab list
    private void setListTab(List <String[]> lineArray, int index) {        
        // Initialise variable
        Date startDate = null, endDate = null;
        
        // Get index data from array
        String[] firstData = lineArray.get(index);
        
        // Convert string to date
        try {  
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(firstData[3]);
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(firstData[4]);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Errorr: " + e);
        }
        
        // Set text
        rentIdField.setText(firstData[0]);
        userIdField.setText(firstData[1]);
        carIdField.setSelectedItem(firstData[2]);
        totalCostField.setText(firstData[5].substring(2));
        startDateField.setDate(startDate);
        endDateField.setDate(endDate);
        
        Date today = new Date();
        if (endDate.compareTo(today) > 0) checkOldData(false);
        else checkOldData(true);
    }
    
    // Get list value
    private String[] getListTab() {
        String[] listData;
        
        // Format date field
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            listData = new String[] {
                    rentIdField.getText(),
                    userIdField.getText(),
                    carIdField.getSelectedItem().toString(),
                    sdf.format(startDateField.getDate()),
                    sdf.format(endDateField.getDate()),
                    totalCostField.getText()
            };
        } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid data format. Please double check ya");
                return null;
        }
        return listData;
    }
    
    
    // Filter table
    private void filter(String query) {
        DefaultTableModel model = (DefaultTableModel) rentTable.getModel();
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        rentTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
        
        // Reset selected row
        rentTable.getSelectionModel().clearSelection();
    }

    private void addCarComboBox() {
        // Reset combobox
        carIdField.removeAllItems();
        
        // Read car from 
        List<String[]> lineArray = readFile("cars.txt");
        
        for (String[] lines : lineArray) {
            carIdField.addItem(lines[0]);
        }
    }
    
    private void checkOldData(boolean status) {
        if (status) {
            editButton.setVisible(false);
            startDateField.setEnabled(false);
            endDateField.setEnabled(false);
            carIdField.setEnabled(false);
            totalCostField.setEnabled(false);
        }
        else {
            editButton.setVisible(true);
            startDateField.setEnabled(true);
            endDateField.setEnabled(true);
            carIdField.setEnabled(true);
            totalCostField.setEnabled(true);
        }
    }
}
