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
public class PlateQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "SELECT * " +
                        "FROM ParkingPass p "
                + "INNER JOIN Car c "
                + "ON c.platenum = p.carplatenum " 
                        + "WHERE p.carplatenum = '" + str[0] + "'";
        
        return query;
    }
    
}
