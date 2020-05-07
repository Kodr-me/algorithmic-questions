package Solutions.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    void test0() {
        String s = "aabdecxyz";
        String pattern = "abc";
        String result =  "abdec";

        assertEquals(result, MinimumWindowSubstring.minWindow(s, pattern));
    }

    @Test
    void test1() {
        String s = "aabdec";
        String pattern = "abc";
        String result =  "abdec";

        assertEquals(result, MinimumWindowSubstring.minWindow(s, pattern));
    }

    @Test
    void test2() {
        String s = "abdabca";
        String pattern = "abc";
        String result =  "abc";

        assertEquals(result, MinimumWindowSubstring.minWindow(s, pattern));
    }

    @Test
    void test3() {
        String s = "adcad";
        String pattern = "abc";
        String result =  "";

        assertEquals(result, MinimumWindowSubstring.minWindow(s, pattern));
    }

    @Test
    void test4() {
        String s = "cabwefgewcwaefgcf";
        String pattern = "cae";
        String result =  "cwae";

        assertEquals(result, MinimumWindowSubstring.minWindow(s, pattern));
    }

}