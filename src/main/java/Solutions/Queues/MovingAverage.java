package Solutions.Queues;

/*
Given a stream of integers and a window size,
calculate the moving average of all integers in the sliding window.
 */

class MovingAverage {

    private int total, i;
    int[] queue;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        queue = new int[size];
        total = 0;
        i = -1;
    }

    public double next(int val) {
//        System.out.println("val " + val);
        if (total != queue.length) total++;
//        System.out.println("total " + total);

        i++;
        if (i == (queue.length)) i = 0;

        queue[i] = val;
//        System.out.println(Arrays.toString(queue));
        int t = getTotal();
        double result = (double) t / total;
//        System.out.println(t);
//        System.out.println(result);
        return result;
    }

    private int getTotal() {
        int t = 0;
        for (int i1 = 0; i1 < queue.length; i1++) {
            t+= queue[i1];
        }
        return t;
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */
