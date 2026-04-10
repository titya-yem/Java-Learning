public class Main {
    public static void main (String[] args) {
        var account = new BankAccount("Titya", 100);

        account.deposit(500);

        account.withdraw(200);

        account.checkBalance();
    }
}
