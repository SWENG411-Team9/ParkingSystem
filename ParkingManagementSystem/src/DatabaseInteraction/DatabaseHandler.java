package DatabaseInteraction;

import User.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class DatabaseHandler {
    
    private String driver ="com.mysql.jdbc.Driver"; 
    private String url = "jdbc:mysql://localhost:3306/hello";
    private String user ="root";
    private String pass ="";
    public void createPass(){
        
    
     
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
    
    
    public void createUser(Employee e){
        
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url,user,pass);
            //st=con.createStatement();
            String sql = "insert into users" + "(fname,lname,username,password,permission,officenumber)" +"values(?,?,?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, e.getfname());
            pst.setString(2, e.getlname());
            pst.setString(3, e.getusername());
            pst.setString(4, e.getpassword());
            pst.setString(5, String.valueOf(e.gettype()));
            pst.setString(6, e.getconfirmp());
            

            pst.executeUpdate();
            
           // JOptionPane.showMessageDialog(this,"Insert successful");
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    public void deleteUser(){
        
    }
    public void getLots(){
        
    }
    public void setLots(){
        
    }
}
