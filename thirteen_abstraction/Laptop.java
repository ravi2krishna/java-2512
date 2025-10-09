package thirteen_abstraction;

// Govt given contract/guidelines
public interface Laptop {

    // concrete method
    // public void show() {
    //     System.out.println("Laptop");
    // }

    // abstract methods 
    public void processorLogic();
    public void ramLogic();
    public void hddLogic();
    public void screenLogic();
    public void keyboardLogic();

    // added new contract 
    default void bioMetricLogin() {
        System.out.println("Govt Providing Bio Metric");
    }
    
}
