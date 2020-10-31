/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CustomerRole;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Flight;
import Business.FlightSchedule;
import Business.Ticket;
import UserInterface.ManageAirliner.ManageAirlinersJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aditi
 */
public class BookTickets extends javax.swing.JPanel {

    /**
     * Creates new form BookTickets
     */
    
    JPanel UserProcessContainer;
    AirlinerDirectory airlinerDir;
    CustomerDirectory custDir;
    Customer customer;
    List<FlightSchedule> flightSchList;
    List<Flight> flightList;
    Flight flight;
    List<Ticket> ticketList;
    public BookTickets(JPanel UserProcessContainer, AirlinerDirectory airlinerDir, CustomerDirectory custDir, Customer c, List<FlightSchedule> flightSchList, List<Flight> flightList,  List<Ticket> ticketList) {
        initComponents();
        this.UserProcessContainer = UserProcessContainer;
        this.airlinerDir= airlinerDir;
        this.custDir=custDir;
        this.flightList=flightList;
        this.customer=c;
        this.flightSchList = flightSchList;
        this.ticketList=ticketList;
      //  populateCustomer();
        populateSource();
        populateDest();
        cmbCustomerID.setVisible(false);
        txtSrc.setVisible(false);
        txtDestination.setVisible(false);
        lblCustomerID.setText(customer.getfName()+" "+ customer.getlName()+" Mobile -> "+ customer.getMoblieNum());
    }

    public void populateSource(){
        //String[] array = new String[arrayList.size()];
         List<String> al= new ArrayList<>();//.toArray(new String[custDir.getCustomerList().size()]); 
         for(FlightSchedule fs: flightSchList)
         {
             if(! al.contains(fs.getSrc()))
             {
                 al.add(fs.getSrc());
             }
         }
         
         cmbSrc.setModel(new DefaultComboBoxModel(al.toArray()));
    }
    
     public void populateDest(){
        List<String> al= new ArrayList<>();//.toArray(new String[custDir.getCustomerList().size()]); 
        String source = cmbSrc.getItemAt(cmbSrc.getSelectedIndex());
        for(FlightSchedule fs: flightSchList)
         {
            // if(fs.getSrc().equals(source) && (! al.contains(fs.getDestination())))
             if(! al.contains(fs.getDestination()))
             {
             al.add(fs.getDestination());
             }
         }
         
         cmbDest.setModel(new DefaultComboBoxModel(al.toArray()));
    }
    
    
    public void populateCustomer(){
        //String[] array = new String[arrayList.size()];
         List<Customer> al= custDir.getCustomerList();//.toArray(new String[custDir.getCustomerList().size()]); 
         cmbCustomerID.setModel(new DefaultComboBoxModel(al.toArray()));
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
        jLabel7 = new javax.swing.JLabel();
        cmbTime = new javax.swing.JComboBox<>();
        txtSrc = new javax.swing.JTextField();
        txtDestination = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFlightSchedule = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        btnBook = new javax.swing.JButton();
        cmbCustomerID = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cmbSeatType = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        lblCustomerID = new javax.swing.JLabel();
        cmbSrc = new javax.swing.JComboBox<>();
        cmbDest = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Book Ticket");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Source:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Destination:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Date:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Time:");

        cmbTime.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Evening", "Night" }));

        txtSrc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDestination.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblFlightSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Flight Name", "Source", "Destination", "Date", "Time", "Price", "Airliner", "FlightNum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblFlightSchedule);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Customer ID:");

        btnBook.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBook.setText("Book");
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });

        cmbCustomerID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbCustomerID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customerid1", "CustomerID2" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Seat Type:");

        cmbSeatType.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbSeatType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Middle", "Window", "Aisle" }));

        btnBack.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBack.setText("<Back");
        btnBack.setToolTipText("");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCustomerID.setText("jLabel2");

        cmbSrc.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbSrc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbDest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbDest.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(188, 188, 188)
                                        .addComponent(btnSearch))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbDest, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 709, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbSeatType, 0, 227, Short.MAX_VALUE)
                                    .addComponent(lblCustomerID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(126, 126, 126)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBook)
                                    .addComponent(cmbCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnBack)
                .addGap(189, 189, 189)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnBack)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbDest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbSrc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSrc, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cmbTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeatType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBook))
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        backAction();
                                     
    }
    private void backAction(){
        UserProcessContainer.remove(this);
        //Component [] componentArray = UserProcessContainer.getComponents();
        //Component c = componentArray[componentArray.length-1];
        //ManageAirlinersJPanel ms = (ManageAirlinersJPanel) c;
       // ms.populateAirlinerList();
        CardLayout layout = (CardLayout) UserProcessContainer.getLayout();
        layout.previous(UserProcessContainer);
    
    
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        try{
        /*if(txtSrc.getText() == null || txtSrc.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter Source");
            return;
        }
        
        if(txtDestination.getText() == null || txtDestination.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null,"Enter Destination");
            return;
        }
        */
         java.util.Date date=null;
         SimpleDateFormat sdfrmt;
        if(txtDate.getText().equals("") || txtDate.getText()==null)
        {
            
        }
        else{
         sdfrmt= new SimpleDateFormat("MM/dd/yyyy");
                sdfrmt.setLenient(false);
               date = sdfrmt.parse(txtDate.getText());
                
        }
        
        String source = cmbSrc.getItemAt(cmbSrc.getSelectedIndex());//txtSrc.getText();
        String dest= cmbDest.getItemAt(cmbSrc.getSelectedIndex());//txtDestination.getText();
        String time = cmbTime.getItemAt(cmbTime.getSelectedIndex());
        if(date==null)
        {
            searchFlights(source, dest, time);
        }
        else{
        searchFlights(source, dest,date, time);
        }
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Date format mm/dd/yyyy like 12/12/2020 !");
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
        int row = tblFlightSchedule.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        FlightSchedule fsch= (FlightSchedule)  tblFlightSchedule.getValueAt(row,7);
        
        Ticket t = new Ticket();
        ticketList.add(t);
        t.setCustomerID(customer.getCustomerID());
        t.setDate(fsch.getDate().toString());
        t.setSource(fsch.getSrc());
        t.setDestination(fsch.getDestination());
        t.setFlightNum(fsch.getFlightNum());
        t.setPrice(fsch.getPrice());
        t.setTime(fsch.getTime());
        t.setStatus("Booked");
        //t.setFlight(flight);
        
    }//GEN-LAST:event_btnBookActionPerformed

    
    public void searchFlights(String source, String dest, Date date, String time) 
    {
       // String tableDateExpired = "2012-03-18";
        try{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        for(FlightSchedule fs : flightSchList)
        {
            String fDate ;//= fs.getDate();
            
            fDate = sdf.format(fs.getDate());
            String dateS= sdf.format(date);
           if(fs.getSrc().equals(source)
                   &&
               fs.getDestination().equals(dest)&&
                   (fDate.equals(dateS)  )&&
                   fs.getTime().equals(time)  )
           {
              
               
               
               for(Flight f: flightList)
               {
                   if(f.getFlightNum().equals(fs.getFlightNum()))
                   {
                       flight=f;
                       break;
                       
                   }
               }
               
                DefaultTableModel model = (DefaultTableModel) tblFlightSchedule.getModel();
        model.setRowCount(0);
        //List<FlightSchedule> flightSchList = flight.getFlightSchedule();
        
            Object row[] = new Object[8];
            row[0] = flight.getFlightName();
            row[1] = source;
            row[2] = dest;
            row[3] = fs.getDate();
            row[4] = fs.getTime();
            row[5] = fs.getPrice();//flight.getFlightNum();
            row[6]= flight.getAirlinerName();
            row[7] = fs;
            model.addRow(row); 
            
           }
        }
        }
       
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
    public void searchFlights(String source, String dest, String time) 
    {
       // String tableDateExpired = "2012-03-18";
        try{
    //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        
        for(FlightSchedule fs : flightSchList)
        {
           // String fDate ;//= fs.getDate();
            
          //  fDate = sdf.format(fs.getDate());
          //  String dateS= sdf.format(date);
           if(fs.getSrc().equals(source)
                   &&
               fs.getDestination().equals(dest)&&
                  // (fDate.equals(dateS)  )&&
                   fs.getTime().equals(time)  )
           {
              
               
               
               for(Flight f: flightList)
               {
                   if(f.getFlightNum().equals(fs.getFlightNum()))
                   {
                       flight=f;
                       break;
                       
                   }
               }
               
                DefaultTableModel model = (DefaultTableModel) tblFlightSchedule.getModel();
        model.setRowCount(0);
        //List<FlightSchedule> flightSchList = flight.getFlightSchedule();
        
            Object row[] = new Object[8];
            row[0] = flight.getFlightName();
            row[1] = source;
            row[2] = dest;
            row[3] = fs.getDate();
            row[4] = fs.getTime();
            row[5] = fs.getPrice();//flight.getFlightNum();
            row[6]= flight.getAirlinerName();
            row[7]=fs;
            model.addRow(row); 
            
           }
        }
        }
       
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cmbCustomerID;
    private javax.swing.JComboBox<String> cmbDest;
    private javax.swing.JComboBox<String> cmbSeatType;
    private javax.swing.JComboBox<String> cmbSrc;
    private javax.swing.JComboBox<String> cmbTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCustomerID;
    private javax.swing.JTable tblFlightSchedule;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDestination;
    private javax.swing.JTextField txtSrc;
    // End of variables declaration//GEN-END:variables
}