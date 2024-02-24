package jala.university.academic;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

/**
 * Clase que realiza validaciones y ejecuta el programa.
 */
public class Validations {
    private final Map<String, String> values;

    public Validations() {
        values = new LinkedHashMap<>();
    }

    public static String validatorAlgorithm(String algorithm) {
        Random rand = new Random();
        String[] random = {"Bubble Sort", "Insertion Sort", "Quick Sort"};
        if (algorithm != null) {
            algorithm = algorithm.toUpperCase();
            switch (algorithm) {
                case "B":
                    algorithm = "Bubble Sort";
                    break;
                case "I":
                    algorithm = "Insertion Sort";
                    break;
                case "Q":
                    algorithm = "Quick Sort";
                    break;
                default:
                    int number = rand.nextInt(0, 3);
                    algorithm = random[number];
                    break;
            }
        } else {
            int number = rand.nextInt(0, 3);
            algorithm = random[number];
        }
        return algorithm;
    }

    public static String validatorFicha(String ficha) {
        if (ficha != null) {
            try {
                if (Integer.parseInt(ficha) > 16 || Integer.parseInt(ficha) < 1) {
                    return "Dato invalido";
                } else {
                    return ficha;
                }
            } catch (Exception e) {
                return "Dato invalido";
            }
        } else {
            ficha = "Ficha no encontrado";
        }
        return ficha;
    }

    public static String validatorSpeed(String speed) {
        if (speed != null) {
            try {
                if (Integer.parseInt(speed) > 1000 || Integer.parseInt(speed) < 100) {
                    speed = "Dato invalido";
                }
            } catch (Exception e) {
                speed = "Dato invalido";
            }
        } else {
            speed = "Speed no encontrado";
        }
        return speed;
    }

    public static String validatorColor(String color) {
        if (color != null) {
            color = color.toUpperCase();
            if (color.equals("B") || color.equals("N")) {
                color = color.equals("B") ? "Blancas" : "Negras";
            } else {
                color = "Dato invalido";
            }
        } else {
            color = "Color de fichas no encontrado";
        }
        return color;
    }

    public static String validatorType(String chartType) {
        if (chartType != null) {
            chartType = chartType.toUpperCase();
            if (chartType.equals("C") || chartType.equals("N")) {
                chartType = chartType.equals("C") ? "Carácter" : "Entero";
            } else {
                chartType = "Dato invalido";
            }
        } else {
            chartType = "Carácter no encontrado";
        }
        return chartType;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void readArgs(String[] args) {
        for (String arg : args) {
            String[] values = arg.split(" ");
            for (String value : values) {
                if (value.contains("a")) {
                    this.values.put("a", value.split("=").length != 2 ? "x" : value.split("=")[1]);
                } else if (value.contains("t")) {
                    this.values.put("t", value.split("=").length != 2 ? "x" : value.split("=")[1]);
                } else if (value.contains("o")) {
                    this.values.put("o", value.split("=").length != 2 ? "x" : value.split("=")[1]);
                } else if (value.contains("r")) {
                    this.values.put("r", value.split("=").length != 2 ? "x" : value.split("=")[1]);
                } else if (value.contains("s")) {
                    this.values.put("s", value.split("=").length != 2 ? "x" : value.split("=")[1]);
                }
            }
        }
    }

    public void printValues() {
        values.put("a", validatorAlgorithm(values.get("a")));
        values.put("t", validatorType(values.get("t")));
        values.put("o", validatorColor(values.get("o")));
        values.put("r", validatorFicha(values.get("r")));
        values.put("s", validatorSpeed(values.get("s")));
        System.out.println("Algoritmo: " + values.get("a"));
        System.out.println("Tipo: " + values.get("t"));
        System.out.println("Color: " + values.get("o"));
    }

    public boolean runProgram() {
        if (!"Dato invalido".equals(values.get("t")) && !"Dato invalido".equals(values.get("o")) && !"Dato invalido".equals(values.get("r")) && !"Dato invalido".equals(values.get("s"))) {
            return !"Color de fichas no encontrado".contains(values.get("o")) && !"Carácter no encontrado".equals(values.get("t")) && !"Ficha no encontrado".equals(values.get("r")) && !"Speed no encontrado".equals(values.get("s"));
        }
        return false;
    }
}