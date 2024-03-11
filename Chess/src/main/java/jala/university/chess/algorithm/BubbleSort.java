package jala.university.chess.algorithm;

import jala.university.chess.array.Piece;

public class BubbleSort extends AbstractAlgorithm {
    private final Piece[] sortingList;
    private final int pieces;
    private long time;

    public BubbleSort(Piece[] list, int piecesAmount, String color, String type) {
        super(list, color, type);
        this.sortingList = list;
        this.pieces = piecesAmount;
    }

    public long getTime() {
        return time;
    }

    public Piece[] getSortingList() {
        return sortingList;
    }

    public void sortTable(Piece[] listToSort, int speed) {
        int startTime = 0;
        boolean sorted;
        updateAndShowTable(pieceToString(listToSort, pieces));
        do {
            sorted = true;
            for (int idxArray = 0; idxArray < listToSort.length - 1; idxArray++) {
                if (listToSort[idxArray].getPosition() > listToSort[idxArray + 1].getPosition()) {
                    swapElements(listToSort, idxArray + 1, idxArray);
                    sorted = false;
                }
            }
            startTime += 1;
            System.out.println("Iteración: " + startTime);
            updateAndShowTable(pieceToString(listToSort, pieces));
            sleep(speed);
        } while (!sorted);
        showTablePiece();
        time = calculateElapsedTime(startTime, speed);
    }

    public String sortValue(String typeList) {
        Piece[] listToSort = sortingList;
        boolean sorted;
        do {
            sorted = true;
            for (int idxArray = 0; idxArray < listToSort.length - 1; idxArray++) {
                if (typeList.equals("Entero")) {
                    if (listToSort[idxArray].getValueInt() > listToSort[idxArray + 1].getValueInt()) {
                        swapElements(listToSort, idxArray + 1, idxArray);
                        sorted = false;
                    }
                } else {
                    if (listToSort[idxArray + 1].getValueChar().compareTo(listToSort[idxArray].getValueChar()) < 0) {
                        swapElements(listToSort, idxArray + 1, idxArray);
                        sorted = false;
                    }
                }
            }
        } while (!sorted);
        return stringList(typeList, listToSort);
    }
}