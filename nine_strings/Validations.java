package nine_strings;

import java.util.Scanner;

public class Validations {

    // simulate call rates/currency based on ISD Code
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone Number With ISD Code");
        String number = sc.next();

        if (number.startsWith("+1")) {
            System.out.println("Pay In Dollars");
        } else if (number.startsWith("+86")) {
            System.out.println("Pay In Yuan");
        } else if (number.startsWith("+33")) {
            System.out.println("Pay In Euros");
        } else if (number.startsWith("+91")) {
            System.out.println("Pay In Rupees");
        } else {
            System.out.println("Invalid");
        }

        // simulate email backup end with
        System.out.println("Enter Source Email ID: ");
        String sourceEmail = sc.next();

        System.out.println("Enter Destination Email ID to Backup: ");
        String destinationEmail = sc.next();

        if (sourceEmail.endsWith("@gmail.com") && destinationEmail.endsWith("@gmail.com")) {
            System.out.println("Backup In Progress");
        } else {
           System.out.println("Backup Failed, Both should be same type"); 
        }

    }
}
