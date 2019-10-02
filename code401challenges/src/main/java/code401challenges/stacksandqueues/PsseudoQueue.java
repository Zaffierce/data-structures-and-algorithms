//package code401challenges.stacksandqueues;
//
//import java.util.NoSuchElementException;
//
//public class PsseudoQueue {
//
//
//    private Stack enQStack = new Stack();
//    private Stack deQStack = new Stack();
//
//    public void enqueue(int value) {
//        this.enQStack.push(value);
//    }
//
//    public int dequeue() throws Exception {
//        if (this.deQStack.top == null) {
//            while (this.enQStack.top != null) {
//                this.deQStack.push(this.enQStack.pop());
//            }
//            if (this.deQStack.top == null) {
//                throw new NoSuchElementException();
//            }
//        }
//        return this.deQStack.pop();
//    }
//
//}