package eleven_inheritance;

// Parent for all entities like Student, Trainer etc
public class Person {

    // all common attributes 
    int personID;
    String personName;
    int personAge;
    int personMobileNumber;

    // Constructor
    public Person (){

    }
    
    // Constructor
    public Person(int personID, String personName, int personAge, int personMobileNumber) {
        this.personID = personID;
        this.personName = personName;
        this.personAge = personAge;
        this.personMobileNumber = personMobileNumber;
    }

    // Display Complete Info (click)
    public void personCompleteInfo() {
        System.out.println("======= Complete Profile Information =======");
        System.out.println("ID: "+personID);
        System.out.println("Name: "+personName);
        System.out.println("Age: "+personAge);
        System.out.println("Contact: "+personMobileNumber);
    }
    
}
