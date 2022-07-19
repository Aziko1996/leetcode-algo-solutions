package datastructures.arraylist;

import java.util.Arrays;

public class ArrayList<T> {
    private int size = 0;
    private final int DEFAULT_CAPACITY;
    private Object[] elements;

    public ArrayList() {
        elements = new Object[this.DEFAULT_CAPACITY = 16];
    }

    public ArrayList(int initialCapacity) {
        elements = new Object[this.DEFAULT_CAPACITY = initialCapacity];
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(T element) {
        if (size == elements.length) ensureCapacity();
        elements[size++] = element;
    }

    public Object get(int index) {
        if (index < 0 || index >= elements.length) {
            throw new IndexOutOfBoundsException("Incorrect Index");
        }
        return elements[index];
    }

}
