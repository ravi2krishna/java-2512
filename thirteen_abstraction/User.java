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

    }
}
