package javaPrograms;

public class ConstructorExample {
    /* Constructor is used to initialize objects.
      It is used to set initial values for object Attributes
      No return type in constructor
      Default and parameter - types
      public, private and default access */
    int x;
    String name;

    void display(){
        System.out.println(x+ "---->" +name);
    }
    public ConstructorExample(int x,String s){// parameter constructor
        this.x =x;
        this.name = s;
    }
   /* public ConstructorExample(){ // Intialize constructor --> constructor is used to access the global variable

        this.x =22;
        this.name = "Anitha";
    }*/
    public static void main(String[] args) {

        /*ConstructorExample constEx = new ConstructorExample();
        constEx.display();// default constructor --> without any valuews, it gives result as 0 ----> null
       */
        ConstructorExample constEx1 = new ConstructorExample(50, "Anil");

        constEx1.display();


    }
}
