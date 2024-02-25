package jala.university.academic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class QuickSortTest {

    @Test
    void sortTest() {
        QuickSort quickSort = new QuickSort(new String[]{"3", "1", "4", "1", "5", "9", "2", "6"});
        String[] sortedList = quickSort.sort(quickSort.getSortingList(), 500);
        String[] expected = {"1", "1", "2", "3", "4", "5", "6", "9"};
        assertArrayEquals(expected, sortedList);
    }
}
