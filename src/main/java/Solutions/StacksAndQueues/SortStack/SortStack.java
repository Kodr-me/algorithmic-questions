package Solutions.StacksAndQueues.SortStack;

import Solutions.StacksAndQueues.Stack;

// Write a program to sort a stack such that the smallest items are on the top. You can use an additional temporary stack, but you may not copy the elements into any other data structure (such as an array).The stack supports the following operations: push, pop, peek, and isEmpty.
public class SortStack {
    private static Stack<Integer> stack = new Stack<>();


    public void push(int i) {
        if (stack.isEmpty()) stack.push(i);
        else {
            Stack<Integer> biggerThan = new Stack<>();
            Stack<Integer> smallerThan = new Stack<>();

            while (!stack.isEmpty()) {
                Integer n = stack.pop();
                if (n >= i) biggerThan.push(n);
                else smallerThan.push(n);
            }

            while (!biggerThan.isEmpty()) {
                stack.push(biggerThan.pop());
            }

            stack.push(i);

            while (!smallerThan.isEmpty()) {
                stack.push(smallerThan.pop());
            }


        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public static String printStack() {
        Stack<Integer> temp = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            Integer n = stack.pop();
            stringBuilder.append(n.intValue() + ", ");
            temp.push(n);
        }

        while (!temp.isEmpty()) {
            Integer n = temp.pop();
            stack.push(n);
        }
        return stringBuilder.toString();
    }
}
