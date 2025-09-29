package ten_static;

import java.util.Random;

public class All {
    
    // instance data 
    public int studentid;

    // static data 
    public static String instituteName;

    public static void main(String[] args) {

        // local data 
        int marks = 90;

        if (marks >=35) {
            System.out.println("Passed");
        }

        All s1 = new All();
        s1.studentid = new Random().nextInt();
        System.out.println("Student s1 ID: "+s1.studentid );
        System.out.println("Student s1 Institute: "+All.instituteName );

        All s2 = new All();
        s2.studentid = new Random().nextInt();
        System.out.println("Student s1 ID: "+s2.studentid );
        System.out.println("Student s1 Institute: "+All.instituteName );

        All s3 = new All();
        s3.studentid = new Random().nextInt();
        System.out.println("Student s1 ID: "+s3.studentid );
        System.out.println("Student s1 Institute: "+All.instituteName );



        
    }
}
