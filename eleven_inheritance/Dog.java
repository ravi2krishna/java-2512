package eleven_inheritance;

// Child from Animal
public class Dog extends Animal {

    String animal = "Dog";

    public void display() {
        System.out.println("Dog Displayed");
    }

    // child specific 
    public void show() {
        display(); // current class display
        super.display(); // parent class display
        System.out.println("Show Current Class Animal: "+animal);
        System.out.println("Show Parent Class Animal: "+super.animal);
    }

}
