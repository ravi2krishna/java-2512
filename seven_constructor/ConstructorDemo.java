package seven_constructor;

public class ConstructorDemo {

    // some data -> instance data
    int number;
    double decNumber;
    boolean value;
    String data;
    char ch;

    // default constructor -> assigns default values
    public ConstructorDemo(){
        System.out.println("Default Constructor");
        System.out.println("Set my values for instance data");
        number = 1;
        decNumber = 3.5;
        value = true;
        data = "java";
        ch = '$';

    }

    // Explicit / Parameterized Constructors
    public ConstructorDemo(int intValue, String stringValue) {
        number = intValue;
        data = stringValue;
    }

    // method 
    public void method(){
        System.out.println("Some Method");
    }

    public static void main(String[] args) {
        ConstructorDemo obj = new ConstructorDemo(); // constructor will be called when obj is created
        obj.method(); // method always needs to be called explicitly
        
        // print instance data
        System.out.println(obj.ch);
        System.out.println(obj.number);
        System.out.println(obj.decNumber);
        System.out.println(obj.value);
        System.out.println(obj.data);

        System.out.println(("==================="));
        ConstructorDemo obj2 = new ConstructorDemo();

        // print instance data
        System.out.println(obj2.ch);
        System.out.println(obj2.number);
        System.out.println(obj2.decNumber);
        System.out.println(obj2.value);
        System.out.println(obj2.data);


        System.out.println(("==================="));
        ConstructorDemo obj3 = new ConstructorDemo(2,"devops");
        
        // print instance data
        System.out.println(obj3.number);
        System.out.println(obj3.data);

        System.out.println(("==================="));
        ConstructorDemo obj4 = new ConstructorDemo(4,"cloud");
        
        // print instance data
        System.out.println(obj4.number);
        System.out.println(obj4.data);

        // 



    }

}
