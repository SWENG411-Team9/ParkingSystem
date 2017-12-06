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
    private String empID = new String();
    private String username = new String();
    private String password = new String ();
    private String fname = new String();
    private String lname  =  new String();
    private String confirmpass = new String();
    
    private int type;   //categorizes types of employees(1-ticketer, 2-administrator,3-manager)
    
    public Employee(String firstn,String lastn,String confirmpassword,String usern,String pass,int emptype){    //constructor method
        //empID = id;
        username = usern;
        password = pass;
        type = emptype;
        fname = firstn;
        lname = lastn;
        confirmpass=confirmpassword;
        
    }
    
    
    public String getempID(){ 
        return empID;
        
    }
    public String getfname(){
        return fname;
    }
    
    public void setfname(String f){
        this.fname=f;
    }
    
    public void setlname(String l){
        this.lname=l;
        
    }
    public void setconfirmp(String c){
        this.confirmpass=c;
    }
    
    public String getlname(){
        return lname;
    }
    
    public String getconfirmp(){
        return confirmpass;
    }
    
    
    public void setempID(String e){
        this.empID = e;
        
    }
    public String getusername(){
        return username;
        
    }
    public void setusername(String u){
        this.username = u;
        
    }
    public String getpassword(){
        return password;
    }
    public void setpassword(String p){
        this.password = p;
    }
    public int gettype(){
        return type;
    }
    public void settype(int t){
        if (t>=1 && t <=3){     // error checking for the emptype 
        this.type = t;
        }
        
    }
    public String toString(){
        String result;
        result= fname+"\t"+lname+"\t"+username+"\t"+password+"\t"+type;
        return result;
    }
}
