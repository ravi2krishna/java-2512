package thirteen_abstraction;

public class User {
    public static void main(String[] args) {
        
        // Last Session -> Person -> Student & Trainer 
        
        Lenovo lenovo = new Lenovo(); // No Abstraction
        lenovo.processorLogic();
        lenovo.ramLogic();
        lenovo.hddLogic();
        lenovo.screenLogic();
        lenovo.keyboardLogic();
        lenovo.bioMetricLogin();


        Laptop dell = new Dell(); // Abstraction Achieved -> Why is this valid ? -> Inheritance 
        dell.processorLogic();
        dell.ramLogic();
        dell.hddLogic();
        dell.screenLogic();
        dell.keyboardLogic();
        dell.bioMetricLogin();

        // HP hp = new HP();

        // Type Conversion 
        double num = 10.5;
        System.out.println((num));
        int num_new = (int)num;
        System.out.println((num_new));

        // Type Conversion 
        int num_int = 10;
        System.out.println((num_int));
        double num_db = (double)num_int;
        System.out.println((num_db));

    }
}
