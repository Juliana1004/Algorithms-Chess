package jala.university.academic;
import jala.university.academic.createArrays.CreateArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class SortingAlgorithmRunnerTest {
    @Test
    void listOrdenTest() {
        CreateArray runner = new CreateArray();
        String[] result = runner.listOrden("Carácter", 4);
        assertEquals(4, result.length);
        result = runner.listOrden("Entero", 10);
        assertEquals(8, result.length);
    }
}
