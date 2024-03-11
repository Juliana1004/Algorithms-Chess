package jala.university.chess.array;

public enum PiecePrint {
    KING("♚"), KINGW("♔"), QUEEN("♛"), QUEENW("♕"), HORSE("♞"), HORSEW("♘")
    , TOWER("♜"), TOWERW("♖"), BISHOP("♝"), BISHOPW("♗"), PAWN("♟"), PAWNW("♙");

    final String value;

    PiecePrint(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
