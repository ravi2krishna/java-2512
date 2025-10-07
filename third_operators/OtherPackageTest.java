package third_operators;

import twelve_encapsulation.DemoPerson;

public class OtherPackageTest {
    public static void main(String[] args) {
        
        DemoPerson dp = new DemoPerson();
        System.out.println("Different Package - Different Class ");
        System.out.println(dp.publicName); 
        // System.out.println(dp.protectedName); // Not Visible / Accessible 
        // System.out.println(dp.defaultName); // Not Visible / Accessible 
        // System.out.println(dp.privateName); // Not Visible / Accessible 
    }
}
