package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    Queue<Integer> newQueue = new Queue();
    @Before
    public void setup(){

        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
    }

    @Test
    public void enqueue() {
        newQueue.enqueue(4);
        assertEquals("This should return 1 <- 2 <- 3 <- 4 <- ",
                "Queued LinkedList (FIFO): 1 <- 2 <- 3 <- 4 <- ",
                newQueue.toString()
                );
    }

    @Test
    public void dequeue() throws Exception {
        Integer answer = 1;
        assertEquals("This will return the first value of our queue",
                answer,
                newQueue.dequeue());
    }

    @Test
    public void stackPeek() throws Exception {
        Integer answer = 1;
        assertEquals("This should return the first value of our queue",
                answer,
                newQueue.stackPeek());
    }

    @Test
    public void testToString() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        testQueue.enqueue(2);

        assertEquals("This should return our values in a string.",
                "Queued LinkedList (FIFO): 1 <- 2 <- ",
                testQueue.toString());
    }
}