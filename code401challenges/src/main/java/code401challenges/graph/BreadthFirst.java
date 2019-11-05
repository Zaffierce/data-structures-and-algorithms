package code401challenges.graph;

import java.util.*;

public class BreadthFirst<T> {
    /*
    401 Java Student by day, SQL Wizard by night.
     */

    public Node root;

    public Set<Node<T>> breadthFirst(Node node) {
        Queue<Node<T>> queue = new LinkedList<>();
        Set<Node<T>> seen = new HashSet<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            Node temp = queue.poll();
            if (!seen.contains(temp)) {
                seen.add((Node<T>) temp.value);
                queue.add((Node<T>) temp.value);
            }
        }
        return seen;
    }
}
