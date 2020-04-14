package Solutions.StringsAndArrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordLadderTest {
    @Test
    void test1() {
        WordLadder wordLadder = new WordLadder();

        List<String> list = new ArrayList<>(Arrays.asList("hot","dot","dog","lot","log","cog"));

        System.out.println(list);

        int n = wordLadder.ladderLength("hit", "cog", list);

        assertEquals(5, n);

    }
}