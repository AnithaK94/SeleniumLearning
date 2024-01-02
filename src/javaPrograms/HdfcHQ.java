package javaPrograms;

public abstract class HdfcHQ implements RBI{
    @Override
    public void aadharMandatory() {
        System.out.println("added");
    }
// cannot create an object for an abstract class because it has no Constructor
// Implement LaterOn I will implement -- abstract class --> used when particular function must be implemented.
    @Override
public boolean panMandatory() {
    return false;
}
}

/*Interface and Abstract
* Pros: Interface --> All methods must be implemented but it is not mandatory for Absdtract class
* Cons: For Abstract class, to implement the not used methode, it should be done in a sublass.
*  */