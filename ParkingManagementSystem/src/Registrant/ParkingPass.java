/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrant;

import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author chilly.godfrey
 */
public class ParkingPass {
    public static int ONCAMPUS = 0;
    public static int COMMUTER = 1;
    public static int FACULTY = 2;
    private Parker parker;
    private Long permitNum;
    private int permitType;
    private String expirationDate;
    private Car car;
    
    public ParkingPass(String id, String fname, String lname, int type, String date, Car c, Long pNum) {
        this.parker = new Parker(id, fname, lname);
        this.expirationDate = date;
        this.permitType = type;
        this.permitNum = pNum;
        this.car = c;
    }
    
    public Parker getParker() {
        return this.parker;
    }
    
    public Long getPermitNum() {
        return this.permitNum;
    }
    
    public int getPermitType() {
        return this.permitType;
    }
    
    public String getExpirationDate() {
        return this.expirationDate;
    }
    
    public Car getCar() {
        return this.car;
    }
}
