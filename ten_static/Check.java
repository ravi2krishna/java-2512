package ten_static;

public class Check {

    // static variable
    public static String data;

    // instance variable
    public String value;

    // static block
    static {
        System.out.println("Static Block Executed");
        data = "Java";
    }

    // instance block 
    {   
        System.out.println("Instance Block Executed");
        value = "Ravi";
    }

    // constructor
    public Check(){
        System.out.println("Constructor Executed");
    }

    // main method
    public static void main(String[] args) {
        System.out.println("Main Method Executed");
        // System.out.println("Static Data: "+Check.data);
        Check c1 = new Check();
        System.out.println("Instance Data: "+c1.value);
    }
}
