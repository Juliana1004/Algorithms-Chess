package jala.university.academic;

import jala.university.academic.algorithms.BubbleSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void sortTest() {
        BubbleSort bubbleSort = new BubbleSort(new String[]{"3", "1", "4", "1", "5", "9", "2", "6"});
        String[] sortedList = bubbleSort.sort(bubbleSort.getSortingList(), 500);
        String[] expected = {"1", "1", "2", "3", "4", "5", "6", "9"};
        assertArrayEquals(expected, sortedList);
    }
}
