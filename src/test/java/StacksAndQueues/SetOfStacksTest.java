package StacksAndQueues;

import StacksAndQueues.SetOfStacks.SetOfStacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SetOfStacksTest {


    @Test
    void StackOfPlatesTest1() {
        SetOfStacks<Integer> setOfStacks = generateSetOfStacks();

        Stack<Integer> stackOne = setOfStacks.list.get(0);
        Stack<Integer> stackTwo = setOfStacks.list.get(1);
        Stack<Integer> stackThree = setOfStacks.list.get(2);

        assertEquals(8, stackOne.peek());
        assertEquals(6, stackTwo.peek());
        assertEquals(3, stackThree.peek());
    }

    @Test
    void StackOfPlatesTest2() {
        SetOfStacks<Integer> setOfStacks = generateSetOfStacks();

        setOfStacks.pop();
        Stack<Integer> stackOne = setOfStacks.list.get(0);
        Stack<Integer> stackTwo = setOfStacks.list.get(1);
        Stack<Integer> stackThree = setOfStacks.list.get(2);

        assertEquals(7, stackOne.peek());
        assertEquals(6, stackTwo.peek());
        assertEquals(3, stackThree.peek());

        setOfStacks.pop();
        setOfStacks.pop();
        setOfStacks.pop();

        stackOne = setOfStacks.list.get(0);
        stackTwo = setOfStacks.list.get(1);
        assertEquals(4, stackOne.peek());
        assertEquals(3, stackTwo.peek());

    }

    @Test
    void StackOfPlatesTest3() {
        SetOfStacks<Integer> setOfStacks = generateSetOfStacks();

        setOfStacks.popAt(2);
        setOfStacks.popAt(0);
        setOfStacks.popAt(1);
        Stack<Integer> stackOne = setOfStacks.list.get(0);
        Stack<Integer> stackTwo = setOfStacks.list.get(1);
        Stack<Integer> stackThree = setOfStacks.list.get(2);

        assertEquals(7, stackOne.peek());
        assertEquals(5, stackTwo.peek());
        assertEquals(2, stackThree.peek());
    }

    public SetOfStacks generateSetOfStacks() {
        SetOfStacks setOfStacks = new SetOfStacks(3);
        setOfStacks.push(1);
        setOfStacks.push(2);
        setOfStacks.push(3);
        setOfStacks.push(4);
        setOfStacks.push(5);
        setOfStacks.push(6);
        setOfStacks.push(7);
        setOfStacks.push(8);
        return setOfStacks;
    }
}
