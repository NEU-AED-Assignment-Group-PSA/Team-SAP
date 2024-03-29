/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.Appointment.Appointment;
import Business.Bill.Bill;
import Business.Bill.BillDirectory;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise.Hospital;
import Business.Enterprise.InsuranceEnterprise.Insurance;
import Business.Enterprise.LabEnterprise.Lab;
import Business.Enterprise.LabEnterprise.LabTest;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.InsuranceWorkRequest;
import Business.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author root
 */
public class ViewPatientBillJPanel extends javax.swing.JPanel {

    /**
     * Creates new form GeneratePatientBillJPanel
     */
    JPanel userProcessContainer;
    Organization organization;
    Enterprise enterprise;
    EcoSystem system;
    Patient patient;
    Appointment appointment;
    UserAccount useraccount;
    ViewPatientBillJPanel(JPanel userProcessContainer, Organization organization, Enterprise enterprise, EcoSystem system, Patient patient, Appointment appointment, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.system = system;
        this.patient = patient;
        this.appointment = appointment;
        this.useraccount= useraccount;
        populatePatientData();
        disableFields();
    }
    
    private void disableFields() {
        txtPatientName.setEditable(false);
        txtDoctor.setEditable(false);
        txtAppointmetId.setEditable(false);
        txtAppointmetDate.setEditable(false);
        txtAppointmentType.setEditable(false);
        txtVisingCharge.setEditable(false);
        txtOperationCharge.setEditable(false);
        txtTotalCharge.setEditable(false);
        txtInsuranceE.setEditable(false);
        txtInsuranceId.setEditable(false);
    }
    
    public void populatePatientData(){
        
        SimpleDateFormat formatter1=new SimpleDateFormat("yyyy-MM-dd");
        txtPatientName.setText(patient.getName());
        if(appointment.getDoctor().getSpecialization() == null){
            txtDoctor.setText(appointment.getDoctor().getName() + " - Lab Technician");
        }else{
            txtDoctor.setText(appointment.getDoctor().getName() + " - " + appointment.getDoctor().getSpecialization().getValue());
        }
        
        txtAppointmetId.setText(String.valueOf(appointment.getAppointmentId()));
        txtAppointmetDate.setText(formatter1.format(appointment.getDate()));
        txtAppointmentType.setText(appointment.getType());
        double visitingCharge = appointment.getDoctor().getVisitingCharge();
        Double operationCharge = 0d;
        if(appointment.getOperation() != null){
            operationCharge = appointment.getOperation().getOperationCharge();
        }
        
        txtVisingCharge.setText(String.valueOf(visitingCharge));
        txtOperationCharge.setText(String.valueOf(operationCharge));
        
        Double labtestCharge = 0d;
        if(appointment.getLabTestList() != null && appointment.getLabTestList().getLabTestList() != null){
            for(LabTest labTest : appointment.getLabTestList().getLabTestList()){
                labtestCharge += labTest.getTestCharge();
            }
        }
        txtLabTestCharge.setText(String.valueOf(labtestCharge));
         if(enterprise instanceof Hospital)
        {
           txtLabTestCharge.setText(""); 
           labtestCharge=0d;
        }
        
        
        double totalCharge = visitingCharge + operationCharge + labtestCharge;
        txtTotalCharge.setText(String.valueOf(totalCharge));
        txtInsuranceE.setText(patient.getInsuranceE().getName() == null ? "" : patient.getInsuranceE().getName());
        txtInsuranceId.setText(patient.getInsuranceId() == null ? "" : patient.getInsuranceId() );
        txtApptnmtStatus.setText(appointment.getStatus());
        
        if(appointment.getStatus().equals(Appointment.AppointmentStatus.ApprovedInsurance.getValue()) ||
                appointment.getStatus().equals(Appointment.AppointmentStatus.MarkForInsurance.getValue()))
        {
            txtInsuranceStatus.setText(appointment.getStatus());
        }
        else{
            txtInsuranceStatus.setText("Not approved");
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

        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtAppointmetDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAppointmetId = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtVisingCharge = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtOperationCharge = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotalCharge = new javax.swing.JTextField();
        txtDoctor = new javax.swing.JTextField();
        txtAppointmentType = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtInsuranceId = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtInsuranceE = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtInsuranceStatus = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtApptnmtStatus = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtLabTestCharge = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Appointment Type:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 233, -1, -1));

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Patient Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 68, 109, -1));
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 65, 148, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Doctor:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 110, 109, -1));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Appointment Date:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 193, 109, -1));

        txtAppointmetDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmetDateActionPerformed(evt);
            }
        });
        add(txtAppointmetDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 190, 148, -1));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Appointment Id:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 150, 134, -1));

        txtAppointmetId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAppointmetIdActionPerformed(evt);
            }
        });
        add(txtAppointmetId, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 147, 148, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Visiting Charge:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 273, 109, -1));
        add(txtVisingCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 270, 148, -1));

        jLabel8.setText("Operation Charge:");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 313, 109, -1));
        add(txtOperationCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 310, 148, -1));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Total Charge:");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 109, -1));
        add(txtTotalCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 148, -1));
        add(txtDoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 107, 148, -1));
        add(txtAppointmentType, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 230, 148, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Insurance ID:");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 430, 166, -1));
        add(txtInsuranceId, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 150, -1));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("Insurance Company:");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 166, -1));
        add(txtInsuranceE, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 148, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel12.setText("Insurance Status:");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 143, -1));
        add(txtInsuranceStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 500, 148, -1));

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel13.setText("Appointment Status:");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 540, 143, -1));
        add(txtApptnmtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 540, 148, -1));

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

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(96, 83, 150));
        jLabel14.setText("View Bill");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 270, 37));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/BillingPayment.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 340, 310));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel15.setText("Lab Test Charge:");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 130, -1));

        txtLabTestCharge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLabTestChargeActionPerformed(evt);
            }
        });
        add(txtLabTestCharge, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 150, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        //Component[] componentArray =userProcessContainer.getComponents();
        //Component component = componentArray[componentArray.length - 1];
        //ReceptionistWorkAreaJPanel sysAdminwajp = (ReceptionistWorkAreaJPanel) component;
        //sysAdminwajp.populatePatients();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtAppointmetDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmetDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmetDateActionPerformed

    private void txtAppointmetIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAppointmetIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAppointmetIdActionPerformed

    private void txtLabTestChargeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLabTestChargeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLabTestChargeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JTextField txtAppointmentType;
    private javax.swing.JTextField txtAppointmetDate;
    private javax.swing.JTextField txtAppointmetId;
    private javax.swing.JTextField txtApptnmtStatus;
    private javax.swing.JTextField txtDoctor;
    private javax.swing.JTextField txtInsuranceE;
    private javax.swing.JTextField txtInsuranceId;
    private javax.swing.JTextField txtInsuranceStatus;
    private javax.swing.JTextField txtLabTestCharge;
    private javax.swing.JTextField txtOperationCharge;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtTotalCharge;
    private javax.swing.JTextField txtVisingCharge;
    // End of variables declaration//GEN-END:variables

    
}
