package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseIntegerTest {
    ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    void test1() {
        int reveresed = reverseInteger.reverse(123);

        assertEquals(321, reveresed);
    }

    @Test
    void test2() {
        int reveresed = reverseInteger.reverse(12);

        assertEquals(21, reveresed);
    }

    @Test
    void test3() {
        int reveresed = reverseInteger.reverse(120);

        assertEquals(21, reveresed);
    }

    @Test
    void test4() {
        int reveresed = reverseInteger.reverse(0);

        assertEquals(0, reveresed);
    }

    @Test
    void test5() {
        int reveresed = reverseInteger.reverse(-123);

        assertEquals(-321, reveresed);
    }

    @Test
    void test6() {
        int reveresed = reverseInteger.reverse(-1230);

        assertEquals(-321, reveresed);
    }

    @Test
    void test7() {
        int reveresed = reverseInteger.reverse(901000);

        assertEquals(109, reveresed);
    }

    @Test
    void test8() {
        int reveresed = reverseInteger.reverse(1534236469);

        assertEquals(0, reveresed);
    }
}