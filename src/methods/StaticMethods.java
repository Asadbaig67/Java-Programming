package methods;

import java.util.HashMap;
import java.util.Map;


// Simple Example
class CallMethod {

   public static void printStatement(String var){
       System.out.println(var);
   }
}


// Example Number 2
class CountryCodes {

    public String name = "Asad";
    private static final Map<String, String> codes = new HashMap<>(); // Belongs to class and its reference cannot be changed

    static {  // Executes only once when the class is loaded into memory!
        initializeCodes();
    }

    private static void initializeCodes() {
        codes.put("US", "United States");
        codes.put("PK", "Pakistan");
        codes.put("FR", "France");
    }

    public static String getCountryName(String code) {
        // callMe(); Error cannot call non-static methods
        // System.out.println(name); Error cannot use non-static variables inside static function
        // System.out.println("I was called by " + this.name); Cannot use this inside static method
        return codes.get(code);
    }

    public void callMe(){
        System.out.println("I was called by " + this.name);
    }
}


public class StaticMethods {



    public static void main(String[] args) {

        String temp= "This is my helper string using for testing purposes";

        CallMethod.printStatement(temp);
        String countryName = CountryCodes.getCountryName("US");
        System.out.println(countryName);



    }

}
