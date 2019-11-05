package code401challenges.graph;

import java.util.LinkedList;
import java.util.List;

public class Node<T> {

    T value;
    List<Edge<T>> edges;

    public Node(T value) {
        this.value = value;
        this.edges = new LinkedList<>();
    }

    public Node() {
        this.edges = new LinkedList<>();
    }

    public boolean addEdgeToListOfEdges(Node<T> nodeBeingPointedTo, int weight) {
        Edge<T> newEdge = new Edge<>(weight, nodeBeingPointedTo);
        return edges.add(newEdge);
    }

    public Node(T value, List<Edge<T>> neighbors){
        this.value = value;
        this.edges = neighbors;
    }

}
