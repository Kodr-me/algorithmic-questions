package Solutions.Queues;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {

    @Test
    void enQueue() {
        MyCircularQueue queue = new MyCircularQueue(5);
        assertTrue(queue.enQueue(1));
        assertTrue(queue.enQueue(2));
        System.out.println(Arrays.toString(queue.array));
        assertEquals(1, queue.Front());
        assertEquals(2, queue.Rear());
    }

    @Test
    void enQueue2() {
        MyCircularQueue queue = new MyCircularQueue(3);
        assertTrue(queue.enQueue(1));
        assertTrue(queue.enQueue(2));
        assertTrue(queue.enQueue(3));
        assertEquals(1, queue.Front());
        assertEquals(3, queue.Rear());
        assertTrue(queue.deQueue());

        assertTrue(queue.enQueue(4));
//        System.out.println(Arrays.toString(queue.array));
        assertEquals(2, queue.Front());
        assertEquals(4, queue.Rear());
    }

    @Test
    void deQueue() {
        MyCircularQueue queue = new MyCircularQueue(3);
        assertTrue(queue.isEmpty());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        assertFalse(queue.isEmpty());

        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
    }

    @Test
    void deQueue2() {
        MyCircularQueue queue = new MyCircularQueue(3);
        assertTrue(queue.isEmpty());
        queue.enQueue(1);
        queue.enQueue(2);

        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertFalse(queue.deQueue());
    }

    @Test
    void deQueue3() {
        MyCircularQueue queue = new MyCircularQueue(3);
        assertTrue(queue.isEmpty());
        queue.enQueue(1);
        queue.enQueue(2);

        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertFalse(queue.deQueue());
    }

    @Test
    void enQueueOutOfSpace() {
        MyCircularQueue queue = new MyCircularQueue(3);
        assertTrue(queue.enQueue(1));
        assertTrue(queue.enQueue(2));
        assertTrue(queue.enQueue(3));
        assertFalse(queue.enQueue(4));
        assertEquals(1, queue.Front());
        assertEquals(3, queue.Rear());
    }

    @Test
    void front() {
    }

    @Test
    void rear() {
    }

    @Test
    void isEmpty() {
        MyCircularQueue queue = new MyCircularQueue(3);
        assertTrue(queue.isEmpty());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        assertFalse(queue.isEmpty());

        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        assertTrue(queue.deQueue());
        System.out.println(Arrays.toString(queue.array));
        assertTrue(queue.isEmpty());
    }

    @Test
    void isFull() {
    }
}