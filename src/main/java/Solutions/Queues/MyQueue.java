package Solutions.Queues;

import java.util.ArrayList;
import java.util.List;

// FIFO data structure
public class MyQueue {

    private List<Integer> data;
    private int pStart;

    public MyQueue() {
        this.data = new ArrayList<>();
        pStart = 0;
    }

    public boolean enQueue(int x) {
        data.add(x);
        return true;
    }

    public boolean dequeue() {
        if (data.isEmpty()) return false;
        pStart++;
        return true;
    }

    public int front() {
        return data.get(pStart);
    }

    public boolean isEmpty() {
        return pStart >= data.size();
    }
}
