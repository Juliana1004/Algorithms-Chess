package jala.university.academic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Clase que implementa la creación del array e impresión de datos según los parámetros.
 */
public class SortingAlgorithmRunner {

    public void runAlgorithm(String algorithm, String typeList, String pieces, String speed) {
        switch (algorithm) {
            case "Bubble Sort":
                BubbleSort bubble = new BubbleSort(listOrden(typeList, Integer.parseInt(pieces)));
                System.out.println("Valores: " + Arrays.toString(bubble.getSortingList()));
                String sortedValues = Arrays.toString(bubble.sort(bubble.getSortingList(), Integer.parseInt(speed)));
                System.out.println("Organizados: " + sortedValues);
                System.out.println("Tiempo total: " + bubble.getTime() + " ms");
                break;
            case "Insertion Sort":
                InsertionSort insertion = new InsertionSort(listOrden(typeList, Integer.parseInt(pieces)));
                System.out.println("Valores: " + Arrays.toString(insertion.getSortingList()));
                System.out.println("Organizados: " + Arrays.toString(insertion.sort(insertion.getSortingList(), Integer.parseInt(speed))));
                System.out.println("Tiempo total: " + insertion.getTime() + " ms");
                break;
            case "Quick Sort":
                QuickSort quick = new QuickSort(listOrden(typeList, Integer.parseInt(pieces)));
                System.out.println("Valores: " + Arrays.toString(quick.getSortingList()));
                System.out.println("Organizados: " + Arrays.toString(quick.sort(quick.getSortingList(), Integer.parseInt(speed))));
                System.out.println("Tiempo total: " + quick.getTime() + " ms");
                break;
        }
    }

    public String[] listOrden(String type, int pieces) {
        String[] array = new String[pieces];
        String[] arrayCharacter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"};
        String[] arrayInteger = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        String[] arrayToUse = new String[16];
        switch (type) {
            case "Carácter" -> arrayToUse = arrayCharacter;
            case "Entero" -> arrayToUse = arrayInteger;
        }
        switch (pieces) {
            case 1:
                array = new String[]{arrayToUse[0]};
                break;
            case 2:
                array = new String[]{arrayToUse[0], arrayToUse[1]};
                break;
            case 4:
                array = new String[]{arrayToUse[0], arrayToUse[1], arrayToUse[4], arrayToUse[5]};
                break;
            case 6:
                int index = 0;
                for (int indexPiece = 0; indexPiece < arrayToUse.length; indexPiece++) {
                    if (indexPiece != 3 && indexPiece != 2 && indexPiece < 10) {
                        if (index < array.length) {
                            array[index] = arrayToUse[indexPiece];
                            index += 1;
                        } else {
                            break;
                        }
                    }
                }
                break;
            case 8:
                int index2 = 0;
                for (int indexPiece = 8; indexPiece < arrayToUse.length; indexPiece++) {
                    array[index2] = arrayToUse[indexPiece];
                    index2 += 1;
                }
                break;
            default:
                for (int idxArray = 0; idxArray < pieces; idxArray++) {
                    int pieceRandom = (int) (Math.random() * 16);
                    if (idxArray != 0) {
                        while (Arrays.asList(array).contains(arrayToUse[pieceRandom])) {
                            pieceRandom = (int) (Math.random() * 16);
                        }
                    }
                    array[idxArray] = arrayToUse[pieceRandom];
                }
                break;
        }
        List<String> listToUse = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(listToUse);
        listToUse.toArray(array);
        return array;
    }
}
