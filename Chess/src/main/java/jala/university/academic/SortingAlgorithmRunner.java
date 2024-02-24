package jala.university.academic;

import java.util.Arrays;

public class SortingAlgorithmRunner {

    public void runAlgorithm(String algorithm, String typeList, String fichas, String speed) {
        switch (algorithm) {
            case "Bubble Sort":
                BubbleSort bubble = new BubbleSort(listOrden(typeList, Integer.parseInt(fichas)));
                System.out.println("Valores: " + Arrays.toString(bubble.getSortingList()));
                String sortedValues = Arrays.toString(bubble.sort(bubble.getSortingList(), Integer.parseInt(speed)));
                System.out.println("Organizados: " + sortedValues);
                System.out.println("Tiempo total: " + bubble.getTime() + " ms");
                break;
            case "Insertion Sort":
                InsertionSort insertion = new InsertionSort(listOrden(typeList, Integer.parseInt(fichas)));
                System.out.println("Valores: " + Arrays.toString(insertion.getSortingList()));
                System.out.println("Organizados: " + Arrays.toString(insertion.sort(insertion.getSortingList(), Integer.parseInt(speed))));
                System.out.println("Tiempo total: " + insertion.getTime() + " ms");
                break;
            case "Quick Sort":
                QuickSort quick = new QuickSort(listOrden(typeList, Integer.parseInt(fichas)));
                System.out.println("Valores: " + Arrays.toString(quick.getSortingList()));
                System.out.println("Organizados: " + Arrays.toString(quick.sort(quick.getSortingList(), Integer.parseInt(speed))));
                System.out.println("Tiempo total: " + quick.getTime() + " ms");
                break;
            default:
                System.out.println("Error");
        }
    }

    public String[] listOrden(String type, int fichas) {
        String[] array = new String[fichas];
        String[] arrayCharacter = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p"};
        String[] arrayInteger = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
        String[] arrayTomar = new String[fichas];
        switch (type) {
            case "Carácter" -> System.arraycopy(arrayCharacter, 0, arrayTomar, 0, fichas);
            case "Entero" -> System.arraycopy(arrayInteger, 0, arrayTomar, 0, fichas);
        }
        for (int i = 0; i < fichas; i++) {
            int number = (int) (Math.random() * fichas);
            if (i != 0) {
                while (Arrays.asList(array).contains(arrayTomar[number])) {
                    number = (int) (Math.random() * fichas);
                }
            }
            array[i] = arrayInteger[number];
        }
        return array;
    }
}
