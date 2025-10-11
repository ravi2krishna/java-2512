package fourteen_polymorphism;

public class PaymentProcessor {

    // Payment Via Net Banking
    public void makePayment(double amount, String bankName) {
        System.out.println("====== Net Banking Payment ======");
        NetBankingPayment netBanking = new NetBankingPayment();
        System.out.println("Amount To Pay: "+amount);
        netBanking.processPayment(amount);
        netBanking.generateReceipt(netBanking.getTransactionId());
    }

    // Payment Via Card
    public void makePayment(double amount, int cardNumber){
        System.out.println("====== Card Payment ======");
        CardPayment cardPayment = new CardPayment();
        System.out.println("Amount To Pay: "+amount);
        cardPayment.processPayment(amount);
        cardPayment.generateReceipt(cardPayment.getTransactionId());
    }

    // Payment Via UPI
    public void makePayment(double amount, String upiId, String upiPaymentType){
        System.out.println("====== UPI Payment ======");
        UPI upiPayment = new UPI();
        System.out.println("Amount To Pay: "+amount);
        upiPayment.processPayment(amount);
        upiPayment.generateReceipt(upiPayment.getTransactionId());
    }

}
