public class CryptoPayment implements PaymentMethord {

    @Override
    public void payment(double amount) {
        System.out.println("Paid $" + amount + " using Crypto");
    }
}
