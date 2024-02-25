package jala.university.academic;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class InsertionSortTest {
    @Test
    void sortTest() {
        InsertionSort insertionSort = new InsertionSort(new String[]{"c", "a", "b", "d"});
        String[] sortedList = insertionSort.sort(insertionSort.getSortingList(), 500);
        String[] expected = {"a", "b", "c", "d"};
        assertArrayEquals(expected, sortedList);
    }
}
