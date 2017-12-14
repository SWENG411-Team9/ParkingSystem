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
public class Car {
    private String plateNum;
    private String make;
    private String model;
    private String color;
    
    public Car(String plate, String make, String model, String color) {
        this.plateNum = plate;
        this.make = make;
        this.model = model;
        this.color = color;
    }
    
    public String getPlateNum() {
        return this.plateNum;
    }
    
    public String getMake() {
        return this.make;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public String getColor() {
        return this.color;
    }
}
