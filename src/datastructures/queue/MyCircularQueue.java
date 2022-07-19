package datastructures.queue;

public class MyCircularQueue {
    /*private Object[] queue;
    private int front;
    private int rear;

    public MyCircularQueue(int size) {
        this.queue = new Object[size];
        this.front = -1;
        this.rear = -1;
    }

    public void enQueue(Object element) throws Exception {
        if (front == 0 && rear == queue.length - 1 || rear == front - 1) {
            throw new RuntimeException("Trying to insert into the full Queue");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            queue[rear] = element;
        } else if (front != 0 && rear == queue.length - 1) {
            rear = 0;
            queue[rear] = element;
        } else {
            queue[++rear] = element;
        }
    }

    public Object deQueue() {
        Object element;
        if (front == -1) {
            return null;
        }
        element = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == queue.length - 1) {
            front = 0;
        } else {
            front = front + 1;
        }
        return element;
    }

    public void displayQueue() throws Exception {
        if (front == -1) {
            throw new Exception("Cannot display empty queue elements");
        } else {
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            } else {
                for (int i = 0; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                for (int j = front; j < queue.length; j++) {
                    System.out.print(queue[j] + " ");
                }
            }
            System.out.println();
        }
    }*/
    private int front;
    private int rear;
    private Object[] queue;

    public MyCircularQueue(int size) {
        queue = new Object[size];
        front = -1;
        rear = -1;
    }

    public void enQueue(Object value) throws Exception {
        if (front == 0 && rear == queue.length  - 1 || rear == front - 1) {
            throw new Exception("Cannot enqueue to the full circular queue");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            queue[rear] = value;
        } else if (front != 0 && rear == queue.length - 1) {
            rear = 0;
            queue[rear] = value;
        } else {
            rear++;
            queue[rear] = value;
        }
    }

    public Object deQueue() throws Exception {
        if (front == -1) {
            throw new Exception("Cannot dequeue from empty circular queue");
        }
        Object value = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == queue.length - 1) {
            front = 0;
        } else {
            front++;
        }
        return value;
    }

    public void displayQueue() throws Exception {
        if (front == -1) {
            throw new Exception("Cannot perform display function on the empty circular queue");
        } else {
            if (front <= rear) {
                for (int i = front; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
            } else {
                for (int i = 0; i <= rear; i++) {
                    System.out.print(queue[i] + " ");
                }
                for (int j = front; j < queue.length; j++) {
                    System.out.print(queue[j] + " ");
                }
            }
            System.out.println();
        }
    }


}