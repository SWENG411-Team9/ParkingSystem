package DatabaseInteraction;

import Registrant.Car;
import Registrant.Parker;
import Registrant.ParkingPass;
import Registrant.Ticket;
import User.Employee;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class DatabaseHandler {
    static String url = "jdbc:derby://localhost:1527/PARKING";
        // Declare the JDBC objects.  
    static Connection con = null;
        
    public static void databaseSetup() {
        
        
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection(url, "park", "park");
            // Create and execute an SQL statement that returns some data.
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        
       
        
        
    }

    public static boolean createPass(ParkingPass pp) {
        Statement stmt = null;
        ResultSet rs = null;
        RegisterParkerQ rq = new RegisterParkerQ();
        RegisterCarQ rc = new RegisterCarQ();
        RegisterPassQ rp = new RegisterPassQ();
        String[] ppString = {pp.getParker().getPennStateID(), pp.getParker().getfName(), pp.getParker().getlName(), pp.getCar().getPlateNum(), pp.getCar().getMake(), pp.getCar().getModel(), pp.getCar().getColor(), String.valueOf(pp.getPermitNum()), String.valueOf(pp.getPermitType()), pp.getExpirationDate(), pp.getParker().getPennStateID(), pp.getCar().getPlateNum()};
        String park = rq.getString(ppString);
        String car = rc.getString(ppString);
        String pass = rp.getString(ppString);
        
        Boolean success = true;
        
        try {
            
            stmt= con.createStatement();
            stmt.executeUpdate(park);
            stmt.executeUpdate(car);
            stmt.executeUpdate(pass);
                    
        } catch (Exception e) {
            System.out.println("in createPass");
            System.out.println(e.getMessage());
            success = false;
        }
        
        return success;
    }

    public static void createTicket(Ticket t) {
        Statement stmt = null;
        ResultSet rs = null;
        CreateTicketQ ctq = new CreateTicketQ();
        
        String[] tkString = {t.getCar().getPlateNum(), t.getID(), t.getBadgeNum(), Double.toString(t.getPrice()), t.getIssueDate(), t.getReason(), t.getLot()};
        String code = ctq.getString(tkString);
        
        System.out.println(code);
        
        try {
            
            stmt= con.createStatement();
            stmt.executeUpdate(code);
           
            
            
        } catch (Exception e) {
            System.out.println("in createTicket");
            System.out.println(e.getMessage());
        }

    }

    public static Employee login(String uName, String pass) {
        Statement stmt = null;
        ResultSet rs = null;
        
        LoginQ lq = new LoginQ();
        String lgString[] = {uName, pass};
        String code = lq.getString(lgString);
        
        
        Employee returnVal = null;
        
        try {
            stmt= con.createStatement();
            stmt.executeQuery(code);
            rs = stmt.getResultSet();
            
            
            
            while(rs.next()) {
                returnVal = new Employee(rs.getString("employeeid"), rs.getString("username"), rs.getString("utype"), rs.getString("badgenum"));
            }
            
        } catch (Exception e) {
            System.out.println("in login");
            System.out.println(e.getMessage());
        }
        
        //System.out.println(returnVal);
        return returnVal;
    }

    public static ResultSet generateReport(int type, String param) {
        Statement stmt = null;
        ResultSet rs = null;
        String code = "";
        
        switch(type) {
            case 0:
                PSUIDQ pq = new PSUIDQ();
                String[] pqString = {param};
                code = pq.getString(pqString);
                break;
            case 1:
                LotQ lq = new LotQ();
                String[] lqString = {param};
                code = lq.getString(lqString);
                break;
            case 2:
                OfficerQ oq = new OfficerQ();
                String[] oqString = {param};
                code = oq.getString(oqString);
                break;
            case 3: 
                RevenueQ rq = new RevenueQ();
                String[] str = {};
                code = rq.getString(str);
                break;
            default:
                System.out.println("Please never let this print");
        }
        
        try {
            stmt= con.createStatement();
            stmt.executeQuery(code);
            rs = stmt.getResultSet();
            
        } catch (Exception e) {
            System.out.println("in login");
            System.out.println(e.getMessage());
        }
        
        return rs;
    }

    public static void closeTicket(String[] str) {
        Statement stmt = null;
        ResultSet rs = null;
        
        CloseTicketQ ctq = new CloseTicketQ();
        String code = ctq.getString(str);
        
        
        try {
            System.out.println("this may work");
            
            stmt= con.createStatement();
            stmt.executeUpdate(code);
           
            System.out.println("this worked");
        } catch (Exception e) {
            System.out.println("in CloseTicker");
            System.out.println(e.getMessage());
        }        
    }
    
    public static ParkingPass plateQuery(String plateNum) {
        Statement stmt = null;
        ResultSet rs = null;
        
        PlateQ pq = new PlateQ();
        String pqString[] = {plateNum};
        String code = pq.getString(pqString);
        
        ParkingPass returnPass = null;        
        
        try {
            
            stmt= con.createStatement();
            stmt.executeQuery(code);
            rs = stmt.getResultSet();
            
            while(rs.next()) {
                Car c = new Car(rs.getString("platenum"), rs.getString("make"), rs.getString("model"), rs.getString("color"));
                returnPass = new ParkingPass(rs.getString("parkerid"), "", "", Integer.valueOf(rs.getString("permittype")), rs.getString("experationdate"), c, Long.valueOf(rs.getString("permitNum")));
            }
            
        } catch (Exception e) {
            System.out.println("in plateQuery");
            System.out.println(e.getMessage());
        }    
        
        return returnPass;
    }

    public static ParkingPass registrationQuery(String regNum) {
        Statement stmt = null;
        ResultSet rs = null;        
        
        RegNumQ rnq = new RegNumQ();
        String[] rnqString = {regNum};
        String code = rnq.getString(rnqString);
        
        ParkingPass returnPass = null;          
        
        try {
            
            stmt= con.createStatement();
            stmt.executeQuery(code);
            rs = stmt.getResultSet();
            
            
            
            while(rs.next()) {
                Car c = new Car(rs.getString("platenum"), rs.getString("make"), rs.getString("model"), rs.getString("color"));
                returnPass = new ParkingPass(rs.getString("parkerid"), "", "", Integer.valueOf(rs.getString("permittype")), rs.getString("experationdate"), c, Long.valueOf(rs.getString("permitNum")));
            }
            
        } catch (Exception e) {
            System.out.println("in registrationQuery");
            System.out.println(e.getMessage());
        }     
        
        return returnPass;
    }
}
