package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZeroesTest {

    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    void moveZeroes() {
        int[] a = new int[]{0,1,0,3,12};
        int[] result = new int[]{1,3,12,0,0};

        moveZeroes.moveZeroes(a);

        assertArrayEquals(result, a);
    }
}