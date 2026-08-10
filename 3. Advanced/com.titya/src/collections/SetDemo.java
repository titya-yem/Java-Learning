package collections;

import java.util.*;

public class SetDemo {
    public static void show () {
        // set will not store duplicates, and it doesn't guarantee order of item
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("night");
//        set.add("night");
//        System.out.println(set);

//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection); // make collection not duplicate
//        System.out.println(set);

        // Arrays.asList = List of ArrayList
        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

        // Set has 4 operations
        // 1 - Unions (Combination of 2 sets)
        set1.addAll(set2);
        System.out.println(set1);

        // 2 - Intersection (Give us items are common in both sets)
        set1.retainAll(set2);
        System.out.println(set1);

        // 3 - Difference (Give what items has in first set not in the second set)
        set1.removeAll(set2);
        System.out.println(set1);
    }
}
