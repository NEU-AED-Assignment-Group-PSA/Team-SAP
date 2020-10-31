/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManageAirliner;

import Business.Airliner;
import Business.Airplane;
import Business.AirlinerDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aditi
 */
public class ViewAirplane extends javax.swing.JPanel {

    /**
     * Creates new form ViewAirplane
     */
    Airplane airplane;
    Airliner airliner;
    JPanel userProcessContainer;
    public ViewAirplane(JPanel upc, Airplane airplane, Airliner airliner) {
        initComponents();
        this.airplane= airplane;
        this.airliner=airliner;
        this.userProcessContainer=upc;       
        populate();
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
    }

    public void populate(){
        txtName.setText(airplane.getAirplaneName());
        int i= (airplane.getWindowSeatCount())/10 - 1;
        cmbWindow.setSelectedIndex(i);
        i= (airplane.getMiddleSeatCount())/10 -1;
        cmbMiddle.setSelectedIndex(i);
        i= (airplane.getAisleSeatCount())/10 -1;
        cmbAisle.setSelectedIndex(i);
        txtModel.setText(airplane.getModelNum());
        txtName.setEnabled(false);
        cmbWindow.setEnabled(false);
        cmbMiddle.setEnabled(false);
        cmbAisle.setEnabled(false);
        txtModel.setEnabled(false);
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        txtModel = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cmbWindow = new javax.swing.JComboBox<>();
        cmbMiddle = new javax.swing.JComboBox<>();
        cmbAisle = new javax.swing.JComboBox<>();

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Model Number:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("View Airplane");

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setToolTipText("");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Name:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Window Seat Count:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Middle Seat Count:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Aisle Seat Count:");

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack1.setText("<Back");
        btnBack1.setToolTipText("");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        txtModel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbWindow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbWindow.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));

        cmbMiddle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbMiddle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));

        cmbAisle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbAisle.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "20", "30" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSave)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(70, 70, 70)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtModel)
                                .addComponent(txtName)
                                .addComponent(cmbWindow, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbMiddle, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAisle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBack1)
                        .addGap(203, 203, 203)
                        .addComponent(jLabel1)))
                .addContainerGap(381, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack1))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbWindow))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbMiddle))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbAisle, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(97, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        
        backAction();
        
    }                                       

    private void backAction(){
        userProcessContainer.remove(this);
        Component [] componentArray = userProcessContainer.getComponents();
        Component c = componentArray[componentArray.length-1];
        ManageAirplaneJPanel ms = (ManageAirplaneJPanel) c;
        ms.populateAirplaneList();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    
    
        
        
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        
        txtName.setEnabled(true);
        cmbWindow.setEnabled(true);
        cmbMiddle.setEnabled(true);
        cmbAisle.setEnabled(true);
        txtModel.setEnabled(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);
        
        
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        //validate values->
        if(txtName.getText()==null || "".equals(txtName.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Airplane Name");
            return;
        }
        
        int windowSeat =Integer.parseInt(cmbWindow.getItemAt(cmbWindow.getSelectedIndex()));
        int midSeat =Integer.parseInt(cmbMiddle.getItemAt(cmbMiddle.getSelectedIndex()));
        int aisleSeat =Integer.parseInt(cmbAisle.getItemAt(cmbAisle.getSelectedIndex()));
        
        if(txtModel.getText()==null || "".equals(txtModel.getText())){
            JOptionPane.showMessageDialog(null, "Please enter Model number");
            return;
        }
        
        //Aplha only
        boolean match = txtName.getText().matches("[a-zA-Z0-9]+");
        if(match == false){
            JOptionPane.showMessageDialog(null, "Enter Name correctly ([a-zA-Z0-9]+) ");
            return;
        }
        
        //Aplha only
        match = txtModel.getText().matches("[a-zA-Z0-9]+");
        if(match == false){
            JOptionPane.showMessageDialog(null, "Enter Model number correctly");
            return;

        }
        
        String name=txtName.getText();
        //rating =cmbRating.getSelectedIndex();
        String model = txtModel.getText();
        
        //Airplane a = new Airplane();
        airplane.setAirplaneName(name);
        airplane.setWindowSeatCount(windowSeat);
        airplane.setMiddleSeatCount(midSeat);
        airplane.setAisleSeatCount(aisleSeat);
        airplane.setModelNum(model);
        //airliner.getAirplaneList().remove(airplane);
        //airliner.getAirplaneList().add(a);
        JOptionPane.showMessageDialog(null, "Airplane updated successfully!");

        
        
        
        btnUpdate.setEnabled(true);
        btnSave.setEnabled(false);
        
        txtName.setEnabled(false);
        cmbWindow.setEnabled(false);
        cmbMiddle.setEnabled(false);
        cmbAisle.setEnabled(false);
        txtModel.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cmbAisle;
    private javax.swing.JComboBox<String> cmbMiddle;
    private javax.swing.JComboBox<String> cmbWindow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}