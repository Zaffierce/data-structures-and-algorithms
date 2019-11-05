package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GraphTest {

    Graph<Integer> graph = new Graph<>();

    @Before
    public void setUp() throws Exception {
        Graph<Integer> graph = new Graph<>();
        graph.addNode(3);
        graph.addNode(7);
        graph.addNode(9);
        Node<Integer> node1 = graph.addNode(1);
        Node<Integer> node2 = graph.addNode(12);
        graph.addEdge(node1, node2,10);
    }

    @Test
    public void testContains() {
        Node<Integer> node3 = graph.addNode(99);
        Node<Integer> node4 = graph.addNode(100);
        graph.addEdge(node3, node4, 100);
        Set<Integer> containNode = graph.getNeighbors(node3);
        assertEquals("This should contain node4",
                true,
                containNode.contains(node4));
        //and it fails.  Why?
    }
}