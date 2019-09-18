package code401challenges;

import code401challenges.ArrayShift.ArrayShift;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayShiftTest {

        @Test
        public void testInsertArrayShiftEven() {
            int[] paulasAnswer = new int[]{2,4,6,8};
            assertArrayEquals(
                    "the resulting array should be [2, 4, 8, 6, 8]",
                    paulasAnswer,
                    ArrayShift.insertShiftArray(new int[]{2, 4, 6, 8}, 8)
            );
        }

    @Test
    public void testInsertShiftArray() {
        int[] rightAnswer = new int[]{1,2,6,3,4,5};
        assertArrayEquals(
                "This should insert in the middle",
                rightAnswer,
                ArrayShift.insertShiftArray(new int[]{1,2,3,4,5},6)
        );
        //Why does this method work?  Am confused as to what's happening here.
//        assertEquals(
//                "This should insert in the middle",
//                "[1, 2, 6, 3, 4, 5]",
//                Arrays.toString(ArrayShift.insertShiftArray(new int[]{1,2,3,4,5},6)));
    }
}