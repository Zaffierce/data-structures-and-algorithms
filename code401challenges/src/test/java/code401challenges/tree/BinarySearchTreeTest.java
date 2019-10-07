package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    BinarySearchTree bst = new BinarySearchTree();
    Tree tree = new Tree();

    @Before
    public void setUp() throws Exception {
        bst.add(4);
        bst.add(10);
        bst.add(3);
        bst.add(20);
        bst.add(11);
        bst.add(12);
        bst.add(1);
    }

    @Test
    public void emptyTree() {
        BinarySearchTree test = new BinarySearchTree();
        assertNull(test.root);
    }

    @Test
    public void containsTrue() {
        assertTrue(bst.contains(3));
    }

    @Test
    public void containsFalse() {
        assertFalse(bst.contains(99));
    }

    /*
    Currently these 3 tests below just print results to console.  Need to change the return types and make them testable.
     */

    @Test
    public void testInOrder() {
//        tree.inOrder(bst.root);
    }

    @Test
    public void testPreOrder() {
//        tree.preOrder(bst.root);
    }

    @Test
    public void testPostOrder() {
//        tree.postOrder(bst.root);
    }
}