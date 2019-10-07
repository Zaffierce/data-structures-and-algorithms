package code401challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {


    Stack<T> enQStack = new Stack<>();
    Stack<T> deQStack = new Stack<>();

    public void enqueue(T value) throws Exception {
        this.enQStack.push(value);
    }

    public T dequeue() throws Exception {
        if(!deQStack.isEmpty()){
            while (!enQStack.isEmpty()){
                deQStack.push(enQStack.pop());
            }
            if (deQStack.isEmpty()){
                throw new NoSuchElementException();
            }
        }
    return deQStack.pop();
    }
}