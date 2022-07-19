package commonproblems.first;

public class MyCircularQueue {
    private int[] queue;
    private int front;
    private int rear;

    public MyCircularQueue(int k) {
        queue = new int[k];
        front = -1;
        rear = -1;
    }

    public boolean enQueue(int value) {
        if (front == 0 && rear == queue.length - 1 || rear == front - 1) return false;
        else if (front == -1) {
            front = 0;
            rear = 0;
            queue[rear] = value;
            return true;
        }else if (front != 0 && rear == queue.length - 1) {
            rear = 0;
            queue[rear] = value;
            return true;
        } else {
            rear = rear + 1;
            queue[rear] = value;
            return true;
        }
    }

    public boolean deQueue() {
        if (front == -1) {
            return false;
        }
        int element = queue[front];
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        } else if (front == queue.length - 1) {
            front = 0;
            return true;
        } else {
            front = front + 1;
            return true;
        }
    }

    public int Front() {
        if (front == -1) return -1;
        return queue[front];
    }

    public int Rear() {
        if (front == -1) return -1;
        return queue[rear];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == queue.length - 1 || rear == front - 1);
    }

}
