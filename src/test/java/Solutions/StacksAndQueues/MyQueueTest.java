package Solutions.StacksAndQueues;

import Solutions.StacksAndQueues.MyQueue.MyQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyQueueTest {

    @Test
    void testPush() {
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);

        assertEquals(1, myQueue.peek());
        assertEquals(1, myQueue.peek());
    }

    @Test
    void testPop() {
        MyQueue<Integer> myQueue = new MyQueue<>();

        myQueue.insert(1);
        myQueue.insert(2);
        myQueue.insert(3);
        myQueue.insert(4);
        myQueue.insert(5);

        assertEquals(1, myQueue.pop());
        assertEquals(2, myQueue.pop());
        assertEquals(3, myQueue.peek());
    }
}
