package javaPrograms;

public class Bike extends Vehicles{
    public boolean hasDisc(){
        return true;
    }

    public void applyBrake(){
        System.out.println("Bike --- Brake is applied");
    }
}
