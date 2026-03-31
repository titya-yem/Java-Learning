public class Main {
    public static void main(String[] args) {
        // Because every class inherit Object class (Object())
        // it has some methods that we can use (below). It is automatically
        // inherit, EXP, public class UIControl extends Object. Even if we
        // didn't see it but Java auto inherit it on every class
        var box1 = new TextBox();
        var box2 = new TextBox();

        // it will compare the location of the memory,
        // if it the same = true, if not the same = false
        // we will get (112810359), it is the hash code of this object
        // we can use it to comparing objects for equality, EXP
        System.out.println(box1.hashCode());
        System.out.println(box2.hashCode());
        // we may use equal method also and it will return boolean
        System.out.println(box1.equals(box2));

        // it will the string represent of an object
        System.out.println(box1.toString());
    }
}
