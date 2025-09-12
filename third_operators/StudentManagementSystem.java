package third_operators;
public class StudentManagementSystem {
    public static void main(String[] args) {

        //student information

        int ID  = 886;
        String Name = "Shannu" ;
        int Age = 21;
        int quiz = 85;
        int assignment = 81;
        int exam = 86;
        int AttendancePercentage = 78;
        System.out.println("ID: " + ID);
        System.out.println("Name: "+Name);
        System.out.println("Age: "+Age);
        System.out.println("Quiz Score: "+quiz);
        System.out.println("Assignment Score: "+assignment);
        System.out.println("Exam Score: "+exam);
        System.out.println("Attendance Percentage: "+AttendancePercentage);

        //-> Calculate
        //Total Score 
        //Average Score

        int ts = (quiz+assignment+exam);
        System.out.println("Total Score: "+ ts+"/300");

        int avg = (quiz+assignment+exam)/3;
        System.err.println("Average Score: "+ avg);

        //Student passed or not (Passed means average score above 75)

        boolean passed = avg>75;
        System.out.println("Student passed: "+ passed);

        //using if
        //if(avg>75) System.out.println("Student is passed");


        //Increase Attendance By One day
        System.out.println("Increase Attendance: "+ (AttendancePercentage+1));

        //Awarded 
        //-> Average Score 80 or above
        //-> Attendance above 75
        boolean award = avg>80 && AttendancePercentage>75;

        System.out.println(Name + " got Awarded: "+ award);

        // using if statement
        
        // if ((ts > avgscore) && AttendancePercentage>75 ){
        //     System.out.println("This award was given to: "+Name);
        // }



    }
    
}