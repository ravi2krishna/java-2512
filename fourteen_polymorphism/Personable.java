package fourteen_polymorphism;

// contract for persons like Students & Trainers & Mentors etc
public interface Personable {

    // abstract methods -> contracts 
    public void setPersonDetails();

    public void displayPersonDetails();

    default void achievementStatus(){}
}
