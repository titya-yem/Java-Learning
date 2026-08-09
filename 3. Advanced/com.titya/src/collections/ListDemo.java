package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void show () {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.addFirst("!");
        Collections.addAll(list, "d", "e", "f");

        list.set(0, "a+");
        list.remove(0);

        System.out.println(list.get(0));
        System.out.println(list);
        System.out.println(list.indexOf("a")); // get index by item
        System.out.println(list.lastIndexOf("f")); // get boolean by item
        System.out.println(list.subList(1, 3)); // get item from index 1-3
    }
}
