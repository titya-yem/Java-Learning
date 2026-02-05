
public class Main {
    final static byte MONTH_OF_THE_YEAR = 12;
    final static byte PERCENT = 100;

    public static void main(String[] args) {

        int principal = (int) Print.readNumber("Principal: ", 1_000, 1_000_100);
        float interestRate = (float) Print.readNumber("Annual Interest Rate: ", 1, 30);
        byte period = (byte) Print.readNumber("Period (Years): ", 1, 30);

        double mortgage = Calculate.calculateMortgage(principal, interestRate, period);

        Report.printMortgage(mortgage);
        Report.printPaymentSchedule(principal, interestRate, period);
    }

}