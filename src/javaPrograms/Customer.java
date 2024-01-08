package javaPrograms;

public class Customer {
    public static void main(String[] args) {

        HDFCChennai chennai = new HDFCChennai();
        chennai.panMandatory();

        Axis mybank = new Axis();
        mybank.aadharMandatory();
        boolean panMandatory = mybank.panMandatory();
        System.out.println(panMandatory);
        mybank.interestFreeLoan();
        System.out.println(Axis.UPILimit);

        // Cannot create an object for an interface - why? because interface doesnot have constructor.
        // We can create a reference variable
        RBI myRbi = new Axis();
        myRbi.aadharMandatory();
        myRbi.panMandatory();
        myRbi.housingLoan();
        RBI.bikeLoan();
        //We cannot access the functions in class Axis. It also depends on the Left side of the object Creation
        // It is recommended to go with interface . It is used only in certain conditions
    }
}
