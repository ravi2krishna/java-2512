package ten_static;

import java.util.Scanner;

public class Student {

    // static data 
    public static String instituteName;
    public static double globalDiscount; // 10% 

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


    // instance data 
    int studentID;
    String studentName;
    int totalSessionsAttended;
    int attendanceCredits;
    int performanceCredits;
    int finalCredits;
    int tarinerRating;
    int studentMobileNumber;
    int studentAge;
    double courseFee;
    String coupon;

    // take 5 scores (without arrays)
    // int subject1;
    // int subject2;
    // int subject3;
    // int subject4;
    // int subject5;

    // take dynamic scores (with arrays)
    int [] subjectScores;

    // we ca use constructor to initialize data 
    public Student(){
        System.out.println("Default Called");
    }

    // hover
    // public Student(int studentID, String studentName){
    //     this.studentID = studentID;
    //     this.studentName = studentName;
    // }

    // click
    public Student(int studentID, String studentName, int studentAge, int studentMobileNumber, double courseFee, String coupon){
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentMobileNumber = studentMobileNumber;
        this.courseFee = courseFee;
        this.coupon = coupon;
    }

    // hover
    public Student(int studentID, String studentName) {
        // this(); // default called
        this(101, "Ravi", 20, 80980,30000,"PROMO");
    }


    // Common Scanner 
    Scanner sc = new Scanner(System.in);

    // Display Basic Student Info (hover)
    public void studentInfo() {
        System.out.println("=======Basic Student Information=======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
    }

    // Display Complete Info (click)
    public void studentCompleteInfo() {
        System.out.println("=======Basic Complete Information=======");
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Age: "+studentAge);
        System.out.println("Student Contact: "+studentMobileNumber);

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
