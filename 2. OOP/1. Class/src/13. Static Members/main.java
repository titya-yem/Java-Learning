
public class main {
    public static void main(String[] args) {
        // in OOP class have 2 types (instant member and static member)
        // instant member belongs instant members or objects
        // static keyword are fields belong to class not object

        // static member use when we wanna represent a concept
        // that should be in single place

        // we use it when the value is independence of object
        // and we wanna share it across all objects

        var employee = new Employee(50_000, 20);
        int wage = employee.calculateWage(10);
        System.out.println(wage);

        // we don't have to create an object
        // we can access it directly from the class itself
        System.out.println(Employee.numberOfEmployees); // field
        Employee.printNumberOfEmployees(); // method
    }
}