package datastructures.heap;

import java.util.Arrays;

public class MinHeap {
    private int capacity = 10;
    private int size;
    private int[] array;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        array = new int[capacity];
        size = 0;
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int leftChild(int parentIndex) {
        return array[getLeftChildIndex(parentIndex)];
    }

    private int rightChild(int parentIndex) {
        return array[getRightChildIndex(parentIndex)];
    }

    private int parent(int childIndex) {
        return array[getParentIndex(childIndex)];
    }

    private void swap(int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    private void ensureCapacity() {
        if (size == capacity) {
            array = Arrays.copyOf(array, capacity * 2);
            capacity *= 2;
        }
    }

    public int peek() {
        if (size == 0) throw new IllegalStateException();
        else return array[0];
    }

    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = array[0];
        array[0] = array[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item) {
        ensureCapacity();
        array[size] = item;
        size++;
        heapifyUp();
    }

    public void heapifyUp() {
        int index = size - 1;
        while (hasParent(index) && parent(index) > array[index]) {
            swap(getParentIndex(index), index);
            index = getParentIndex(index);
        }
    }

    public void heapifyDown() {
        int index = 0;
        while (hasLeftChild(index)) {
            int smallerIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerIndex = getRightChildIndex(index);
            }
            if (array[index] <= array[smallerIndex]) {
                break;
            }
            if (array[index] > array[smallerIndex]) {
                swap(index, smallerIndex);
            }
            index = smallerIndex;
        }
    }

    public int[] getAllElements() {
        return array;
    }

}
