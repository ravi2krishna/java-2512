package seven_constructor;

public class LMS {
    public static void main(String[] args) {
        
        // hover
        Student s1 = new Student(101,"Ravi");

        // click 
        Student s2 = new Student(102,"Krishna",25,909090);

        // Hover functionality
        s1.studentInfo();

        // click functionality
        s2.studentCompleteInfo();

        // sessions credits 
        s1.achievementStatus();
        
        // trainer 
        Trainer t1 = new Trainer();
        t1.trainerID = 101;
        t1.trainerName = "John";

        // info of trainer
        t1.trainerInfo();

        // trainer payment
        t1.sessionsPayment();


    }
}
