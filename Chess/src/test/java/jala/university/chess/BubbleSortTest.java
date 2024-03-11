package jala.university.chess;


import jala.university.chess.algorithm.BubbleSort;
import jala.university.chess.array.Piece;
import jala.university.chess.array.Pieces;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    void sortTest() {
        String type = "Entero";
        Piece[] arrayTest = new Piece[]{Pieces.BISHOP2.getValue(),Pieces.QUEEN.getValue(), Pieces.KING.getValue()
                , Pieces.BISHOP1.getValue()};
        BubbleSort bubbleSort = new BubbleSort(arrayTest,arrayTest.length,"Black",type);
        String sortedList = bubbleSort.sortValue(type);
        String expected = "1 2 5 6 ";
        assertEquals(expected, sortedList);
    }
}
