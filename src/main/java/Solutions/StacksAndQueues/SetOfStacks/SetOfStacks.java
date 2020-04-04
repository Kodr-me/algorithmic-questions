package Solutions.StacksAndQueues.SetOfStacks;

import Solutions.StacksAndQueues.Stack;

import java.util.ArrayList;

// In this solution I maintain a fixed size of stacks passed down when the class gets instantiated, whilst keeping a list of stacks.
// Everytime I push into the setOfStacks I keep track of how many I've inserted, if it equals the same number as the size of stacks I create a new stack at the start of the list.
// Whenever I pop from the stack I verify if the stack is empty, if it is I remove that stack from the list.
public class SetOfStacks <T> {
    int sizeOfStack;
    int inserted = 0;
    public ArrayList<Stack<T>> list = new ArrayList<>();

    public SetOfStacks(int sizeOfStack) {
        this.sizeOfStack = sizeOfStack;
        list.add(new Stack<T>());
    }

    public void push(T t) {
        list.get(0).push(t);
        inserted++;
        if (inserted == sizeOfStack) {
            list.add(0, new Stack<T>());
            inserted = 0;
        }
    }

    public T pop() {
        Stack<T> current = list.get(0);
        T value = current.pop();
        inserted--;
        if (current.isEmpty()) {
            list.remove(0);
        }

        return value;
    }

    public T popAt(int index) {
        Stack<T> current = list.get(index);
        T value = current.pop();
        inserted--;
        if (current.isEmpty()) {
            list.remove(index);
        }
        return value;
    }
}
