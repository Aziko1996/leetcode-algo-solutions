package datastructures.linkedlist;

public class Node<T> {

    public T value;
    public Node<T> nextNode;

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }
}
