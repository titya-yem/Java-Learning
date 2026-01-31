
public class Employee {
    // change from public to private (not accessible outside class)
    private int baseSalary;
    private int hourlyRate;

    public Employee(int i, int j) {
        //TODO Auto-generated constructor stub
    }

    public Employee(int i) {
        //TODO Auto-generated constructor stub
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalaray(int baseSalary) {
        // validate first
        if (baseSalary <= 0)
            // throw exception (will terminate terminal)
            throw new IllegalArgumentException("Salaray cannot be 0 or less");

        // then assign value
        this.baseSalary = baseSalary;
    }

    private int getBaseSalaray() {
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate cannot be 0 or less");

        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
