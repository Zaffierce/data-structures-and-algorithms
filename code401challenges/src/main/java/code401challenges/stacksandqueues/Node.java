package code401challenges.stacksandqueues;


public class Node<T> {
//    Node head;

    public T value;
    public Node<T> next;

    Node(T value) {
        this(value, null);
    }

    Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }
}
