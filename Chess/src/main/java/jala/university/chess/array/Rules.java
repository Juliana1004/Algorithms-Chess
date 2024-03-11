package jala.university.chess.array;

public enum Rules {
    RULE1(new Piece[]{Pieces.KING.getValue()}),
    RULE2(new Piece[]{Pieces.KING.getValue(),Pieces.QUEEN.getValue()}),
    RULE4(new Piece[]{Pieces.KING.getValue(), Pieces.QUEEN.getValue(), Pieces.BISHOP1.getValue()
            , Pieces.BISHOP2.getValue()}),
    RULE6(new Piece[]{Pieces.KING.getValue(), Pieces.QUEEN.getValue(), Pieces.BISHOP1.getValue()
            , Pieces.BISHOP2.getValue(), Pieces.HORSE1.getValue(), Pieces.HORSE2.getValue()}),
    RULE8(new Piece[]{Pieces.KING.getValue(), Pieces.QUEEN.getValue(), Pieces.BISHOP1.getValue()
            , Pieces.BISHOP2.getValue(), Pieces.HORSE1.getValue(), Pieces.HORSE2.getValue()
            , Pieces.TOWER1.getValue(), Pieces.TOWER2.getValue()}),
    RULE10(new Piece[]{Pieces.PAWN1.getValue(), Pieces.PAWN2.getValue(), Pieces.PAWN3.getValue()
            , Pieces.PAWN4.getValue(), Pieces.PAWN5.getValue(), Pieces.PAWN6.getValue(), Pieces.PAWN7.getValue()
            , Pieces.PAWN8.getValue()}),
    RULE16(new Piece[]{Pieces.KING.getValue(), Pieces.QUEEN.getValue(), Pieces.BISHOP1.getValue()
            , Pieces.BISHOP2.getValue(), Pieces.HORSE1.getValue(), Pieces.HORSE2.getValue()
            , Pieces.TOWER1.getValue(), Pieces.TOWER2.getValue(), Pieces.PAWN1.getValue(), Pieces.PAWN2.getValue()
            , Pieces.PAWN3.getValue(), Pieces.PAWN4.getValue(), Pieces.PAWN5.getValue(), Pieces.PAWN6.getValue()
            , Pieces.PAWN7.getValue(), Pieces.PAWN8.getValue()});

    final Piece[] value;

    Rules(Piece[] value) {
        this.value = value;
    }

    public Piece[] getValue() {
        return value;
    }
}
