package Solutions.Queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueTest {


    @Test
    void enqueue() {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(0);
        assertEquals(0, myQueue.front());
    }

    @Test
    void dequeue() {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(0);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        System.out.println(myQueue.front());
        assertTrue(myQueue.dequeue());
        assertEquals(1, myQueue.front());
    }

    @Test
    void isEmpty() {
        MyQueue myQueue = new MyQueue();
        myQueue.enQueue(0);
        myQueue.enQueue(1);
        assertTrue(myQueue.dequeue());
        System.out.println(myQueue.front());
        assertFalse(myQueue.isEmpty());
    }

}