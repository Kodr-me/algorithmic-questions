package Solutions.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringSameLettersReplacementTest {

    @Test
    void test1() {
        assertEquals(5, LongestSubstringSameLettersReplacement.findLength("aabccbb", 2));
    }

    @Test
    void test2() {
        assertEquals(4, LongestSubstringSameLettersReplacement.findLength("abbcb", 1));
    }

    @Test
    void test3() {
        assertEquals(3, LongestSubstringSameLettersReplacement.findLength("abccde", 1));
    }
}