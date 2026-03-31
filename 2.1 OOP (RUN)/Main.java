public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50_000);
        employee.setHourlyRate(20);
        int pay = employee.calculatePay(10);

        System.out.println(pay);
    }
}