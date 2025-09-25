package nine_strings;

import java.util.Scanner;

public class Gmail {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        
        // simulate gmail functionality
        System.out.println("Enter Email ID: ");
        String email = sc.next();

        // convert to lower case and attached @gmail.com and remove any spaces
        System.out.println("Original Email Given: "+email);
        System.out.println("Formatting Email Given: "+email.toLowerCase().concat("@gmail.com").strip());

        // simulate password change functionality
        System.out.println("Enter Password: ");
        String password_one = sc.next();
        System.out.println("Reenter Password Again: ");
        String password_two = sc.next();

        if(password_one.equals(password_two)) {
            System.out.println("Password Changed Successfully");
        } else {
            System.out.println("Passwords Did not match");
        }

        // simulate valid email 
        String email_id = email.toLowerCase().concat("@gmail.com").strip();
        if (email_id.contains("@")) {
            System.out.println("Given Email: "+email_id + " is valid");
        } else {
            System.out.println("Given Email: "+email_id + " is invalid");
        }



    }
}
