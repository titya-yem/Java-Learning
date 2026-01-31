
public class main {
    public static void main(String[] args) {
        // Contruction
        // Java will initial value based on type auto if we didn't use constarctor

        // Here we must assign values here
        var employee = new Employee(50_000, 20);

        // pretend that we forget to or dont assign values (they will be 0)
        // employee.setBaseSalaray(50_000);
        // employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}