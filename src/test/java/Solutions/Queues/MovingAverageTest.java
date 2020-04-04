package Solutions.Queues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovingAverageTest {

    @Test
    void test1() {
        MovingAverage m = new MovingAverage(3);
        double sum;
        assertEquals(1, m.next(1));
        sum = (double) (1 + 10) / 2;
        assertEquals(sum, m.next(10));
        sum = (double) (1 + 10 + 3) / 3;
        assertEquals(sum, m.next(3));
        sum = (double) (5 + 10 + 3) / 3;
        assertEquals(sum, m.next(5));
    }

}