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
public class RegNumQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "SELECT *\n" +
                        "FROM ParkingPass\n" +
                        "WHERE permitNum = '" + str[0] + "'";
        return query;
    }
    
}
