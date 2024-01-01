package javaPrograms;

public class BMW extends Bike{

    int mileage = 20;

    String getColor(){
        return "red";
    }

    public static void main(String[] args) {
        BMW myBike = new BMW();
        myBike.getColor();
        myBike.getColor();
        int mileage2 = myBike.mileage;
        System.out.println(mileage2);
        boolean hasDisc = myBike.hasDisc();
        myBike.hasDisc();
        myBike.applyBrake();// Bike class is executed -- If same methods are in parent and child class -->
        // then, the output will be from the immediate child class.-- In child class -- it will show as override method
        //super.applyBrake(); --> should given in Bike class inside method. or create an object for the Parent class

        // class always extents to the Object class -- Which is the super most class
        // multi-level is possible but multiple is not possible
        // Ctrl + H --> to view hierachy in intelli J

        /* Diamond problem:
        * Class A1 and Class A2 has similiar method name get()
        * Class A1 extends B -> create Object and call Get() from Class A1
        * |||ly, Class A2 extends B -> create Object and call Get() from Class A2
        *
        * If Java Allows multiple inheritance than Class B extends A1,A2 then, there will be an ambiguity.
        * It confuses when we call get() --> from Where it will class  whether from class A1 or A2 <>
        */
    }
}
