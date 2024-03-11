package jala.university.chess;

import jala.university.chess.algorithm.BubbleSort;
import jala.university.chess.algorithm.InsertionSort;
import jala.university.chess.algorithm.QuickSort;
import jala.university.chess.array.CreateArray;

import java.util.Map;

import static jala.university.chess.UtilsMessage.*;

public class SortingAlgorithmRunner {
    public void runAlgorithm(Map<String, String> values) {
        String algorithm = values.get("a");
        String type = values.get("t");
        int pieces = Integer.parseInt(values.get("r"));
        int speed = Integer.parseInt(values.get("s"));
        String color = values.get("o");
        selectAlgorithm(algorithm, type, pieces, speed, color);
    }

    public void selectAlgorithm(String algorithm, String typeList, int pieces, int speed, String color) {
        CreateArray newArray = new CreateArray();
        switch (algorithm) {
            case bubble:
                processBubbleSort(newArray, typeList, pieces, speed, color);
                break;
            case insertion:
                processInsertionSort(newArray, typeList, pieces, speed, color);
                break;
            case quick:
                processQuickSort(newArray, typeList, pieces, speed, color);
                break;
        }
    }

    public void processBubbleSort(CreateArray valueArray, String typeList, int pieces, int speed, String color) {
        BubbleSort bubble = new BubbleSort(valueArray.listOrden(pieces), pieces, color, typeList);
        System.out.println("Valores: " + bubble.stringList(typeList, bubble.getSortingList()));
        bubble.sortTable(bubble.getSortingList(), speed);
        System.out.println("Organizados: " + bubble.sortValue(typeList));
        System.out.println("Tiempo total: " + bubble.getTime() + " ms");
    }

    public void processInsertionSort(CreateArray valueArray, String typeList, int pieces, int speed, String color) {
        InsertionSort insertion = new InsertionSort(valueArray.listOrden(pieces), pieces, color, typeList);
        System.out.println("Valores: " + insertion.stringList(typeList, insertion.getSortingList()));
        insertion.sortTable(insertion.getSortingList(), speed);
        System.out.println("Organizados: " + insertion.sortValue(typeList));
        System.out.println("Tiempo total: " + insertion.getTime() + " ms");
    }

    public void processQuickSort(CreateArray valueArray, String typeList, int pieces, int speed, String color) {
        QuickSort quick = new QuickSort(valueArray.listOrden(pieces), pieces, color, typeList);
        System.out.println("Valores: " + quick.stringList(typeList, quick.getSortingList()));
        quick.sortTable(quick.getSortingList(), speed);
        System.out.println("Organizados: " + quick.sortValue(typeList));
        System.out.println("Tiempo total: " + quick.getTime() + " ms");
    }
}
