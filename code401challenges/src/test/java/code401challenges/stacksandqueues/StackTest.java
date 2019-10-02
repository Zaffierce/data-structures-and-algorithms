package code401challenges.stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    Stack<Integer> newStack = new Stack();

    @Before
    public void setup() {
        newStack.push(1);
        newStack.push(2);
        newStack.push(3);
    }

    @Test
    public void stackPush() {
        newStack.push(4);
        Integer answer = 4;
        assertEquals("This should push 4 to the top of our stack.",
                answer,
                newStack.head.value);
    }

    @Test
    public void stackPeek() throws Exception {
        Integer answer = 3;
        assertEquals("This should return the top",
                answer,
                newStack.peek());
    }

    @Test
    public void stackPop() {
        Integer answer = 3;
        assertEquals("This should pop the first value in the stack off",
                answer,
                newStack.head.value);
    }

    @Test
    public void testToString() {
        Stack testStack = new Stack();
        testStack.push(1);
        testStack.push(2);

        assertEquals("This should return our values in a string",
                "Stacked LinkedList (LIFO): -> 2 -> 1",
                testStack.toString());
    }
}