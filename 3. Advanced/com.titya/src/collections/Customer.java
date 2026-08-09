package collections;

public class Customer implements Comparable<Customer> {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Customer other) {
        // if this < other -> -1
        // if this = other -> 0
        // if this > other -> 1
        return name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name;
    }
}