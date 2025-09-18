package sixth_oops;

public class LMS {

    // static variable
    public static String instituteName = "Edify";

    public static void main(String[] args) {

        // Student Identity
        Student s = new Student();
        s.studentID = 101;
        s.studentName = "Ravi";

        // show student details
        s.showInfo();

        // student achievement 
        s.finalAchievement();

        // Trainer Identity
        Trainer t = new Trainer();

        t.trainerID = 101;
        t.trainerName = "John";

        // show trainer details
        t.showInfo();

        // trainer payment
        t.calculatePayment();


    }
}
