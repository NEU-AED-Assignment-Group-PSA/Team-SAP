/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Person.Person;
import Business.Role.DoctorRole;
import Business.Role.LabTechnicianRole;
import Business.Role.NurseRole;
import Business.Role.PatientRole;
import Business.Role.ReceptionistRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import Business.Utility.Validation;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
    private UserAccount selectedStaff;

    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;

        popMainOrganizationComboBox();
        //popMainDeptComboBox();
       // employeeJComboBox.removeAllItems();
        //popData();
        createStaffPanel.setVisible(false);
        viewStaffPanel.setVisible(false);
        
        //visitingChargeLbl.setEnabled(false);
        //visitingChargeTxt.setEnabled(false);
        //visitingChargeLbl.setVisible(false);
        //visitingChargeTxt.setVisible(false);
    }

    public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();
        //organizationJComboBox2.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization);
          //  organizationJComboBox2.addItem(organization);
          //  selectDeptCmb.addItem(organization);// main cmb box of department
        }
    }
    
    public void popOrganizationComboBox2() {
        //organizationJComboBox.removeAllItems();
        organizationJComboBox2.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
           // organizationJComboBox.addItem(organization);
            organizationJComboBox2.addItem(organization);
            //selectDeptCmb.addItem(organization);// main cmb box of department
        }
    }
    
    
    public void popMainOrganizationComboBox() {
        //organizationJComboBox.removeAllItems();
        selectDeptCmb.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            //organizationJComboBox.addItem(organization);
            //organizationJComboBox2.addItem(organization);
            selectDeptCmb.addItem(organization);// main cmb box of department
        }
    }
    
    
    
   /* public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }*/
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox.addItem(role); //.roleValue()
        }
    }
    
    
    private void populateRoleComboBox2(Organization organization){
        roleJComboBox2.removeAllItems();
        for (Role role : organization.getSupportedRole()){
            roleJComboBox2.addItem(role);
        }
    }
    

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);
        Organization selectedOrganization = (Organization) selectDeptCmb.getSelectedItem();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(organization.equals(selectedOrganization))
            {
                for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList())
                {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getRole();
                row[2] = organization;//.getName();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
            }
        }//end if
        }
        
    }
    
    
    
    public void popDataAll() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);
        
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[3];
                row[0] = ua;
                row[1] = ua.getRole();
                row[2] = organization;//.getName();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        backjButton1 = new javax.swing.JButton();
        addStaffBtn = new javax.swing.JButton();
        createStaffPanel = new javax.swing.JPanel();
        closebtn = new javax.swing.JButton();
        empNameJTextField = new javax.swing.JTextField();
        visitingChargeLbl = new javax.swing.JLabel();
        visitingChargeTxt = new javax.swing.JTextField();
        createUserJButton = new javax.swing.JButton();
        nameJTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        organizationJComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        roleJComboBox = new javax.swing.JComboBox();
        viewStaffPanel = new javax.swing.JPanel();
        closebtn1 = new javax.swing.JButton();
        empNameJTextField2 = new javax.swing.JTextField();
        visitingChargeLbl2 = new javax.swing.JLabel();
        visitingChargeTxt2 = new javax.swing.JTextField();
        updateUserBtn = new javax.swing.JButton();
        nameJTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        passwordJTextField2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        organizationJComboBox2 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        roleJComboBox2 = new javax.swing.JComboBox();
        saveBtn2 = new javax.swing.JButton();
        viewStaff = new javax.swing.JButton();
        viewStaff1 = new javax.swing.JButton();
        selectDeptCmb = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        deleteStaffBtn = new javax.swing.JButton();

        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userJTable);

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        addStaffBtn.setText("Add Staff");
        addStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStaffBtnActionPerformed(evt);
            }
        });

        createStaffPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Schedule"));
        createStaffPanel.setAutoscrolls(true);

        closebtn.setText("Close");
        closebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtnActionPerformed(evt);
            }
        });

        empNameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameJTextFieldActionPerformed(evt);
            }
        });

        visitingChargeLbl.setText("Visiting Charge");
        visitingChargeLbl.setEnabled(false);

        visitingChargeTxt.setEnabled(false);

        createUserJButton.setText("Create Staff");
        createUserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("User Name");

        jLabel2.setText("Password");

        jLabel3.setText("Staff Name");

        jLabel5.setText("Department");

        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("Staff Type");

        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout createStaffPanelLayout = new javax.swing.GroupLayout(createStaffPanel);
        createStaffPanel.setLayout(createStaffPanelLayout);
        createStaffPanelLayout.setHorizontalGroup(
            createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createStaffPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(visitingChargeLbl)
                    .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(createStaffPanelLayout.createSequentialGroup()
                            .addComponent(closebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createUserJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(createStaffPanelLayout.createSequentialGroup()
                            .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5)))
                            .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createStaffPanelLayout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(createStaffPanelLayout.createSequentialGroup()
                                    .addGap(67, 67, 67)
                                    .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(visitingChargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                            .addComponent(empNameJTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(passwordJTextField, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addGap(51, 51, 51))
        );
        createStaffPanelLayout.setVerticalGroup(
            createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createStaffPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(empNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visitingChargeLbl)
                    .addComponent(visitingChargeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(createStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserJButton)
                    .addComponent(closebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viewStaffPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Schedule"));
        viewStaffPanel.setAutoscrolls(true);

        closebtn1.setText("Close");
        closebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebtn1ActionPerformed(evt);
            }
        });

        empNameJTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empNameJTextField2ActionPerformed(evt);
            }
        });

        visitingChargeLbl2.setText("Visiting Charge");
        visitingChargeLbl2.setEnabled(false);

        visitingChargeTxt2.setEnabled(false);

        updateUserBtn.setText("Update Staff");
        updateUserBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserBtnActionPerformed(evt);
            }
        });

        jLabel11.setText("User Name");

        jLabel12.setText("Password");

        jLabel13.setText("Staff Name");

        jLabel14.setText("Department");

        organizationJComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBox2ActionPerformed(evt);
            }
        });

        jLabel15.setText("Staff Type");

        roleJComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBox2ActionPerformed(evt);
            }
        });

        saveBtn2.setText("Save ");
        saveBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout viewStaffPanelLayout = new javax.swing.GroupLayout(viewStaffPanel);
        viewStaffPanel.setLayout(viewStaffPanelLayout);
        viewStaffPanelLayout.setHorizontalGroup(
            viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, viewStaffPanelLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(visitingChargeLbl2)
                        .addGroup(viewStaffPanelLayout.createSequentialGroup()
                            .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel14)))
                            .addGap(32, 32, 32)
                            .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nameJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(empNameJTextField2)
                                    .addComponent(roleJComboBox2, 0, 176, Short.MAX_VALUE))
                                .addComponent(passwordJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(visitingChargeTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(organizationJComboBox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(viewStaffPanelLayout.createSequentialGroup()
                        .addComponent(closebtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(saveBtn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(updateUserBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addGap(51, 51, 51))
        );
        viewStaffPanelLayout.setVerticalGroup(
            viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewStaffPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(organizationJComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(roleJComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(empNameJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nameJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(passwordJTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(visitingChargeLbl2)
                    .addComponent(visitingChargeTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(viewStaffPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateUserBtn)
                    .addComponent(closebtn1))
                .addGap(18, 18, 18)
                .addComponent(saveBtn2)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        viewStaff.setText("View Staff");
        viewStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStaffActionPerformed(evt);
            }
        });

        viewStaff1.setText("View Department Staff");
        viewStaff1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewStaff1ActionPerformed(evt);
            }
        });

        selectDeptCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectDeptCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectDeptCmbActionPerformed(evt);
            }
        });

        jLabel16.setText("Select Department");

        deleteStaffBtn.setText("Delete Staff");
        deleteStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteStaffBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(selectDeptCmb, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(viewStaff1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(createStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(addStaffBtn)
                                    .addGap(98, 98, 98)
                                    .addComponent(viewStaff)
                                    .addGap(25, 25, 25)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(viewStaffPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(109, 109, 109)
                                    .addComponent(deleteStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(viewStaff1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(selectDeptCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(deleteStaffBtn)
                        .addComponent(viewStaff))
                    .addComponent(addStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(viewStaffPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(createStaffPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        createStaffPanel.getAccessibleContext().setAccessibleName("Add Staff");
        viewStaffPanel.getAccessibleContext().setAccessibleName("View Staff");
    }// </editor-fold>//GEN-END:initComponents

    private void createUserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButtonActionPerformed
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
        String name = empNameJTextField.getText();
        
        if(userName.equals("") || userName.equals(null)){
            JOptionPane.showMessageDialog(null, "Enter username!");
            return;
        }
        
        if(password.equals("") || password.equals(null)){
            JOptionPane.showMessageDialog(null, "Enter password!");
            return;
        }
        
        if(name.equals("") || name.equals(null)){
            JOptionPane.showMessageDialog(null, "Enter name!");
            return;
        }
        
        boolean isUserNameCorrect = Validation.userNameValidator(userName);
        if(isUserNameCorrect == false)
        {
            JOptionPane.showMessageDialog(null, "Enter username properly: only alphabets and numbers allowed!");
            return;
        }
        
        boolean isPasswordCorrect = Validation.passwordValidator(password);
        if(isPasswordCorrect == false)
        {
            JOptionPane.showMessageDialog(null, "Enter password properly!");
            return;
        }
        boolean isNameCorrect = Validation.nameValidator(name);
        if(isNameCorrect == false)
        {
            JOptionPane.showMessageDialog(null, "Enter name properly!");
            return;
        }
        
        
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        
        //check if username is unique
        boolean isUserNameUnique = organization.getUserAccountDirectory().checkIfUsernameIsUnique(userName);
        if(isUserNameUnique == false)
        {
            JOptionPane.showMessageDialog(null, "Username already exists, try another name!");
            return;
        }
        
        //Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        
        Employee employee =organization.getEmployeeDirectory().createEmployee(name);
        //UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee,role);// new AdmRole());
        
        Role role = (Role) roleJComboBox.getSelectedItem();
        
        if(role.roleValue().equals("Doctor Role"))
        {
            employee.setVisitingCharge(Double.parseDouble(visitingChargeTxt.getText()));
        }
        
        
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        //organization.ge
        popData();
        
        JOptionPane.showMessageDialog(null, "Staff added successfully!");
        //clear text
        empNameJTextField.setText("");
        passwordJTextField.setText("");
        visitingChargeTxt.setText("");
        nameJTextField.setText("");
    }//GEN-LAST:event_createUserJButtonActionPerformed

    
        public Role createObjectForRole(String roleString){
        Role role = null;
        if(roleString.equals("DoctorRole"))
        {
            role=new DoctorRole();
        }
        else if(roleString.equals("NurseRole"))
        {
            role=new NurseRole();
        }
        else if(roleString.equals("LabTechnicianRole"))
        {
            role=new LabTechnicianRole();
        }
        else if(roleString.equals("PatientRole"))
        {
            role=new PatientRole();
        }
        else if(roleString.equals("ReceptionistRole"))
        {
            role=new ReceptionistRole();
        }
        
        return role;
    }
    
    
    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = (Organization) organizationJComboBox.getSelectedItem();
        if (organization != null){
            //populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void empNameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameJTextFieldActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
        
        Role role = (Role) roleJComboBox.getSelectedItem();
        if(role!=null){
        //String roleString = role.toString();
        if(role.roleValue().equals("Doctor Role"))
        {
            visitingChargeLbl.setEnabled(true);
            visitingChargeTxt.setEnabled(true);
            visitingChargeLbl.setVisible(true);
            visitingChargeTxt.setVisible(true);
        }
        else{
            visitingChargeLbl.setEnabled(false);
            visitingChargeTxt.setEnabled(false);
            visitingChargeLbl.setVisible(false);
            visitingChargeTxt.setVisible(false);
        }
        }
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void closebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtnActionPerformed
        createStaffPanel.setVisible(false);
    }//GEN-LAST:event_closebtnActionPerformed

    private void addStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addStaffBtnActionPerformed
        // TODO add your handling code here:
        createStaffPanel.setVisible(true);
        visitingChargeLbl.setEnabled(false);
        visitingChargeTxt.setEnabled(false);
        visitingChargeLbl.setVisible(false);
        visitingChargeTxt.setVisible(false);
        popOrganizationComboBox();
        //populateRoleComboBox();
    }//GEN-LAST:event_addStaffBtnActionPerformed

    private void closebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebtn1ActionPerformed
        // TODO add your handling code here:
        viewStaffPanel.setVisible(false);
    }//GEN-LAST:event_closebtn1ActionPerformed

    private void empNameJTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empNameJTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empNameJTextField2ActionPerformed

    private void updateUserBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserBtnActionPerformed
        // TODO add your handling code here:
       // organizationJComboBox2.setEditable(true);
        //roleJComboBox2.setEditable(true);
        empNameJTextField2.setEditable(true);
        nameJTextField2.setEditable(false); // cannot change userName
        passwordJTextField2.setEditable(true);
        
        //if(uaRole.toString().equals("DoctorRole"))
       // {
            //visitingChargeLbl2.setVisible(true);
         //   visitingChargeTxt2.setVisible(true);
            //visitingChargeLbl2.setEditable(false);
            visitingChargeTxt2.setEditable(false);
            
        //}
       // else{
          //  visitingChargeLbl2.setVisible(false);
         //   visitingChargeTxt2.setVisible(false);
       // }
        updateUserBtn.setEnabled(false);
        saveBtn2.setEnabled(true);
        closebtn1.setEnabled(true);
        
       // closebtn1.setEnabled(true);
        
    }//GEN-LAST:event_updateUserBtnActionPerformed

    private void organizationJComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBox2ActionPerformed
        // TODO add your handling code here:
        Organization organization = (Organization) organizationJComboBox2.getSelectedItem();
        if (organization != null){
            //populateEmployeeComboBox(organization);
            populateRoleComboBox2(organization);
        }
    }//GEN-LAST:event_organizationJComboBox2ActionPerformed

    private void roleJComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBox2ActionPerformed

    private void viewStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStaffActionPerformed
        // TODO add your handling code here:
        int row = userJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        viewStaffPanel.setVisible(true);
        organizationJComboBox2.setEnabled(false);  // not allowed to change department
        roleJComboBox2.setEnabled(false);  // not allowed to change role
        popOrganizationComboBox2(); // department populate
        
        UserAccount selectedUsrAcc = (UserAccount) userJTable.getValueAt(row,0);
        selectedStaff = selectedUsrAcc;
        //populateRoleComboBox2((Organization)userJTable.getValueAt(row, 2));  //based on department
        Role uaRole= selectedUsrAcc.getRole();
        organizationJComboBox2.setSelectedItem((Organization)userJTable.getValueAt(row, 2));  //department at 2nd index
        roleJComboBox2.getModel().setSelectedItem(uaRole);
        empNameJTextField2.setText(selectedUsrAcc.getEmployee().getName());
        nameJTextField2.setText(selectedUsrAcc.getUsername());//username
        passwordJTextField2.setText(selectedUsrAcc.getPassword());
        
        organizationJComboBox2.setEditable(false);
        roleJComboBox2.setEditable(false);
        empNameJTextField2.setEditable(false);
        nameJTextField2.setEditable(false);
        passwordJTextField2.setEditable(false);
        //uaRole.getClass()
        if(uaRole.roleValue().equals("Doctor Role"))
        {
            visitingChargeLbl2.setVisible(true);
            visitingChargeTxt2.setVisible(true);
            //visitingChargeLbl2.setEditable(false);
            visitingChargeTxt2.setEditable(false);
            
        }
        else{
            visitingChargeLbl2.setVisible(false);
            visitingChargeTxt2.setVisible(false);
        }
        updateUserBtn.setEnabled(true);
        saveBtn2.setEnabled(false);
        closebtn1.setEnabled(true);
    }//GEN-LAST:event_viewStaffActionPerformed

    private void viewStaff1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewStaff1ActionPerformed
        // TODO add your handling code here:
        
        
        //check if department cmb box is selected
        //int row= selectDeptCmb.getS
        //Organization organization = (Organization) selectDeptCmb.getSelectedItem();
        
        
        popData();
    }//GEN-LAST:event_viewStaff1ActionPerformed

    private void saveBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtn2ActionPerformed
        // TODO add your handling code here:
        //change password, staff name, visiting charge 
        String staffName= empNameJTextField2.getText();
        String password = passwordJTextField2.getText();
        
        boolean result = Validation.nameValidator(staffName);
        if(result == false){
            JOptionPane.showMessageDialog(null, "Enter name properly!");
            return;
        }
        
        
        result = Validation.passwordValidator(password);
        if(result == false){
            JOptionPane.showMessageDialog(null, "Enter password properly!");
            return;
        }
        
        double visitingChgr =-1; ;
        if(visitingChargeTxt2.isVisible())
        {
            visitingChgr= Double.parseDouble(visitingChargeTxt2.getText());
        }
        
        //update properrty
        selectedStaff.setPassword(password);
        selectedStaff.getEmployee().setName(staffName);
        
        if(selectedStaff.getRole().roleValue().equals("Doctor Role"))
        {
            selectedStaff.getEmployee().setVisitingCharge(visitingChgr);
        }
        //show message success
        JOptionPane.showMessageDialog(null, "Updated Successfully!");
        
        
        updateUserBtn.setEnabled(true);
        saveBtn2.setEnabled(false);
        closebtn1.setEnabled(true);
        empNameJTextField2.setEditable(false);
        nameJTextField2.setEditable(false); // cannot change userName
        passwordJTextField2.setEditable(false);
        if(visitingChargeTxt2.isVisible())
        {
            visitingChargeTxt2.setEditable(false);
        }
        else{
            visitingChargeTxt2.setEditable(false);
        }
        
        
        popData();
    }//GEN-LAST:event_saveBtn2ActionPerformed

    private void deleteStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteStaffBtnActionPerformed
        // TODO add your handling code here:
        
        int row = userJTable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        
         int dialogButton= JOptionPane.YES_NO_CANCEL_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the account details?", "Warning",dialogButton);
            if(dialogResult==JOptionPane.YES_OPTION){
                UserAccount selectedUsrAcc = (UserAccount) userJTable.getValueAt(row,0);
                Organization org = (Organization) userJTable.getValueAt(row,2);
                //reomve account
                
            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) 
            {
                if(org.equals(organization)){
                organization.getUserAccountDirectory().removeUserAccount(selectedUsrAcc);
                
                organization.getEmployeeDirectory().removeEmployee(selectedUsrAcc.getEmployee());
                
                 popData();
                 JOptionPane.showMessageDialog(null, "Deleted successfully!!");
                }//inner for 
                }//if 
            }

        
       
    }//GEN-LAST:event_deleteStaffBtnActionPerformed

    private void selectDeptCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectDeptCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectDeptCmbActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addStaffBtn;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton closebtn;
    private javax.swing.JButton closebtn1;
    private javax.swing.JPanel createStaffPanel;
    private javax.swing.JButton createUserJButton;
    private javax.swing.JButton deleteStaffBtn;
    private javax.swing.JTextField empNameJTextField;
    private javax.swing.JTextField empNameJTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField nameJTextField2;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JComboBox organizationJComboBox2;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JTextField passwordJTextField2;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JComboBox roleJComboBox2;
    private javax.swing.JButton saveBtn2;
    private javax.swing.JComboBox selectDeptCmb;
    private javax.swing.JButton updateUserBtn;
    private javax.swing.JTable userJTable;
    private javax.swing.JButton viewStaff;
    private javax.swing.JButton viewStaff1;
    private javax.swing.JPanel viewStaffPanel;
    private javax.swing.JLabel visitingChargeLbl;
    private javax.swing.JLabel visitingChargeLbl2;
    private javax.swing.JTextField visitingChargeTxt;
    private javax.swing.JTextField visitingChargeTxt2;
    // End of variables declaration//GEN-END:variables
}
