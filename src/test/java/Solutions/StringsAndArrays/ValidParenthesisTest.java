package Solutions.StringsAndArrays;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesisTest {
    ValidParenthesis validParenthesis = new ValidParenthesis();

    @Test
    void validTest0() {
        String input = "[]";
        assertTrue(validParenthesis.isValid(input));
    }


    @Test
    void validTest1() {
        String input = "()";
        assertTrue(validParenthesis.isValid(input));
    }

    @Test
    void validTest2() {
        String input = "()[]{}";
        assertTrue(validParenthesis.isValid(input));
    }

    @Test
    void validTest3() {
        String input = "{[]}";
        assertTrue(validParenthesis.isValid(input));
    }

    @Test
    void invalidTest1() {
        String input = "(]";
        assertFalse(validParenthesis.isValid(input));
    }

    @Test
    void invalidTest2() {
        String input = "([)]";
        assertFalse(validParenthesis.isValid(input));
    }

    @Test
    void invalidTest3() {
        String input = "((";
        assertFalse(validParenthesis.isValid(input));
    }

    @Test
    void invalidTest4() {
        String input = "){";
        assertFalse(validParenthesis.isValid(input));
    }
}
