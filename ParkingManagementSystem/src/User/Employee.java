/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

/**
 *
 * @author sgm9
 */
public class Employee {
    private String empID;
    private String username;
    private String type;
    private String badgeNum;
    
    public Employee(String id, String usern, String emptype, String badgeNum){
        this.empID = id;
        this.username = usern;
        this.type = emptype;
        this.badgeNum = badgeNum;
    }
    
    public String getID(){ 
        return this.empID;
    }
    
    public String getUsername(){
        return this.username;    
    }
    
    public String getType(){
        return this.type;
    }

    public String getBadgeNum() {
        return badgeNum;
    }
    
    public String toString(){
        String result;
        result= empID+"\t"+username+"\t"+type+"\t"+badgeNum;
        return result;
    }
}
