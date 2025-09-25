package nine_strings;

import java.util.Scanner;

public class PAN {

    // validate PAN as Alphabets and Numerics Only 
    public static boolean validPAN(String pan) {
        if (pan == null) {
            return false;
        }

        for (char c : pan.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
        }
        return true;
    }   

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // simulate pan functionality
        System.out.println("Enter PAN Number: ");
        String pan = sc.next();
        // System.out.println("Given PAN "+pan +" - " +validPAN(pan));

        if(validPAN(pan) == true && pan.length() == 10) {
            System.out.println("Given PAN: "+pan);
            System.out.println("Formatted PAN: "+pan.toUpperCase());
        } else {
            System.out.println("Aadhar "+pan + " is not valid");
        }

    }
}
