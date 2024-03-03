package jala.university.academic.algorithms;

import static jala.university.academic.utils.Utilizes.*;

/**
 * Clase que implementa el algoritmo de ordenamiento de burbuja.
 */
public class BubbleSort implements IAlgorithm {
    private final String[] sortingList;
    private long time;

    public BubbleSort(String[] list) {
        this.sortingList = list;
    }

    @Override
    public String[] sort(String[] listToSort, int speed) {
        int startTime =0;
        boolean sorted;
        do {
            sorted = true;
            for (int idxArray = 0; idxArray < listToSort.length - 1; idxArray++) {
                if (listToSort[idxArray].matches(".*\\d.*")) {
                    if (Integer.parseInt(listToSort[idxArray]) > Integer.parseInt(listToSort[idxArray + 1])) {
                        String valorTemp = listToSort[idxArray];
                        listToSort[idxArray] = listToSort[idxArray + 1];
                        listToSort[idxArray + 1] = valorTemp;
                        sorted = false;
                    }
                } else {
                    if (listToSort[idxArray].charAt(0) > listToSort[idxArray + 1].charAt(0)) {
                        String valorTemp = listToSort[idxArray];
                        listToSort[idxArray] = listToSort[idxArray + 1];
                        listToSort[idxArray + 1] = valorTemp;
                        sorted = false;
                    }
                }
                startTime+=1;
                sleep(speed);
            }
        } while (!sorted);
        time = calculateElapsedTime(startTime,speed);
        return listToSort;
    }

    public String[] getSortingList() {
        return sortingList;
    }

    public long getTime() {
        return time;
    }
}