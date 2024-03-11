package jala.university.academic;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SortingAlgorithmRunnerTest {
    @Test
    void listOrdenTest() {
        SortingAlgorithmRunner runner = new SortingAlgorithmRunner();
        String[] result = runner.listOrden("Carácter", 5);
        assertEquals(5, result.length);
        result = runner.listOrden("Entero", 10);
        assertEquals(10, result.length);
    }
}
