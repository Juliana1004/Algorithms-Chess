package jala.university.academic;
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
        String result = validator.validatorAlgorithm("X");
        assertTrue(result.equals("Bubble Sort") || result.equals("Insertion Sort") || result.equals("Quick Sort"));
    }

    @Test
    void validatorFichaTest() {
        assertEquals("5", validator.validatorPiece("5"));
        assertEquals("Ficha no encontrado", validator.validatorPiece(null));
        assertEquals("Dato invalido", validator.validatorPiece("20"));
    }

    @Test
    void validatorSpeedTest() {
        assertEquals("500", validator.validatorSpeed("500"));
        assertEquals("Speed no encontrado", validator.validatorSpeed(null));
        assertEquals("Dato invalido", validator.validatorSpeed("1500"));
    }

    @Test
    void validatorColorTest() {
        assertEquals("Blancas", validator.validatorColor("B"));
        assertEquals("Negras", validator.validatorColor("N"));
        assertEquals("Color de fichas no encontrado", validator.validatorColor(null));
        assertEquals("Dato invalido", validator.validatorColor("X"));
    }

    @Test
    void validatorTypeTest() {
        assertEquals("Carácter", validator.validatorType("C"));
        assertEquals("Entero", validator.validatorType("N"));
        assertEquals("Carácter no encontrado", validator.validatorType(null));
        assertEquals("Dato invalido", validator.validatorType("X"));
    }
}
