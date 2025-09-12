package second_datatypes;
public class DataTypes {
    public static void main(String[] args) {
        
        int value = 10;
        String data = "Java";
        // Student john = "John is from USA"; // in future you can create own data type

        // byte bigNumber = 10000; // byte cannot hold 10000
        short bigNumber = 10000;
        System.out.println(value);
        System.out.println(data);
        System.out.println(bigNumber);

        // all primitive types
        byte b = 9;
        short s = 999;
        int i = 99999;
        long l = 9999999;

        float f = 3.14f; // error: incompatible types
        double d = 32.7818191;

        char c = 'c';
        boolean bool = true;

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);

        System.out.println(f);
        System.out.println(d);

        System.out.println(c);
        System.out.println(bool);

        // non primitive type
        String greet = "Good Morning "; // --> String
        String name = "Ravi "; 
        byte time = 11;

        // Employees ID Multiple values  --> Array 
        int [] ids = {101,102,103}; 

        // Concatenation
        System.out.println(greet + name + time);
        System.out.println("Class will end by: " +time+1);
        System.out.println("Class will end by: " +(time+1));

        int num1 = 10;
        int num2 = 20;

        System.err.println(num1+num2); // 1020 or 30

    }
}
