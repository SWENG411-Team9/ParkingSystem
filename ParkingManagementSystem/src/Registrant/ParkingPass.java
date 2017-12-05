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
    private int permitNum;
    private int permitType;
    private SystemDate expirationDate;
    private Car car;
    
    ParkingPass(int id, String name, int type, int month, int day, int year, Car c, int pNum) {
        this.parker = new Parker(id, name);
        try {
            if (month == -1 || day == -1 || year == -1) {
                LocalDate ld = LocalDate.now();
                this.expirationDate = new SystemDate(ld.getMonthValue(), ld.getDayOfMonth(), ld.getYear());
            }
            else {
                this.expirationDate = new SystemDate(month, day, year);
            }
        } catch (InvalidDateException ex) {
            //ADD ERROR CATCH HERE!!!!!
        }
        this.permitType = type;
        
        if (pNum != -1) {
            this.permitNum = pNum;
        }
        
        this.car = c;
    }
    
    public Parker getParker() {
        return this.parker;
    }
    
    public int getPermitNum() {
        return this.permitNum;
    }
    
    public int getPermitType() {
        return this.permitType;
    }
    
    public SystemDate getExpirationDate() {
        return this.expirationDate;
    }
    
    public Car getCar() {
        return this.car;
    }
}
