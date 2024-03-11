package jala.university.chess.board;

import jala.university.chess.array.Piece;

public class BoardManager {
    private final String color;
    private final Piece[] array;
    private final String typeList;
    BoardPrint print = new BoardPrint();
    private Piece[][] board = new Piece[8][8];

    public BoardManager(Piece[] list, String color, String type) {
        this.array = list;
        createTables(list.length);
        this.color = color;
        this.typeList = type;
    }

    public void showBoardWithValue() {
        print.showBoard(board, typeList);
    }

    public void showBoardWithPiece() {
        print.showBoardPiece(board, color);
    }

    public void updateBoard(String[] piecePositions) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int index = i * 8 + j;
                if (index < piecePositions.length && piecePositions[index] != null) {
                    for (Piece piece : array) {
                        if (piece.getPosition() == Integer.parseInt(piecePositions[index])) {
                            board[i][j] = piece;
                        }
                    }
                } else {
                    board[i][j] = null;
                }
            }
        }
    }

    public void createTables(int totalPieces) {
        int rowCount = (int) Math.ceil((double) totalPieces / 8);
        String[] pieceValuesArray = new String[rowCount];
        StringBuilder stringBuilder = new StringBuilder();
        for (int indexRows = 0; indexRows < totalPieces; indexRows++) {
            stringBuilder.append(array[indexRows].getPosition());
            if ((indexRows + 1) % 8 == 0 || indexRows == totalPieces - 1) {
                pieceValuesArray[indexRows / 8] = stringBuilder.toString();
                stringBuilder.setLength(0);
            }
        }
        for (int i = 0; i < 8 && i < pieceValuesArray.length; i++) {
            String row = pieceValuesArray[i];
            for (int j = 0; j < 8 && j < row.length(); j++) {
                char cell = row.charAt(j);
                for (Piece piece : array) {
                    if (piece.getPosition() == cell) {
                        board[i][j] = piece;
                    }
                }
            }
        }
    }

    public void changeToPositionPieces() {
        this.board = print.valuePieces(color, array);
    }
}

