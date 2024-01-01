package javaPrograms;

public class Axis implements RBI{

    // Any method created in the class cannot be override. as it not creates in an interface.
    public void interestFreeLoan(){
       // RBI.UPILimit = 1; Cannot assign a value to final variable 'UPILimit
        System.out.println("Free Loan");
    }
    @Override // these functions are not in the current class, it came from the interface.
    public void aadharMandatory() {
        System.out.println("Aadhar is added");
    }

    @Override // All functions in interface must be override should not left any one method.
    public boolean panMandatory() {
        return true;
    }
}
