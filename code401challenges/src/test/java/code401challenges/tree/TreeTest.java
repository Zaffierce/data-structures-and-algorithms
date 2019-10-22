package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class TreeTest {

    Tree tree = new Tree();
    /*
                    1
                   / \
                  3   5
                 / \   \
                9   12  2
     */

    @Before
    public void setUp() throws Exception {
        Node childTwo = new Node(5, new Node(2), null);
        Node childOne = new Node(3, new Node(9), new Node(12));
        Node rootNode = new Node(1, childOne, childTwo);
        tree = new Tree();
        tree.root = rootNode;
    }

    @Test
    public void testInOrder() {
        assertArrayEquals(new Integer[]{4, 2, 6, 5, 1, 3}, tree.inOrder());
    }

    @Test
    public void testPreOrder() {
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 6, 3}, tree.preOrder());
    }

    @Test
    public void testPostOrder() {
        assertArrayEquals(new Integer[]{4, 6, 5, 2, 3, 1}, tree.postOrder());
    }

    @Test
    public void testBreadthOrder() {
        assertEquals("This should return the tree in breadth-first order.",
                "1, 3, 5, 9, 12, 2]",
            tree.breadthFirst().toString()
        );
    }

//    @Test
//    public void testMaximumValue() {
//        assertEquals("This should return the maximum integer value in our Tree, which is 12.",
//                12,
//                tree.findMaximumValue());
//    }
//    @Test
//    public void testmaxWeird() {
//        System.out.println(tree.findMaxWeird());
//    }

}