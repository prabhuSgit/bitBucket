/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RegisterationPanels;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.Organization.SysAdmin;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.MedicalSchoolRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.AccessApprovalRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.ProviderRegistrationRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.JPanel;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author pravinash
 */
public class RegisterProviderJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ProviderAdminRegistrationWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem system;
    private Role role;
    private Enterprise.EnterpriseType roleSelect;

    public RegisterProviderJPanel(JPanel userProcessContainer, EcoSystem system, Role role, Enterprise.EnterpriseType roleSelect) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.role = role;
        this.roleSelect = roleSelect;
        StateComboBox.removeAllItems();
        entTypCombobox.removeAllItems();
        for (Network n : system.getNetworkList()) {
            StateComboBox.addItem(n);
        }
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
//            if (type.toString().equals(role.toString())) {
//                OrgTypCombobox.addItem(type);
////                OrgTypeTxt.setText(String.valueOf(type));
//            }
            if (roleSelect.equals(type.HealthCareProvider)) {
                entTypCombobox.addItem(type.HealthCareProvider);
            } else {
                entTypCombobox.addItem(type.MedicalSchool);
            }
        }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ProviderNameJTxtField = new javax.swing.JTextField();
        ProviderCityJTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProviderAddrJTxtArea = new javax.swing.JTextArea();
        RegisterJBtn = new javax.swing.JButton();
        FilePathTxtField = new javax.swing.JTextField();
        StateComboBox = new javax.swing.JComboBox();
        BtnBack = new javax.swing.JButton();
        BtnBrowse = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        entTypCombobox = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        pwdTxt = new javax.swing.JPasswordField();
        rtypPwdTxt = new javax.swing.JPasswordField();
        OrgTypeTxt = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Provider Registration ");

        jLabel2.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("City:");

        jLabel5.setText("State:");

        jLabel6.setText("License Document:");

        ProviderAddrJTxtArea.setColumns(20);
        ProviderAddrJTxtArea.setRows(5);
        jScrollPane1.setViewportView(ProviderAddrJTxtArea);

        RegisterJBtn.setText("Register");
        RegisterJBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterJBtnActionPerformed(evt);
            }
        });

        StateComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<none>" }));

        BtnBack.setText("<<Back");
        BtnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBackActionPerformed(evt);
            }
        });

        BtnBrowse.setText("Browse Computer");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel7.setText("Create username:");

        jLabel8.setText("Password:");

        jLabel9.setText("Re-type password:");

        entTypCombobox.setEnabled(false);

        jLabel10.setText("Enterprise Type:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel2)))
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(StateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(ProviderNameJTxtField, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(ProviderCityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(FilePathTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(39, 39, 39)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel9))
                                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addComponent(jLabel10)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(BtnBrowse))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BtnBack)
                                .addGap(197, 197, 197)
                                .addComponent(RegisterJBtn)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameTxt)
                            .addComponent(entTypCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwdTxt)
                            .addComponent(rtypPwdTxt)
                            .addComponent(OrgTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(entTypCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OrgTypeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel2)
                                            .addComponent(ProviderNameJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(ProviderCityJTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(StateComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(30, 30, 30)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel6)
                                            .addComponent(FilePathTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(BtnBrowse))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RegisterJBtn)
                                    .addComponent(BtnBack)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(usernameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(rtypPwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(98, 98, 98)))))
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterJBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterJBtnActionPerformed
        // TODO add your handling code here:
        Network network = (Network) StateComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) entTypCombobox.getSelectedItem();

//        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) OrgTypeTxt.getText();
        if (network == null || type == null) {
            JOptionPane.showMessageDialog(null, "Invalid Input!");
            return;
        }

        String name = ProviderNameJTxtField.getText();

        Enterprise enterprise = network.getEnterpriseDirectory().createAndAddEnterprise(name, type);
//      Enterprise ent = (Enterprise) OrgTypCombobox.getSelectedItem();
        String address = ProviderAddrJTxtArea.getText();
        String city = ProviderCityJTxtField.getText();
        String state = StateComboBox.getSelectedItem().toString();

        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name, address, city, state, type.toString());
        UserAccount account = system.getUserAccountDirectory().createEmployeeAccount(usernameTxt.getText(), pwdTxt.getText(),
                employee, new MedicalSchoolRole());
         AccessApprovalRequest request = new AccessApprovalRequest();
            request.setRole(entTypCombobox.getSelectedItem().toString());
            request.setSender(account);
            request.setStatus("Pending");

            for (UserAccount u : system.getUserAccountDirectory().getUserAccountList()) {
                if (u.getUsername().equals("sysadmin")) {
                    u.getWorkQueue().getWorkRequestList().add(request);
                }
            }

            employee.setRegStatus(request.getStatus());



//        if (employee.getType().equals("MedicalSchool")) {
//            UserAccount account = system.getUserAccountDirectory().createEmployeeAccount(usernameTxt.getText(), pwdTxt.getText(),
//                    employee, new MedicalSchoolRole());
//            AccessApprovalRequest request = new AccessApprovalRequest();
//            request.setRole(entTypCombobox.getSelectedItem().toString());
//            request.setSender(account);
//            request.setStatus("Pending");
//
//            for (UserAccount u : system.getUserAccountDirectory().getUserAccountList()) {
//                if (u.getUsername().equals("sysadmin")) {
//                    u.getWorkQueue().getWorkRequestList().add(request);
//                }
//            }
//
//            employee.setRegStatus(request.getStatus());
//        } else {
//            UserAccount account = system.getUserAccountDirectory().createEmployeeAccount(usernameTxt.getText(), pwdTxt.getText(),
//                    employee, new AdminRole());
//            AccessApprovalRequest request = new AccessApprovalRequest();
//            request.setRole(entTypCombobox.getSelectedItem().toString());
//            request.setSender(account);
//            request.setStatus("Pending");
//
//            for (UserAccount u : system.getUserAccountDirectory().getUserAccountList()) {
//                if (u.getUsername().equals("sysadmin")) {
//                    u.getWorkQueue().getWorkRequestList().add(request);
//                }
//            }
//
//            employee.setRegStatus(request.getStatus());
//        }

//        
        ProviderNameJTxtField.setText("");
        ProviderAddrJTxtArea.setText("");
        ProviderCityJTxtField.setText("");
        usernameTxt.setText("");
        pwdTxt.setText("");
        rtypPwdTxt.setText("");
        JOptionPane.showMessageDialog(null, "Registered Successfully");

        //ArrayList<WorkRequest> request = wk.getWorkRequestList();
//        SystemAdminWorkAreaJPanel sysadmin = new SystemAdminWorkAreaJPanel(userProcessContainer, system,wk);
//        sysadmin.populateRequestTable();
    }//GEN-LAST:event_RegisterJBtnActionPerformed

    private void BtnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_BtnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBack;
    private javax.swing.JButton BtnBrowse;
    private javax.swing.JTextField FilePathTxtField;
    private javax.swing.JLabel OrgTypeTxt;
    private javax.swing.JTextArea ProviderAddrJTxtArea;
    private javax.swing.JTextField ProviderCityJTxtField;
    private javax.swing.JTextField ProviderNameJTxtField;
    private javax.swing.JButton RegisterJBtn;
    private javax.swing.JComboBox StateComboBox;
    private javax.swing.JComboBox entTypCombobox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JPasswordField rtypPwdTxt;
    private javax.swing.JTextField usernameTxt;
    // End of variables declaration//GEN-END:variables
}
