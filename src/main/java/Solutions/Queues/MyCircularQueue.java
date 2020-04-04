package Solutions.Queues;

import java.util.Arrays;

public class MyCircularQueue {
    private int front;
    private int rear;
    int[] array;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        array = new int[k];
        Arrays.fill(array, -1);
        front = -1;
        rear = -1;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {

        if (front == -1 && array.length > 0) { // first item inserted
            array[0] = value;
            front = 0;
            rear = 0;
            return true;
        }

        int index = getFirstAvailableIndex();

        if (index == -1) return false; // queue out of space, no available indexes

        rear = index;
        array[index] = value;
        return true;
    }

    private int getFirstAvailableIndex() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1)  {
                return i;
            };
        }
        return -1;
    }

    /** Get the front item from the queue. */
    public int Front() {
        return front != -1 ? array[front] : -1;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (isEmpty()) return false;
        if (front == rear) { // when we dequeue the last element, we should reset the array
            front = -1;
            rear = -1;
            return true;
        }
        array[front] = -1;
        front++;
        return true;
    }


    /** Get the last item from the queue. */
    public int Rear() {
        return rear != -1 ? array[rear] : -1;
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) return false;
        }
        return true;
    }
}
