package jala.university.academic;

import jala.university.academic.algorithms.BubbleSort;
import jala.university.academic.algorithms.InsertionSort;
import jala.university.academic.algorithms.QuickSort;
import jala.university.academic.createArrays.CreateArray;

import java.util.*;

import static jala.university.academic.utils.UtilsMessage.*;

/**
 * Clase que implementa la ejecución e impresión de los algoritmos.
 */
public class SortingAlgorithmRunner {
    public void runAlgorithm(Map<String,String> values){
        String algorithm = values.get("a");
        String type = values.get("t");
        int pieces = Integer.parseInt(values.get("r"));
        int speed = Integer.parseInt(values.get("s"));
        selectAlgorithm(algorithm,type,pieces,speed);
    }
    public void selectAlgorithm(String algorithm, String typeList, int pieces, int speed) {
        CreateArray newArray = new CreateArray();
        switch (algorithm) {
            case bubble:
                processBubbleSort(newArray,typeList,pieces,speed);
                break;
            case insertion:
                processInsertionSort(newArray,typeList,pieces,speed);
                break;
            case quick:
                processQuickSort(newArray,typeList,pieces,speed);
                break;
        }
    }
    public void processBubbleSort(CreateArray holi,String typeList, int pieces, int speed){
        BubbleSort bubble = new BubbleSort(holi.listOrden(typeList, pieces));
        System.out.println("Valores: " + Arrays.toString(bubble.getSortingList()));
        System.out.println("Organizados: " + Arrays.toString(bubble.sort(bubble.getSortingList(), speed)));
        System.out.println("Tiempo total: " + bubble.getTime() + " ms");
    }
    public void processInsertionSort(CreateArray holi,String typeList, int pieces, int speed){
        InsertionSort insertion = new InsertionSort(holi.listOrden(typeList, pieces));
        System.out.println("Valores: " + Arrays.toString(insertion.getSortingList()));
        System.out.println("Organizados: " + Arrays.toString(insertion.sort(insertion.getSortingList(), speed)));
        System.out.println("Tiempo total: " + insertion.getTime() + " ms");
    }
    public void processQuickSort(CreateArray holi,String typeList, int pieces, int speed){
        QuickSort quick = new QuickSort(holi.listOrden(typeList, pieces));
        System.out.println("Valores: " + Arrays.toString(quick.getSortingList()));
        System.out.println("Organizados: " + Arrays.toString(quick.sort(quick.getSortingList(), speed)));
        System.out.println("Tiempo total: " + quick.getTime() + " ms");
    }
}
