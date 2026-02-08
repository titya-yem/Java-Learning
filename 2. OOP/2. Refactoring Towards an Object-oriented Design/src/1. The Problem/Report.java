import java.text.NumberFormat;

public class Report {
    // declared calculator field as Calculate Object
    private Calculate calculator;
    private NumberFormat currencyInstance;

    // initialize calculator field with constructor
    public Report(Calculate calculator) {
        this.calculator = calculator;
        currencyInstance = NumberFormat.getCurrencyInstance();
    }

    public void printMortgage(double mortgage) {
        System.out.println("MORTGAGE");
        System.out.println("--------");
        System.out.print("Monthly Payment: " + currencyInstance.format(mortgage) + "\n");
    }

    public void printPaymentSchedule() {
        System.out.println("PAYMENT SCHEDULE");
        System.out.println("--------------");

        // use forEach loop to loop the array to get one balance at a time
        for (double balance : calculator.getRemainingBalances())
            System.out.println(NumberFormat.getCurrencyInstance().format(balance));
    }
}
