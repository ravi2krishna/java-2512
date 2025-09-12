package first_variables;
public class VariableDemo {
    public static void main(String[] args) {

        // 1000(price), 3.5(rating), "Nike"(brand)
        int price = 1000; // valid 1000 is whole number
        // int rating = 3.5; // error: incompatible types
        double rating = 3.5; // error: incompatible types
        // String brand = Nike; // string needs ""
        String brand = "Nike";

        // Retrieve Data -> System.out.println(variable)
        System.out.println(price);
        System.out.println(rating);
        System.out.println(brand);

    }
}
