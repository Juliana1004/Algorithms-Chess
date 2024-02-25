package jala.university.academic;

import static jala.university.academic.Utilizes.*;

/**
 * Clase que implementa el algoritmo de ordenamiento de inserción.
 */
public class InsertionSort implements IAlgorithm {
    private final String[] sortingList;
    private long time;

    public InsertionSort(String[] list) {
        this.sortingList = list;
    }

    @Override
    public String[] sort(String[] listToSort, int speed) {
        long startTime = getCurrentTimeMillis();
        for (int idx = 0; idx < listToSort.length - 1; idx++) {
            int min = idx;
            for (int scan = idx + 1; scan < listToSort.length; scan++) {
                if (listToSort[idx].matches(".*\\d.*")) {
                    if (Integer.parseInt(listToSort[scan]) < Integer.parseInt(listToSort[min])) {
                        min = scan;
                    }
                } else {
                    if (listToSort[scan].compareTo(listToSort[min]) < 0) {
                        min = scan;
                    }
                }
            }
            String temp = listToSort[idx];
            listToSort[idx] = listToSort[min];
            listToSort[min] = temp;
            sleep(speed);
        }
        time = calculateElapsedTime(startTime);
        return listToSort;
    }

    public long getTime() {
        return time;
    }

    public String[] getSortingList() {
        return sortingList;
    }
}