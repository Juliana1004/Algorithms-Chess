package jala.university.academic;

/**
 * Clase que implementa el algoritmo de ordenamiento de inserción.
 */
public class InsertionSort implements IAlgorithm {
    private final String[] sortingList;

    public InsertionSort(String[] list) {
        this.sortingList = list;
    }

    @Override
    public String[] sort(String[] listToSort) {
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
        }
        return listToSort;
    }

    public String[] getSortingList() {
        return sortingList;
    }
}