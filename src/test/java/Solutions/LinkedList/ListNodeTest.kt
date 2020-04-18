package Solutions.LinkedList

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ListNodeTest {

    @Test
    fun `test 1`() {
        val head = ListNode(1)

        assertNull(head.next)
    }
}