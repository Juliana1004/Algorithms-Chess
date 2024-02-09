package jala.university.academic;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        Validations validator = new Validations();
        validator.readArgs(args);
        validator.printValues();
        validator.runProgram();
    }
}