package seven_constructor;

// simulate banking system
public class Bank {

    // if you want to create an account in HDFC Bank 
    // Account Can be Opened if minimum balance is 10000

    // now we can accept bank account with custom balance 2000, 5000, 0


    // initial account creation
    double minBalance;

    // bank start up operations -> current account
    public Bank() {
        System.out.println("======== HDFC ========");
        System.out.println("Creating HDFC Account");
        minBalance = 10000;

        // service charge
        minBalance-=1500;
    }

    // savings account
    public Bank(double minBalance) {
        this.minBalance = minBalance;
    }

    public double showBalance() {
        return minBalance;
    }

    public static void main(String[] args) {
        Bank customer_one = new Bank(); // current account 
        System.out.println(customer_one.showBalance());

        Bank customer_two = new Bank(2000); // savings account
        System.out.println(customer_two.showBalance());
        
    }
}
