package sixth_oops;

public class CarUser {
    public static void main(String[] args) {

        // use CarNavigator blueprint
        CarNavigator mahindra = new CarNavigator(); // creating object 
        CarNavigator maruti = new CarNavigator(); // creating object 

        // assign data to object 
        mahindra.color = "grey";
        mahindra.brandModel = "Mahindra XUV700";
        mahindra.price = 25.14;

        // display cars
        System.out.println("Website : "+CarNavigator.website);
        mahindra.displayCarInfo();
        maruti.displayCarInfo(); // default values, if not initialized

        // working with instance variables
        System.out.println(mahindra.color);

        // working with local variables
        // System.out.println(mahindra.rating);

    }
}
