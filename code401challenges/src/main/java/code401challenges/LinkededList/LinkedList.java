package code401challenges.LinkededList;

public class LinkedList {
    //Used the following links to help me -
    // https://www.geeksforgeeks.org/linked-list-set-1-introduction/
    // https://www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/

    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this(data, null);
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void insertHead(int val) {
        this.head = new Node(val, this.head);
    }

    public void insert(int val) {
        Node new_node = new Node(val);
        if (this.head == null) {
            this.head = new_node;
//            insertHead(val);
        } else {
            Node last_node = this.head;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = new_node;
        }
    }

    public boolean includes(int val) {
        Node n = head;
//        boolean result = false;
        while (n != null) {
            if (n.data == val) {
                return true;
            }
            n = n.next;
        }
        return false;
    }

    public String toString() {
        Node n = head;
        StringBuilder result = new StringBuilder();
        result.append("LL Results: ");
        while (n != null) {
            result.append(" "+Integer.toString(n.data));
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
            if (n.next.data == val) {
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
            if (current.data == val){
                Node new_node = new Node(newVal);
                new_node.next = current.next;
                current.next = new_node;
                return;
            }
            current = current.next;
        }
    }

    public int kthFromEnd(int k) {
        int llSizeCounter = 0;
        int result = 0;
        Node currNode = this.head;

        while(currNode != null) {
            currNode = currNode.next;
            llSizeCounter++;
        }
        llSizeCounter = llSizeCounter - k;
        currNode = this.head;
        int stepper = 0;
        while (stepper < k) {
            stepper++;
            currNode = currNode.next;
            result = currNode.data;
        }
        return result;
    }

    public static LinkedList mergeLists(LinkedList ll1, LinkedList ll2) {
        LinkedList ll3 = new LinkedList();
        ll3.insertHead(1);

        Node currNode1 = ll1.head;
        Node currNode2 = ll2.head;
        Node currNode3 = ll3.head;

        if (currNode1 == null || currNode2 == null) {
            throw new IllegalArgumentException("Empty");
        } else {
            while (currNode1 != null && currNode2 != null) {
                if (currNode1 != null) {
                    currNode3.next = currNode1;
                    currNode3 = currNode3.next;
                    currNode1 = currNode1.next;
                }
                if (currNode2 != null) {
                    currNode3.next = currNode2;
                    currNode3 = currNode3.next;
                    currNode2 = currNode2.next;
                }
            }
        }
        ll3.head = ll3.head.next;

        return ll3;
    }



}