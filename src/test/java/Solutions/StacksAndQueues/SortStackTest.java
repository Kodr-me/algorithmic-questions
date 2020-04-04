package Solutions.StacksAndQueues;

import Solutions.StacksAndQueues.SortStack.SortStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortStackTest {

    @Test
    public void TestingPush0() {
        SortStack sortStack = new SortStack();

        sortStack.push(1);

        assertEquals(1, sortStack.pop());
    }

    @Test
    public void TestingPush1() {
        SortStack sortStack = new SortStack();

        sortStack.push(1);
        sortStack.push(0);

        assertEquals(0, sortStack.pop());
        assertEquals(1, sortStack.pop());
    }

    @Test
    public void TestingPush2() {
        SortStack sortStack = new SortStack();

        sortStack.push(5);
        sortStack.push(7);

        assertEquals(5, sortStack.pop());
        assertEquals(7, sortStack.pop());
    }

    @Test
    public void TestingPush3() {
        SortStack sortStack = new SortStack();

        sortStack.push(1);
        sortStack.push(2);
        sortStack.push(3);

        assertEquals(1, sortStack.pop());
        assertEquals(2, sortStack.pop());
        assertEquals(3, sortStack.pop());
    }

    @Test
    public void TestingPush4() {
        SortStack sortStack = new SortStack();

        sortStack.push(3);
        sortStack.push(2);
        sortStack.push(1);


        assertEquals(1, sortStack.pop());
        assertEquals(2, sortStack.pop());
        assertEquals(3, sortStack.pop());
    }

    @Test
    public void TestingPush5() {
        SortStack sortStack = new SortStack();

        sortStack.push(3);
        sortStack.push(5);
        sortStack.push(10);
        sortStack.push(2);
        sortStack.push(25);


        assertEquals(2, sortStack.pop());
        assertEquals(3, sortStack.pop());
        assertEquals(5, sortStack.pop());
        assertEquals(10, sortStack.pop());
        assertEquals(25, sortStack.pop());
    }
}
