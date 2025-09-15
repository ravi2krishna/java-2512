package fifth_loops;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        
        // without loops
        // greet
        System.out.println("Good Morning");

        // greet 10 times (repeating - manual)
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");
        System.out.println("Good Morning");

        // with loops
        // greet 10 times
        // for loop : used when you know number of Iterations / Repetitions in advance 

        for (int count=1;count <=5;count++) {
            System.out.println(count); 
        }

        // forward
        for (int count=1;count <=10;count++) {
            System.out.println("Good Morning"); 
        }

        // backward
        for (int count=5;count >=1;count--) {
            System.out.println(count); 
        }

        // while loop : used when you don't know number of Iterations / Repetitions in advance 
        int count = 1;
        while (count <=5) {
            System.out.println(count); 
            count++;
        }

        // check for phone passcode 
        int correctPin = 5678;
        int enteredPin = 0;
        // read input using scanner
        Scanner input = new Scanner(System.in);
        while (enteredPin != correctPin) {
            System.out.println("Enter Passcode: ");
            enteredPin = input.nextInt();
        }
        System.out.println("Phone Unlocked");

        // similar to while, but runs the code at least once, before checking the condition 
        int ct = 7;
        do {
            System.out.println(ct); 
            ct++;
        }
        while (ct<=5);

        // nested for loops
        for(int outer = 1; outer<=5; outer++) {
            for (int inner = 1; inner<=5; inner++) {
                System.out.println(outer + "X" + inner+ " =" +(outer*inner));
            }
        }

        // while while loops - like above
        int outer = 3;
        while(outer<=5) {
            int inner = 1;
            while (inner<=5) {
                System.out.println(outer + "X" + inner+ " =" +(outer*inner));
                inner++;
            }
            outer++;
        }

        // break : used to terminate loop
        for (int i=1;i <=5;i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i); 
        }
        System.out.println("==================");
        // continue : skip current(3rd) iteration 
        for (int i=1;i <=5;i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i); 
        }

        //using return to get sum
        System.out.println(addNumbers(200, 300));
    }

    // return : return a value to caller
    public static int addNumbers(int a, int b) {
        return a+b;
    }

}
