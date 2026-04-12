public class PaypalPayment implements  PaymentMethord{

    @Override
    public void payment(double amount) {
        System.out.println("Paid $" + amount + " using Paypal");
    }
}
