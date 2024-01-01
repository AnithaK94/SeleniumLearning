package javaPrograms;

public interface RBI {
    int UPILimit = 100000; // variable declare in an interface is by default is static and final.

    // Method declaration but no method body is Interface
    // Abstract function - A function without a body
     void aadharMandatory(); // by default the access modifier is public in interface. - no default modifier.

    // void aadharMandatory(boolean a); - can overload but it must be implemented in the class file.
     boolean panMandatory();
     // method creation is possible in >jdk1.8 using default and static
     default void housingLoan(){
         System.out.println(" Housing Loan");
     }
     static void bikeLoan(){
         System.out.println("Bike Loan");
     }

}
