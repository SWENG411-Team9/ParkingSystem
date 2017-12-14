/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrant;

/**
 *
 * @author chilly.godfrey
 */
public class Parker {
    private String pennStateID;
    private String fName;
    private String lName;
    
    public Parker(String id, String fName, String lName) {
        this.pennStateID = id;
        this.fName = fName;
        this.lName = lName;
    }
    
    public String getPennStateID() {
        return this.pennStateID;
    }
    
    

    public String getfName() {
        return fName;
    }

    

    public String getlName() {
        return lName;
    }

    
    
    
}
