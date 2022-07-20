package datastructures.hashtable;

public class HashTable<T, M> {

    private HashNode<T, M>[] buckets;
    private int capacity;
    private int size;

    public HashTable(int capacity) {
        this.capacity = capacity;
        this.buckets = new HashNode[this.capacity];
        this.size = 0;
    }

    private int getBucketIndex(int key) {
        return key % this.capacity;
    }

    public void put(T key, M value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("Illegal Argument!");
        }
        int bucketIndex = getBucketIndex(key.hashCode());
        HashNode<T, M> head = buckets[bucketIndex];
        while (head != null) {
            if (head.getKey() == key) {
                head.setValue(value);
                return;
            }
            head = head.getNext();
        }
        size++;
        head = buckets[bucketIndex];
        HashNode<T, M>  newNode = new HashNode<>(key, value);
        newNode.setNext(head);
        buckets[bucketIndex] = newNode;
    }

    public M remove(T key) {
        int bucketIndex = getBucketIndex(key.hashCode());
        HashNode<T, M> head = buckets[bucketIndex];
        HashNode<T, M> previous = null;
        while (head != null) {
            if (head.getKey() == key) {
                break;
            }
            previous = head;
            head = head.getNext();
        }
        if (head == null) return null;
        size--;
        if (previous != null) {
            previous.setNext(head.getNext());
        } else {
            buckets[bucketIndex] = head.getNext();
        }
        return head.getValue();
    }

    public M get(T key) {
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }
}
