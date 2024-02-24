package jala.university.academic;


/**
 * Clase que implementa el algoritmo de ordenamiento de inserción.
 */
public class InsertionSort extends Algorithm {

    public InsertionSort(String[] list) {
        super(list);
    }

    public String[] sort(String[] listToSort, int speed) {
        long startTime = System.currentTimeMillis();
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
        setTime(System.currentTimeMillis() - startTime);
        return listToSort;
    }

}