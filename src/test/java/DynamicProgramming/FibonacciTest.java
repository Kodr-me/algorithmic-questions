package DynamicProgramming;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void testingFib() {
        Fibonacci f = new Fibonacci();
//        System.out.println(f.solution(100));
        System.out.println(f.memoized(500));
        System.out.println(f.botomUp(500));
        System.out.println(f.simplifiedBottomUp(500));
    }
}
