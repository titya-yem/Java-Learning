
public class Employee {
    // change from public to private (not accessible outside class)
    private int baseSalary;
    private int hourlyRate;

    // 2 ways to use constructor
    public Employee(int baseSalary, int hourlyRate) {
        // first way, it could be invalid state (no validation)
        // this.baseSalary = baseSalary

        // second way, use setter to assign value (recommend)
        setBaseSalaray(baseSalary);
        setHourlyRate(hourlyRate);
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }

    // overloaded calculated twice
    public int calculateWage() {
        return calculateWage(0);
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
