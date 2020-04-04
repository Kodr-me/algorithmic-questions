package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringRotationTest {

    @Test
    void Test1() {
        StringRotation stringRotation = new StringRotation();
        String s1 = "erbottlewat";
        String s2 = "waterbottle";

        assertTrue (stringRotation.solution(s1, s2));
    }
}
