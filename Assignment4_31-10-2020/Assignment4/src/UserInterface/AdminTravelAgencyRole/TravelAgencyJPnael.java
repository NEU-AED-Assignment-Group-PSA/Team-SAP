/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminTravelAgencyRole;

import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.Fleet;
import Business.Flight;
import Business.FlightSchedule;
import Business.Ticket;
import UserInterface.CustomerRole.ManageCustomerJPanel;
import java.util.List;
import javax.swing.JPanel;
import UserInterface.AdminTravelAgencyRole.ManageTravelOffJPanel;
/**
 *
 * @author aditi
 */
public class TravelAgencyJPnael extends javax.swing.JPanel {

    /**
     * Creates new form TravelAgencyJPnael
     */
    JPanel UserProcessContainer;
    AirlinerDirectory airlinerDir;
    CustomerDirectory custDir;
    List<Ticket> ticketList;
    Fleet airplanelist;
    List<Flight> flightList;
    List<FlightSchedule>  flightScheduleList;
    public TravelAgencyJPnael(JPanel UserProcessContainer, AirlinerDirectory ad,CustomerDirectory custDir, List<Ticket> ticketList, Fleet airplanelist, List<Flight> flightList, List<FlightSchedule>  flightScheduleList) {
        initComponents();
        this.airlinerDir=ad;
        this.UserProcessContainer=UserProcessContainer;
        this.custDir=custDir;
        this.ticketList=ticketList;
        this.airplanelist=airplanelist;
        this.flightList=flightList;
        this.flightScheduleList=flightScheduleList;
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
        btnCustomer = new javax.swing.JButton();
        btnViewMTSch = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Manage Travel Agency");

        btnCustomer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCustomer.setText("Manage Customer");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnViewMTSch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewMTSch.setText("View Master Travel Schedule");
        btnViewMTSch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMTSchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnViewMTSch, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(257, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(239, 239, 239))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnViewMTSch, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(398, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        
        AirlinerDirectory ad = airlinerDir;
        
        ManageCustomerJPanel msjp = new ManageCustomerJPanel (UserProcessContainer, ad, custDir, ticketList, flightScheduleList,flightList);
        UserProcessContainer.add("ManageCustomerJPanel",msjp); //any name will do
        ((java.awt.CardLayout)UserProcessContainer.getLayout()).next(UserProcessContainer);

        
        
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnViewMTSchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMTSchActionPerformed
        // TODO add your handling code here:
        
         AirlinerDirectory ad = airlinerDir;
        
        ViewMasteTrvlSchJPanel msjp = new ViewMasteTrvlSchJPanel (UserProcessContainer, ad, custDir,airplanelist, flightList,flightScheduleList);
        UserProcessContainer.add("ViewMasteTrvlSchJPanel",msjp); //any name will do
        ((java.awt.CardLayout)UserProcessContainer.getLayout()).next(UserProcessContainer);

        
    }//GEN-LAST:event_btnViewMTSchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnViewMTSch;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
