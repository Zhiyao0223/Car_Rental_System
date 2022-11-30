package car_rental;

/**
 *
 * @author acer
 */
public class ReceiptPage extends javax.swing.JFrame implements ValidateProcess, FileProcess {

    /**
     * Creates new form Receipt
     */
    public ReceiptPage() {
        initComponents();
        
        // Set GUI middle of screen
        this.setLocationRelativeTo(null);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Receipt_Lb = new javax.swing.JLabel();
        Duration_Lb = new javax.swing.JLabel();
        Name_Lb = new javax.swing.JLabel();
        IC_Passport_Lb = new javax.swing.JLabel();
        Email_Lb = new javax.swing.JLabel();
        Phone_Lb = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        Price_Lb = new javax.swing.JLabel();
        CheckIn_Lb = new javax.swing.JLabel();
        Room_Lb = new javax.swing.JLabel();
        CheckOut_Lb = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        name = new javax.swing.JTextField();
        ic = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        car_name = new javax.swing.JTextField();
        car_no = new javax.swing.JTextField();
        end_date = new javax.swing.JTextField();
        start_date = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Rent_date = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Receipt_Lb.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Receipt_Lb.setText("Receipt");

        Duration_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Duration_Lb.setText("End date:");

        Name_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Name_Lb.setText("Name: ");

        IC_Passport_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IC_Passport_Lb.setText("IC / Passport: ");

        Email_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Email_Lb.setText("Email: ");

        Phone_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Phone_Lb.setText("Phone: ");

        jPanel1.setBackground(new java.awt.Color(114, 143, 206));
        jPanel1.setForeground(new java.awt.Color(0, 51, 255));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/car.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(545, 545, 545)
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(248, 248, 255));

        Price_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Price_Lb.setText("Price:");

        CheckIn_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CheckIn_Lb.setText("Car No:");

        Room_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Room_Lb.setText("Car Name:");

        CheckOut_Lb.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CheckOut_Lb.setText("Start date:");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        name.setEditable(false);
        name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        ic.setEditable(false);
        ic.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        email.setEditable(false);
        email.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        phone.setEditable(false);
        phone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        car_name.setEditable(false);
        car_name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        car_no.setEditable(false);
        car_no.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        end_date.setEditable(false);
        end_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        end_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                end_dateActionPerformed(evt);
            }
        });

        start_date.setEditable(false);
        start_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        price.setEditable(false);
        price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Rent date:");

        Rent_date.setEditable(false);
        Rent_date.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Rent_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rent_dateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(547, 547, 547)
                        .addComponent(Receipt_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IC_Passport_Lb)
                                    .addComponent(Phone_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Email_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ic)
                                    .addComponent(name)
                                    .addComponent(email)
                                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(CheckOut_Lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Room_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CheckIn_Lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(Duration_Lb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(81, 81, 81)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(car_name)
                                            .addComponent(car_no)
                                            .addComponent(start_date)
                                            .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Price_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(price)
                                            .addComponent(Rent_date, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 894, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Receipt_Lb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Room_Lb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(car_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckIn_Lb)
                            .addComponent(car_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CheckOut_Lb)
                            .addComponent(start_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Duration_Lb)
                            .addComponent(end_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Name_Lb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(IC_Passport_Lb)
                                .addGap(20, 20, 20)
                                .addComponent(Email_Lb)
                                .addGap(16, 16, 16)
                                .addComponent(Phone_Lb))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Price_Lb)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Rent_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(284, 284, 284))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        home_page home = new home_page();
//        home.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void end_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_end_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_end_dateActionPerformed

    private void Rent_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rent_dateActionPerformed
    
        
    }//GEN-LAST:event_Rent_dateActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(ReceiptPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new ReceiptPage().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CheckIn_Lb;
    private javax.swing.JLabel CheckOut_Lb;
    private javax.swing.JLabel Duration_Lb;
    private javax.swing.JLabel Email_Lb;
    private javax.swing.JLabel IC_Passport_Lb;
    private javax.swing.JLabel Name_Lb;
    private javax.swing.JLabel Phone_Lb;
    private javax.swing.JLabel Price_Lb;
    private javax.swing.JLabel Receipt_Lb;
    private javax.swing.JTextField Rent_date;
    private javax.swing.JLabel Room_Lb;
    private javax.swing.JTextField car_name;
    private javax.swing.JTextField car_no;
    private javax.swing.JTextField email;
    private javax.swing.JTextField end_date;
    private javax.swing.JTextField ic;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField price;
    private javax.swing.JTextField start_date;
    // End of variables declaration//GEN-END:variables
}
