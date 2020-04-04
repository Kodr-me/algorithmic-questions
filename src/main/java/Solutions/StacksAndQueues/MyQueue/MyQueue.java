package Solutions.StacksAndQueues.MyQueue;

import Solutions.StacksAndQueues.Stack;

import java.util.EmptyStackException;

public class MyQueue <T> {
    Stack<T> activeStack = new Stack<>();
    Stack<T> passiveStack = new Stack<>();

    public void insert(T item) {
        activeStack.push(item);
    }

    public T peek() {
        while (!activeStack.isEmpty()) {
            T current = activeStack.pop();
            passiveStack.push(current);
        }
        return passiveStack.peek();
    }

    public T pop() {
        if (activeStack.isEmpty()) throw new EmptyStackException();
        while (!activeStack.isEmpty()) {
            T current = activeStack.pop();
            passiveStack.push(current);
        }
        T value = passiveStack.pop();

        while (!passiveStack.isEmpty()) {
            T current = passiveStack.pop();
            activeStack.push(current);
        }

        return value;
    }
}
