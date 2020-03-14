package TreesAndGraphs;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListOfDepthsTest {

    MinimalTree mt = new MinimalTree();
    ListOfDepths listOfDepths = new ListOfDepths();
    int [] ints = new int[]{1,2,3,4,5,6,7,8,9};

    BinaryTreeNode binaryTreeNode = mt.createMinimalBST(ints);


    @Test
    void test1() {
        List<List<Integer>> list = listOfDepths.solution(binaryTreeNode);

        assertEquals(5, list.get(0).get(0));
    }

    @Test
    void test2() {
        List<List<Integer>> list = listOfDepths.solution(binaryTreeNode);

        assertEquals(2, list.get(1).get(0));
        assertEquals(7, list.get(1).get(1));
    }

    @Test
    void test3() {
        List<List<Integer>> list = listOfDepths.solution(binaryTreeNode);

        assertEquals(4, list.get(3).get(0));
        assertEquals(9, list.get(3).get(1));
    }
}
