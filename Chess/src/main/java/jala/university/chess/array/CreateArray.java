package jala.university.chess.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateArray {
    public Piece[] arrayConstructor(int piecesAmount) {
        Rules[] rules = Rules.values();
        Piece[] arrayWithPieces;
        for (Rules rule : rules) {
            if (piecesAmount == 10) {
                arrayWithPieces = rules[5].getValue();
                return arrayWithPieces;
            } else if (piecesAmount == 8) {
                arrayWithPieces = rules[4].getValue();
                return arrayWithPieces;
            } else {
                if (rule.getValue().length == piecesAmount) {
                    arrayWithPieces = rule.getValue();
                    return arrayWithPieces;
                }
            }
        }
        return null;
    }

    public Piece[] listOrden(int pieces) {
        Piece[] array;
        array = arrayConstructor(pieces);
        List<Piece> listToUse = new ArrayList<>(Arrays.asList(array));
        Collections.shuffle(listToUse);
        return listToUse.toArray(new Piece[0]);
    }
}

