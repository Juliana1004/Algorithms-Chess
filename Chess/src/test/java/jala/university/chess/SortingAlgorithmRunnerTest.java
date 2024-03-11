package jala.university.chess;

import jala.university.chess.array.CreateArray;
import jala.university.chess.array.Piece;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SortingAlgorithmRunnerTest {
    @Test
    void listOrdenTest() {
        CreateArray runner = new CreateArray();
        Piece[] result4 = runner.listOrden(4);
        assertEquals(4, result4.length);
        Piece[] result10 = runner.listOrden(10);
        assertEquals(8, result10.length);
    }
}

