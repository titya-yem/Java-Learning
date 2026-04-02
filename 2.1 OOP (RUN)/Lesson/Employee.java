package Lesson;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary) { // constructor overloading
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) { // constructor
        setBaseSalary(baseSalary); // use setter to validate
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees);
    }

    public int calculatePay(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculatePay() { // methord overloading
        return calculatePay(0);
    }

    private void setBaseSalary(int baseSalary) { // getter
        if (baseSalary <= 0) // validation
            throw new IllegalArgumentException("Base salary must be greater than 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() { // setter
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
