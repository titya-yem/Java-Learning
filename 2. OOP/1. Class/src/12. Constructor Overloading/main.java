
public class main {
    public static void main(String[] args) {
        // method overloading means we can use one function with
        // difference parameters.

        var employee = new Employee(50_000, 20);

        // int wage = employee.calculateWage() overloading
        int wage = employee.calculateWage(10);
        System.out.println(wage);
    }
}