package Solutions.DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripleStepTest {
    TripleStep tripleStep = new TripleStep();

    @Test
    void testCount() {
        assertEquals(13, tripleStep.countWays(5));
        assertEquals(24, tripleStep.countWays(6));
//        assertEquals(24, tripleStep.countWays(100)); // int would overflow
    }
}