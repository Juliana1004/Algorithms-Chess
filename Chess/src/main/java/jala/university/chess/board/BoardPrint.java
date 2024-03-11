package jala.university.chess.board;

import jala.university.chess.array.Piece;
import jala.university.chess.array.PiecePrint;

public class BoardPrint {
    public Piece[][] valuePieces(String color, Piece[] array) {
        Piece[][] sortedBoard = new Piece[8][8];
        int numberPiece = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (numberPiece <= array.length) {
                    for (Piece piece : array) {
                        int position = piece.getPosition();
                        if (position >= 8) {
                            sortedBoard[1][position - 8] = piece;
                        } else {
                            if (position == 4) {
                                position = color.equals("Black") ? 3 : position;
                                sortedBoard[i][position] = piece;
                            } else if (position == 3) {
                                position = color.equals("Black") ? 4 : position;
                                sortedBoard[i][position] = piece;
                            } else {
                                sortedBoard[i][position] = piece;
                            }
                        }
                        numberPiece += 1;
                    }
                }
                if (sortedBoard[i][j] == null) {
                    sortedBoard[i][j] = null;
                }
            }
        }
        return sortedBoard;
    }

    public void showBoardPiece(Piece[][] board, String color) {
        String printValue = null;
        for (int i = 0; i < board.length; i++) {
            System.out.printf("%s-", i + 1);
            for (int j = 0; j < board[i].length; j++) {
                Piece value = board[i][j];
                if (value != null) {
                    if (!color.equals("Black")) {
                        if (value.getValueInt() == 1) {
                            value.setSymbol(PiecePrint.KINGW.getValue());
                        } else if (value.getValueInt() == 2) {
                            value.setSymbol(PiecePrint.QUEENW.getValue());
                        } else if (value.getValueInt() == 3 || value.getValueInt() == 4) {
                            value.setSymbol(PiecePrint.TOWERW.getValue());
                        } else if (value.getValueInt() == 5 || value.getValueInt() == 6) {
                            value.setSymbol(PiecePrint.BISHOPW.getValue());
                        } else if (value.getValueInt() == 7 || value.getValueInt() == 8) {
                            value.setSymbol(PiecePrint.HORSEW.getValue());
                        } else if (value.getValueInt() >= 9 && value.getValueInt() <= 16) {
                            value.setSymbol(PiecePrint.PAWNW.getValue());
                        }
                    }
                    printValue = value.getSymbol();

                }
                System.out.printf("|%s|", value != null ? printValue : "  ");
            }
            System.out.println();
        }
        System.out.println("----A---B---C---D---E---F---G---H");
    }

    public void showBoard(Piece[][] board, String typeList) {
        String printValue = null;
        for (int i = 0; i < board.length; i++) {
            System.out.printf("%s-", i + 1);
            for (int j = 0; j < board[i].length; j++) {
                Piece value = board[i][j];
                if (value != null) {
                    printValue = typeList.equals("Entero") ? String.valueOf(value.getValueInt()) : value.getValueChar();
                }
                System.out.printf("|%s|", value != null ? printValue : "  ");
            }
            System.out.println();
        }
        System.out.println("----A---B---C---D---E---F---G---H");
    }
}
