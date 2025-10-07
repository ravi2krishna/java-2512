package eleven_inheritance;

public class LMS {
    public static void main(String[] args) {
        
        // hover
        Student s1 = new Student(101,"Ravi");

        // click 
        Student s2 = new Student(102,"Krishna",25,909090,30000,"FIFTY");

        // Institute Details
        Student.instituteInfo();

        // click functionality
        s2.personCompleteInfo();

        // CourseFee
        s1.calculateCourseFee();
        s2.calculateCourseFee();

        // sessions credits 
        s1.achievementStatus();
        
        // trainer 
        Trainer t1 = new Trainer(100,"John",40,88888);

        // info of trainer
        t1.personCompleteInfo();

        // trainer payment
        t1.sessionsPayment();

    }
}
