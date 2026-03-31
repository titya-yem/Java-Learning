public class Employee {
    public int baseSalary;
    public int hourlyRate;

    public int calculatePay(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }
}
