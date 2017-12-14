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
public class SystemDate {
    private int month;
    private int day;
    private int year;
    
    SystemDate(int month, int day, int year) throws InvalidDateException {
        if (month >= 1 && month <= 12) {
            this.month = month;
        }
        else {
            throw new InvalidDateException();
        }
        
        if (day >= 1 && day <= 31 && (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)) {
            this.day = day;
        }
        else if (day >= 1 && day <= 30 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            this.day = day;
        }
        else if (day >= 1 && day <= 29 && month == 2) {
            this.day = day;
        }
        else {
            throw new InvalidDateException();
        }
        
        if (year >= 1990 && year <= 2200) {
            this.year = year;
        }
        else {
            throw new InvalidDateException();
        }
    }
    
    public int getMonth() {
        return this.month;
    }
    
    public int getDay() {
        return this.day;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public String getDate() {
        String date = Integer.toString(this.month) + "/" + Integer.toString(this.day) + "/" + Integer.toString(this.year);
        return date;
    }
}
