package jala.university.chess.algorithm;

import jala.university.chess.array.Piece;
import jala.university.chess.board.BoardManager;

public abstract class AbstractAlgorithm {
    BoardManager tablero;

    public AbstractAlgorithm(Piece[] list, String color, String type) {
        this.tablero = new BoardManager(list, color, type);
    }

    public String[] pieceToString(Piece[] arrayPieces, int piecesAmount) {
        String[] arrayString = new String[piecesAmount];
        for (int index = 0; index < arrayPieces.length; index++) {
            arrayString[index] = Integer.toString(arrayPieces[index].getPosition());
        }
        return arrayString;
    }

    public String stringList(String typeArray, Piece[] array) {
        StringBuilder resultString = new StringBuilder();
        String newStringOfArray;
        for (Piece pieza : array) {
            resultString.append(typeArray.equals("Entero") ? pieza.getValueInt() + " " : pieza.getValueChar() + " ");
        }
        newStringOfArray = resultString.toString();
        return newStringOfArray;
    }

    public void swapElements(Piece[] array, int min, int high) {
        Piece temp = array[min];
        array[min] = array[high];
        array[high] = temp;
    }

    public void updateAndShowTable(String[] array) {
        tablero.updateBoard(array);
        tablero.showBoardWithValue();
        System.out.println(" ");
    }

    public void showTablePiece() {
        tablero.changeToPositionPieces();
        tablero.showBoardWithPiece();
        System.out.println(" ");
    }
    public void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException error) {
            System.out.println("error");
        }
    }
    public static long calculateElapsedTime(int startTime, long speed) {
        return startTime * speed;
    }
}
