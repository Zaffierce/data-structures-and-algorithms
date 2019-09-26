package code401challenges.LinkededList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    LinkedList link = new LinkedList();
    @Before
    public void setup() {
        link.insertHead(0);
        link.insert(1);
        link.insert(2);
        link.insert(3);
    }

    @Test
    public void testInsertHead() {
        assertEquals(
                "This should return 0, as the head of your LinkedList is set to 0.",
                0,
                link.head.data);
    }

    @Test
    public void includes() {
        assertEquals(
                "This should be true as it contains the value",
                true,
                link.includes(1)
        );
    }

    @Test
    public void includes_false() {
        assertEquals(
                "This should be false as it does not contain the value",
                false,
                link.includes(5)
        );
    }

    @Test
    public void testkthFromEnd(){
        assertEquals("This should return a 2, as this is the 3rd value from the end.",
                2,
                link.kthFromEnd(2)
                );
    }

    @Test
    public void testMergeLL() {
        LinkedList ll1 = new LinkedList();
        LinkedList ll2 = new LinkedList();
        ll1.insert(1);
        ll1.insert(3);
        ll1.insert(5);
        ll2.insert(2);
        ll2.insert(4);
        ll2.insert(6);

        LinkedList result = LinkedList.mergeLists(ll1, ll2);
        assertEquals("This should return a list of 1 through 6",
                "LL Results:  1 2 3 4 5 6",
                result.toString());
    }

    //These two should be equal but they aren't?  Is this a java thing that one object doesn't equal another?
//    @Test
//    public void insertBefore() {
//        LinkedList link_before = new LinkedList();
//        link_before.insert(3);
//        link_before.insert(2);
//        link_before.insert(1);
//        link_before.insertBefore(3,10);
//
//
//        LinkedList link_after = new LinkedList();
//        link_after.insert(3);
//        link_after.insert(10);
//        link_after.insert(2);
//        link_after.insert(1);
//        assertEquals(
//                "This should be true",
//                link_before,
//                link_after
//        );
//    }
}