package fourteen_polymorphism;

import java.util.Random;

public abstract class AbstractPayment implements Payment {

    private String transactionId;

    // abstract methods for specific type of payment logic
    public abstract void processPayment(double amount);

    // generate Transaction Id after processing the payment 
    public String getTransactionId() {
        Random randomID = new Random();
        transactionId = "TX-ID-"+randomID.nextInt(10000000);
        return transactionId;
    }

    // Receipt Generation
    @Override
    public void generateReceipt(String transactionId){
        System.out.println("Receipt Generated For Transaction ID: "+transactionId);
    }

}
