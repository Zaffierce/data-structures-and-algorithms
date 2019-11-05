package code401challenges.graph;

public class Edge<T> {

    public int weight;
    public Node<T> node;

    public Edge(int weight, Node<T> node) {
        this.weight = weight;
        this.node = node;
    }
}
