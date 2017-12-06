
import java.sql.Time;

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
    public static int func;
    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
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
        ParentUI pui = new ParentUI();
        pui.setVisible(true);
        
        //loop for primary functionality processing
        while(true) {
            
        }
    }
}
