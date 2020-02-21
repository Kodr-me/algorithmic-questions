package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class IsUniqueTest {

    IsUnique Iu = new IsUnique();

    @Test
    void testEmptyString() {
        String input = "";
        assert (Iu.solution(input) == true);
    }

    @Test
    void testBasicNonUnique() {
        String input = "aab";
        assert (Iu.solution(input) == false);
    }

    @Test
    void testBasicUnique() {
        String input = "abc";
        assert (Iu.solution(input) == true);
    }

    @Test
    void testLongNonUniqueString() {
        String input = "qwertyuiopasdfghjklzxcvbnmm";
        assert (Iu.solution(input) == false);
    }

    @Test
    void testLongUniqueString() {
        String input = "qwertyuiopasdfghjklzxcvbnm";
        assert (Iu.solution(input) == true);
    }
}