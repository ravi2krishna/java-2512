package twelve_encapsulation;

public class Teacher {
    public static void main(String[] args) {
        
        NewStudent s = new NewStudent();
        
        s.setAge(10);
        System.out.println("Student Age: "+s.getAge());

        s.setAge(-10);
        System.out.println("Student Age: "+s.getAge());


    }
}
