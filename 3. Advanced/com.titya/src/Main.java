import collections.Customer;
import java.util.List;

public static void main (String[] args) {
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("b"));
    customers.add(new Customer("a"));
    customers.add(new Customer("c"));

    // in order to sort it we need to compare interface first
    // the method is in Customer class named ComparedTo
    Collections.sort(customers);
    System.out.println(customers);
}
