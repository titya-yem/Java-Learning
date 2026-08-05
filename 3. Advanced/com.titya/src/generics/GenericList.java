package generics;

import java.util.Iterator;

public class GenericList <T> implements Iterable<T>{
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add (T item) {
        items[count++] = item;
    }

    public T get (int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        // this -> current class
        return new ListIterator(this);
    }

    // create my own iterator
    private class ListIterator implements Iterator<T> {
        private GenericList<T> list;
        private int index;

        public ListIterator (GenericList<T>  list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            // if index still inside list -> return true
            return (index < list.count);
        }

        @Override
        public T next() {
            // return current item and move forward
            return list.items[index++];
        }
    }
}
