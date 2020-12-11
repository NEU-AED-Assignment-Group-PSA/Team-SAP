/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PharmacyWorkerMainWorkArea;

import userinterface.LabTechnicianRole.*;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.LabEnterprise.LabTest;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacyWorkRequest;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;

/**
 *
 * @author raunak
 */
public class PharmacyMainWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private Organization organization;
    //private LabOrganization organization;
    
    private Enterprise enterprise;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public PharmacyMainWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business, Enterprise enterprise) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        //this.labOrganization = (LabOrganization)organization;
        this.enterprise = enterprise;
        //this.business = business;
        this.organization = organization;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
        
        model.setRowCount(0);
        //enterprise.getWorkQueue().getWorkRequestList();//.add(request);
        for(WorkRequest request : enterprise.getWorkQueue().getWorkRequestList()){
           // List<LabTest> labTestList = ((PharmacyWorkRequest)request).getAppointment().getLabTestList().getLabTestList();
            if(request instanceof  PharmacyWorkRequest &&(request.getReceiver()==null ||  request.getReceiver() ==  userAccount )){
           //for(LabTest labTest : labTestList)
           // {
            
            Object[] row = new Object[8];
            row[0] = request.getSender();
            //row[1] = request.getSender().getEmployee().getName();
            row[1] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[2] = ((PharmacyWorkRequest)request).getPatient();
            
            row[3] = request.getStatus();
           // LabTest lt= ((PharmacyWorkRequest)request).getLabTest();
            row[4] = request.getRequestDate();//.getName();
            row[5] = ((PharmacyWorkRequest)request).getDoctor();
            row[6] = request.getMessage();
            row[7] = request;
            model.addRow(row);
       // }//inner for
        }//if
        }//outer for
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
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Receiver", "Patient", "Request Status", "Lab Test", "Test Status", "Message", "Request ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 58, 860, 170));

        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 110, -1));

        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/diagnosis.PNG"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 860, 540));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pharmacy Worker Area");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 270, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 7);
        
        if(request.getReceiver() != null)
        {
            JOptionPane.showMessageDialog(null, "Already assigned to technician!");
            return;
        }
        
        request.setReceiver(userAccount);
        request.setStatus("Pending");
        JOptionPane.showMessageDialog(null, "Assigned successfully!");
        populateTable();
        
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        
        int selectedRow = workRequestJTable.getSelectedRow();
        
        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        
        WorkRequest request = (WorkRequest)workRequestJTable.getValueAt(selectedRow, 7);
        if(request.getReceiver()==null)
        {
            JOptionPane.showMessageDialog(null, "Please assign request before processing!");
            return;
        }
        
        if(request.getStatus().equals("Complete"))
        {
           JOptionPane.showMessageDialog(null, "Request is already processed");
           return;
       }
        
        //request.setStatus("Processing");
        //LabTest labtest = (LabTest) workRequestJTable.getValueAt(selectedRow, 4);
        PharmacyWorkerWorkAreaJPanel processWorkRequestJPanel = 
                new PharmacyWorkerWorkAreaJPanel(userProcessContainer, userAccount,  organization,  business,request,  enterprise);
        userProcessContainer.add("LabTechnicianWorkAreaJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
