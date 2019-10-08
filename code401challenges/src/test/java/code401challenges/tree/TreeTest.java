package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TreeTest {

    Tree tree = new Tree();

    @Before
    public void setUp() throws Exception {
        Node node5 = new Node(5, new Node(6), null);
        Node node2 = new Node(2, new Node(4), node5);
        Node rootNode = new Node(1, node2, new Node(3));
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

}