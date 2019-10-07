package code401challenges.stacksandqueues;


public class Node<T> {
//    Node head;

    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

//    Node(T value, Node next) {
//        this.value = value;
//        this.next = next;
//    }
}
