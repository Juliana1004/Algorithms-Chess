package jala.university.chess.algorithm;

import jala.university.chess.array.Piece;

public class QuickSort extends AbstractAlgorithm {
    private final int piecesAmount;
    private final Piece[] sortingList;
    public int num = 0;
    private long time;

    public QuickSort(Piece[] list, int pieces, String color, String type) {
        super(list, color, type);
        this.sortingList = list;
        this.piecesAmount = pieces;
    }

    public Piece[] getSortingList() {
        return sortingList;
    }

    public long getTime() {
        return time;
    }

    public void sortTable(Piece[] listToSort, int speed) {
        updateAndShowTable(pieceToString(listToSort, piecesAmount));
        quickSort(listToSort, 0, getSortingList().length - 1, speed);
        showTablePiece();
        time = calculateElapsedTime(num, speed);
    }

    public void quickSort(Piece[] array, int start, int end, int speed) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);
            quickSort(array, start, partitionIndex - 1, speed);
            quickSort(array, partitionIndex + 1, end, speed);
            System.out.println("Iteración: " + num);
            updateAndShowTable(pieceToString(array, piecesAmount));
            num += 1;
            sleep(speed);
        }
    }

    public int partition(Piece[] array, int start, int end) {
        Piece pivot = array[end];
        int idxStart = start - 1;
        for (int idxEnd = start; idxEnd < end; idxEnd++) {
            if (compareValues(array[idxEnd].getPosition(), pivot.getPosition()) <= 0) {
                idxStart++;
                swapElements(array, idxStart, idxEnd);
            }
        }
        swapElements(array, idxStart + 1, end);
        return idxStart + 1;
    }

    public int compareValues(int a, int b) {
        return Integer.compare(Integer.parseInt(String.valueOf(a)), Integer.parseInt(String.valueOf(b)));
    }

    public String sortValue(String typeList) {
        Piece[] listToSort = sortingList;
        quickSortValue(listToSort, 0, getSortingList().length - 1, typeList);
        return stringList(typeList, listToSort);
    }

    public void quickSortValue(Piece[] array, int inicio, int fin, String type) {
        if (inicio < fin) {
            int indexPartition = partitionValue(array, inicio, fin, type);
            quickSortValue(array, inicio, indexPartition - 1, type);
            quickSortValue(array, indexPartition + 1, fin, type);
        }
    }

    public int partitionValue(Piece[] array, int inicio, int fin, String typeList) {
        String pivote = typeList.equals("Entero") ? String.valueOf(array[fin].getValueInt()) : String.valueOf(array[fin].getValueChar());
        int i = inicio - 1;
        for (int j = inicio; j < fin; j++) {
            String value = typeList.equals("Entero") ? String.valueOf(array[j].getValueInt()) : String.valueOf(array[j].getValueChar());
            if (compareValuesByType(value, pivote) <= 0) {
                i++;
                swapElements(array, i, j);
            }
        }
        swapElements(array, i + 1, fin);
        return i + 1;
    }

    private int compareValuesByType(String a, String b) {
        if (isNumber(a) && isNumber(b)) {
            return Integer.compare(Integer.parseInt(a), Integer.parseInt(b));
        } else {
            return a.compareTo(b);
        }
    }

    private boolean isNumber(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}