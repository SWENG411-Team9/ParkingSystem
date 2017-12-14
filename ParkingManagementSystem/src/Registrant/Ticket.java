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
    private String plateNum;
    private String id;
    private String badgeNum;
    private String registrationNumber;
    private double price;
    private String issueDate;
    private String reason;
    private Car car;
    private String lot;
    
    public Ticket(String plateNum, String id, String badgeNum, String regNum, double price, String date, String reason, Car car, String lot) {
        this.plateNum = plateNum;
        this.id = id;
        this.badgeNum = badgeNum;
        this.price = price;
        this.reason = reason;
        this.car = car;
        this.lot = lot;
        this.issueDate = date;
    }

    public String getLot() {
        return lot;
    }
    
    public String getPlateNum() {
        return this.plateNum;
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
    
    public String getIssueDate() {
        return this.issueDate;
    }
    
    public String getReason() {
        return this.reason;
    }
    
    public Car getCar() {
        return this.car;
    }
}
