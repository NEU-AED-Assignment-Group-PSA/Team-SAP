/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.AdminTravelAgencyRole;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Airplane;
import Business.Customer;
import Business.CustomerDirectory;
import Business.Fleet;
import Business.Flight;
import Business.FlightSchedule;
import Business.Ticket;
import UserInterface.ManageAirliner.ManageAirlinersJPanel;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.awt.CardLayout;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author aditi
 */
public class TravelAgencyMain extends javax.swing.JFrame {

    /**
     * Creates new form TravelAgencyMain
     */
    AirlinerDirectory airlinerDir ;
    CustomerDirectory customerDir;
    List<Ticket>ticketList;
    Fleet airplanelist;
    List<Flight> flightList;
    List<FlightSchedule> flightScheduleList;
    
    public TravelAgencyMain() {
        initComponents();
        airlinerDir= new AirlinerDirectory();
        customerDir =new CustomerDirectory();
        airplanelist=new Fleet();
        flightList= new ArrayList<>();
        ticketList= new ArrayList<>();
        flightScheduleList = new ArrayList<>();
//          populateAirlineFromFile();
//        populateAirplaneFromFile();
//        populateFlightFromFile();
//        populateFlightScheduleFromFile();
//        populatCustomerFIle();
//        populateTicketsFile();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        leftJPanel = new javax.swing.JPanel();
        btnTravelAgency1 = new javax.swing.JButton();
        btnAirliner2 = new javax.swing.JButton();
        UserProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        leftJPanel.setBackground(new java.awt.Color(204, 255, 204));
        leftJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTravelAgency1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTravelAgency1.setText("Manage Travel Agency");
        btnTravelAgency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTravelAgency1ActionPerformed(evt);
            }
        });
        leftJPanel.add(btnTravelAgency1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 300, 90));

        btnAirliner2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAirliner2.setText("Manage Airliner");
        btnAirliner2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirliner2ActionPerformed(evt);
            }
        });
        leftJPanel.add(btnAirliner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 300, 90));

        jSplitPane1.setLeftComponent(leftJPanel);

        UserProcessContainer.setBackground(new java.awt.Color(0, 102, 102));
        UserProcessContainer.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(UserProcessContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTravelAgency1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTravelAgency1ActionPerformed
        // TODO add your handling code here:
        AirlinerDirectory ad = airlinerDir;
        UserProcessContainer.removeAll();
        TravelAgencyJPnael msjp = new TravelAgencyJPnael (UserProcessContainer, ad, customerDir, ticketList,airplanelist, flightList, flightScheduleList);
        UserProcessContainer.add("TravelAgencyJPnael",msjp); //any name will do
        ((java.awt.CardLayout)UserProcessContainer.getLayout()).next(UserProcessContainer);
        
        
        
    }//GEN-LAST:event_btnTravelAgency1ActionPerformed

    private void btnAirliner2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirliner2ActionPerformed
        // TODO add your handling code here:
        
        //AirlinerDirectory ad = airlinerDir;
        UserProcessContainer.removeAll();
        ManageAirlinersJPanel msjp = new ManageAirlinersJPanel (UserProcessContainer, airlinerDir, airplanelist,flightList, flightScheduleList);
        UserProcessContainer.add("ManageAirlinersJPanel",msjp); //any name will do
        ((java.awt.CardLayout)UserProcessContainer.getLayout()).next(UserProcessContainer);
        
        
    }//GEN-LAST:event_btnAirliner2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TravelAgencyMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TravelAgencyMain().setVisible(true);
            }
        });
    }

    public void populateFlightScheduleFromFile(){
        try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("./FlightSchedule.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) {
        FlightSchedule fs= new FlightSchedule();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        //UUID idOne = UUID.randomUUID();
        //String uid=(String.valueOf(idOne));
        //car.setUniqueId(uid);
        //String airlinerName=d[0];
        // DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
         Date dt = new SimpleDateFormat("dd/MM/yyyy").parse(d[3]);  
            fs.setFlightNum(d[0]);
            fs.setSrc(d[1]);            
            fs.setDestination((d[2]));
            fs.setDate(dt);
            fs.setTime((d[4]));
            fs.setPrice(Double.parseDouble(d[5]));
            for(Airplane a: airplanelist.getAirplaneList())
             {
                if(a.getAirplaneName().equals(d[6]))
                {
                    fs.setAirplane(a);
                    break;
                }
            }
            
            
            flightScheduleList.add(fs);
        
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("flight schedule file error input!");
            System.out.println(e);
        }
        
        
    }
    public void populateAirplaneFromFile(){
        //read from file to populate airliner
        try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("./Airplane.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) {
        Airplane airplaneNew= new Airplane();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        //UUID idOne = UUID.randomUUID();
        //String uid=(String.valueOf(idOne));
        //car.setUniqueId(uid);
        String airlinerName=d[0];
        
            airplaneNew.setAirlinerName(airlinerName);
            airplaneNew.setAirplaneName(d[1]);            
            //airplaneNew.setWindowSeatCount(Integer.parseInt(d[2]));
            //airplaneNew.setMiddleSeatCount(Integer.parseInt(d[3]));
            //airplaneNew.setAisleSeatCount(Integer.parseInt(d[4]));
            airplaneNew.setModelNum(d[2]);
            airplanelist.addAirplane(airplaneNew);
        
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("Airplanefile error input!");
            System.out.println(e);
        }
        
    }  
    
    public void populateFlightFromFile(){
        //read from file to populate airliner
        try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("./Flight.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) {
        Flight flightNew= new Flight();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        //UUID idOne = UUID.randomUUID();
        //String uid=(String.valueOf(idOne));
        //car.setUniqueId(uid);
        //String airlinerName=d[0];
        
            flightNew.setFlightNum(d[0]);
            flightNew.setFlightName(d[1]);            
            flightNew.setAirlinerName((d[2]));
            //airplaneNew.setMiddleSeatCount(Integer.parseInt(d[3]));
            //airplaneNew.setAisleSeatCount(Integer.parseInt(d[4]));
            //airplaneNew.setModelNum(d[5]);
            flightList.add(flightNew);
        
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("flight file error input!");
            System.out.println(e);
        }
        
    }  
    
    void populatCustomerFIle(){
         try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("./Customer.txt"); 
        Scanner sc = new Scanner(file); 
  
        int count=500;
        while (sc.hasNextLine()) {
        Customer c= new Customer();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        //UUID idOne = UUID.randomUUID();
        //String uid=(String.valueOf(idOne));
        //car.setUniqueId(uid);
            c.setCustomerID(count++);
            c.setfName((d[1]));
            c.setlName((d[2]));
            c.setMoblieNum((d[3]));
            c.setEmail(d[4]);
            customerDir.addCustomer(c);
        
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("customer file error input!");
            System.out.println(e);
        }
     }
     
     void populateTicketsFile(){
         try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("./Ticket.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) {
        Ticket c= new Ticket();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        //UUID idOne = UUID.randomUUID();
        //String uid=(String.valueOf(idOne));
        //car.setUniqueId(uid);
            c.setTicketID(d[0]);
            c.setFlightNum(d[1]);
            c.setSource((d[2]));
            c.setDestination((d[3]));
            c.setDate(d[4]);
            c.setTime(d[5]);
            c.setStatus(d[6]);
            c.setCustomerID(Integer.valueOf(d[7]));
            ticketList.add(c);
        
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("ticket file error input!");
            System.out.println(e);
        }
     }
     
      public void populateAirlineFromFile(){
        //read from file to populate airliner
        try{
        //BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\aditi\\Desktop\\UberCar.txt"));
        File file = new File("./Airliner.txt"); 
        Scanner sc = new Scanner(file); 
  
        while (sc.hasNextLine()) {
        Airliner airlinerNew= new Airliner();    
        String data =sc.nextLine(); 
        String[] d=data.split(",");
        //UUID idOne = UUID.randomUUID();
        //String uid=(String.valueOf(idOne));
        //car.setUniqueId(uid);
            airlinerNew.setAirLinerName(d[0]);
            airlinerNew.setRating(Integer.parseInt(d[1]));
            airlinerNew.setShareRate(Double.parseDouble(d[2]));
            airlinerDir.addAirline(airlinerNew);
        
        }//end while
        }//end try
        catch(Exception e)
        {
            System.out.println("Airliner file error input!");
            System.out.println(e);
        }
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel UserProcessContainer;
    private javax.swing.JButton btnAirliner2;
    private javax.swing.JButton btnTravelAgency1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JPanel leftJPanel;
    // End of variables declaration//GEN-END:variables
}
