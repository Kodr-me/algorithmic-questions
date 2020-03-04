package StringsAndArrays;

import org.junit.jupiter.api.Test;

public class OneAwayTest {

    OneAway oneAway = new OneAway();

    @Test
    void oneReplaceAway1() {
        assert (oneAway.solution("pale", "bale"));
    }

    @Test
    void oneReplaceAway2() {
        assert (oneAway.solution("pale", "palx"));
    }

    @Test
    void oneReplaceAway3() {
        assert (!oneAway.solution("pale", "pxlx"));
    }

    @Test
    void oneInsertAway1() {
        assert (oneAway.solution("pale", "pal"));
    }

    @Test
    void oneInsertAway2() {
        assert (oneAway.solution("pale", "ale"));
    }

    @Test
    void oneInsertAway3() {
        assert (oneAway.solution("apple", "aple"));
    }

    @Test
    void oneInsertAway4() {
        assert (!oneAway.solution("apple", "able"));
    }

    @Test
    void oneRemoveAway1() {
        assert (oneAway.solution("pal", "pale"));
    }

    @Test
    void oneRemoveAway2() {
        assert (oneAway.solution("ale", "pale"));
    }

    @Test
    void oneRemoveAway3() {
        assert (oneAway.solution("aple", "apple"));
    }

    @Test
    void oneRemoveAway4() {
        assert (!oneAway.solution("able", "apple"));
    }
}
