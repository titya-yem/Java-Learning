public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculatePay(int extraHours) {
        return baseSalary + (extraHours * hourlyRate);
    }

    public void setBaseSalary(int baseSalary) { // getter
        if (baseSalary <= 0) // validation
            throw new IllegalArgumentException("Base salary must be greater than 0");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary() { // setter
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate must be greater than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }
}
