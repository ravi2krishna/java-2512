package third_operators;
public class Operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int num1 = 10;
        int num2 = 5;

        System.out.println("Sum Of num1 and num2: "+(num1+num2));
        System.out.println("Diff Of num1 and num2: "+(num1-num2));
        System.out.println("Product Of num1 and num2: "+(num1*num2));
        System.out.println("Division Of num1 and num2: "+(num1/num2));
        System.out.println("Modulus Of num1 and num2: "+(num1%num2));


        // Increment / Decrement Operators
        int count = 1;
        count++;
        System.out.println(count);

        int newCount = 10;
        newCount--;
        System.out.println(newCount);

        // Compound Assignment Operators
        int x = 10;
        x = x + 5;
        System.out.println(x);

        int y = 10;
        y += 5;
        System.out.println(y); // 15

        y *= 5; // 15 * 5
        System.out.println(y); // 15, 50, 75,  


        // Relational / Comparison Operators
        int n1 = 10;
        int n2 = 5;

        System.out.println( n1 == n2);
        System.out.println( n1 != n2);
        System.out.println( n1 > n2);

        // Logical Operators
        int a = 10;
        int b = 5;
        int c = 3;
        int d = 2;
        System.out.println("Logical Operators");
        System.out.println(a > b && c < d); // T && F -> F
        System.out.println(a > b && c > d); // T && T -> T

        System.out.println(a > b || c < d); // T // F -> T
        System.out.println(a < b || c < d); // F // F -> F

        System.out.println(! (a > b)); 
        boolean result = a > b;
        System.err.println(result);
        System.err.println(! result);

        // Bitwise Operators
        int b1 = 5; // 0000000000000101
        int b2 = 3; // 0000000000000011
                    // 0000000000000111
                    // 0000000000000001 &

        System.err.println(b1 & b2); // 1
        System.err.println(b1 | b2); // 7



    }
}