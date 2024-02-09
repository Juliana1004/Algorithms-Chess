package jala.university.academic;

import java.util.Arrays;
/**
 * Clase que realiza validaciones y ejecuta el programa.
 */
public class Validations {
    private String algorithm;
    private String type;
    private String pieceColor;
    public String getAlgorithm() {
        return algorithm;
    }
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getPieceColor() {
        return pieceColor;
    }
    public void setPieceColor(String pieceColor) {
        this.pieceColor = pieceColor;
    }
    public void readArgs(String[] args) {
        for (String arg : args) {
            String[] values = arg.split(" ");
            for (String value : values) {
                if (value.contains("a")) {
                      setAlgorithm(value.split("=").length != 2 ? "x" : value.split("=")[1]);
                } else if (value.contains("t")) {
                    setType(value.split("=").length != 2 ? "x" : value.split("=")[1]);
                } else if (value.contains("o")) {
                    setPieceColor(pieceColor = value.split("=").length != 2 ? "x" : value.split("=")[1]);
                }
            }
        }
    }
    public Validations(){}
    public static String validatorAlgorithm(String algorithm) {
        if (algorithm != null) {
            if (algorithm.matches(".*\\d.*")) {
                algorithm = "Dato invalido";
            }else {
                algorithm = algorithm.toUpperCase();
                switch (algorithm) {
                    case "B":
                        algorithm = "Bubble Sort";
                        break;
                    case "I":
                        algorithm = "Insertion Sort";
                        break;
                    default:
                        algorithm = "Dato invalido";
                        break;
                }
            }
        }else {
            algorithm="Algoritmo no encontrado";
        }
        return algorithm;
    }
    public static String validatorType(String chartType) {
        if (chartType != null) {
            chartType=chartType.toUpperCase();
            if (chartType.equals("C") || chartType.equals("I")) {
                chartType = chartType.equals("C") ? "Carácter" : "Entero";
            }
            else {
                chartType = "Dato invalido";
            }
        }else {
            chartType = "Carácter no encontrado";
        }
        return chartType;
    }
    public static String validatorColor(String color) {
        if (color != null){
            color=color.toUpperCase();
            if (color.equals("B")||color.equals("N")) {
                color = color.equals("B")?"Blancas":"Negras";
            }else {
                color = "Dato invalido";
            }
        }else {
            color = "Color de fichas no encontrado";
        }
        return color;
    }
    public void printValues(){
        setAlgorithm(validatorAlgorithm(algorithm));
        setType(validatorType(type));
        setPieceColor(validatorColor(pieceColor));
        System.out.println("Algoritmo: "+getAlgorithm());
        System.out.println("Tipo: "+getType());
        System.out.println("Color: "+getPieceColor());
    }
    public void runProgram(){
        if (!"Dato invalido".equals(getAlgorithm()) &&
                !"Dato invalido".equals(getType()) &&
                !"Dato invalido".equals(getPieceColor())) {
            if (!"Color de fichas no encontrado".equals(getPieceColor()) &&
                    !"Carácter no encontrado".equals(getType()) &&
                    !"Algoritmo no encontrado".equals(getAlgorithm())) {
                runAlgorithm(getAlgorithm(), getType());
            }
        }
    }
    public void runAlgorithm(String algorithm, String typeList) {
        String[] intList = new String[]{"23", "56", "12", "78", "45", "9", "67", "34", "87", "3", "90", "16", "72", "8", "51", "29"};
        String[] stringList = new String[]{"A", "Z", "L", "Q", "W", "R", "T", "Y", "H", "F", "G", "B", "N", "M", "J", "K"};
        switch (algorithm) {
            case "Bubble Sort":
                BubbleSort bubble = new BubbleSort(typeList.equals("Carácter") ? stringList : intList);
                System.out.println("Valores: " + Arrays.toString(bubble.getSortingList()));
                String sortedValues = Arrays.toString(bubble.sort(bubble.getSortingList()));
                System.out.println("Organizados: " + sortedValues);
                break;
            case "Insertion Sort":
                InsertionSort sort = new InsertionSort(typeList.equals("Entero") ? intList : stringList);
                System.out.println("Valores: " + Arrays.toString(sort.getSortingList()));
                System.out.println("Organizados: " + Arrays.toString(sort.sort(sort.getSortingList())));
                break;
            default:
                System.out.println("Error");
        }
    }
}
