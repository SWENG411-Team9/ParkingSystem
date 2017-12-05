/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Registrant;

import java.time.LocalDate;

/**
 *
 * @author chilly.godfrey
 */
public class Ticket {
    private String id;
    private String badgeNum;
    private String registrationNumber;
    private double price;
    private SystemDate issueDate;
    private String reason;
    private Car car;
    
    Ticket(String id, String badgeNum, String regNum, double price, int month, int day, int year, String reason, Car car) {
        this.id = id;
        this.badgeNum = badgeNum;
        this.price = price;
        this.reason = reason;
        this.car = car;
        
        try {
            if (month == -1 || day == -1 || year == -1) {
                LocalDate ld = LocalDate.now();
                this.issueDate = new SystemDate(ld.getMonthValue(), ld.getDayOfMonth(), ld.getYear());
            }
            else {
                this.issueDate = new SystemDate(month, day, year);
            }
        } catch (InvalidDateException ex) {
            //ADD ERROR CATCH HERE!!!!
        }
    }
    
    public String getID() {
        return this.id;
    }
    
    public String getBadgeNum() {
        return this.badgeNum;
    }
    
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public SystemDate getIssueDate() {
        return this.issueDate;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public Car getCar() {
        return this.car;
    }
}
