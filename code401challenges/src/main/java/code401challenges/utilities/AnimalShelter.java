package code401challenges.utilities;

import code401challenges.stacksandqueues.Queue;

import java.util.LinkedList;

public class AnimalShelter {
    private LinkedList<Dog> dogQueue = new LinkedList<>();
    private LinkedList<Cat> catQueue = new LinkedList<>();

    public void enqueue(Dog d) {
        this.dogQueue.addLast(d);
    }

    public void enqueue(Cat c) {
        this.catQueue.addLast(c);
    }

    public <T> T dequeue(Class<T> type) {
        if(type == Dog.class) {
            return (T)this.dogQueue.removeFirst();
        } else if (type.equals(Cat.class)) {
            return (T)this.catQueue.removeFirst();
        } else {
            throw new IllegalArgumentException("Only Dogs or Cats please!");
        }
    }

}
