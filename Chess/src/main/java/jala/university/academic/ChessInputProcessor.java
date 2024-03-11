package jala.university.academic;

import java.util.LinkedHashMap;
import java.util.Map;
import static jala.university.academic.utils.UtilsMessage.*;

/**
 * Clase que realiza validaciones y ejecuta el programa.
 */
public class ChessInputProcessor {
    private final Map<String, String> values;
    public ChessInputProcessor() {
        values = new LinkedHashMap<>();
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
                }else if (value.contains("in")) {
                    this.values.put("in", value.split("=").length != 2 ? "x" : value.split("=")[1]);
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
    public String validatorAlgorithm(String algorithm) {
        if (algorithm != null) {
            algorithm = algorithm.toUpperCase();
            switch (algorithm) {
                case "B":
                    algorithm = bubble;
                    break;
                case "I":
                    algorithm = insertion;
                    break;
                case "Q":
                    algorithm = quick;
                    break;
                default:
                    algorithm=invalid;
                    break;
            }
        } else {
            algorithm=missing;
        }
        return algorithm;
    }
    public String validatorType(String chartType) {
        if (chartType != null) {
            chartType = chartType.toUpperCase();
            if (chartType.equals("N")||chartType.equals("C")) {
                chartType = chartType.equals("C") ? "Carácter" : "Entero";
            } else {
                chartType = invalid;
            }
        } else {
            chartType = missing;
        }
        return chartType;
    }
    public String validatorColor(String color) {
        if (color != null) {
            color = color.toUpperCase();
            if (color.equals("B") || color.equals("W")) {
                color = color.equals("W") ? "White" : "Black";
            } else {
                color = invalid;
            }
        } else {
            color = missing;
        }
        return color;
    }
    public String validatorR(String valueR) {
        if (valueR != null) {
            valueR = valueR.toUpperCase();
            if (!valueR.equals("R")) {
                valueR = invalid;
            }
        } else {
            valueR = missing;
        }
        return valueR;
    }
    public String validatorPiece(String pieces) {
        if (pieces != null) {
            int valuePiece = isNumber(pieces);
            if (valuePiece!=16 && valuePiece!=1 &&valuePiece!=2 &&valuePiece!=4 &&valuePiece!=6 &&valuePiece!=8 &&valuePiece!=10) {
                return invalid;
            }
        } else {
            pieces = missing;
        }
        return pieces;
    }
    public String validatorSpeed(String speed) {
        if (speed != null) {
            int valueSpeed = isNumber(speed);
            if (valueSpeed > 1000 || valueSpeed < 100) {
                speed = invalid;
            }
        } else {
            speed = missing;
        }
        return speed;
    }
    public int isNumber(String number){
        try {
            return Integer.parseInt(number);
        }catch (Exception e){
            return 0;
        }
    }
    public void printValues() {
        values.put("a", validatorAlgorithm(values.get("a")));
        values.put("t", validatorType(values.get("t")));
        values.put("o", validatorColor(values.get("o")));
        values.put("r", validatorPiece(values.get("r")));
        values.put("s", validatorSpeed(values.get("s")));
        values.put("in", validatorR(values.get("in")));
        System.out.println("Algoritmo: " + values.get("a"));
        System.out.println("Tipo: " + values.get("t"));
        System.out.println("Color: " + values.get("o"));
        System.out.println("Fichas: "+values.get("r"));
        System.out.println("Speed: "+values.get("s"));
    }
    public boolean runProgram() {
        if (invalid.equals(values.get("in"))||missing.equals(values.get("in"))){
            System.out.println(invalidR);
            return false;
        }
        for (String key : values.keySet()) {
            if (invalid.equals(values.get(key))) {
                return false;
            }
        }
        for (String key : values.keySet()) {
            if (missing.equals(values.get(key))) {
                return false;
            }
        }
        return true;
    }
}