public class CheckoutService {
    private PaymentMethord paymentMethord;

    public CheckoutService(PaymentMethord paymentMethord){
        this.paymentMethord = paymentMethord;
    }

    public void checkout (double amount){
        paymentMethord.payment(amount);
    }
}
