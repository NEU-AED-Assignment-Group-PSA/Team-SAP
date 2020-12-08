/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Appointment.Appointment;
import Business.Appointment.AppointmentDirectory;
import Business.Appointment.Prescription;
import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Pharmacy;
import Business.Enterprise.PharmacyEnterprise.Pharmacy;
import Business.Medicine.Medicine;
import Business.Medicine.MedicineDirectory;
import Business.Network.Network;
import Business.Organization.PharmacyOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author preranaurs
 */


public class PrescriptionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PrescriptionJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Patient patient;
    private Employee doctor;
    private Appointment appointment;
    private MedicineDirectory medicineList;
    private AppointmentDirectory prescriptionList;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    

    PrescriptionJPanel(JPanel userProcessContainer, Patient patient, Appointment appointment, Employee doctor,
            MedicineDirectory medicineList,EcoSystem ecosystem, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.appointment = appointment;
        this.patient = patient;
        this.doctor = doctor;
        this.ecosystem=ecosystem;
        this.medicineList = medicineList;
        this.enterprise= enterprise;
        this.userAccount = userAccount;
        patientNameTxt.setText(patient.getName());
        doctorNameTxt.setText(doctor.getName());
        //docotr
        //appointment.
        //appointment.setPrescription(prescription);
        populatePharmacy();
        //populateMedicineCmb();
    }

    
    void populatePharmacy(){
        ArrayList<Network> networkList=ecosystem.getNetworkList();
        Network network=null;
        //network
        cmbPharmacy.removeAllItems();
        for(int i=0;i<networkList.size();i++){
            network=networkList.get(i);
            
            List<Enterprise> enterpriseList;
            //enterprise.getNetwork();
            
            if(network.equals(enterprise.getNetwork()))
            {
                //boston network
                
                enterpriseList=network.getEnterpriseDirectory().getEnterpriseList();
                
               for(Enterprise enterpri: enterpriseList){
                   if(enterpri.getEnterpriseType().equals(Enterprise.EnterpriseType.Pharmacy))
                   {
                       cmbPharmacy.addItem(enterpri);
                   }
               }
            }
            
            
            
        }
        
        
        //
        
        
        
    }
    
    void populateMedicineCmb()
    {
          medicneCmb.removeAllItems();
        
          Pharmacy pharEnterprise =(Pharmacy) cmbPharmacy.getSelectedItem();
          if(pharEnterprise != null)  // added because on page loading null pointer exception is coming
          {
          MedicineDirectory medicineList1 =pharEnterprise.getMedicineList();
          
          
          if(medicineList1 != null){
          for(Medicine med: medicineList1.getMedicineList())
          {
              medicneCmb.addItem(med);
          }
          }

          
          }//end if
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
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        patientNameTxt = new javax.swing.JTextField();
        doctorNameTxt = new javax.swing.JTextField();
        dosageTxt = new javax.swing.JTextField();
        patientHistoryTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        btnPrescribe = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        PrescriptionTable = new javax.swing.JTable();
        medicneCmb = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cmbPharmacy = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        jLabel1.setText("Medicine Prescription");

        jLabel2.setText("Patient Name :");

        jLabel3.setText("Doctor Name :");

        jLabel6.setText("Remark :");

        jLabel7.setText("Medicines Prescribed :");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnPrescribe.setText("Prescribe");
        btnPrescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeActionPerformed(evt);
            }
        });

        PrescriptionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicines prescribed", "Dosage"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(PrescriptionTable);
        if (PrescriptionTable.getColumnModel().getColumnCount() > 0) {
            PrescriptionTable.getColumnModel().getColumn(0).setResizable(false);
            PrescriptionTable.getColumnModel().getColumn(1).setResizable(false);
        }

        medicneCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        medicneCmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicneCmbActionPerformed(evt);
            }
        });

        jLabel4.setText("Dosage :");

        jButton1.setText("Add Medicine");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbPharmacy.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPharmacyActionPerformed(evt);
            }
        });

        jLabel5.setText("Pharmacy :");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Mediciness.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(23, 23, 23)
                                            .addComponent(cmbPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGap(46, 46, 46)
                                                    .addComponent(jLabel3)
                                                    .addGap(23, 23, 23))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(doctorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel7))
                                                .addGap(23, 23, 23))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(medicneCmb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(dosageTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(patientHistoryTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(backJButton)
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(btnPrescribe)))
                .addContainerGap(457, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(doctorNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPharmacy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(medicneCmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dosageTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientHistoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnPrescribe)
                .addContainerGap(247, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnPrescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeActionPerformed
        //DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
          
        //String date=dateTxt.getText();
        //date = dateFormat.format(date);
        String patientName=patientNameTxt.getText();
        String doctorName=doctorNameTxt.getText();
        //String specialization=specializationTxt.getText();
        String medsPrescribed= dosageTxt.getText();
        if(patientName.equals("") || doctorName.equals("") || medsPrescribed.equals(""))
        {
           JOptionPane.showMessageDialog(null, "Fields cannot be empty"); 
        }
        else
        {Prescription prescription = appointment.getPrescription();//prescriptionList.addPrescription();
        //prescription.setDate(date);
        prescription.setPatient(patient);
        prescription.setDoctor(doctor);
        
        //patient.getAppointmentDirectory().getPrescriptionList().add(prescription);
        
        //pharmacy work request created--todo
        PharmacyWorkRequest phWr = new PharmacyWorkRequest();
         phWr.setStatus("New");
                //appointment.setStatus(Appointment.AppointmentStatus.New.getValue());
                phWr.setMessage("Prescribe medicines for this Patient");
                phWr.setSender(userAccount);
                phWr.setAppointment(appointment);
                phWr.setDoctor(doctor);
                phWr.setPatient(patient);
                phWr.setMedicineMap(appointment.getPrescription().getMedicinePrescribed());
                //phWr.setReceiver(receptionist);
                //Appointment appointment = (Appointment) 
                Pharmacy pharEnterprise =(Pharmacy) cmbPharmacy.getSelectedItem();
                pharEnterprise.getWorkQueue().getWorkRequestList().add(phWr);
                //UserAccount recepUseracc = null;
                //List<UserAccount> userAccDir=  organization.getUserAccountDirectory().getUserAccountList();
                //List<UserAccount> nurseList = enterprise.getUserAccountDirectory().getUserAccountList();
                //workreq.setReceiver(receptionist.getUserAccountDirectory().getUserAccountList().get(0));
                JOptionPane.showMessageDialog(null, "Medicine prescription request sent to Pharmacy");
        
        
        
        //dateTxt.setText("");
        patientNameTxt.setText("");
        doctorNameTxt.setText("");
        dosageTxt.setText("");
        //appointment.setPrescription(prescription);
        JOptionPane.showMessageDialog(null, "Prescription sucessfully added"); 
        populate();
        }
        
    }//GEN-LAST:event_btnPrescribeActionPerformed

    private void cmbPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPharmacyActionPerformed
        // TODO add your handling code here:
        
        populateMedicineCmb();
         DefaultTableModel model = (DefaultTableModel) PrescriptionTable.getModel();
        
        model.setRowCount(0);
        Prescription prescription = appointment.getPrescription();
        
        prescription.getMedicinePrescribed().clear();
    }//GEN-LAST:event_cmbPharmacyActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        populatePrescribedMedicineTable();
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void medicneCmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicneCmbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicneCmbActionPerformed

    
    void populatePrescribedMedicineTable(){
        
        Medicine med = (Medicine) medicneCmb.getSelectedItem();
        double dosage = Double.parseDouble(dosageTxt.getText());
        
        Prescription prescription = appointment.getPrescription();
        
        prescription.getMedicinePrescribed().put(med, dosage);
        
        
        DefaultTableModel model = (DefaultTableModel) PrescriptionTable.getModel();
        Object[] row = new Object[2];
                   
                    row[0] = med;
                    row[1] = dosage;
                    model.addRow(row);
    }
    
    
     public void populate() {
        DefaultTableModel model = (DefaultTableModel) PrescriptionTable.getModel();

        model.setRowCount(0);
        //for (UserAccount ua : system.getUserAccountDirectory().getUserAccountList()) {s
          /*  for (MapEntry<Medicine,double> med : appointment.getPrescription().getMedicinePrescribed()) {
                    Object[] row = new Object[3];
                    //row[0] = prescription.getDate();
                    row[0] = prescription.getPatient();
                    row[1] = prescription.getDoctor();
                    row[2] = prescription.getMedicineList();
                    model.addRow(row);
                }*/
            }
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable PrescriptionTable;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnPrescribe;
    private javax.swing.JComboBox cmbPharmacy;
    private javax.swing.JTextField doctorNameTxt;
    private javax.swing.JTextField dosageTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox medicneCmb;
    private javax.swing.JTextField patientHistoryTxt;
    private javax.swing.JTextField patientNameTxt;
    // End of variables declaration//GEN-END:variables
}
