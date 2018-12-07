/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegisterationPanels;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Customer.Customer;
import Business.DB4OUtil.DB4OUtil;
import Business.Role.CustomerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.sql.Date;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author prabh
 */
public class RegisterCustomerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterHospitalJPanel
     */
    JPanel userProcessContainer;
    Role.RoleType roleType;
    EcoSystem system;

    public RegisterCustomerJPanel(JPanel userProcessContainer, Role.RoleType roleType, EcoSystem system) {
        initComponents();
        this.roleType = roleType;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        welcomeTxt.setText(roleType.getValue());

        initialize();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        welcomeTxt = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextPane();
        dobTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        phNoTxt = new javax.swing.JTextField();
        registerBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        userNameTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        reTypePasswordTxt = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        userNameMsg1 = new javax.swing.JLabel();
        userNameMsg2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 255), 5, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Hi, Welcome for registering");

        welcomeTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcomeTxt.setForeground(new java.awt.Color(0, 204, 102));

        backBtn.setText("<< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(addressTxt);

        jLabel2.setText("Name :");

        jLabel3.setText("Date of Birth :");

        jLabel4.setText("Address :");

        jLabel5.setText("Ph. No :");

        registerBtn.setText("Register");
        registerBtn.setEnabled(false);
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("User Name :");

        jLabel7.setText("Password :");

        userNameTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userNameTxtKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userNameTxtKeyTyped(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Create you User Name :");

        reTypePasswordTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                reTypePasswordTxtKeyTyped(evt);
            }
        });

        jLabel9.setText("Re-Password :");

        userNameMsg1.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        userNameMsg1.setForeground(new java.awt.Color(255, 51, 51));

        userNameMsg2.setFont(new java.awt.Font("Tahoma", 2, 16)); // NOI18N
        userNameMsg2.setForeground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dobTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(nameTxt)
                            .addComponent(jScrollPane1)
                            .addComponent(phNoTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(backBtn)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(registerBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(reTypePasswordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(userNameMsg2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(userNameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(userNameMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 90, Short.MAX_VALUE))))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(377, 377, 377)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(welcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(welcomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(phNoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(6, 51, Short.MAX_VALUE)))
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(userNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameMsg1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(userNameMsg2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(reTypePasswordTxt)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn)
                    .addComponent(registerBtn))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        int i = 0;
        if (nameTxt.getText().isEmpty()
                || dobTxt.getText().isEmpty()
                || addressTxt.getText().isEmpty()
                || phNoTxt.getText().isEmpty()
                || userNameTxt.getText().isEmpty()
                || passwordTxt.getText().isEmpty()) {
            i = 1;
            JOptionPane.showMessageDialog(null, "Please add all the details!");
        } else {
            try {
                Integer.parseInt(phNoTxt.getText());
                i = 0;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Only numbers are allowed in Phone No. field");
                i = 1;
                return;
            }
            try {
//            Integer.parseInt(txtAvailablity.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Only numbers are allowed in Availability field");
                return;
            }
        }
        if (i == 0) {
//            Customer customer = system.getCustomerDirectory().createCustomer(nameTxt.getText(), dobTxt.getText(), addressTxt.getText(), Integer.valueOf(phNoTxt.getText()));
            Customer customer = system.createCustomer(nameTxt.getText(), dobTxt.getText(), addressTxt.getText(), Integer.valueOf(phNoTxt.getText()));
            UserAccount ua = system.getUserAccountDirectory().createCustomerAccount(userNameTxt.getText(), passwordTxt.getText(), customer, new CustomerRole());
            System.out.println(customer.getName() + " " + ua.getCustomer().getName());

            SuccessCustomerJPanel success = new SuccessCustomerJPanel();
            userProcessContainer.add("RegisterHospitalJPanel", success);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }

    }//GEN-LAST:event_registerBtnActionPerformed

    private void reTypePasswordTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reTypePasswordTxtKeyTyped
        // TODO add your handling code here:
        checkForButtonVisibility();
        String check = "" + evt.getKeyChar();
        String compare = reTypePasswordTxt.getText();
        if (!check.isEmpty()) {
            compare += check;
        }
        if (passwordTxt.getText().equals(compare) &&
                userNameMsg2.getText().equals("Available")) {
            registerBtn.setEnabled(true);
            reTypePasswordTxt.setBackground(Color.white);
        } else {
            registerBtn.setEnabled(false);
            reTypePasswordTxt.setBackground(Color.red);
        }
    }//GEN-LAST:event_reTypePasswordTxtKeyTyped

    private void userNameTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTxtKeyTyped
        // TODO add your handling code here:
        
    }//GEN-LAST:event_userNameTxtKeyTyped

    private void userNameTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userNameTxtKeyReleased
        // TODO add your handling code here:
        userNameMsg1.setText("");
        userNameMsg2.setText("");
        for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {
            if (ua.getUsername().equalsIgnoreCase(userNameTxt.getText()) &&
                    ua.getUsername().equals("sysadmin")) {
                System.out.println(ua.getUsername());
                userNameMsg1.setText("Username is not available");
                userNameMsg2.setText("");
            }else{
                userNameMsg1.setText("");
                userNameMsg2.setText("Available");
            }
        }
    }//GEN-LAST:event_userNameTxtKeyReleased

    public boolean passwordPatternCorrect() {
        Pattern p = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$");
        Matcher m = p.matcher(passwordTxt.getText());
        boolean b = m.matches();
        if (b == true) {
            System.out.println("There is special character in my string");
            return false;
        } else {
            System.out.println("There is no speacial character");
            return true;
        }

    }

    public void checkForButtonVisibility() {
        if (!userNameTxt.getText().isEmpty() && 
                !passwordTxt.getText().isEmpty() && 
                !reTypePasswordTxt.getText().isEmpty()) {
            registerBtn.setEnabled(true);
        } else {
            registerBtn.setEnabled(false);
        }

    }

    private void initialize() {
        checkForButtonVisibility();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane addressTxt;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField phNoTxt;
    private javax.swing.JPasswordField reTypePasswordTxt;
    private javax.swing.JButton registerBtn;
    private javax.swing.JLabel userNameMsg1;
    private javax.swing.JLabel userNameMsg2;
    private javax.swing.JTextField userNameTxt;
    private javax.swing.JLabel welcomeTxt;
    // End of variables declaration//GEN-END:variables
}