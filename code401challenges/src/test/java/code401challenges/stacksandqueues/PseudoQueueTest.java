package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    PseudoQueue test = new PseudoQueue();
    @Before
    public void setup() throws Exception {
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
    }

    @Test
    public void dequeue() throws Exception {
        assertEquals("This should return 3",
                3,
                test.dequeue());
    }
}