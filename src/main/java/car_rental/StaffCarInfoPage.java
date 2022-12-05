package car_rental;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author USER
 */
public class StaffCarInfoPage extends javax.swing.JFrame implements ValidateProcess, FileProcess {
    Admin admin;
    int listPointer;
    /**
     * Creates new form staffCarInfo
     */
    public StaffCarInfoPage(Admin tmpAdmin) {
        initComponents();
        
        // Set GUI middle of screen
        this.setLocationRelativeTo(null);
        
        // Set Variable
        admin = tmpAdmin;
        listPointer = 0;
        
        // Import data from .txt file
        resetTable();
        
        // Set sorter
        DefaultTableModel model = (DefaultTableModel) carTable.getModel();
        TableRowSorter sorter = new TableRowSorter<>(model);
        carTable.setRowSorter(sorter);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        searchText = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        tabPanel = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        modelField = new javax.swing.JTextField();
        carIDField = new javax.swing.JTextField();
        brandField = new javax.swing.JTextField();
        yearField = new javax.swing.JTextField();
        availableStatus = new javax.swing.JComboBox<>();
        mileageField = new javax.swing.JTextField();
        costDayField = new javax.swing.JTextField();
        locationField = new javax.swing.JTextField();
        costHourField = new javax.swing.JTextField();
        costWeekField = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        mostNextBtn = new javax.swing.JButton();
        mostBackBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        gearField = new javax.swing.JComboBox<>();
        removeButton = new javax.swing.JButton();
        addCarBtn = new javax.swing.JButton();

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
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cars");

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

        carTable.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        carTable.setRowHeight(25);
        jScrollPane2.setViewportView(carTable);
        carTable.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

        tabPanel.addTab("Table", jScrollPane2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Car ID             :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Car Brand      :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Gear               :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Car Model     :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Year Made     :");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Cost (Hour)   :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Cost (Day)     :");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Cost (Week)  :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Location       :");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Available Status :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Mileage        :");

        modelField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        modelField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        modelField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        carIDField.setEditable(false);
        carIDField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        carIDField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        carIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        carIDField.setMargin(new java.awt.Insets(30, 30, 30, 30));

        brandField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        brandField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        brandField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        yearField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yearField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        availableStatus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        availableStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "True", "False" }));
        availableStatus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        availableStatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mileageField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mileageField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        mileageField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        costDayField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        costDayField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costDayField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        locationField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        locationField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        locationField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        costHourField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        costHourField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costHourField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        costWeekField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        costWeekField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        costWeekField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nextBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nextBtn.setText(">");
        nextBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        mostNextBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostNextBtn.setText(">>");
        mostNextBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostNextBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostNextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostNextBtnActionPerformed(evt);
            }
        });

        mostBackBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mostBackBtn.setText("<<");
        mostBackBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mostBackBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mostBackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostBackBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        backBtn.setText("<");
        backBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        gearField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        gearField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automatic", "Manual" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(availableStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 406, Short.MAX_VALUE)
                        .addComponent(mostBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costHourField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costWeekField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mileageField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(carIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(mostNextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel13))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(brandField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(156, 156, 156)
                                            .addComponent(jLabel12))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(gearField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(carIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostNextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostBackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(brandField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(costHourField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(modelField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(costDayField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(yearField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(costWeekField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gearField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jLabel17)
                        .addComponent(mileageField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(availableStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(locationField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabPanel.addTab("List", jPanel3);

        removeButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        removeButton.setText("Remove");
        removeButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        removeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addCarBtn.setBackground(new java.awt.Color(102, 204, 255));
        addCarBtn.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addCarBtn.setText("Add Car");
        addCarBtn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(102, 204, 255), null, null));
        addCarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addCarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addCarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tabPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1377, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(322, 322, 322)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchText)
                    .addComponent(searchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 16, Short.MAX_VALUE)
                .addComponent(tabPanel)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new StaffMainPage(admin).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // Check tab
        if (tabPanel.getSelectedIndex() == 0) {
            // Switch to list tab for edit
            tabPanel.setSelectedIndex(1);
            
            // Get file data
            List <String[]> lineArray = readFile("cars.txt");
            
            // Set value in list tab
            setListTab(lineArray, carTable.getSelectedRow());
            listPointer = carTable.getSelectedRow();
            return;
        }

        // Display confirmation
        String confirmation = "Confirm Edit " + carIDField.getText() + " ?";
        int input = JOptionPane.showConfirmDialog(null, confirmation);
        
        // Delete from file
        if (input == 0) {
            // Initialise array to store row data
            String[] newData = getListTab();
            
            // Validate data         
            if (!(checkYear(newData[3]) && checkInt(newData[5]) && checkInt(newData[6]) && checkInt(newData[7]) && checkInt(newData[8]))) {
                JOptionPane.showMessageDialog(null, "Invalid data format. Please double check ya");
                return;
            }

            boolean editStatus = editFile(newData, "cars.txt");

            if (editStatus) {
                // Add edit record into log file
                new Log(admin, "cars.txt").writeLog(4);
                
                // Update table to latest
                JOptionPane.showMessageDialog(null, "Edit successfully");
                
                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                model.setRowCount(0);
                
                resetTable();
                
                // Switch back table view
                tabPanel.setSelectedIndex(0);
                
            }
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String confirmation = null;
        int tabIndex = tabPanel.getSelectedIndex();
        int rowNo = 0;
        
        // Table view
        if (tabIndex == 0) {
            // Get selected row
            rowNo = carTable.getSelectedRow() + 1;
            
            // Check if empty row selected
            if (rowNo != 0) {
                confirmation = "Confirm Delete Row " + String.valueOf(rowNo) + " ?";
            }
            else {
                JOptionPane.showMessageDialog(null, "No row is selected");
                return;
            }
        } 
        // Individual view
        else {
            confirmation = "Confirm Delete " + carIDField.getText() + " ?";
        }
        
        int input = JOptionPane.showConfirmDialog(null, confirmation);
        
        // Delete from file
        if (input == 0) {
            String deletedCarID = null;
            
            // Check active tab
            if (tabIndex == 0) {
                deletedCarID = carTable.getValueAt(rowNo - 1, 0).toString();
            }
            else {
                deletedCarID = carIDField.getText();
            }

            boolean deleteStatus = deleteFile(deletedCarID, carTable.getColumnCount(), "cars.txt");

            if (deleteStatus) {
                // Add edit record into log file
                new Log(admin, "cars.txt").writeLog(5);

                // Update table to latest
                DefaultTableModel model = (DefaultTableModel) carTable.getModel();
                model.setRowCount(0);
                
                resetTable();

                JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
            }
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void tabPanelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabPanelStateChanged
        // Cjecl
        if (tabPanel.getSelectedIndex() == 1) {
            searchText.setVisible(false);
            searchBar.setVisible(false);
        }
        else {
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
        List <String[]> lineArray = readFile("cars.txt");
        setListTab(lineArray, 0);
    }//GEN-LAST:event_mostBackBtnActionPerformed

    private void mostNextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostNextBtnActionPerformed
        List <String[]> lineArray = readFile("cars.txt");
        
        if (listPointer == lineArray.size()-1) {
            JOptionPane.showMessageDialog(null, "Last data lorrr");
            return;
        }
        
        listPointer = lineArray.size()-1;
        setListTab(lineArray, listPointer);
    }//GEN-LAST:event_mostNextBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        List <String[]> lineArray = readFile("cars.txt");
        
        if (listPointer == 0) {
            JOptionPane.showMessageDialog(null, "Eh this is first data already weh");
            return;
        }
        
        listPointer -= 1;
        setListTab(lineArray, listPointer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        List <String[]> lineArray = readFile("cars.txt");
        
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

    private void addCarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCarBtnActionPerformed
        new StaffAddCarPage(admin).setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_addCarBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Add login record into log file
        new Log(admin, null).writeLog(2);
    }//GEN-LAST:event_formWindowClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCarBtn;
    private javax.swing.JComboBox<String> availableStatus;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField brandField;
    private javax.swing.JTextField carIDField;
    private javax.swing.JTable carTable;
    private javax.swing.JTextField costDayField;
    private javax.swing.JTextField costHourField;
    private javax.swing.JTextField costWeekField;
    private javax.swing.JButton editButton;
    private javax.swing.JComboBox<String> gearField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField locationField;
    private javax.swing.JTextField mileageField;
    private javax.swing.JTextField modelField;
    private javax.swing.JButton mostBackBtn;
    private javax.swing.JButton mostNextBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton removeButton;
    private javax.swing.JTextField searchBar;
    private javax.swing.JLabel searchText;
    private javax.swing.JTabbedPane tabPanel;
    private javax.swing.JTextField yearField;
    // End of variables declaration//GEN-END:variables

    
    // Initialise table content
    private void resetTable() {
        // Initialise header and get table model
        String[] header = {"Car ID", "Brand", "Model", "Year", "Gear", "Cost (Hour)", "Cost (Day)", "Cost(Week)", "Mileage", "Location", "Status"};  
        DefaultTableModel model = (DefaultTableModel)carTable.getModel();
        
        // Get file data
        List <String[]> lineArray = readFile("cars.txt");

        // Set header
        model.setColumnIdentifiers(header);

        // Append line array into table
        for (String[] loopArray : lineArray) {
            model.addRow(loopArray);
        }
        
        setListTab(lineArray, 0);
    }
    
    
    // Initialise value in second tab list
    private void setListTab(List <String[]> lineArray, int index) {        
        String[] firstData = lineArray.get(index);
        
        // Set text
        carIDField.setText(firstData[0]);
        brandField.setText(firstData[1]);
        modelField.setText(firstData[2]);
        yearField.setText(firstData[3]);
        gearField.setSelectedItem(firstData[4]);
        costHourField.setText(firstData[5].substring(2));
        costDayField.setText(firstData[6].substring(2));
        costWeekField.setText(firstData[7].substring(2));
        mileageField.setText(firstData[8]);
        locationField.setText(firstData[9]);
        availableStatus.getModel().setSelectedItem(firstData[10]);
        
    }
    
    // Get list value
    private String[] getListTab() {
        String[] listData = new String[] {
            carIDField.getText(),
            brandField.getText(),
            modelField.getText(),
            yearField.getText(),
            gearField.getSelectedItem().toString(),
            costHourField.getText(),
            costDayField.getText(),
            costWeekField.getText(),
            mileageField.getText(),
            locationField.getText(),
            availableStatus.getModel().getSelectedItem().toString()
        };
 
        return listData;
    }
    
    
    // Filter table
    private void filter(String query) {
        DefaultTableModel model = (DefaultTableModel) carTable.getModel();
        TableRowSorter <DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        carTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(query));
    }
}
