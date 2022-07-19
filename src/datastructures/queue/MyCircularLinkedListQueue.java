package datastructures.queue;

public class MyCircularLinkedListQueue {
    /*private CircularQueueNode front;
    private CircularQueueNode rear;

    public void enQueue(Object element) {
        CircularQueueNode newNode = new CircularQueueNode(element);
        if (front == null) front = newNode;
        else rear.next = newNode;
        rear = newNode;
        rear.next = front;
    }

    public Object deQueue() throws Exception {
        if (front == null) throw new Exception("Cannot dequeue from empty circular queue");
        else if (front == rear) {
            Object dequeuedElement = front.value;
            front = null;
            rear = null;
            return dequeuedElement;
        } else {
            Object dequeuedElement = front.value;
            front = front.next;
            rear.next = front;
            return dequeuedElement;
        }
    }

    public void traverseCircularQueue() throws Exception {
        if (front == null) throw new RuntimeException("Cannot traverse in empty circular queue");
        else {
            CircularQueueNode temp = front;
            while (temp.next != front) {
                System.out.print(temp.value + " ");
                temp = temp.next;
            }
            System.out.println(temp.value);
        }
    }*/
    private CircularQueueNode front;
    private CircularQueueNode rear;

    public void enQueue(Object value) {
        CircularQueueNode newNode = new CircularQueueNode(value);
        if (front == null) front = newNode;
        else rear.next = newNode;
        rear = newNode;
        rear.next = front;
    }

    public Object deQueue() throws Exception {
        if (front == null) throw new Exception("Cannot dequeue from empty circular queue");
        else {
            if (front == rear) {
                Object value = front.value;
                front = null;
                rear = null;
                return value;
            }  else {
                Object value = front.value;
                front = front.next;
                rear.next = front;
                return value;
            }
        }
    }

    public void traverseCircularQueue() {
        CircularQueueNode temp = front;
        while (temp.next != front) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }
}
