package code401challenges.utilities;

import code401challenges.stacksandqueues.Node;
import code401challenges.stacksandqueues.Queue;

public class AnimalShelter<T> {

//    Queue<Dog> dog = new Queue();
//    Queue<Cat> cat = new Queue();

    Node<T> front;
    Node<T> last;


    public static void main (String[] args) {
        Queue<Dog> dog = new Queue();
        Queue<Cat> cat = new Queue();

        cat.enqueue(Cat, "Lucy");
        cat.enqueue("Lola");
        cat.enqueue("Pip");

        dog.enqueue("Frank");
        dog.enqueue("Teddy");
        dog.enqueue("Olive");

        System.out.println(dog.toString());

        dequeue("cat");

    }

    public T dequeue(String pref){
        if (this.front == null) {
            System.out.println("Null Head");
        }
        if (pref == null) {
            System.out.println("No type");
        }
        Node<T> next_node = this.front;
        this.front = this.front.next;
        return next_node.value;
        }


}
