import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GBLinkedListTest {

    @Test
    public void testAddFirst() {
        GBLinkedList<Integer> listTest = new GBLinkedList<>();
        listTest.addFirst(1);
        listTest.addFirst(2);
        listTest.addFirst(3);

        assertEquals(3, listTest.size());
        assertEquals(Integer.valueOf(3), listTest.get(0));
        assertEquals(Integer.valueOf(2), listTest.get(1));
        assertEquals(Integer.valueOf(1), listTest.get(2));
    }

    @Test
    public void testAddLast() {
        GBLinkedList<String> listTest_1 = new GBLinkedList<>();
        listTest_1.addLast("one");
        listTest_1.addLast("two");
        listTest_1.addLast("three");
        assertEquals("one", listTest_1.get(0));
        System.out.println("test " + listTest_1.get(0));
    }

}
