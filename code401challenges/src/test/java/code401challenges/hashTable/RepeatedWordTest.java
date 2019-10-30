package code401challenges.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedWordTest {

    RepeatedWord repeatedWord = new RepeatedWord();

    @Test
    public void testString() {
        String test = "His name was Bob and he was the best Bob around.";
        assertEquals("This should return was",
                "was",
                repeatedWord.RepeatedWord(test));
    }

    @Test
    public void testNoDuplicates() {
        String test = "This string does not contain any duplicates.";
        assertEquals("This should return null",
                null,
                repeatedWord.RepeatedWord(test));
    }

    @Test
    public void testExtraDuplicates() {
        String test = "This is a very beautiful sentence, but is a very simple sentence.";
        assertEquals("This should return is, as is... is the first duplicated word.",
                "is",
                repeatedWord.RepeatedWord(test));
    }


    //Todo:  Attempt to implement regEx method and see if I can get that to play nicely.
//    @Test
//    public void testPunctiation() {
//        String test = "Hello Bob, are you doing well today, Bob?";
//        assertEquals("This should return Bob",
//                "Bob",
//                repeatedWord.RepeatedWord(test));
//    }



}