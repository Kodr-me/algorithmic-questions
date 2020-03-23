package TreesAndGraphs;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutoCompletionTest {

    AutoCompletion autoCompletion = new AutoCompletion();

    static ArrayList<String> list = new ArrayList<>();
    static ArrayList<String> result = new ArrayList<>();
    static String inputWord = "do";

    @BeforeAll
    private static void beforeAll() {
        list.add("dog");
        list.add("dark");
        list.add("cat");
        list.add("door");
        list.add("dodge");

        result.add("dog");
        result.add("door");
        result.add("dodge");
    }

    @Test
    void testingBadSolution1() {
        System.out.println(list);
        System.out.println(result);
        ArrayList returned = autoCompletion.badSolution(list, inputWord);
        assertEquals(result, returned);
    }

    @Test
    void testingSolution() {
        System.out.println(list);
        System.out.println(result);
        autoCompletion.solution(list, inputWord);

//        assertEquals(result, returned);
    }
}
