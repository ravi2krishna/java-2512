package ten_static;

import java.util.Random;

public class Test {

    // static data 
    public static int number;

    public static void main(String[] args) {

        Test d1 = new Test();
        d1.number = new Random().nextInt();
        
        Test d2 = new Test();
        d2.number = new Random().nextInt();
        
        Test d3 = new Test();
        d3.number = new Random().nextInt();
        
        System.out.println("Number : "+d1.number);
        System.out.println("Number : "+d2.number); 
        System.out.println("Number : "+d3.number); 
        
    }
}
