package car_rental;


import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CusPayment extends javax.swing.JFrame implements FileProcess, ValidateProcess{
    Customer customer;
    Car car;
    Booking book; 
    
    public CusPayment(Customer cus, Car tmpCar) {
        customer = cus;
        this.car = tmpCar;
    
        initComponents();
        
        // Set GUI middle of screen
        this.setLocationRelativeTo(null);
        
        setLabel();
        hideDateField();     
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        startDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        duration = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        rentId = new javax.swing.JTextField();
        model = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        brand = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        costDay = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        startDateLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cardnum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        endDate = new com.toedter.calendar.JDateChooser();
        carddate = new javax.swing.JTextField();
        endDateLabel = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        costWeek = new javax.swing.JTextField();
        costHour = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        startDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                startDatePropertyChange(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("RM");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Duration:");

        jButton3.setBackground(new java.awt.Color(153, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("Back");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "Day", "Week" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        duration.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                durationKeyReleased(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Type:");

        cvv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        rentId.setEditable(false);
        rentId.setBackground(new java.awt.Color(255, 255, 255));

        model.setEditable(false);
        model.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Rent ID: ");

        brand.setEditable(false);
        brand.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Car Brand: ");

        costDay.setEditable(false);
        costDay.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Car Model: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Year made:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Cost per hour:");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Cost per day:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Cost per week:");

        startDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        startDateLabel.setText("Start date:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("CVV");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Name:");

        cardnum.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("Card Number:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("MM/YY");

        endDate.setBackground(new java.awt.Color(255, 255, 255));
        endDate.setEnabled(false);

        carddate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        endDateLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        endDateLabel.setText("End date:");

        year.setEditable(false);
        year.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setText("Total:");

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton1.setText("Submit Payment");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        costWeek.setEditable(false);
        costWeek.setBackground(new java.awt.Color(255, 255, 255));

        costHour.setEditable(false);
        costHour.setBackground(new java.awt.Color(255, 255, 255));

        total.setEditable(false);
        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        total.setText("0.00");
        total.setBorder(null);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Payment");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(cardnum, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(135, 135, 135)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(114, 114, 114)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(carddate, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel11)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel13))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(costWeek, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(costHour, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(costDay, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(384, 384, 384)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(duration))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(endDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)
                                            .addComponent(startDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addComponent(rentId, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(brand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(costHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13))
                            .addComponent(costDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(duration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(startDateLabel)
                            .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(endDateLabel)
                            .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(costWeek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cardnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(carddate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1)))
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        CustomerRentCarPage rent = new CustomerRentCarPage(customer);
        rent.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        if (jComboBox1.getSelectedItem().toString().equals("Hour")) {
            startDate.setVisible(false);
            startDateLabel.setVisible(false);
            
            endDate.setVisible(false);
            endDateLabel.setVisible(false);
        }
        else {
            startDate.setVisible(true);
            startDateLabel.setVisible(true);
            
            endDate.setVisible(true);
            endDateLabel.setVisible(true);
        }
        duration.setText("");
        total.setText("0.00");
      
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Format date field
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        String bookid = getNewRentId();
        String userid = customer.getId();
        String carid = car.getId();
        
        String startdate = sdf.format(new Date());
        String endtdate = sdf.format(new Date());
        if (!jComboBox1.getSelectedItem().toString().equals("Hour")){
            try {
                startdate = sdf.format(startDate.getDate());
            } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "Date cannot be empty");
                return;
            }        
            
            endtdate = sdf.format(endDate.getDate());
        }
        
        String price = total.getText();
        String cardno = cardnum.getText();
        String cardcvv = cvv.getText();
        String datecard = carddate.getText();
        String paymentid = getNewPaymentId();

        // Validation
        if(!checkBlank(duration.getText())){
            JOptionPane.showMessageDialog(null, "Please enter a duration");
            return;
        }
        else if (!(checkBlank(nameField.getText()) && checkBlank(cardnum.getText()) && checkBlank(cvv.getText()) && checkBlank(carddate.getText()))) {
            JOptionPane.showMessageDialog(null, "All field is compulsory");
            return;
        }        
        else if (!checkCard(cardno, cardcvv, datecard)){
            JOptionPane.showMessageDialog(null, "Card number is in a wrong format!");
            return;
        }
        else if (!checkBlank(cardno)){
            JOptionPane.showMessageDialog(null, "Please enter card number");
            return;
        }
        else if (!checkBlank(cardcvv)){
            JOptionPane.showMessageDialog(null, "Please enter cvv");
            return;
        }
        else if (!checkBlank(datecard)){
            JOptionPane.showMessageDialog(null, "Please enter card date");
            return;
        }
        else if (!checkInt(duration.getText())){
            JOptionPane.showMessageDialog(null, "Please enter numbers");
            return;
        }
        
        book = new Booking(bookid, customer, car, startdate, endtdate, price);
        
        String[] bookingDetails = new String[] {bookid, userid,carid, startdate, endtdate, price};
        appendFile(bookingDetails, "booking.txt");
            
        SimpleDateFormat date = new SimpleDateFormat("dd/mm/yyyy");
        String method = "Card";
        
        String[] paymentDetails = new String[] {paymentid, bookid, method, date.format(new Date()), new SimpleDateFormat("hh:mm aa").format(new Date())};
        appendFile(paymentDetails, "payment.txt");
           
        JOptionPane.showMessageDialog(null, "Payment success!!");    
        
        String[] cardetails = new String[] {car.getId(),car.getBrand(), car.getModel(), car.getYear(), car.getYear(), car.getCostHour().substring(2), 
                                            car.getCostDay().substring(2), car.getCostWeek().substring(2), car.getMileage(), car.getLocation(), "False"};
        
        String status = "False";
        editFile(cardetails, "cars.txt");
        status =  car.getStatus();
        
        car = new Car(car.getId(),car.getBrand(), car.getModel(), car.getYear(), car.getYear(), car.getCostHour(), 
            car.getCostDay(), car.getCostWeek(), car.getMileage(), car.getLocation(), car.getStatus());
        
        ReceiptPage receipt = new ReceiptPage(customer, book, false);
        receipt.setVisible(true);
        this.dispose();      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void durationKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_durationKeyReleased
        // Return if duration is zero
        if (duration.getText().isBlank()) {
            startDate.setDate(null);
            endDate.setDate(null);
            return;
        }
        
        // Initialise variable
        DecimalFormat df = new DecimalFormat("0.00");
        int durations = 0;
        
        String select = jComboBox1.getSelectedItem().toString();
        try {
            durations = Integer.valueOf(duration.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Accept only whole number");
            duration.setText("");
            startDate.setDate(null);
            endDate.setDate(null);
            total.setText("0.00");
            return;
        }
        

        if (durations <= 0) {
            JOptionPane.showMessageDialog(null, "Eh want play go other place lah");
            duration.setText("");
            startDate.setDate(null);
            endDate.setDate(null);
            return;
        }
        
        double hour = Double.valueOf(costHour.getText().substring(2));
        double day = Double.valueOf(costDay.getText().substring(2));
        double week = Double.valueOf(costWeek.getText().substring(2));

        if ("Hour".equals(select)){
            total.setText(String.valueOf(df.format(durations * hour)));
            
        }
        else if ("Day".equals(select)){
            total.setText(String.valueOf(df.format(durations * day)));
        }
        else if ("Week".equals(select)){

            total.setText(String.valueOf(df.format(durations * week)));
        }
        
        // Check if start date is filled
        if (startDate.getDate() != null) {
            Long durationss = Long.valueOf(duration.getText());

            if (jComboBox1.getSelectedItem().toString().equals("Week")) durationss *= 7; 
            
            String startDates = new SimpleDateFormat("dd/MM/yyyy").format(startDate.getDate());
     
            LocalDate newDate = LocalDate.now();
            try {
                String[] tmpArray = startDates.split("/");
                newDate = LocalDate.of(Integer.valueOf(tmpArray[2]), Integer.valueOf(tmpArray[1]), Integer.valueOf(tmpArray[0])).plusDays(Long.valueOf(durationss));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            try {
                String tmpDate = newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String[] tmpArray = tmpDate.split("/");
                tmpDate = String.format("%s/%s/%s", tmpArray[0], tmpArray[1], tmpArray[2]);
                
                endDate.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(tmpDate));
            } catch (ParseException ex) {
                Logger.getLogger(CusPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (duration.getText().isBlank()) endDate.setDate(null);
    }//GEN-LAST:event_durationKeyReleased

    
    private void startDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_startDatePropertyChange
        if (!"date".equals(evt.getPropertyName())) {
            return;
        }
        
        // Return if empty start date field
        if (startDate.getDate() == null) {
            endDate.setDate(null);
            return;
        }
        
        String startDates = new SimpleDateFormat("dd/MM/yyyy").format(startDate.getDate());
        String endDates = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
        
        if (checkBlank(duration.getText())) {
            Long durations = Long.valueOf(duration.getText());
            if (jComboBox1.getSelectedItem().toString().equals("Week")) durations *= 7;       
            
            String startDatess = new SimpleDateFormat("dd/MM/yyyy").format(startDate.getDate());
     
            LocalDate newDate = LocalDate.now();
            try {
                String[] tmpArray = startDatess.split("/");
                newDate = LocalDate.of(Integer.valueOf(tmpArray[2]), Integer.valueOf(tmpArray[1]), Integer.valueOf(tmpArray[0])).plusDays(Long.valueOf(durations));
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
            
            try {
                String tmpDate = newDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                String[] tmpArray = tmpDate.split("/");
                tmpDate = String.format("%s/%s/%s", tmpArray[0], tmpArray[1], tmpArray[2]);
                
                endDates = tmpDate;
                
                endDate.setDate(new SimpleDateFormat("dd/MM/yyyy").parse(tmpDate));
            } catch (ParseException ex) {
                Logger.getLogger(CusPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (!checkAvailableStatus(readFile("booking.txt"), -1, car.getId() , startDates, endDates)){
            startDate.setDate(null);
            endDate.setDate(null);
        } 
    }//GEN-LAST:event_startDatePropertyChange

    // Print into file
    private String[] getDateFormat() {
        return new SimpleDateFormat("dd/MM/yyyy,hh:mm aa").format(new Date()).split(",");        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField brand;
    private javax.swing.JTextField carddate;
    private javax.swing.JTextField cardnum;
    private javax.swing.JTextField costDay;
    private javax.swing.JTextField costHour;
    private javax.swing.JTextField costWeek;
    private javax.swing.JTextField cvv;
    private javax.swing.JTextField duration;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel endDateLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField model;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField rentId;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JLabel startDateLabel;
    private javax.swing.JTextField total;
    private javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables

    private void setLabel() {
        String newId = getNewRentId();
        
        // Set label
        rentId.setText(newId);
        brand.setText(car.getBrand());
        model.setText(car.getModel());
        year.setText(car.getYear());
        costHour.setText(car.getCostHour());
        costDay.setText(car.getCostDay());
        costWeek.setText(car.getCostWeek());
    }
    
    
    private String getNewRentId() {
        // Count id
        List <String[]> dataLength = readFile("booking.txt");
        int length = Integer.valueOf(dataLength.get(dataLength.size()-1)[0].substring(1)) + 1;
        String newId = "R" + length;
        
        return newId;
    }
    
    private String getNewPaymentId() {
        // Count id
        List <String[]> dataLength = readFile("payment.txt");
        int length = Integer.valueOf(dataLength.get(dataLength.size()-1)[0].substring(1)) + 1;
        String newpaymentId = "P" + length;
        
        return newpaymentId;
    }

    private void hideDateField() {
        startDate.setVisible(false);
        startDateLabel.setVisible(false);

        endDate.setVisible(false);
        endDateLabel.setVisible(false);
    }
}



