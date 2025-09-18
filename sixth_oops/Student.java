package sixth_oops;

import java.util.Scanner;

public class Student {

    // Student data as instance variables
    int studentID;
    String studentName;
    int studentAttendance;
    int studentScore;
    int trainerRating;

    // method to display student info
    public void showInfo() {
        System.out.println("======== Student Details ========");
        System.out.println("Institute: "+LMS.instituteName);
        System.out.println("Student ID: "+studentID);
        System.out.println("Student Name: "+studentName);
    }

    // method to calculate attendance credits 
    public int attendanceCredits() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Attendance: ");
        int sessions = in.nextInt();   
        if (sessions >=30) {
            return 5;
        } else if (sessions>=20) {
            return 3;
        } else {
            return 0;
        } 
    }

    // method to calculate score credits 
    public int scoreCredits() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Score: ");
        int score = in.nextInt(); 
        if (score >=85) {
            return 5;
        } else if (score>=60) {
            return 3;
        } else {
            return 0;
        } 
    }

    // method to calculate final achievement
    public void finalAchievement() {
        int finalCredits = attendanceCredits() + scoreCredits();
        if (finalCredits >=10) {
            System.out.println("Good");
        } else if (finalCredits >=8) {
           System.out.println("Better");  
        } else {
            System.out.println("Improve");  
        }
    }

    // method to give rating to trainer
    public int trainerRating() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Trainer Rating: ");
        trainerRating = in.nextInt(); 

        if (trainerRating >=5) {
            return 5000;
        } else {
            return 0;
        }

    }
    
}