package methods;


// Helper class acting
// as Abstract class
abstract class GFGhelp {

    // Creating abstract method
    abstract void check(String n);
}

// Java Program to call Abstract Methods

// Main class extending to helper class
public class AbstractMethods extends GFGhelp {

    public static void main(String[] args) {

        // Creating the instance of the class
        AbstractMethods ob = new AbstractMethods();

        // Accessing the abstract method
        ob.check("GFG");
    }

    // Extends the abstract method

    @Override void check(String n)
    {
        System.out.println(n);
    }
}

