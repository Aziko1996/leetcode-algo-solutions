package datastructures.stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
        try {
            myStack.push(1);
            myStack.traverseStack();
            myStack.push(2);
            myStack.traverseStack();
            myStack.push(3);
            myStack.traverseStack();
            myStack.push(4);
            myStack.traverseStack();
            myStack.pop();
            myStack.traverseStack();
            myStack.pop();
            myStack.traverseStack();
            myStack.pop();
            myStack.traverseStack();
            myStack.pop();
            myStack.traverseStack();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }
}
