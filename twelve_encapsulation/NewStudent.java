package twelve_encapsulation;

public class NewStudent {

    private int age;
    private String name;
    private boolean isAttended;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) { // Validation logic
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isAttended() {
        return isAttended;
    }
    public void setAttended(boolean isAttended) {
        this.isAttended = isAttended;
    }

    

    

}
