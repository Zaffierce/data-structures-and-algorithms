package code401challenges.graph;

import java.util.HashSet;
import java.util.Set;

public class Graph<T> {
    HashSet<Node<T>> nodesInSet;

    public Graph() {
        this.nodesInSet = new HashSet<>();
    }

    public Node<T> addNode(T value) {
        Node<T> node = new Node<>(value);
        nodesInSet.add(node);
        return node;
    }

    public HashSet<Node<T>> getNodesInSet() { return nodesInSet; }

    public HashSet<T> getNeighbors (Node<T> node) {
        HashSet<T> neighbors = new HashSet<>();
//        Set<T> neighbors = new HashSet<T>();
        for (Edge<T> potentialNeighbor : node.edges) {
            if (!neighbors.contains(potentialNeighbor.node.value)){
                neighbors.add(potentialNeighbor.node.value);
            }
        }
        return neighbors;
    }

    public void addEdge(Node<T> node1, Node<T> node2, int weight) {
        if (nodesInSet.contains(node1) && nodesInSet.contains(node2)) {
            node1.addEdgeToListOfEdges(node2, weight);
            node2.addEdgeToListOfEdges(node1, weight);
        }
    }

    public int getSize() {
        return nodesInSet.size();
    }
}
