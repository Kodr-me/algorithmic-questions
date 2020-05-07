package Solutions.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {

    @Test
    void test1() {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        int result = 49;

        assertEquals(result, ContainerWithMostWater.maxArea(height));
    }
}