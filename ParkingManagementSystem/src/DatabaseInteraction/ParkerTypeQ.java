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
public class ParkerTypeQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "SELECT * " +
                        "FROM Ticket " +
                        "WHERE  plateNum IN " +
                        "	(SELECT carPlateNum " +
                        "	FROM ParkingPass " +
                        "	WHERE permitType = " + str[0] + ")";
        return query;
    }
    
}
