import java.util.ArrayList;

public class BankAccount {
    private String name;
    private double balance;
    private ArrayList<String> history = new ArrayList<>();

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }

        this.balance += amount;
        history.add("Deposited: " + amount + "$");
        System.out.println("Deposit");
        System.out.println(this.balance);
    }

    public void withdraw (double amount) {
        if (amount < 0 || amount > balance) {
            System.out.println("Invalid amount");
            return;
        }

        this.balance -= amount;
        history.add("Withdrawn: " + amount + "$");
        System.out.println("Withdraw");
        System.out.println(this.balance);
    }

    public void checkBalance () {
        if (balance < 0)
            System.out.println("Invalid balance");

        System.out.println("Checking Balance");
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);;
    }

    public void checkHistory () {
        System.out.println("Checking History");
        System.out.println(this.history);
    }
}
