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
public class CloseTicketQ extends Query {

    @Override
    public String getString(String[] str) {
        String query = "UPDATE Ticket " +
                        "SET closerID = " + str[0] +
                        " WHERE ticketID = " + str[1];
        return query;
    }
    
}
