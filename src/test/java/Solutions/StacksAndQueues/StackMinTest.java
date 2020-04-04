package Solutions.StacksAndQueues;

import Solutions.StacksAndQueues.StackMin.StackMin;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackMinTest {
    StackMin stackMin = new StackMin();

    @Test
    public void StackMinTest1() {
        stackMin.push(5);
        stackMin.push(2);
        stackMin.push(1);
        stackMin.push(3);
        stackMin.push(4);
        stackMin.pop();
        stackMin.pop();
        System.out.println(stackMin.toString());
        assertEquals(1, stackMin.min());
    }
}
