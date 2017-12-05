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
public class LoginQ extends Query{

    @Override
    public String getString(String[] str) {
        String query = "SELECT uType, badgeNum\n" +
                        "FROM Users\n" +
                        "WHERE username = '" + str[0] + "'\n" +
                        "AND password = '" + str[1] + "';";
        return query;
    }
    
}
