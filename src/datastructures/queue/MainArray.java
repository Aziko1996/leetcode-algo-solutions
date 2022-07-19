package datastructures.queue;

public class MainArray
{
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(5);
        try {
            myCircularQueue.enQueue(14);
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(22);
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(13);
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(-6);
            myCircularQueue.displayQueue();
            myCircularQueue.deQueue();
            myCircularQueue.displayQueue();
            myCircularQueue.deQueue();
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(9);
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(20);
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(5);
            myCircularQueue.displayQueue();
            myCircularQueue.deQueue();
            myCircularQueue.displayQueue();
            myCircularQueue.enQueue(51);
            myCircularQueue.displayQueue();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}
