package sixth_oops;

// blueprint for car navigator functionality
public class CarNavigator {

    // characteristics - variables
    // instance variables
    String color;
    String brandModel;
    double price;
    
    // static variables (common data)
    static String website = "Car Dekho";

    // show car details - method
    public void displayCarInfo() {
        // local variable
        int rating = 4; 
        System.out.println("Car Color: "+color);
        System.out.println("Car Brand - Model: "+brandModel);
        System.out.println("Car Price: "+price);
        // System.out.println("Car Rating: "+rating); // rating not initialized
        System.out.println("Car Rating: "+rating);
    }

}
