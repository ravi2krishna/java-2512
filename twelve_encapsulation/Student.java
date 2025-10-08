package twelve_encapsulation;

import java.util.Scanner;

public class Student extends Person {

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

    // Calculate Course Fee
    public void calculateCourseFee() {
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
