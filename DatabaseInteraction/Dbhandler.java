package DatabaseInteraction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Dbhandler {
    DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date date = new Date();
    public static int counter = 0;
    public static int[] taken;
    public static void main(String[] args){
       try{ 
        String host = "databaseAdress:portnumber/database";
        //example "jdbc:derby://localhost:1527/Employees"
        String uName = "admin";
        String uPass = "admin";
        Connection con = DriverManager.getConnection(host, uName, uPass);
                }
       catch(SQLException err){
           System.out.println(err.getMessage());
       }
    }
    
    
    
    public void createPass(String permitType, int year, String parkerID, String carPlateNum){
        String pass = "INSERT INTO ParkingPass VALUES ( " + counter + ", "+ permitType+", " + year+ ", " + parkerID +", " + carPlateNum +" );";
    
     
}
    public void createTicket(int ticketID, int badgeNum, int price, String Reason, String lot){
        String ticket = "INSERT INTO Ticket VALUES ( " + ticketID + ", " + badgeNum + ", " + price + ", " + dateFormat.format(date) + ", " + Reason + ", " +lot +");";
    
}
    public int checkCredentials(){
        return 0;
    }
    public void generateReport(){
        
    }
    public void updateTicket(int ticketID, int badgeNum, int price, String reason, String lot, int closerID){
        String updateT = String.format("UPDATE Ticket SET ticketID = %d, badgeNum = %d, price = %d, issueDate = %s, reason = %s, lot = %s, closerID = %d", ticketID, badgeNum, price, dateFormat.format(date), reason, lot, closerID);
    }
    public void updateUser(int employeeID, String username, String password, int uType, int badgeNum){
        String updateU = String.format("UPDATE User SET employeeID = %d, username = %s, password = %s, uType = %d, badgeNum = %d", employeeID, username, password, uType, badgeNum);
    }
    public void createUser(int employeeID, String username, String password, String uType, int badgeNum){
        String user = "INSERT INTO Users VALUES ( " + employeeID + ", " + username + ", " + password + ", "  + uType + ", " + badgeNum + ");";
    }
    public void deleteUser(int employeeID){
        String deleteUser = String.format("DELETE FROM Users WHERE employeeID = %d", employeeID);
    }
    public void getLots(){
        
    }
    public void setLots(){
        
    }
}
