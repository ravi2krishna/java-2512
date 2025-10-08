package twelve_encapsulation;

import java.util.Scanner;

public class Trainer extends Person {

    private static int basePayPerSession = 1500;
    
    private int totalSessionsTaken;
    private int paymentForSessions;
    private int trainingBonus;
    private int totalPayment;  
     

    public int getTotalSessionsTaken() {
        return totalSessionsTaken;
    }

    public void setTotalSessionsTaken(int totalSessionsTaken) {
        this.totalSessionsTaken = totalSessionsTaken;
    }

    public int getPaymentForSessions() {
        return paymentForSessions;
    }

    public void setPaymentForSessions(int paymentForSessions) {
        this.paymentForSessions = paymentForSessions;
    }

    // Calculate Trainer Payment
    public void sessionsPayment(){
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter Total Sessions Taken: ");
       totalSessionsTaken = sc.nextInt();
       paymentForSessions = basePayPerSession*totalSessionsTaken;
       Student s1 = new Student(); // assigning rating
       System.out.println("=======Student Rating=======");
       trainingBonus = s1.trainerRatings();
       totalPayment = paymentForSessions+trainingBonus;
       System.out.println("=======Trainer Payment=======");
       System.out.println("Total Trainer Payment: "+totalPayment);
    }

}
