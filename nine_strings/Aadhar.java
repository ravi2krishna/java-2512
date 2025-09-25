package nine_strings;

import java.util.Scanner;

public class Aadhar {

    public static boolean validAadhar(String  aadhar) {
        if (aadhar == null) {
            return false;
        }

        for (char c : aadhar.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }   

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // simulate aadhar functionality
        System.out.println("Enter Aadhar Number: ");
        String aadhar = sc.next();
        // System.out.println(validAadhar(aadhar));

        if(validAadhar(aadhar) == true && aadhar.length() == 12) {
            System.out.println("Aadhar "+aadhar + " is valid");
        } else {
            System.out.println("Aadhar "+aadhar + " is not valid");
        }
        
    }
}
