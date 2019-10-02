package code401challenges.stacksandqueues;

// Used a video for reference that Sharina provided
// https://www.youtube.com/watch?v=STmHKGt2G-4&feature=youtu.be

public class Stack<T> {

    Node<T> top;
    Node<T> head;

    //Want to make this Type T but forget the syntax.  Will come back.
    public void push(T data) {
        Node<T> newNode = new Node(data);
        newNode.next = head;
        this.head = newNode;
    }

    public T peek() throws Exception {
        if (this.head == null) {
            System.out.println("Error:  Stack is empty.");
            throw new Exception("Error:  Stack is empty");
        }
        return this.head.value; // Just returns the head value
    }

    public T pop() throws Exception {
        if (this.head == null) {
            System.out.println("Error:  Stack is empty.");
            throw new Exception("Error:  Stack is empty");
        }
        Node<T> next_node = this.head; // Setting a new variable to head's next.
        this.head = this.head.next; // Now we're setting head to next value
        return next_node.value;
    }

    @Override
    public String toString() {
        Node n = head;
        StringBuilder result = new StringBuilder();
        result.append("Stacked LinkedList (LIFO):");
        while (n != null) {
            result.append(" -> "+n.value);
            n = n.next;
        }
        return result.toString();
    }

    public static void main (String[] args) throws Exception {
        Stack newStack = new Stack();

        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
        System.out.println(newStack.toString());
        System.out.println("Peeking the stack, head value is: " + newStack.peek());
        System.out.println("Popping the stack, value is : " + newStack.pop());
        System.out.println(newStack.toString());
        System.out.println("Peeking the stack, head value is: " + newStack.peek());
        System.out.println("Popping the stack, value is : " + newStack.pop());
        System.out.println(newStack.toString());
        System.out.println("Peeking the stack, head value is: " + newStack.peek());
        System.out.println("Popping the stack, value is : " + newStack.pop());
        System.out.println(newStack.toString());
    }
}
