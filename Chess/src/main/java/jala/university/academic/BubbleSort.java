package jala.university.academic;

/**
 * Clase que implementa el algoritmo de ordenamiento de burbuja.
 */
public class BubbleSort extends Algorithm {

    public BubbleSort(String[] list) {
        super(list);
    }

    public String[] sort(String[] listToSort, int Speed) {
        long startTime = System.currentTimeMillis();
        boolean sorted;
        do {
            sorted = true;
            for (int i = 0; i < listToSort.length - 1; i++) {
                if (listToSort[i].matches(".*\\d.*")) {
                    if (Integer.parseInt(listToSort[i]) > Integer.parseInt(listToSort[i + 1])) {
                        String valorTemp = listToSort[i];
                        listToSort[i] = listToSort[i + 1];
                        listToSort[i + 1] = valorTemp;
                        sorted = false;
                    }
                } else {
                    if (listToSort[i].charAt(0) > listToSort[i + 1].charAt(0)) {
                        String valorTemp = listToSort[i];
                        listToSort[i] = listToSort[i + 1];
                        listToSort[i + 1] = valorTemp;
                        sorted = false;
                    }
                }
                sleep(Speed);
            }
        } while (!sorted);
        setTime(System.currentTimeMillis() - startTime);
        return listToSort;
    }
}