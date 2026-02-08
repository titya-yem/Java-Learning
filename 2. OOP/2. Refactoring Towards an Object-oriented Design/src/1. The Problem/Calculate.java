
public class Calculate {
    private final byte MONTH_OF_THE_YEAR = 12;
    private final byte PERCENT = 100;

    private int principal;
    private float interestRate;
    private byte period;

    // Constructor (to assign value to these three fields)
    public Calculate(int principal, float interestRate, byte period) {
        this.principal = principal;
        this.interestRate = interestRate;
        this.period = period;
    }

    // use array because we wanna return the collection of numbers
    public double[] getRemainingBalances() {
        // below is array but we use var to simplify it
        var balances = new double[getNumberOfPayment()];
        for (short month = 1; month <= balances.length; month++)
            // store each month in array after loop
            balances[month - 1] = calculateBalance(month); // loop each month until last month

        return balances;
    }

    public double calculateBalance(short numberOfPaymentsMade) {
        short numberOfPayments = (short) getNumberOfPayment();
        float monthlyInterest = getMonthlyInterest();

        double powTotalPayment = totalPayment(numberOfPayments, monthlyInterest);
        double powPaymentMade = totalPayment(numberOfPaymentsMade, monthlyInterest);

        return principal * (powTotalPayment - powPaymentMade) / (powTotalPayment - 1);
    }

    public double calculateMortgage() {
        // casting all to short
        short numberOfPayments = (short) getNumberOfPayment();

        float monthlyInterest = getMonthlyInterest();
        double powTotalPayment = totalPayment(numberOfPayments, monthlyInterest);

        return principal * (monthlyInterest * powTotalPayment) / (powTotalPayment - 1);
    }

    private float getMonthlyInterest() {
        return interestRate / MONTH_OF_THE_YEAR / PERCENT;
    }

    private int getNumberOfPayment() {
        return period * MONTH_OF_THE_YEAR;
    }

    private double totalPayment(short numberOfPayments, float monthlyInterest) {
        return Math.pow(1 + monthlyInterest, numberOfPayments);
    }
}
