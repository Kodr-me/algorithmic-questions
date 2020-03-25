package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicIndexTest {

    MagicIndex magicIndex = new MagicIndex();

    @Test
    void test1() {
        int[] n = new int[]{-40, -20, -1, 1, 2, 3, 5, 7, 9, 12, 13};
//        assertEquals(7, magicIndex.iterativeSolution(n));
        assertEquals(7, magicIndex.recursively(n));
    }

    @Test
    void test2() {
        int[] n = new int[]{-40, -20, -1, 3, 5, 6, 8, 9, 11, 12, 13};
//        assertEquals(7, magicIndex.iterativeSolution(n));
        assertEquals(3, magicIndex.recursively(n));
    }

    @Test
    void test3() {
        int[] n = new int[]{-40, 1, 3, 4, 5, 6, 8, 9, 12, 13};
//        assertEquals(7, magicIndex.iterativeSolution(n));
        assertEquals(1, magicIndex.recursively(n));
    }

}