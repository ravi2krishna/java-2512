package fourteen_polymorphism;

public class LMS {
    public static void main(String[] args) {
        
        Personable s = new Student();

        // Institute Details
        Student.instituteInfo();

        // click functionality
        s.setPersonDetails();
        s.displayPersonDetails();

        // CourseFee
        ((Payables) s).calculatePayment(); // (int)num;

        // sessions credits 
        s.achievementStatus();
        
        // trainer 
        Personable t = new Trainer();

        // info of trainer
        t.setPersonDetails();
        t.displayPersonDetails();

        // trainer payment
        ((Payables) t).calculatePayment();

    }
}
