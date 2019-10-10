package code401challenges.utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

    AnimalShelter shelter = new AnimalShelter();
    @Before
    public void setup() {
        shelter.enqueue(new Cat("Lucy"));
        shelter.enqueue(new Cat("Lola"));
        shelter.enqueue(new Cat("Pip"));
        shelter.enqueue(new Dog("Ginger"));
        shelter.enqueue(new Dog("Teddy"));
    }

    @Test
    public void enqueueAndDequeueTest() {
        String answer = "Lucy";
        shelter.enqueue(new Cat("Snowball"));
        assertEquals("This should enter the in Snowball and then return our first cat, which is Lucy.",
                answer,
        shelter.dequeue(Cat.class).toString());
    }

    @Test
    public void dequeueMultiple() {
        String cat = "Pip";
        shelter.dequeue(Cat.class);
        shelter.dequeue(Cat.class);
        assertEquals("This should return Pip",
                cat,
                shelter.dequeue(Cat.class).toString());
    }
}