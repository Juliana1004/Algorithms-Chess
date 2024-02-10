package jala.university.academic;

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

    public Validations() {
    }

    public static String validatorAlgorithm(String algorithm) {
        if (algorithm != null) {
            if (algorithm.matches(".*\\d.*")) {
                algorithm = "Dato invalido";
            } else {
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
        } else {
            algorithm = "Algoritmo no encontrado";
        }
        return algorithm;
    }

    public static String validatorType(String chartType) {
        if (chartType != null) {
            chartType = chartType.toUpperCase();
            if (chartType.equals("C") || chartType.equals("I")) {
                chartType = chartType.equals("C") ? "Carácter" : "Entero";
            } else {
                chartType = "Dato invalido";
            }
        } else {
            chartType = "Carácter no encontrado";
        }
        return chartType;
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

    public void printValues() {
        setAlgorithm(validatorAlgorithm(algorithm));
        setType(validatorType(type));
        setPieceColor(validatorColor(pieceColor));
        System.out.println("Algoritmo: " + getAlgorithm());
        System.out.println("Tipo: " + getType());
        System.out.println("Color: " + getPieceColor());
    }

    public boolean runProgram() {
        if (!"Dato invalido".equals(getAlgorithm()) &&
                !"Dato invalido".equals(getType()) &&
                !"Dato invalido".equals(getPieceColor())) {
            return !"Color de fichas no encontrado".equals(getPieceColor()) &&
                    !"Carácter no encontrado".equals(getType()) &&
                    !"Algoritmo no encontrado".equals(getAlgorithm());
        }
        return false;
    }
}