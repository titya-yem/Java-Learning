
public class main {
    public static void main(String[] args) {
        // constructor overloading

        var employee = new Employee(50_000, 20);
        var employee2 = new Employee(50_000);

        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}