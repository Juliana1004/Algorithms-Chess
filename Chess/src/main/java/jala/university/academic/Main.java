package jala.university.academic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Clase principal que ejecuta el programa.
 */
public class Main {
    public static void main(String[] args) {
        Validations validator = new Validations();
        validator.readArgs(args);
        validator.printValues();
        if (validator.runProgram()) {
            runAlgorithm(validator.getAlgorithm(), validator.getType());
        }
    }

    public static void runAlgorithm(String algorithm, String typeList) {
        switch (algorithm) {
            case "Bubble Sort":
                BubbleSort bubble = new BubbleSort(listOrden(typeList));
                System.out.println("Valores: " + Arrays.toString(bubble.getSortingList()));
                String sortedValues = Arrays.toString(bubble.sort(bubble.getSortingList()));
                System.out.println("Organizados: " + sortedValues);
                break;
            case "Insertion Sort":
                InsertionSort sort = new InsertionSort(listOrden(typeList));
                System.out.println("Valores: " + Arrays.toString(sort.getSortingList()));
                System.out.println("Organizados: " + Arrays.toString(sort.sort(sort.getSortingList())));
                break;
            default:
                System.out.println("Error");
        }
    }

    public static String[] listOrden(String type) {
        String[] array = new String[16];
        Set<String> numbersAdd = new HashSet<>();
        switch (type) {
            case "Carácter":
                String[] arrayCharacter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
                        "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
                for (int i = 0; i < 16; i++) {
                    int number = (int) (Math.random() * 26);
                    if (i != 0) {
                        while (Arrays.asList(array).contains(arrayCharacter[number])) {
                            number = (int) (Math.random() * 26);
                        }
                    }
                    array[i] = arrayCharacter[number];
                }
                return array;
            case "Entero":
                for (int i = 0; i < 16; i++) {
                    int numero;
                    do {
                        numero = (int) (Math.random() * 100);
                    } while (numbersAdd.contains(Integer.toString(numero)));
                    array[i] = Integer.toString(numero);
                    numbersAdd.add(array[i]);
                }
                return array;
            default:
                break;
        }
        return null;
    }
}