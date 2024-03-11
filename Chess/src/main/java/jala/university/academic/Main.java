package jala.university.academic;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        Validations validator = new Validations();
        validator.readArgs(args);
        validator.printValues();
        if (validator.runProgram()) {
            SortingAlgorithmRunner sorting = new SortingAlgorithmRunner();
            sorting.runAlgorithm(validator.getValues().get("a"), validator.getValues().get("t"), validator.getValues().get("r"), validator.getValues().get("s"));
        }
    }
}