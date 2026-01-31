
public class Employee {
    public int baseSalary;
    public int hourlyRate;
    // let assume that extraHours will change every year while others the same

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }
}
