package jala.university.chess;

import jala.university.chess.algorithm.InsertionSort;
import jala.university.chess.array.Piece;
import jala.university.chess.array.Pieces;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertionSortTest {
    @Test
    void sortTest() {
        String type = "Entero";
        Piece[] arrayTest = new Piece[]{Pieces.BISHOP2.getValue(), Pieces.QUEEN.getValue(), Pieces.KING.getValue(), Pieces.BISHOP1.getValue()};
        InsertionSort insertionSort = new InsertionSort(arrayTest, arrayTest.length, "White", type);
        String sortedList = insertionSort.sortValue(type);
        String expected = "1 2 5 6 ";
        assertEquals(expected, sortedList);
    }
}

