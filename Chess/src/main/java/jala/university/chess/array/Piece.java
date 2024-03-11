package jala.university.chess.array;

public class Piece implements Comparable<Piece> {
    private final int position;
    private final int valueInt;
    private final String valueChar;
    private String symbol;

    public Piece(int valuePosition, int valueInt, String valueChar, String symbol) {
        this.position = valuePosition;
        this.valueInt = valueInt;
        this.valueChar = valueChar;
        this.symbol = symbol;
    }

    public int getPosition() {
        return position;
    }

    public int getValueInt() {
        return valueInt;
    }

    public String getValueChar() {
        return valueChar;
    }

    @Override
    public int compareTo(Piece o) {
        return 0;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
