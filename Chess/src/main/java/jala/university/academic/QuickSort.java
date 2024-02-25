package jala.university.academic;

import static jala.university.academic.Utilizes.*;

/**
 * Clase que implementa el algoritmo de ordenamiento de quick.
 */

public class QuickSort implements IAlgorithm {
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

    private void quickSort(String[] array, int start, int end, int speed) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex - 1, speed);
            quickSort(array, partitionIndex + 1, end, speed);
            sleep(speed);
        }
    }

    private int partition(String[] array, int start, int end) {
        String pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (compareValues(array[j], pivot) <= 0) {
                i++;
                swapElements(array, i, j);
            }
        }
        swapElements(array, i + 1, end);
        return i + 1;
    }

    private int compareValues(String a, String b) {
        if (isNumericValue(a) && isNumericValue(b)) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        } else {
            return a.compareTo(b);
        }
    }

    private void swapElements(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
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
        long startTime = getCurrentTimeMillis();
        quickSort(values, 0, getSortingList().length - 1, speed);
        time = calculateElapsedTime(startTime);
        return getSortingList();
    }
}