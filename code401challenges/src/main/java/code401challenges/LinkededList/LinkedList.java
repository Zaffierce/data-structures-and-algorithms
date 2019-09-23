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
//        if (val == Integer.parseInt(null)) {
//            return;
//        }
        if (val < 0 ) {
            System.out.println("Value was less than 0");
            return;
        }
        Node new_node = new Node(val);
        new_node.next = head;
        head = new_node;
    }

    public boolean includes(int val){
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

//    public static void main(String[] args) {
//        LinkedList link = new LinkedList();
//        link.head = new Node(1);
//        int var = -1;
//        link.insert(1);
////        link.insert(2);
////        link.insert(4);
////        link.insert(8);
////        System.out.println(link.includes(10)); //This returns false as 10 is not in the linked list.
////        System.out.println(link.includes(8)); //This returns true as 8 is in our list.
//
//
//        System.out.println(link.toString());
//    }

    public String toString(){
        Node n = head;
        StringBuilder result = new StringBuilder();
        while (n != null) {
            result.append("\n"+Integer.toString(n.data));
            n = n.next;
        }
        return result.toString();
    }

}