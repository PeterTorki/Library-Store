
import java.awt.Color;
import javax.swing.JPanel;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }
    
    public boolean isGood(String...  s) {
        boolean x = true;
        for (String str : s)    x &= !str.isEmpty();
        return x;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        getGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtPhone = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        btnRegister = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        maleRadio = new javax.swing.JRadioButton();
        femaleRadio = new javax.swing.JRadioButton();
        titlebar = new javax.swing.JPanel();
        iconminmaxclose = new javax.swing.JPanel();
        Buttonclose = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        ButtonMin = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("register");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(38, 42, 66));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(83, 103, 255));

        jLabel2.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(7, 13, 108));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Create account");
        jLabel2.setPreferredSize(new java.awt.Dimension(187, 50));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email :");

        jLabel5.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("password :");

        jLabel6.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Phone Num :");

        txtName.setBackground(new java.awt.Color(45, 49, 70));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(45, 49, 70));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(45, 49, 70));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        txtPhone.setBackground(new java.awt.Color(45, 49, 70));
        txtPhone.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtPhone.setForeground(new java.awt.Color(255, 255, 255));
        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhoneFocusGained(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        btnRegister.setBackground(new java.awt.Color(76, 165, 92));
        btnRegister.setFont(new java.awt.Font("JetBrains Mono", 1, 24)); // NOI18N
        btnRegister.setForeground(new java.awt.Color(255, 255, 255));
        btnRegister.setText("Submit");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Username:");

        txtUsername.setBackground(new java.awt.Color(45, 49, 70));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsernameFocusGained(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("JetBrains Mono", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender:");

        maleRadio.setBackground(new java.awt.Color(83, 103, 255));
        getGender.add(maleRadio);
        maleRadio.setText("Male");
        maleRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioActionPerformed(evt);
            }
        });

        femaleRadio.setBackground(new java.awt.Color(83, 103, 255));
        getGender.add(femaleRadio);
        femaleRadio.setSelected(true);
        femaleRadio.setText("Female");
        femaleRadio.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnRegister))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(txtEmail)
                                    .addComponent(txtPassword)
                                    .addComponent(txtPhone)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(maleRadio)
                                .addGap(18, 18, 18)
                                .addComponent(femaleRadio)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(11, 11, 11)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRadio)
                    .addComponent(femaleRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 330, 380));

        titlebar.setBackground(new java.awt.Color(83, 103, 255));
        titlebar.setPreferredSize(new java.awt.Dimension(800, 40));
        titlebar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                titlebarMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                titlebarMouseReleased(evt);
            }
        });
        titlebar.setLayout(new java.awt.BorderLayout());

        iconminmaxclose.setBackground(new java.awt.Color(83, 103, 255));
        iconminmaxclose.setPreferredSize(new java.awt.Dimension(150, 50));
        iconminmaxclose.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Buttonclose.setBackground(new java.awt.Color(83, 103, 255));
        Buttonclose.setLayout(new java.awt.BorderLayout());

        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/delete_32px.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });
        Buttonclose.add(close, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(Buttonclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, 50, 40));

        ButtonMin.setBackground(new java.awt.Color(83, 103, 255));
        ButtonMin.setLayout(new java.awt.BorderLayout());

        minimize.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        minimize.setForeground(new java.awt.Color(242, 242, 242));
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("-");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });
        ButtonMin.add(minimize, java.awt.BorderLayout.CENTER);

        iconminmaxclose.add(ButtonMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 50, 40));

        titlebar.add(iconminmaxclose, java.awt.BorderLayout.LINE_END);

        jPanel1.add(titlebar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 718, 50));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(716, 472));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void changecolor(JPanel hover, Color rand){
        hover.setBackground(rand);
    }
    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        txtName.setText("");
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        txtEmail.setText("");
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        txtPassword.setText("");
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPhoneFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusGained
        txtPhone.setText("");
    }//GEN-LAST:event_txtPhoneFocusGained

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        maleRadio.setActionCommand("M");
        femaleRadio.setActionCommand("F");
        
        char gender = getGender.getSelection().getActionCommand().charAt(0);
        
        String usernameLow = txtUsername.getText().toLowerCase();
        String emailLow = txtEmail.getText().toLowerCase();
        if(isGood(txtName.getText(), usernameLow, emailLow, txtPassword.getText(), txtPhone.getText())) {
            String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emailLow);
            
    
            if(!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid Email", "Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            regex = "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";
            pattern = Pattern.compile(regex);
            matcher = pattern.matcher(usernameLow);
            if(!matcher.matches()) {
                JOptionPane.showMessageDialog(null, "Invalid User(Minimum 6)", "Error",JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            String username = "SELECT * FROM persons WHERE username='"+ usernameLow+"';";
            String email = "SELECT * FROM persons WHERE email='"+ emailLow+"';";
            
            ResultSet userRs = Tools.selectQuery(username);
            ResultSet emailRs = Tools.selectQuery(email);

            try {
                boolean uniUser = userRs.next();
                boolean uniEmail = emailRs.next();
                if(uniUser && uniEmail) {
                    this.dispose();
                    Register main = new Register() ; 
                    main.setVisible(true);
                    JOptionPane.showMessageDialog(null, "User and Email already Exists", "Error",JOptionPane.ERROR_MESSAGE);
                    Tools.closeConnection();

                    return;
                }
                
                else if(uniUser) {
                    this.dispose();
                    Register main = new Register() ; 
                    main.setVisible(true);
                    JOptionPane.showMessageDialog(null, "User already Exists", "Error",JOptionPane.ERROR_MESSAGE);
                    Tools.closeConnection();

                    return;
                } 
                
                else if(uniEmail) {
                    this.dispose();
                    Register main = new Register() ; 
                    main.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Email already Exists", "Error",JOptionPane.ERROR_MESSAGE);
                    Tools.closeConnection();

                    return;
                }
                
                else {
                    
                    String statement = "INSERT INTO persons (username, name, password, email, role, gender, phone, img) "
                    + "VALUES('"+ usernameLow + "', '"+ txtName.getText() + "', '"+ txtPassword.getText() + "', '" + emailLow + "', 'Customer', '"+ gender + "', '"+ txtPhone.getText() + "', 'upload/profileImgs/default.png');";
                    boolean check = Tools.excecuateStatement(statement);
                    JOptionPane.showMessageDialog(null, "Register Completed");
                    Tools.closeConnection();

                    this.dispose();
                    Login main = new Login() ; 
                    main.setVisible(true);
                
                }
                                    
            } catch (SQLException ex) {
                Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
            }
            Tools.closeConnection();
        } 
        else {
            JOptionPane.showMessageDialog(null, "All Fields Required", "Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsernameFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameFocusGained

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void maleRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        changecolor(Buttonclose, new Color(25, 29, 74));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        changecolor(Buttonclose, new Color(83, 103, 255));
    }//GEN-LAST:event_closeMouseExited

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        this.setExtendedState(Mainmenu.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        changecolor(ButtonMin, new Color(25, 29, 74));
    }//GEN-LAST:event_minimizeMouseEntered

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        changecolor(ButtonMin, new Color(83, 103, 255));
    }//GEN-LAST:event_minimizeMouseExited

    private void titlebarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseEntered
        titlebar.setVisible(true);
    }//GEN-LAST:event_titlebarMouseEntered

    private void titlebarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlebarMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_titlebarMouseReleased

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonMin;
    private javax.swing.JPanel Buttonclose;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel close;
    private javax.swing.JRadioButton femaleRadio;
    private javax.swing.ButtonGroup getGender;
    private javax.swing.JPanel iconminmaxclose;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton maleRadio;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel titlebar;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
