//package code401challenges.HashTable;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class HashTableTest {
//
//    HashTable table;
//
//    @Before
//    public void setUp() throws Exception {
//        table = new HashTable();
//        table.add("Michelle", 1);
//        table.add("Nicholas", 2);
//        table.add("Ginger", 3);
//        table.add("Jeff", 4);
//    }
//
//    @Test
//    public void testIfExistsFalse() {
//        assertEquals("This should return false, as John was never added in.",
//                false,
//                table.contains("John"));
//    }
//
//    @Test
//    public void testIfExistsTrue() {
//        assertEquals("This should return true, as Jeff was added in.",
//                true,
//                table.contains("Jeff"));
//    }
//
//    @Test
//    public void testGettingKey() {
//        assertEquals("This should return the key of Michelle",
//                1,
//                table.get("Michelle"));
//    }
//
//}