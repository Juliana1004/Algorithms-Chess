package jala.university.chess;

public class Chess {
    public static void main(String[] args) {
        ChessInputProcessor processChess = new ChessInputProcessor();
        processChess.readArgs(args);
        processChess.printValues();
        processChess.runProgram();
    }
}