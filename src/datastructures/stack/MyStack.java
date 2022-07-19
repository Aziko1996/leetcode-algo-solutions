package datastructures.stack;

public class MyStack {
    private final Object[] stack;
    private int top = 0;

    public MyStack(int size) {
        stack = new Object[size];
    }

    public void push(Object element) throws Exception {
        if (top == stack.length) throw new Exception("Cannot push to full stack");
        else stack[top++] = element;
    }

    public Object pop() throws Exception {
        if (top == 0) throw new Exception("Cannot pop from empty stack");
        else return stack[--top];
    }

    public void traverseStack() {
        for (int i = 0; i < top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
