package twelve_encapsulation;

import java.util.Scanner;

public class LMS {
    public static void main(String[] args) {
        
        Student s = new Student();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        s.setPersonID(sc.nextInt());

        System.out.println("Enter Name: ");
        s.setPersonName(sc.next());

        System.out.println("Enter Age: ");     
        s.setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile: ");     
        s.setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Coupon: ");
        s.setCoupon(sc.next());

        System.out.println("Enter Course Fee: ");
        s.setCourseFee(sc.nextInt());


        // Institute Details
        Student.instituteInfo();

        // click functionality
        s.personCompleteInfo();

        // CourseFee
        s.calculateCourseFee();

        // sessions credits 
        s.achievementStatus();
        
        // trainer 
        Trainer t1 = new Trainer();

        System.out.println("Enter ID: ");
        t1.setPersonID(sc.nextInt());

        System.out.println("Enter Name: ");
        t1.setPersonName(sc.next());

        System.out.println("Enter Age: ");     
        t1.setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile: ");     
        t1.setPersonMobileNumber(sc.nextInt());

        // info of trainer
        t1.personCompleteInfo();

        // trainer payment
        t1.sessionsPayment();

    }
}
