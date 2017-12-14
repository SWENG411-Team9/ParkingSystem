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
public class RegisterParkerQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "INSERT INTO Parker (parkerID, fname, lname) "
                + "VALUES (" + str[0] + ", '" + str[1] + "', '" + str[2] + "') ";
                        
        return query;
    }
    
}
