package sixth_oops;

import java.util.Scanner;

public class Trainer {

    // Trainer data as instance variables
    int trainerID;
    String trainerName;
    int sessionsTaken;
    int totalPayment;

    // method to display trainer info
    public void showInfo() {
        System.out.println("======== Trainer Details ========");
        System.out.println("Institute: "+LMS.instituteName);
        System.out.println("Trainer ID: "+trainerID);
        System.out.println("Trainer Name: "+trainerName);
    }
    

    // method to calculate payment
    public void calculatePayment(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Sessions Taken: ");
        int numberSessions = in.nextInt(); 
        int sessionCost = 1500;
        totalPayment = numberSessions * sessionCost;

        // student should rate 
        Student s = new Student();
        System.out.println("Student Giving Rating");
        int bonus = s.trainerRating();
        totalPayment = totalPayment + bonus;
        System.out.println("Trainer Payment: "+totalPayment);
    }

}
