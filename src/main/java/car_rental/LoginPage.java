package car_rental;

import java.util.List;
import javax.swing.JOptionPane;


public class LoginPage extends javax.swing.JFrame implements ValidateProcess, FileProcess{
    public LoginPage() {
        initComponents();
        
        // Set GUI middle of screen
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        icon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        signUp = new javax.swing.JLabel();
        passField = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Car Rental System");

        icon1.setForeground(new java.awt.Color(255, 255, 255));
        icon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-car-rental-90.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(icon1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addGap(69, 69, 69)
                .addComponent(icon1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 204, 204));
        jLabel1.setText("Login");

        nameField.setForeground(new java.awt.Color(153, 153, 153));
        nameField.setText("Username");
        nameField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFieldFocusLost(evt);
            }
        });

        loginBtn.setBackground(new java.awt.Color(102, 153, 255));
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Didn't have account?");

        signUp.setForeground(new java.awt.Color(51, 51, 255));
        signUp.setText("Sign Up");
        signUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpMouseClicked(evt);
            }
        });

        passField.setForeground(new java.awt.Color(153, 153, 153));
        passField.setText("Password");
        passField.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));
        passField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(signUp))
                            .addComponent(jLabel1)
                            .addComponent(nameField, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(passField))))
                .addGap(0, 90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(passField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(signUp))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpMouseClicked
        new SignUpPage().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_signUpMouseClicked

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        String inputName = nameField.getText();
        String inputPass = passField.getText();
        
        List <String[]> lineArray = readFile("user.txt");
        
        // Check member
        for (String[] line : lineArray) {
            if (line[1].equals(inputName)) {
                if (line[2].equals(inputPass)) {
                    JOptionPane.showMessageDialog(null, "Login Success");
                    
                    Customer currentUser = new Customer(line[0], line[1], line[2], line[3], line[4]);
                    new CustHomepage(currentUser).setVisible(true);
                    setVisible(false);
                    return;
                }
            }
        }
        
        // Check admin
        lineArray = readFile("admin.txt");
        
        for (String[] line : lineArray) {
            if (line[1].equals(inputName)) {
                if (line[3].equals(inputPass)) {
                    JOptionPane.showMessageDialog(null, "Login Success");
                    
                    Admin currentAdmin = new Admin(line[0], line[1], line[2], line[3]);
                    new StaffMainPage(currentAdmin).setVisible(true);
                    setVisible(false);
                    return;
                }
            }
        }
        
        JOptionPane.showMessageDialog(null, "Invalid username or password");
        passField.setText("");
    }//GEN-LAST:event_loginBtnActionPerformed

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        if (nameField.getText().equals("Username")) {
            nameField.setText("");
        }
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusLost
        if (nameField.getText().isEmpty()) {
            nameField.setText("Username");
        }
    }//GEN-LAST:event_nameFieldFocusLost

    private void passFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusGained
        if (passField.getText().equals("Password")) {
            passField.setText("");
        }
    }//GEN-LAST:event_passFieldFocusGained

    private void passFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFieldFocusLost
        if (passField.getText().isEmpty()) {
            passField.setText("Password");
        }
    }//GEN-LAST:event_passFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icon1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel signUp;
    // End of variables declaration//GEN-END:variables
}
