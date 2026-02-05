
public class Calculate {
    private int principal;
    private float interestRate;
    private byte period;

    public Calculate(int principal, float interestRate, byte period) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.period = period;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        short numberOfPayments = (short) (period * Main.MONTH_OF_THE_YEAR);
        float monthlyInterest = interestRate / Main.MONTH_OF_THE_YEAR / Main.PERCENT;

        double powTotalPayment = Math.pow(1 + monthlyInterest, numberOfPayments);
        double powPaymentMade = Math.pow(1 + monthlyInterest, numberOfPaymentsMade);

        return principal * (powTotalPayment - powPaymentMade) / (powTotalPayment - 1);
    }

    public double calculateMortgage() {
        // casting all to short
        short numberOfPayments = (short) (period * Main.MONTH_OF_THE_YEAR);

        float monthlyInterest = interestRate / Main.MONTH_OF_THE_YEAR / Main.PERCENT;
        double powTotalPayment = Math.pow(1 + monthlyInterest, numberOfPayments);

        return principal * (monthlyInterest * powTotalPayment) / (powTotalPayment - 1);
    }
}
