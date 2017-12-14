/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseInteraction;

/**
 *
 * @author nak5297
 */
public class RegisterPassQ extends Query{

    @Override
    public String getString(String[] str) {
        String hiian = "INSERT INTO ParkingPass (permitNum, permitType, experationDate, parkerID, carPlateNum) " +
                        "VALUES (" + str[7] + ", " + str[8] + ", '" + str[9] + "', " + str[0] + ", '" + str[3] + "')";
        return hiian;
    }
}
