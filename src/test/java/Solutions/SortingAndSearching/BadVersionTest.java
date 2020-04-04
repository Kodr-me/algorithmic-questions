package Solutions.SortingAndSearching;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadVersionTest {

    @Test
    void badSolution() {
        BadVersion badVersion = new BadVersion(9);

        assertEquals(9, badVersion.badSolution(11));
    }

    @Test
    void solution() {
        BadVersion badVersion = new BadVersion(9);

        assertEquals(9, badVersion.firstBadVersion(11));
    }

    @Test
    void solution1() {
        BadVersion badVersion = new BadVersion(3);

        assertEquals(3, badVersion.firstBadVersion(10));
    }
}