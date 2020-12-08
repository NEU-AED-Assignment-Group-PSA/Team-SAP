/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Appointment.PatientHistoryDetails;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author preranaurs
 */
public class PatientHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientHistoryJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem ecosystem;
    private Patient patient;

    PatientHistoryJPanel(JPanel userProcessContainer, UserAccount userAccount, Organization organization, Enterprise enterprise, EcoSystem ecosystem, Patient patient) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.organization = organization;
        this.enterprise = enterprise;
        this.ecosystem = ecosystem;
        this.patient = patient;
        patientNameTxt.setText(patient.getName());
        
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        previousDiagnosisTxt = new javax.swing.JTextField();
        medAlergiesTxt = new javax.swing.JTextField();
        familyHistoryTxt = new javax.swing.JTextField();
        alergiesTxt = new javax.swing.JTextField();
        surgeryHistoryTxt = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        btnAddPatientDetails = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        patientDetailsTbl = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        patientNameTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 14)); // NOI18N
        jLabel1.setText("Patient Details");

        jLabel3.setText("Family History :");

        jLabel4.setText("Medicine Allergies :");

        jLabel5.setText("Allergies :");

        jLabel6.setText("Surgery History :");

        jLabel7.setText("Previous visit diagnosis :");

        medAlergiesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medAlergiesTxtActionPerformed(evt);
            }
        });

        familyHistoryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                familyHistoryTxtActionPerformed(evt);
            }
        });

        alergiesTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alergiesTxtActionPerformed(evt);
            }
        });

        surgeryHistoryTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                surgeryHistoryTxtActionPerformed(evt);
            }
        });

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnAddPatientDetails.setText("Add Details");
        btnAddPatientDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientDetailsActionPerformed(evt);
            }
        });

        patientDetailsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Name", "Previous Visit details", "Medicine Allergies"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(patientDetailsTbl);
        if (patientDetailsTbl.getColumnModel().getColumnCount() > 0) {
            patientDetailsTbl.getColumnModel().getColumn(0).setResizable(false);
            patientDetailsTbl.getColumnModel().getColumn(1).setResizable(false);
            patientDetailsTbl.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel8.setText("Patient Name :");

        patientNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTxtActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/prescroption.PNG"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(85, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(previousDiagnosisTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(familyHistoryTxt)
                            .addComponent(surgeryHistoryTxt)
                            .addComponent(alergiesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddPatientDetails)
                        .addGap(160, 160, 160))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(34, 34, 34)
                        .addComponent(medAlergiesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(274, 274, 274))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(backJButton)
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(backJButton))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(patientNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(previousDiagnosisTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(alergiesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(surgeryHistoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(familyHistoryTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(medAlergiesTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addComponent(btnAddPatientDetails)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medAlergiesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medAlergiesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medAlergiesTxtActionPerformed

    private void familyHistoryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_familyHistoryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_familyHistoryTxtActionPerformed

    private void alergiesTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alergiesTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alergiesTxtActionPerformed

    private void surgeryHistoryTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_surgeryHistoryTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_surgeryHistoryTxtActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnAddPatientDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientDetailsActionPerformed
       /*
        
        String patientName=patientNameTxt.getText();
        String previousDiagnosis = previousDiagnosisTxt.getText();
        String medsalergies = medAlergiesTxt.getText();
        if(patientName.equals("") || previousDiagnosis.equals("") || medsalergies.equals(""))
        {
           JOptionPane.showMessageDialog(null, "Fields cannot be empty, Please fill in all fields"); 
        }
        else{
        {PatientHistoryDetails patientHistoryDetails = prescriptionList.addPrescription();
        //prescription.setDate(date);
        prescription.setPatient(patient);
        prescription.setDoctor(doctor);
        prescription.setMedicineList(medicineList);
        //dateTxt.setText("");
        patientNameTxt.setText("");
        doctorNameTxt.setText("");
        medsPrescribedTxt.setText("");
        appointment.setPrescription(prescription);
        JOptionPane.showMessageDialog(null, "Prescription sucessfully added"); 
        populatePatientDetails();
        }
        }
        int select=diagnosistable.getSelectedRow();
        if(select<0){
            JOptionPane.showMessageDialog(null, "please select");
            return;
        }else{
            Diagnosis date=(Diagnosis)diagnosistable.getValueAt(select, 0);
//            String detail=(String)diagnosistable.getValueAt(select, 1);
//            String medicine=(String)diagnosistable.getValueAt(select, 2);
            System.out.println("to patient detail:"+date);
            CardLayout layout=(CardLayout)jpanel.getLayout();
            jpanel.add("patient detail",new PatientDetailJPanel(jpanel,date));
            layout.next(jpanel);
        }

*/
    }//GEN-LAST:event_btnAddPatientDetailsActionPerformed

    public void populatePatientDetails(){
        DefaultTableModel model = (DefaultTableModel) patientDetailsTbl.getModel();
        model.setRowCount(0);
            Object[] row = new Object[6];
            row[0] = patient.getName();
            row[1] = previousDiagnosisTxt.getText();
            row[2] = medAlergiesTxt.getText();
            row[3] = alergiesTxt.getText();
            row[4] = surgeryHistoryTxt.getText();
            row[5] = familyHistoryTxt.getText();
            model.addRow(row);
            
    }
    
    
    private void patientNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alergiesTxt;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAddPatientDetails;
    private javax.swing.JTextField familyHistoryTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField medAlergiesTxt;
    private javax.swing.JTable patientDetailsTbl;
    private javax.swing.JTextField patientNameTxt;
    private javax.swing.JTextField previousDiagnosisTxt;
    private javax.swing.JTextField surgeryHistoryTxt;
    // End of variables declaration//GEN-END:variables
}
