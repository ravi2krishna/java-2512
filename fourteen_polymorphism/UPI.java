package fourteen_polymorphism;

import java.util.Scanner;

public class UPI extends AbstractPayment {

    private String upiId;
    private String upiPaymentType;
    
    public String getUpiId() {
        return upiId;
    }
    public void setUpiId(String upiId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI ID");
        upiId = sc.next();
        this.upiId = upiId;
    }
    public String getUpiPaymentType() {
        return upiPaymentType;
    }
    public void setUpiPaymentType(String upiPaymentType) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter UPI Type Gpay / PhonePe / PayTM");
        upiPaymentType = sc.next();
        this.upiPaymentType = upiPaymentType;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI Payment Of Rupees: "+amount);
    }

}
