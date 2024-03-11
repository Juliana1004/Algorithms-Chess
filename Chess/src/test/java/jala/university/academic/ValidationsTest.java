package jala.university.academic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidationsTest {

    @Test
    void validatorAlgorithmTest() {
        assertEquals("Bubble Sort", Validations.validatorAlgorithm("B"));
        assertEquals("Insertion Sort", Validations.validatorAlgorithm("I"));
        assertEquals("Quick Sort", Validations.validatorAlgorithm("Q"));
        assertNotNull(Validations.validatorAlgorithm(null));
        String result = Validations.validatorAlgorithm("X");
        assertTrue(result.equals("Bubble Sort") || result.equals("Insertion Sort") || result.equals("Quick Sort"));
    }

    @Test
    void validatorFichaTest() {
        assertEquals("5", Validations.validatorFicha("5"));
        assertEquals("Ficha no encontrado", Validations.validatorFicha(null));
        assertEquals("Dato invalido", Validations.validatorFicha("20"));
    }

    @Test
    void validatorSpeedTest() {
        assertEquals("500", Validations.validatorSpeed("500"));
        assertEquals("Speed no encontrado", Validations.validatorSpeed(null));
        assertEquals("Dato invalido", Validations.validatorSpeed("1500"));
    }

    @Test
    void validatorColorTest() {
        assertEquals("Blancas", Validations.validatorColor("B"));
        assertEquals("Negras", Validations.validatorColor("N"));
        assertEquals("Color de fichas no encontrado", Validations.validatorColor(null));
        assertEquals("Dato invalido", Validations.validatorColor("X"));
    }

    @Test
    void validatorTypeTest() {
        assertEquals("Carácter", Validations.validatorType("C"));
        assertEquals("Entero", Validations.validatorType("N"));
        assertEquals("Carácter no encontrado", Validations.validatorType(null));
        assertEquals("Dato invalido", Validations.validatorType("X"));
    }
}
