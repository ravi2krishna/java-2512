package seven_constructor;

public class OverLoad {

    // constructor overloading : based on input, should give different outcome
    // based on 
    // number of parameters
    // types of parameters
    // order of parameters


    public OverLoad (int a, int b) {
        System.out.println("Sum is " +(a+b));
    }

    public OverLoad (int a, double b) {
        System.out.println("Sum is " +(a+b));
    }

    public OverLoad (double a, int b) {
        System.out.println("Sum is " +(a+b));
    }

    public OverLoad (int a, int b, int c) {
        System.out.println("Sum is " +(a+b+c));
    }

    public static void main(String[] args) {
        OverLoad o1 = new OverLoad(5.5, 5);
        OverLoad o2 = new OverLoad(5, 5, 5);
        // OverLoad o2 = new OverLoad(5.5, 5.5);

    }
}
