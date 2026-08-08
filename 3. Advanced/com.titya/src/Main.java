import java.util.List;

public static void main (String[] args) {
    List<String> list = new ArrayList<>();
    list.add("a");
    Collections.addAll(list, "b", "c");

    list.add(0, "!"); // add by using index
//    list.addFirst("!"); or using this

    list.set(0, "a+"); // change element using index
    list.remove(1); // remove by index

    System.out.println(list);
    System.out.println(list.get(2)); // get element by index
    System.out.println(list.indexOf("a+")); // check index by value
    System.out.println(list.lastIndexOf("c")); // check index of
    System.out.println(list.contains("a+")); // check if contain
    System.out.println(list.subList(0, 2)); // return from 0-1
}
