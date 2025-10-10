package thirteen_abstraction;

import java.util.Scanner;

public class Trainer extends AbstractPerson implements Personable,Payables {

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
    }

    // displayPersonDetails() -> Personable
    public void displayPersonDetails() {
        System.out.println("======= Complete Profile Information =======");
        System.out.println("ID: "+getPersonID());
        System.out.println("Name: "+getPersonName());
        System.out.println("Age: "+getPersonAge());
        System.out.println("Contact: "+getPersonMobileNumber());
    }

    // Calculate Trainer Payment
    // calculatePayment() -> Payables
    public void calculatePayment(){
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
