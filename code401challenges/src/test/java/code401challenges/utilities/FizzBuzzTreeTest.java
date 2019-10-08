package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class FizzBuzzTreeTest {

    FizzBuzzTree tree = new FizzBuzzTree();

    @Before
    public void setUp() throws Exception {
        FizzBuzzTree.Node node15 = new FizzBuzzTree.Node("15", new FizzBuzzTree.Node(null), new FizzBuzzTree.Node("10"));
        FizzBuzzTree.Node node3 = new FizzBuzzTree.Node("3", new FizzBuzzTree.Node("7"), new FizzBuzzTree.Node("9"));
        FizzBuzzTree.Node rootNode = new FizzBuzzTree.Node("1", node3, node15);
        tree = new FizzBuzzTree();
        tree.root = rootNode;
    }

    @Test
    public void add() {
    }

    @Test
    public void addRecursive() {
    }

    @Test
    public void preOrder() {
        System.out.println(Arrays.toString(tree.preOrder()));
    }
}