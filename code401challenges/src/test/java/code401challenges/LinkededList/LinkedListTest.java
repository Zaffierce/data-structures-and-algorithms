package code401challenges.LinkededList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insert_valid() {
        LinkedList link = new LinkedList();
        link.insert(1);
        Integer testValue = 1;

        assertEquals(
                "This should return 1, as the length of your LinkedList is 1.",
                testValue,
                link.head.data);
    }

    @Test
    public void includes() {
        LinkedList link = new LinkedList();
        link.insert(1);
        link.insert(2);
        link.insert(3);

        assertEquals(
                "This should be true as it contains the value",
                true,
                link.includes(1)
        );
    }

    @Test
    public void includes_false() {
        LinkedList link = new LinkedList();
        link.insert(1);
        link.insert(2);
        link.insert(3);

        assertEquals(
                "This should be false as it does not contain the value",
                false,
                link.includes(5)
        );
    }

    @Test
    public void testkthFromEnd(){
        LinkedList link = new LinkedList();
        link.insert(1);
        link.insert(2);
        link.insert(3);
        link.insert(4);
        link.insert(5);

        assertEquals("This should return a 2, as this is the 3rd value from the end.",
                2,
                link.kthFromEnd(3)
                );
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