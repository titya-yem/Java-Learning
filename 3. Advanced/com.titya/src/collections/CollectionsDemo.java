package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show () {
        Collection<String> collection = new ArrayList<>();
        collection.add("a");
        Collections.addAll(collection, "b", "c", "d");
        collection.remove("a");
        collection.clear();
        var findingA = collection.contains("a");
        Object[] objectArray = collection.toArray(); // convert to object array
        String[] stringArray = collection.toArray(new String[0]); // convert to string array

        System.out.println(collection);
        System.out.println(findingA);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

        Collection<String> other = new ArrayList<>();
        other.addAll(collection);

        System.out.println(collection == other); // false because new keyword
        System.out.println(collection.equals(other)); // true because value
    }
}
