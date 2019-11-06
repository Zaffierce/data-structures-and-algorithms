package code401challenges.graph;

import java.util.*;

public class BreadthFirst<T> {

    Graph graph = new Graph();

    public HashSet<Node<T>> breadthFirst(Node<T> node) {
        LinkedList<Node<T>> queue = new LinkedList<>();
        HashSet<Node<T>> seen = new HashSet<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node temp = queue.poll();
            HashSet neighbors = graph.getNeighbors(temp);
            seen.add(temp);
            for (Object neighbor : neighbors) {
                if (!seen.contains(neighbor)) {
                    queue.add((Node<T>) neighbor);
                }
            }
        }
        return seen;
    }
}
