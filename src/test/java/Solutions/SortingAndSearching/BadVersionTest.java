package Solutions.SortingAndSearching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadVersionTest {

    @Test
    void solution() {
        BadVersion badVersion = new BadVersion(9);

        assertEquals(9, badVersion.firstBadVersion(11));
    }

    @Test
    void solution1() {
        BadVersion badVersion = new BadVersion(11);

        assertEquals(11, badVersion.firstBadVersion(11));
    }

    @Test
    void solution2() {
        BadVersion badVersion = new BadVersion(10);

        assertEquals(10, badVersion.firstBadVersion(11));
    }

    @Test
    void solution3() {
        BadVersion badVersion = new BadVersion(9);

        assertEquals(9, badVersion.firstBadVersion(10));
    }

    @Test
    void solution4() {
        BadVersion badVersion = new BadVersion(4);

        assertEquals(4, badVersion.firstBadVersion(10));
    }

    @Test
    void solution5() {
        BadVersion badVersion = new BadVersion(1);

        assertEquals(1, badVersion.firstBadVersion(10));
    }

    @Test
    void solution6() {
        BadVersion badVersion = new BadVersion(5);

        assertEquals(5, badVersion.firstBadVersion(10));
    }

    @Test
    void solution7() {
        BadVersion badVersion = new BadVersion(-1);

        assertEquals(-1, badVersion.firstBadVersion(10));
    }

    @Test
    void solution8() {
        BadVersion badVersion = new BadVersion(2);

        assertEquals(2, badVersion.firstBadVersion(2));
    }

    @Test
    void solution9() {
        BadVersion badVersion = new BadVersion(1);

        assertEquals(1, badVersion.firstBadVersion(2));
    }

    @Test
    void solution10() {
        BadVersion badVersion = new BadVersion(1);

        assertEquals(1, badVersion.firstBadVersion(2));
    }

//    @Test
//    void solution10() {
//        int badV = 1702766719;
//        int max = 2126753390;
//        int result = -1;
//        BadVersion badVersion = new BadVersion(badV);
//
//        assertEquals(result, badVersion.firstBadVersion(max));
//    }
}