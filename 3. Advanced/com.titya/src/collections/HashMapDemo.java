package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapDemo {
    public static void show () {
//        List<Customer> customers = new ArrayList<>();
        // O(n) example if we wanna look for a customer for a particular email
//        for (var customer : customers) {
//            if (customer.getEmail() == "e1")
//                System.out.println("Found !");
//        }

        var c1 = new Customer("a", "e1");
        var c2 = new Customer("b", "e2");

        // Java: Maps, C#: Dictionary, Python: Dictionary, JavaScript: Object
        Map<String, Customer> map = new HashMap<>();

        // To store customer in hash map (This case store by email)
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

        // To get customer from hash map (This case uses email to get name)
        var customer = map.get("e1");
        System.out.println(customer);

        var unknown = new Customer("unknown", "");

        // This means that if we cannot find email (key) we will return unknown customer instead
        var unknownCustomer = map.getOrDefault("e10", unknown);

        // We wanna see if we have customer using key (this case e10)
        var containCustomer = map.containsKey("e10");


        // It will replace the key and return new key, or we can update key and value
        var replaceCustomer = map.replace("e1", new Customer("a++", "e1"));

        // keySet() - key, entrySet() - key and value, values() - value
        for (var item : map.entrySet()) {
            System.out.println(item);
        }
    }
}
