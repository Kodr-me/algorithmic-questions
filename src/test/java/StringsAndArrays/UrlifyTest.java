package StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UrlifyTest {
    Urlify urlIfy = new Urlify();
    @Test
    void testCorrectSolution() {
        char[] test = "Mr John Smith    ".toCharArray();
        urlIfy.solution(test, 13);
        String output = new String(test);

        assertEquals("Mr%20John%20Smith", output);
    }
}
