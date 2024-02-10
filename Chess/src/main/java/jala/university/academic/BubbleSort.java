package jala.university.academic;

import java.util.Objects;
/**
 * Clase que implementa el algoritmo de ordenamiento de burbuja.
 */
public class BubbleSort implements IAlgorithm {
    private final String[] sortingList;
    public String[] getSortingList() {
        return sortingList;
    }
    public BubbleSort(String[] list){
        this.sortingList = list;
    }
    @Override
    public String[] sort(String[] listToSort) {
        boolean sorted;
        do{
            sorted = true;
            for (int i = 0; i < listToSort.length - 1; i++) {
                if (listToSort[i].matches(".*\\d.*")){
                    if (Integer.parseInt(listToSort[i]) > Integer.parseInt(listToSort[i + 1])) {
                        String valorTemp = listToSort[i];
                        if (!Objects.equals(valorTemp, listToSort[i + 1])){
                            listToSort[i] = listToSort[i + 1];
                            listToSort[i + 1] = valorTemp;
                        }
                        sorted = false;
                    }
                } else {
                    if (listToSort[i].charAt(0) > listToSort[i + 1].charAt(0)) {
                        String valorTemp = listToSort[i];
                        if (valorTemp.charAt(0) !=listToSort[i + 1].charAt(0)){
                            listToSort[i] = listToSort[i + 1];
                            listToSort[i + 1] = valorTemp;
                        }
                        sorted = false;
                    }
                }
            }
        } while (!sorted);
        return listToSort;
    }
}

