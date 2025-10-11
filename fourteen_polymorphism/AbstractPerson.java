package fourteen_polymorphism;

public abstract class AbstractPerson {

    // implement data hiding  
    private int personID;
    private String personName;
    private int personAge;
    private int personMobileNumber;

    public int getPersonID() {
        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        if (personAge>0) {
            this.personAge = personAge;
        } else {
            System.out.println("Person Age Should Be Above 0");
        }
    }

    public int getPersonMobileNumber() {
        return personMobileNumber;
    }

    public void setPersonMobileNumber(int personMobileNumber) {
        this.personMobileNumber = personMobileNumber;
    }

}
