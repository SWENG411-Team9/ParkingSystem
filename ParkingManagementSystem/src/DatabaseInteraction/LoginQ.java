/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatabaseInteraction;

import javax.management.Query;

/**
 *
 * @author Ian
 */
public class LoginQ extends Query{

    public String getString(String[] str) {
        String query = "SELECT employeeid, username, uType, badgeNum " +
                        "FROM Users " +
                        "WHERE username = '" + str[0] + "' " +
                        "AND password = '" + str[1] + "'";
        return query;
    }
    
}
