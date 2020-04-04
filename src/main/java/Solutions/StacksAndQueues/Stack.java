package Solutions.StacksAndQueues;

import java.util.EmptyStackException;

public class Stack <T> {

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode<T> t = new StackNode<>(item);
        t.next = top;
        top = t;
    }

    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StackNode n = top;
        while (n.next != null) {
            stringBuilder.append(n.data + ", ");
            n = n.next;
        }
        stringBuilder.append(n.data + ", ");
        return stringBuilder.toString();
    }
}
