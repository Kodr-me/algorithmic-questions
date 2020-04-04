package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

public class StringCompressionTest {
    StringCompression stringCompression = new StringCompression();

    String valid = "aabcccccaaa";
    String validAnswer = "a2b1c5a3";

    @Test
    void validTest0() {
        assert (stringCompression.solution(valid).equals(validAnswer));
    }

    @Test
    void validTest1() {
        assert (stringCompression.solution("aaaaaabbbbbbbcccccccabc").equals("a6b7c7a1b1c1"));
    }

    @Test
    void validTest3() {
        assert (stringCompression.solution("a").equals("a"));
    }

    @Test
    void validTest4() {
        assert (stringCompression.solution("abc").equals("abc"));
    }
}