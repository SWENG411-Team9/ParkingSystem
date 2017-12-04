import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Dbhandler {
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
    
    
    
    public void createPass(String semester, int year){
    String pass = "INSERT INTO PASS VALUES( " + counter + ", "+semseter+", " + year+");";
    
     
}
    public void createTicket(){
    
}
    public int checkCredentials(){
        return 0;
    }
    public void generateReport(){
        
    }
    public void updateTicket(){
        
    }
    public void updateUser(){
        
    }
    public void createUser(){
        
    }
    public void deleteUser(){
        
    }
    public void getLots(){
        
    }
    public void setLots(){
        
    }
}
