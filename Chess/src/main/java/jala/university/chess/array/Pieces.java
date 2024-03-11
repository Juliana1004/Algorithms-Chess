package jala.university.chess.array;

public enum Pieces {
    KING(new Piece(4, 1, "A", PiecePrint.KING.getValue()))
    , QUEEN(new Piece(3, 2, "B", PiecePrint.QUEEN.getValue()))
    , TOWER1(new Piece(0, 3, "C", PiecePrint.TOWER.getValue()))
    , TOWER2(new Piece(7, 4, "D", PiecePrint.TOWER.getValue()))
    , BISHOP1(new Piece(2, 5, "E", PiecePrint.BISHOP.getValue()))
    , BISHOP2(new Piece(5, 6, "F", PiecePrint.BISHOP.getValue()))
    , HORSE1(new Piece(1, 7, "G", PiecePrint.HORSE.getValue()))
    , HORSE2(new Piece(6, 8, "H", PiecePrint.HORSE.getValue()))
    , PAWN1(new Piece(8, 9, "I", PiecePrint.PAWN.getValue()))
    , PAWN2(new Piece(9, 10, "J", PiecePrint.PAWN.getValue()))
    , PAWN3(new Piece(10, 11, "K", PiecePrint.PAWN.getValue()))
    , PAWN4(new Piece(11, 12, "L", PiecePrint.PAWN.getValue()))
    , PAWN5(new Piece(12, 13, "M", PiecePrint.PAWN.getValue()))
    , PAWN6(new Piece(13, 14, "N", PiecePrint.PAWN.getValue()))
    , PAWN7(new Piece(14, 15, "O", PiecePrint.PAWN.getValue()))
    , PAWN8(new Piece(15, 16, "P", PiecePrint.PAWN.getValue()));

    final Piece value;

    Pieces(Piece value) {
        this.value = value;
    }

    public Piece getValue() {
        return value;
    }
}
