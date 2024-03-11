package jala.university.chess.algorithm;

import jala.university.chess.array.Piece;

public class InsertionSort extends AbstractAlgorithm {
    private final Piece[] sortingList;
    private final int pieces;
    private long time;

    public InsertionSort(Piece[] list, int piecesAmount, String color, String type) {
        super(list, color, type);
        this.sortingList = list;
        this.pieces = piecesAmount;
    }

    public Piece[] getSortingList() {
        return sortingList;
    }

    public long getTime() {
        return time;
    }

    public void sortTable(Piece[] listToSort, int speed) {
        int startTime = 0;
        updateAndShowTable(pieceToString(listToSort, pieces));
        for (int idx = 0; idx < listToSort.length - 1; idx++) {
            System.out.println(" ");
            for (int scan = idx + 1; scan < listToSort.length; scan++) {
                if (listToSort[scan].getPosition() < listToSort[idx].getPosition()) {
                    swapElements(listToSort, scan, idx);
                }
            }
            startTime += 1;
            System.out.println("Iteración: " + startTime);
            updateAndShowTable(pieceToString(listToSort, pieces));
            sleep(speed);
        }
        showTablePiece();
        time = calculateElapsedTime(startTime, speed);
    }

    public String sortValue(String typeList) {
        Piece[] listToSort = sortingList;
        for (int idx = 0; idx < listToSort.length - 1; idx++) {
            for (int scan = idx + 1; scan < listToSort.length; scan++) {
                if (typeList.equals("Entero")) {
                    if (listToSort[scan].getValueInt() < listToSort[idx].getValueInt()) {
                        swapElements(listToSort, scan, idx);
                    }
                } else {
                    if (listToSort[scan].getValueChar().compareTo(listToSort[idx].getValueChar()) < 0) {
                        swapElements(listToSort, scan, idx);
                    }
                }
            }
        }
        return stringList(typeList, listToSort);
    }
}