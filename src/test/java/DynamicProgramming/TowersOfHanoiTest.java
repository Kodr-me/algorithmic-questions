package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TowersOfHanoiTest {
    TowersOfHanoi towersOfHanoi = new TowersOfHanoi();

    @Test
    void test1() {
        towersOfHanoi.solution(100);
    }

}