package code401challenges.stacksandqueues;


public class Node {
//    Node head;

    int value;
    Node next;

    Node(int value) {
        this(value, null);
    }

    Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
