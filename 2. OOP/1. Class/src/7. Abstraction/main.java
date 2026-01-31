
public class main {
    public static void main(String[] args) {
        // Coupling (The level of dependency between classes)
        var employee = new Employee();

        employee.setBaseSalaray(50_000);
        employee.setHourlyRate(20);

        int wage = employee.calculateWage(10);
        System.out.println(wage);

        // employee.getHourlyRate() change to private 
        // because something that we don't often use
        // we change to private if not it will depends on coupied it
    }
}