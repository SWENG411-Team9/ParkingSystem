package UI;


import DatabaseInteraction.DatabaseHandler;
import Registrant.ParkingPass;
import Registrant.Ticket;
import User.Employee;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ian
 */
public class ParkingSystem {
    
    //static variables for UI interation with system
    public static boolean waitBool = true;
    public static int func = 0;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        DatabaseHandler.databaseSetup();
        Employee sessionEmployee = null;
        
        //loops until successful login
        while(sessionEmployee == null) {
            //creates new login window
            LoginUI lgn = new LoginUI();
            lgn.setVisible(true);

            //busy waits until user presses sign in
            while(waitBool)
            {
                System.out.print("");
            }

            //gets user login info
            String[] lgnInfo = lgn.getLoginInfo();
            lgn.dispose();
            
            //requests employee info from database handler
            sessionEmployee = DatabaseHandler.login(lgnInfo[0], lgnInfo[1]);
        }
        
        //UI for primary functionality
        MainUI manui = new MainUI();
        manui.setVisible(true);
        
        //loop for primary functionality processing
        while(true) {
            while(func == 0)
            {
                System.out.print("");
            }
            
            switch (func) {
                case 1:
                    Ticket ticket = manui.administerTicketPanel1.getTicket();
                    DatabaseHandler.createTicket(ticket);
                    break;
                case 2:
                    String regNum = manui.searchRegistrationPanel1.getSearchString();
                    ParkingPass regPPSearch = DatabaseHandler.registrationQuery(regNum);
                    manui.searchRegistrationPanel1.populateTable(regPPSearch);
                    break;
                case 3:
                    String plateNum = manui.searchRegistrationPanel1.getSearchString();
                    ParkingPass platePPSearch = DatabaseHandler.plateQuery(plateNum);
                    manui.searchRegistrationPanel1.populateTable(platePPSearch);
                    break;
                case 4:
                    String param = manui.generateReportPanel1.getParam();
                    int reptType = manui.generateReportPanel1.getType();
                    ResultSet rs = DatabaseHandler.generateReport(reptType, param);
                    manui.generateReportPanel1.populateTable(rs);
                    break;
                case 5:
                    String params[] = {sessionEmployee.getID(), manui.generateReportPanel1.getParam()};
                    DatabaseHandler.closeTicket(params);
                    break;
                default:
                    System.out.println("You should never see this");
            }
            
            func = 0;
        }
    }
}
