package Solutions.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {

    @Test
    void test1() {
        int[] a = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        int res = 6;

        assertEquals(res, TrappingRainWater.trap(a));
    }
}