package code401challenges.stacksandqueues;

public class Queue<T> {

    Node<T> front;
    Node<T> last;

//    public Node getNewNode(T val) {
//        Node newNode = new Node<T>(val);
//        newNode.value = val;
//        return newNode;
//    }

    public void enqueue(T data) {
        if (this.last == null) {
            front = new Node<T>(data);
            last = front;
            return;
        }
        last.next = new Node<T>(data);
        last = last.next;
        /*
        Node newNode = new Node();
        back.next = newNode;
        newNode.next = null;
         */
    }

    public T dequeue() throws Exception {
        if (this.front == null) {
            throw new Exception("Error:  Queue is empty.");
        }
        Node<T> next_node = this.front;
        this.front = this.front.next;
        return next_node.value;
    }

    public T stackPeek() throws Exception {
        if (this.front == null) {
            System.out.println("Error:  Queue is empty.");
            throw new Exception("Error:  Queue is empty");
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
