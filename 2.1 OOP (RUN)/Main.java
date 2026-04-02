public class Main {

    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);

        int pay = employee.calculatePay(10);
        System.out.println(pay);

        Employee.printNumberOfEmployees();
    }
}