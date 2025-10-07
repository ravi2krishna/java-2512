package eleven_inheritance;

import java.util.Scanner;

public class Trainer extends Person {

    int totalSessionsTaken;
    int paymentForSessions;
    int trainingBonus;
    int totalPayment;

    // constructor
    public Trainer(int trainerID, String trainerName, int trainerAge, int trainerMobileNumber){
        // below line call parent class constructor
        super(trainerID,trainerName,trainerAge,trainerMobileNumber); 
    }

    // Calculate Trainer Payment
    public void sessionsPayment(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       paymentForSessions = 1500*totalSessionsTaken;
       Student s1 = new Student(); // assigning rating
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions+trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: "+totalPayment);
    }

}
