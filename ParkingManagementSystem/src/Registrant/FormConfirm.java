package Registrant;

/**
 * Form Confirmation
 * @author bns5273
 */


class NameException extends Exception {
    NameException() {
        System.out.println("Name exception thrown.");
    }
}
class IDException extends Exception {
    IDException(){
        System.out.println("ID entry invalid");
    }
}
class PlateException extends Exception {
    PlateException(){
        System.out.println("Plate entry invalid");
    }
}
class MakeException extends Exception {
    MakeException(){
        System.out.println("Make entry invalid");
    }
}
class ModelException extends Exception {
    ModelException(){
        System.out.println("Model entry invalid");
    }
}
class ColorException extends Exception {
    ColorException(){
        System.out.println("Color entry invalid");
    }
}


public class FormConfirm {
    boolean checkName(String in) throws NameException{
        if(in.matches(".*\\d+.*")) { // does string contain any digits?
            throw new NameException();
        }
        else {
            return false;
        }
    }
    boolean checkID(String in) throws IDException{
        if(!in.matches(".*\\d+.*")) { // does string contain anything except numbers?
            throw new IDException();
        }
        else{
            return false;
        }
    }
    boolean checkPlate(String in) throws PlateException{
        if(in.length() > 8){ // plates cannot be of a greater length than 8
           throw new PlateException();
        }
        else{
            return false;
        }
    }
    boolean checkMake(String in) throws MakeException{
        if(in == null){
            throw new MakeException();
        }
        else{
            return false;
        }
    }
    boolean checkModel(String in) throws ModelException{
        if(in == null){
            throw new ModelException();
        }
        else{
            return false;
        }
    }
    boolean checkColor(String in) throws ColorException{
        if(in.matches(".*\\d+.*")){ // checks for digits
            throw new ColorException();
        }
        else{
            return false;
        }
    }
}