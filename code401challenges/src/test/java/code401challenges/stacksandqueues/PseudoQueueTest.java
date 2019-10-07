package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    PseudoQueue<Integer> test = new PseudoQueue();
    @Before
    public void setup() throws Exception {
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
    }

    @Test
    public void dequeueTest() throws Exception {
        Integer answer = 1;
        assertEquals("This should return 1",
                answer,
                test.dequeue());
    }

    @Test
    public void enqueueAndDequeueTest() throws Exception {
        Integer answer = 4;
        test.enqueue(4);
        test.dequeue();
        test.dequeue();
        test.dequeue();
        assertEquals("This should return 4",
                answer,
                test.dequeue());
    }
}