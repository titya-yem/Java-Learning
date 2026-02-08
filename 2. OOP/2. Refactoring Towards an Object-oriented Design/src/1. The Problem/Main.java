
public class Main {

    public static void main(String[] args) {
        // we don't need to declared variable object because here we use
        // Object itself to get the fields and methods

        int principal = (int) Print.readNumber("Principal: ", 1_000, 1_000_100);
        float interestRate = (float) Print.readNumber("Annual Interest Rate: ", 1, 30);
        byte period = (byte) Print.readNumber("Period (Years): ", 1, 30);

        // create class and assign values to fiels by constructor
        var calculator = new Calculate(principal, interestRate, period);
        // use method to calculate while getting the private fiels in Calculate object
        double mortgage = calculator.calculateMortgage();

        // create class and assign values to fiels (calculator object) by constructor
        var report = new Report(calculator);

        report.printMortgage(mortgage);
        report.printPaymentSchedule();
    }

}