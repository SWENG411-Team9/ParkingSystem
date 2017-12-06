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
    private int pennStateID;
    private String fullName;
    
    public Parker(int id, String name) {
        this.pennStateID = id;
        this.fullName = name;
    }
    
    public int getPennStateID() {
        return this.pennStateID;
    }
    
    public void setPennStateID(int id) {
        this.pennStateID = id;
    }
    
    public String getName() {
        return this.fullName;
    }
    
    public void setName(String name) {
        this.fullName = name;
    }
}
