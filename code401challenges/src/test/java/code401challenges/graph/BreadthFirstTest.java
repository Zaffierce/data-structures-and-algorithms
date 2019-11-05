package code401challenges.graph;

import org.junit.Test;

import static org.junit.Assert.*;

public class BreadthFirstTest {

    Graph<Integer> graph = new Graph<>();
    BreadthFirst<Integer> breadthFirst = new BreadthFirst<>();

    @Test
    public void saveItRunItSeeWhatHappens() {
        //No idea.  Wee... nullpointers :)
        Node<Integer> node1 = graph.addNode(43);
        Node<Integer> node2 = graph.addNode(23);
        graph.addNode(8);
        graph.addNode(17);
        graph.addEdge(node1, node2, 1); //what is weight?

        breadthFirst.breadthFirst(node1);
    }

}