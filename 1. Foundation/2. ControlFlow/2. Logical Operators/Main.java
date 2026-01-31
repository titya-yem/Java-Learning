
public class Main {
    public static void main(String[] args) {
        int temperature = 22;

        // must true on both sides (&&)
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);

        // must true on one side (||)
        boolean hasHightIncome = true;
        boolean hasGoodCredit = false;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHightIncome || hasGoodCredit) && !hasGoodCredit;
        System.out.println(isEligible);
    }
}