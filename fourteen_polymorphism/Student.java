package fourteen_polymorphism;

import java.util.Scanner;

public class Student extends AbstractPerson implements Personable,Payables {

    // static data 
    private static String instituteName;
    private static double globalDiscount; // 10% 

    // static block for initialization of static variables
    static {
        instituteName = "Digital Edify";
        globalDiscount = 0.1;
    }

    // static method to work with static variables 
    public static void instituteInfo(){
        System.out.println("======== INSTITUTE DETAILS ========");
        System.out.println("Institute Name: "+instituteName);
        System.out.println("Currently We have discount of "+(globalDiscount*100)+" % for everyone:");
    }

    // instance data encapsulated 
    private int totalSessionsAttended;
    private int attendanceCredits;
    private int performanceCredits;
    private int finalCredits;
    private int tarinerRating;
    private double courseFee;
    private String coupon;

    // take dynamic scores (with arrays)
    private int [] subjectScores;

    // Common Scanner 
    Scanner sc = new Scanner(System.in);

    // setters & getters
    public double getCourseFee() {
        return courseFee;
    }

    public void setCourseFee(double courseFee) {
        // validation for course fee 
        if (courseFee > 0) {
            this.courseFee = courseFee;
        } else {
            System.out.println("Invalid Course Fee Given");
        }
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    // implement setPersonDetails() -> Personable
    public void setPersonDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ID: ");
        setPersonID(sc.nextInt());

        System.out.println("Enter Name: ");
        setPersonName(sc.next());

        System.out.println("Enter Age: ");     
        setPersonAge(sc.nextInt());

        System.out.println("Enter Mobile: ");     
        setPersonMobileNumber(sc.nextInt());

        System.out.println("Enter Coupon: ");
        setCoupon(sc.next());

        System.out.println("Enter Course Fee: ");
        setCourseFee(sc.nextInt());
    }

    // displayPersonDetails() -> Personable
    public void displayPersonDetails() {
        System.out.println("======= Complete Profile Information =======");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Contact: "+getPersonMobileNumber());
    }


    // Calculate Course Fee
    // calculatePayment() -> Payables
    public void calculatePayment() {
        double discount = 0;

        // if coupon is PROMO apply 5000
        // if coupon is FIFTY apply 15000
        String couponApplied = coupon;

        if(couponApplied.equals("PROMO")) {
            discount = 5000;
        } else if (couponApplied.equals("FIFTY")) {
            discount = 15000;
        } else {
            discount = 0;
        }

        double finalFee = courseFee - discount;

        // apply global discount
        double gd = finalFee * globalDiscount;

        System.out.println("Actual Fee: "+courseFee);
        System.out.println("Discount Applied Via Coupon: "+discount);
        System.out.println("Global Discount Applied: "+gd);
        System.out.println("Final Fee To Pay: "+(finalFee-gd));

        // Fee Payment Options
        System.out.println("===== Payment Processing =====");
        System.out.println("Select One Of Payment Options Below");
        System.out.println("1) Net Banking 2) Card Payment 3) UPI");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        PaymentProcessor processor = new PaymentProcessor();

        if (option == 1) {
            NetBankingPayment bankName = new NetBankingPayment();
            bankName.setBankName(bankName.getBankName());
            System.out.println("Paying Fee: "+(finalFee-gd));
            processor.makePayment((finalFee-gd), bankName.getBankName());
        }
        else if (option == 2) {
            System.out.println("Do for Card Payment");
        }

        else if (option == 3) {
            System.out.println("Do for UPI Payment");
        } 
        else {
            System.out.println("Only Select 1 or 2 or 3");
        }

    }

    // Calculate Attendance credits
    public int sessionsCredits() {
        System.out.println("Enter Total Sessions Attended: ");
        totalSessionsAttended = sc.nextInt();
        if (totalSessionsAttended>=30) {
            return attendanceCredits = attendanceCredits+5;
        } else if (totalSessionsAttended>=20) {
            return attendanceCredits = attendanceCredits+3;
        } else {
            return attendanceCredits = 0;
        }
    }

    // calculate average score 
    public int calculateAverageScore(){
        System.out.println("Enter Number Of Subjects: ");
        int numSubjects = sc.nextInt();

        subjectScores = new int[numSubjects];

        int sum = 0;
        for (int i = 0; i < subjectScores.length; i++) {
            System.out.println("Enter Score for subject: "+(i+1));
            subjectScores[i] = sc.nextInt();
            sum = sum + subjectScores[i];
        }
        System.out.println("Total Score: "+sum);
        System.out.println("Number Of Subjects: "+subjectScores.length);
        // avg score
        int averageScore = sum / subjectScores.length;
        return averageScore;
    }

    // Calculate Performance credits
    public int scoreCredits(int averageScore){
        if (averageScore>=85) {
            return performanceCredits = performanceCredits+5;
        } else if (averageScore>=60) {
            return performanceCredits = performanceCredits+3;
        } else {
            return performanceCredits = 0;
        }
    }
  
   // Calculate Achievements
    public void achievementStatus(){
        int averageScore = calculateAverageScore();
        System.out.println("Average Score : "+averageScore);
        
        finalCredits = scoreCredits(averageScore)+sessionsCredits();
        if (finalCredits>=10) {
            System.out.println("**** A ****");
        } else if (finalCredits>=8) {
            System.out.println("**** B ****");
        } else {
            System.out.println("You Need To IMPROVE");
        }
    }

   // Calculate Trainer Rating
    public int trainerRatings(){
        System.out.println("Enter Trainer Rating: 1-5");
        tarinerRating = sc.nextInt();
        if (tarinerRating>=5) {
            // set bonus as 5000
            return 5000;
        } else {
            // No bonus
            return 0;
        }
    }

}
