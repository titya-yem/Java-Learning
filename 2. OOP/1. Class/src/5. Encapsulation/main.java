
public class main {
    public static void main(String[] args) {
        // Ecapsulation of OOP (Bundle the data and methods that
        // operate on the data in a single unit)

        // first call or get Employee class
        var employee = new Employee();

        // second assign values
        employee.baseSalary = 50_000;
        employee.hourlyRate = 20;

        // use method and pass 10 as augurment of extraHours
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}