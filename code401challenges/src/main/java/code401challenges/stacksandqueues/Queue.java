package code401challenges.stacksandqueues;

public class Queue {

    Node front;
    Node last;
    int size;

    public Node getNewNode(int val) {
        Node newNode = new Node(val);
        newNode.value = val;
        return newNode;
    }

    public void enqueue(int data) {
        if (this.last == null) {
            front = last = getNewNode(data);
            size++;
            return;
        }
        size++;
        last.next = getNewNode(data);
        last = last.next;
    }

    public int dequeue() throws Exception {
        if (this.front == null) {
            throw new Exception("Error:  Queue is empty.");
        }
        Node next_node = this.front;
        this.front = this.front.next;
        return next_node.value;
    }

    public int stackPeek() throws Exception {
        if (this.front == null) {
            System.out.println("Error:  Stack is empty.");
            throw new Exception("Error:  Stack is empty");
        }
        return this.front.value; // Just returns the head value
    }

    @Override
    public String toString() {
        Node n = front;
        StringBuilder result = new StringBuilder();
        result.append("Queued LinkedList (FIFO): ");
        while (n != null) {
            result.append(n.value + " <- ");
            n = n.next;
        }
        return result.toString();
    }



    public static void main (String[] args) throws Exception {
        Queue newQueue = new Queue();

        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        System.out.println(newQueue.toString());
        System.out.println("Peeking the queue, head value is :" +newQueue.stackPeek());
        System.out.println("Dequeueing the queue, value is : " + newQueue.dequeue());
        System.out.println(newQueue.toString());
        System.out.println("Peeking the queue, head value is :" +newQueue.stackPeek());
        System.out.println("Dequeueing the queue, value is : " + newQueue.dequeue());
        System.out.println(newQueue.toString());
    }
}
