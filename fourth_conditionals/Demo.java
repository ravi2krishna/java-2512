package fourth_conditionals;

public class Demo {
    public static void main(String[] args) {
        
        // if condition
        int num = -10;
        if (num > 0) {
            System.out.println("Number is Positive");
        }

        // check if given number is in range of 10 to 20
        int number = 20;
        if (number >= 10 && number <= 20) {
            System.out.println("The number is in range");
        }

        // if-else condition
        int numb = 10;
        if (numb > 0) {
            System.out.println("Number is Positive");
        } else {
            System.out.println("Number is Negative");
        }

        // voting app
        int age = 20;
        if (age >= 18) {
           System.out.println("You can Vote"); 
        } else {
            System.out.println("You cannot Vote");
        }

        // ternary operator
        // variable = (condition) ? value_if_true:value_if_false
        int a = 10;
        int b = 20; // (condition) ? value_if_true:value_if_false
        int max = (a > b) ? a:b;
        System.out.println(max);

        // voting app using ternary operator
        String result = (age >= 18) ? "You can Vote" : "You cannot Vote";
        System.out.println(result);

        // else if ladder (grade )
        int marks = 9;
        if (marks >= 90) {
            System.out.println("A");
        } else if (marks >= 75) {
            System.out.println("B");
        } else if (marks >= 60) {
            System.out.println("C");
        } else if (marks >= 50) {
            System.out.println("D");
        } else if (marks >= 35) {
            System.out.println("E");
        } else {
            System.out.println("FAIL");
        }

        // switch case
        int dayNumber = 5;
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break; 
            default:
                System.out.println("Invalid Day");
                break;
        }

        // switch case with fall through
        int day = 7;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break; 
            default:
                System.out.println("Invalid Day");
                break;
        }

    }
}
