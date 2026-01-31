
public class main {
    public static void main(String[] args) {
        // do the data validation
        var employee = new Employee();

        // now user can write employee.baseSalary = -1
        // we have 2 options: if statment or getter and setter (Recommend)
        // if (baseSalary <= 0)...
        // BaseSalary
        employee.setBaseSalaray(50_000);
        employee.getBaseSalaray();

        // HourlyRate
        employee.setHourlyRate(20);
        employee.getHourlyRate();

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}