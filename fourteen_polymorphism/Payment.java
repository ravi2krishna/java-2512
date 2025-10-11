package fourteen_polymorphism;

public interface Payment {

    // contract for processing payment
    public void processPayment(double amount);

    // contract for generating receipt
    public void generateReceipt(String transactionId);

}
