package jala.university.academic;

/**
 * Clase principal que ejecuta el programa.
 */
public class Chess {
    public static void main(String[] args) {
        ChessInputProcessor validator = new ChessInputProcessor();
        validator.readArgs(args);
        validator.printValues();
        if (validator.runProgram()) {
            SortingAlgorithmRunner sorting = new SortingAlgorithmRunner();
            sorting.runAlgorithm(validator.getValues());
        }
    }
}