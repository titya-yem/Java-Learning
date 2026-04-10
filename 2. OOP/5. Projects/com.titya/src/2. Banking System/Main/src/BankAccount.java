public class BankAccount {
    private String name;
    private double balance;
    private double amount;


    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit (double amount) {
        if (amount < 0)
            System.out.println("Invalid amount");

        this.balance += amount;
        System.out.println("Deposit");
        System.out.println(this.balance);
    }

    public void withdraw (double amount) {
        if (amount < 0 || amount > balance)
            System.out.println("Invalid amount");

        this.balance -= amount;
        System.out.println("Withdraw");
        System.out.println(this.balance);
    }

    public void checkBalance () {
        System.out.println("Checking Balance");
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);;
    }
}
