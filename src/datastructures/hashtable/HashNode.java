package datastructures.hashtable;

public class HashNode<T, M> {
    private T key;
    private M value;
    private HashNode<T, M> next;

    public HashNode(T key, M value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public T getKey() {
        return key;
    }

    public M getValue() {
        return value;
    }

    public void setValue(M value) {
        this.value = value;
    }

    public HashNode<T, M> getNext() {
        return next;
    }

    public void setNext(HashNode<T, M> next) {
        this.next = next;
    }
}
