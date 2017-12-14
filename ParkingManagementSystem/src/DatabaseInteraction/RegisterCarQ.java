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
public class RegisterCarQ extends Query{
    public String getString(String[] str){
        String query = "INSERT INTO Car (plateNum, make, model, color) " +
                        "VALUES ('" + str[3] + "', '" + str[4] + "', '" + str[5] + "', '" + str[6] + "') " ;
        return query;
                        
    }
    
}
