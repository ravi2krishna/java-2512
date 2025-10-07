package third_operators;

import twelve_encapsulation.DemoPerson;

public class SubClassTest extends DemoPerson {
    public static void main(String[] args) {
        SubClassTest dp = new SubClassTest();
        System.out.println("Different Package - Sub Class ");
        System.out.println(dp.publicName); 
        System.out.println(dp.protectedName); 
        // System.out.println(dp.defaultName); // Not Visible / Accessible 
        // System.out.println(dp.privateName); // Not Visible / Accessible 

    }
}
