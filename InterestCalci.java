interface Account {
    void set(String accountNumber, double balance);

    void display();
}

interface Person {
    void store(String name);

    void disp();
}

class Customer implements Account, Person {
    private String name;
    private String accountNumber;
    private double balance;

    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public void store(String name) {
        this.name = name;
    }

    public void disp() {
        System.out.println("Name: " + name);
    }

    public void calculateInterest() {
        double interest = balance * 0.05; // Assuming interest rate of 5%
        System.out.println("Interest: " + interest);
    }
}

public class InterestCalci {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.store("John Doe");
        customer.set("123456789", 10000.0);
        customer.disp();
        customer.display();
        customer.calculateInterest();
    }
}
