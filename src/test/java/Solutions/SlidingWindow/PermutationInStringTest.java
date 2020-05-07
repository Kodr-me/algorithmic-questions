package Solutions.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationInStringTest {

    @Test
    void test0() {
        String s = "oidbcaf";
        String pattern = "abc";
        boolean ans = PermutationInString.checkInclusion(s, pattern);
        assertTrue(ans);
    }
    
    @Test
    void test1() {
        String s = "eidbaooo";
        String pattern = "ab";
        boolean ans = PermutationInString.checkInclusion(s, pattern);
        assertTrue(ans);
    }

    @Test
    void test2() {
        String s = "eidboaoo";
        String pattern = "ab";
        boolean ans = PermutationInString.checkInclusion(s, pattern);
        assertFalse(ans);
    }

    @Test
    void test3() {
        String s = "odicf";
        String pattern = "dc";
        boolean ans = PermutationInString.checkInclusion(s, pattern);
        assertFalse(ans);
    }

    @Test
    void test4() {
        String s = "odibcdxabcdycf";
        String pattern = "bcdyabcdx";
        boolean ans = PermutationInString.checkInclusion(s, pattern);
        assertTrue(ans);
    }

}