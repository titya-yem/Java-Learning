public class Main {
    public static void main(String[] args) {

        var payment1 = new CreditCardPayment();
        var checkout1 = new CheckoutService(payment1);
        checkout1.checkout(100);

        var payment2 = new PaypalPayment();
        var checkout2 = new CheckoutService(payment2);
        checkout1.checkout(200);

        var payment3 = new CryptoPayment();
        CheckoutService checkout3 = new CheckoutService(payment3);
        checkout3.checkout(300);
    }
}
