package code401challenges.LinkededList;

public class LinkedList {
    //Used the following links to help me -
    // https://www.geeksforgeeks.org/linked-list-set-1-introduction/
    // https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

    Node head;

    public static class Node {
        Integer data;
        Node next;
        Node(Integer d){
            data = d;
            next = null;
        }
    }

    public void insert(int val) {
        if (val < 0 ) {
            System.out.println("Value was less than 0");
            return;
        }
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    public boolean includes(int val) {
        Node n = head;
        boolean result = false;
        while (n != null) {
            if (n.data == val) {
                result = true;
            }
            n = n.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedList link_before = new LinkedList();
//        link.head = new Node(1);
//        link.insert(3);
//        link.insert(10);
//        link.insert(2);
//        link.insert(1);
        link_before.insert(3);
        link_before.insert(2);
        link_before.insert(1);
        link_before.insertBefore(3,10);
        System.out.println(link_before.toString());

        LinkedList link_after = new LinkedList();
        link_after.insert(3);
        link_after.insert(10);
        link_after.insert(2);
        link_after.insert(1);
        System.out.println(link_after.toString());
//        link.insertBefore(3, 10);


//        link.head = new Node(1); //Head
//        link.insert(2); //Third, or fourth if insertBefore
//        link.insert(4); //Second
//        link.append(12); //This adds 12 to the end.
//        link.insert(8); //First
//        link.insertBefore(2, 88); //Third
//        link.insertAfter(2, 99);
////        System.out.println(link.includes(10)); //This returns false as 10 is not in the linked list.
////        System.out.println(link.includes(8)); //This returns true as 8 is in our list.
//
//

    }

    public String toString() {
        Node n = head;
        StringBuilder result = new StringBuilder();
        while (n != null) {
            result.append("\n"+Integer.toString(n.data));
            n = n.next;
        }
        return result.toString();
    }

    public void append(int val) {
        Node new_node = new Node(val);
        new_node.next = null;
        Node end = head;
        while(end.next != null)
            end = end.next;
        end.next = new_node;
    }

    public void insertBefore(int val, int newVal) {
        Node n = head;
        while (n.next != null) {
            if (n.next.data.equals(val)) {
                Node new_node = new Node(newVal);
                new_node.next = n.next;
                n.next = new_node;
                return;
            }
            n = n.next;
        }
    }

    public void insertAfter(int val, int newVal) {
        Node current = head;
        while(current.next != null) {
            if (current.data.equals(val)){
                Node new_node = new Node(newVal);
                new_node.next = current.next;
                current.next = new_node;
                return;
            }
            current = current.next;
        }
    }

}