import collections.Customer;
import collections.EmailComparator;

import java.util.List;

public static void main (String[] args) {
    List<Customer> customers = new ArrayList<>();
    customers.add(new Customer("b", "e3"));
    customers.add(new Customer("a", "e2"));
    customers.add(new Customer("c", "e1"));

//    Collections.sort(customers, new EmailComparator()); or using
    customers.sort(new EmailComparator());
    System.out.println(customers);
}
