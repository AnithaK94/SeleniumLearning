package javaPrograms;

public class LerarningStatic {
    int x = 0;
    static int y = 0; // static variable declaration and initialization
    public void counter(){
        x++;
        y++; // static variable can be referenced in a non-static function
        System.out.println(" non- static x : " +x+ "; Static y : " +y);
    }
    public static void display(){ // static method
        // Non-static variable can not be used in the static method
      //  System.out.println(x); // Non-static field 'x' cannot be referenced from a static context
      //  System.out.println(this.x); // (this) cannot be referenced from a static context
        System.out.println("I am Anitha");
    }

    public static void main(String[] args) {
        LerarningStatic ls = new LerarningStatic();
        ls.counter();
        ls.counter();
        System.out.println("After Creating new object : ");
        LerarningStatic ls1 = new LerarningStatic();
        ls1.counter();// It is clear that static variable and function can be accessed in main method without creating object
        // Whereas non-=static method can be accesssed without creating object.
        ls1.counter();
        display();// there is no need to create an object to call a static method
        // but we need to use classname .staticMethodName, if we need to use the static method in another class.
        // Static method is used as utility or helper function
        String s1 = "10";
        String s2 = "10";
        System.out.println(s1+s2);// output = 1010 ---> Because it is a String variable which concatenates s1 and s2
        int a = Integer.parseInt(s1);// Integer is the className ; parseInt  is a Static Method
        int b = Integer.parseInt(s2);// Integer.parseInt ---> converts String Value to integer value.
        System.out.println(a+b); // output = 20

    }
}

