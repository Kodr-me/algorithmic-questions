package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class CheckPermutationTest {

    CheckPermutation checkPermutation = new CheckPermutation();
    String valid1 = "ABC";
    String valid2 = "CBA";
    String invalid2 = "ABZ";
    String invalid3 = "ABZXY";

    @Test
    void sortingSolutionCorrect() {
        assert(checkPermutation.solution(valid1, valid2));
    }

    @Test
    void sortingSolutionIncorrectDifferentLengths() {
        assert(!checkPermutation.solution(valid1, invalid3));
    }

    @Test
    void sortingSolutionIncorrect() {
        assert(!checkPermutation.solution(valid1, invalid2));
    }
}
