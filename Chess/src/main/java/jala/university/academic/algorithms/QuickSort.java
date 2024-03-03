package jala.university.academic.algorithms;

import static jala.university.academic.utils.Utilizes.*;

/**
 * Clase que implementa el algoritmo de ordenamiento de quick.
 */

public class QuickSort implements IAlgorithm {
    public int num = 0;
    private final String[] sortingList;
    private long time;
    public QuickSort(String[] list) {
        this.sortingList = list;
    }
    public String[] getSortingList() {
        return sortingList;
    }
    public long getTime() {
        return time;
    }
    private void quickSort(String[] array, int start, int end,int speed) {
        num+=1;
        sleep(speed);
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex - 1,speed);
            quickSort(array, partitionIndex + 1, end,speed);
        }
    }
    private int partition(String[] array, int start, int end) {
        String pivot = array[end];
        int idxStart = start - 1;
        for (int idxEnd = start; idxEnd < end; idxEnd++) {
            if (compareValues(array[idxEnd], pivot) <= 0) {
                idxStart++;
                swapElements(array, idxStart, idxEnd);
            }
        }
        swapElements(array, idxStart + 1, end);
        return idxStart + 1;
    }
    private int compareValues(String a, String b) {
        if (isNumericValue(a) && isNumericValue(b)) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        } else {
            return a.compareTo(b);
        }
    }
    private void swapElements(String[] array, int min, int high) {
        String temp = array[min];
        array[min] = array[high];
        array[high] = temp;
    }
    private boolean isNumericValue(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    @Override
    public String[] sort(String[] values, int speed) {
        quickSort(values, 0, getSortingList().length - 1,speed);
        time = calculateElapsedTime(num,speed);
        return getSortingList();
    }
}