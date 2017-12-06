/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseInteraction;

/**
 *
 * @author Ian
 */
public class RegisterQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "INSERT INTO Parker (parkerID, fname, lname)\n" +
                        "VALUES (" + str[0] +", '" + str[1] + "', '" + str[2] + "');\n" +
                        "INSERT INTO Car (plateNum, make, model, color)\n" +
                        "VALUES ('" + str[3] + "', '" + str[4] + "', '" + str[5] + "', 'Gold');\n" +
                        "INSERT INTO ParkingPass (permitNum, permitType, experationDate, parkerID, carPlateNum)\n" +
                        "VALUES (" + str[6] + ", " + str[7] + ", '" + str[8] + "', " + str[0] + ", '" + str[3] + "');";
        return query;
    }
    
}
