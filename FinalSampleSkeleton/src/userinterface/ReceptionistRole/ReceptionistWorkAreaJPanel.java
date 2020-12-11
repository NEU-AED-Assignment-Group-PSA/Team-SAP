/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ReceptionistRole;

import Business.Appointment.Appointment;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.ReceptionistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.DoctorRole.ViewAppointmentJPanel;
import userinterface.PatientRole.BookAppointmentJPanel;
import userinterface.PatientRole.CreateNewPatientJPanel;
import userinterface.PatientRole.GeneratePatientBillJPanel;
import userinterface.PatientRole.ViewPatientJPanel;

/**
 *
 * @author aditi
 */
public class ReceptionistWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReceptionistWorkAreaJPanel
     */
    
    private JPanel userProcessContainer;
    private Organization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem system;
    
    public ReceptionistWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        this.system = business;
        
        if(enterprise.getEnterpriseType().getValue().equals("Hospital"))
        {
           populatePatients();
        }
        
        
        if(enterprise.getEnterpriseType().getValue().equals("Lab"))
        {
            populateTest();
        }
        
        
        if(enterprise.getEnterpriseType().getValue().equals("Pharmacy"))
        {
            populatepharmacyReceptionist();
        }
        
        
        if(enterprise.getEnterpriseType().getValue().equals("Insurance"))
        {
            populateTest();
        }
        
        
    }

    public void populatePatients() {
        DefaultTableModel model = (DefaultTableModel) PatientDataJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getPatientDirectory()!= null && enterprise.getPatientDirectory().getPatientList() != null){
            for (Patient patient : enterprise.getPatientDirectory().getPatientList()) {
                    Object[] row = new Object[4];
                    row[0] = patient.getId();
                    row[1] = patient.getName();
                    row[2] = patient.getPhoneNum();
                    row[3] = patient.getBloodGroup();
                    model.addRow(row); 
            }
        }
    }
    
    
    
     public void populateTest() {
        DefaultTableModel model = (DefaultTableModel) PatientDataJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getWorkQueue() != null ){
            List<WorkRequest> wrList = enterprise.getWorkQueue().getWorkRequestList();
            for (WorkRequest wr : wrList) {
                if(wr instanceof ReceptionistWorkRequest)
                {
                    Appointment app = ((ReceptionistWorkRequest) wr).getApp();
                Patient patient = ((ReceptionistWorkRequest)wr).getPatient();
                if(patient == null && app !=null){
                    patient= ((ReceptionistWorkRequest) wr).getApp().getPatient();
                            
                }
                
                
                if(patient!=null)
                {
                
                    Object[] row = new Object[4];
                    row[0] = patient.getId();
                    row[1] = patient.getName();
                    row[2] = patient.getPhoneNum();
                    row[3] = patient.getBloodGroup();
                    model.addRow(row); 
                }
                }
            }
        }
    }
    
     
     public void populatepharmacyReceptionist() {
        DefaultTableModel model = (DefaultTableModel) PatientDataJTable.getModel();
        model.setRowCount(0);
        if(enterprise.getWorkQueue() != null ){
            List<WorkRequest> wrList = enterprise.getWorkQueue().getWorkRequestList();
            for (WorkRequest wr : wrList) {
                if(wr instanceof ReceptionistWorkRequest)
                {
                
                Patient patient = ((ReceptionistWorkRequest)wr).getPatient();
                if(patient!=null)
                {
                
                    Object[] row = new Object[4];
                    row[0] = patient.getId();
                    row[1] = patient.getName();
                    row[2] = patient.getPhoneNum();
                    row[3] = patient.getBloodGroup();
                    model.addRow(row); 
                }
                }
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
        PatientDataJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnManagePatient = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnBookAppointment = new javax.swing.JButton();
        btnViewAppointment = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 204, 255)));

        PatientDataJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Id", "Patient Name", "Phone Number", "Blood Group"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PatientDataJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, 876, 362));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Receptionist");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 200, -1));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        btnManagePatient.setText("Create New Patient");
        btnManagePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientActionPerformed(evt);
            }
        });

        jButton2.setText("View Patient");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBookAppointment.setText("Book Appointment");
        btnBookAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookAppointmentActionPerformed(evt);
            }
        });

        btnViewAppointment.setText("View Appointment");
        btnViewAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAppointmentActionPerformed(evt);
            }
        });

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnManagePatient, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBookAppointment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 153, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnManagePatient)
                    .addComponent(jButton2)
                    .addComponent(refreshJButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAppointment)
                    .addComponent(btnBookAppointment))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 154, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/receptionist.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 230));

        jPanel14.setBackground(new java.awt.Color(232, 201, 232));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel13.setBackground(new java.awt.Color(96, 83, 150));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(96, 83, 150));
        jLabel5.setText("Welcome back!");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 270, 37));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManagePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientActionPerformed

        CreateNewPatientJPanel createNewPatientJPanel = new CreateNewPatientJPanel(userProcessContainer, userAccount, organization, enterprise, system);
        userProcessContainer.add("createNewPatientJPanel",createNewPatientJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManagePatientActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = PatientDataJTable.getSelectedRow();
        if(selectedRow >= 0){
            Patient patient = (Patient)enterprise.getPatientDirectory().getPatientList().get(selectedRow);
//            Order order = (Order)OrderJTable.getValueAt(selectedRow, 0);
            ViewPatientJPanel viewPatientJPanel = new ViewPatientJPanel(userProcessContainer, userAccount, organization, enterprise, system, patient);
            userProcessContainer.add("viewPatientJPanel",viewPatientJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        } 
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBookAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookAppointmentActionPerformed
        int selectedRow = PatientDataJTable.getSelectedRow();
        if(selectedRow >= 0){
            Patient patient = (Patient)enterprise.getPatientDirectory().getPatientList().get(selectedRow);
            BookAppointmentJPanel appointmentJPanel = new BookAppointmentJPanel(userProcessContainer, userAccount, organization, enterprise, system, patient);
            userProcessContainer.add("appointmentJPanel",appointmentJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBookAppointmentActionPerformed

    private void btnViewAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAppointmentActionPerformed
        // TODO add your handling code here:
       int selectedRow = PatientDataJTable.getSelectedRow();
        if(selectedRow >= 0){
            Patient patient = (Patient)enterprise.getPatientDirectory().getPatientList().get(selectedRow);
            userinterface.PatientRole.ViewAppointmentJPanel viewAppointmentJPanel = new userinterface.PatientRole.ViewAppointmentJPanel(userProcessContainer, userAccount, organization, enterprise, system, patient);
            userProcessContainer.add("viewAppointmentJPanel",viewAppointmentJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }else{
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);
            
        }
    }//GEN-LAST:event_btnViewAppointmentActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
      if(enterprise.getEnterpriseType().getValue().equals("Hospital"))
        {
           populatePatients();
        }
        
        
        if(enterprise.getEnterpriseType().getValue().equals("Lab"))
        {
            populateTest();
        }
        
        
        if(enterprise.getEnterpriseType().getValue().equals("Pharmacy"))
        {
            populateTest();
        }
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PatientDataJTable;
    private javax.swing.JButton btnBookAppointment;
    private javax.swing.JButton btnManagePatient;
    private javax.swing.JButton btnViewAppointment;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables

    
}
