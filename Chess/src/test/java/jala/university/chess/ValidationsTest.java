package jala.university.chess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidationsTest {
    ChessInputProcessor validator = new ChessInputProcessor();

    @Test
    void validatorAlgorithmTest() {
        assertEquals("Bubble Sort", validator.validatorAlgorithm("B"));
        assertEquals("Insertion Sort", validator.validatorAlgorithm("I"));
        assertEquals("Quick Sort", validator.validatorAlgorithm("Q"));
        assertNotNull(validator.validatorAlgorithm(null));
        String result = validator.validatorAlgorithm("B");
        assertTrue(result.equals("Bubble Sort") || result.equals("Insertion Sort") || result.equals("Quick Sort"));
    }

    @Test
    void validatorFichaTest() {
        assertEquals("Dato invalido", validator.validatorPiece("5"));
        assertEquals("No encontrado", validator.validatorPiece(null));
        assertEquals("Dato invalido", validator.validatorPiece("20"));
    }

    @Test
    void validatorSpeedTest() {
        assertEquals("500", validator.validatorSpeed("500"));
        assertEquals("No encontrado", validator.validatorSpeed(null));
        assertEquals("Dato invalido", validator.validatorSpeed("1500"));
    }

    @Test
    void validatorColorTest() {
        assertEquals("Black", validator.validatorColor("B"));
        assertEquals("White", validator.validatorColor("w"));
        assertEquals("No encontrado", validator.validatorColor(null));
        assertEquals("Dato invalido", validator.validatorColor("X"));
    }

    @Test
    void validatorTypeTest() {
        assertEquals("Carácter", validator.validatorType("C"));
        assertEquals("Entero", validator.validatorType("N"));
        assertEquals("No encontrado", validator.validatorType(null));
        assertEquals("Dato invalido", validator.validatorType("X"));
    }
}
