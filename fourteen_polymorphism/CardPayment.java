package fourteen_polymorphism;

import java.util.Scanner;

public class CardPayment extends AbstractPayment {

    private int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Card Number");
        cardNumber = sc.nextInt();
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Card Payment Of Rupees: "+amount);
    }

}
