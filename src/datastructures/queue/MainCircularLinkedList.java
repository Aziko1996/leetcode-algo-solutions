package datastructures.queue;

public class MainCircularLinkedList {
    public static void main(String[] args) {
        try {
            MyCircularLinkedListQueue myCircularLinkedListQueue = new MyCircularLinkedListQueue();
            myCircularLinkedListQueue.enQueue(14);
            myCircularLinkedListQueue.enQueue(22);
            myCircularLinkedListQueue.enQueue(-6);
            myCircularLinkedListQueue.traverseCircularQueue();
            myCircularLinkedListQueue.deQueue();
            myCircularLinkedListQueue.traverseCircularQueue();
            myCircularLinkedListQueue.deQueue();
            myCircularLinkedListQueue.traverseCircularQueue();
            myCircularLinkedListQueue.enQueue(9);
            myCircularLinkedListQueue.traverseCircularQueue();
            myCircularLinkedListQueue.enQueue(20);
            myCircularLinkedListQueue.traverseCircularQueue();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
