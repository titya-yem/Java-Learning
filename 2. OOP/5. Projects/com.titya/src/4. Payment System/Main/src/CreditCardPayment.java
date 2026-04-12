public class CreditCardPayment implements PaymentMethord {

    @Override
    public void payment(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}
