package javaPrograms;

public class Calculation {
    int c = 40; // global or instance value- whether it is not declared it's default value is 0 for intyegfer.
    // instance value can be used in class.
    int d; // initialization if values given, then it is declarations
    public void name(String name){
        System.out.println("My name is : " + name);
    }
    public int sum(int a, int b){
        int sum = a + b ;
        int c = 10; // local variable it is accessible only in local place.
        // when local and global has same value,high priority will be given to the local variable.
        System.out.println("The local variable : " +c);
        System.out.println("The global variable : " +this.c); // this keyword can be used to call a method
        // but this keyword cannot be used in the main method.
        System.out.println("The value of d is : " +d); // if no use of same variable,then it will take the value of the variable
        System.out.println("sum of the numbers : " +(sum+c));
        this.name("Anitha");
        return sum;
    }
    public double sum(double a, double b){
       double sum = a + b ;
        System.out.println("sum of the numbers : " +sum);
        return sum;
    }
    public int sum(int a, int b, int c){
        int sum = a + b + c;
        System.out.println("sum of the numbers : " +sum);
        return sum;
    }

    public static void main(String[] args) {
         /* Methods or functions are same - used for minimizing the repetition of code
        Rules to write a method - method should write inside a class and not inside  main function
        accessModifier returnType methodName(optional parameters) { action }
        To access the method inside the main function, need to create an object
        returnType should be at the end of the method
        Object Creation - ClassName objectName = new Classname() -> Constructor*/

        Calculation calc = new Calculation();
        calc.sum(250,300);
        // method overloading
        calc.sum(30.5,24.5);
        calc.sum(50, 150, 200);
        //this.name("Anil");// this keyword is not accessible inside main method- it is a static method

    }
}
