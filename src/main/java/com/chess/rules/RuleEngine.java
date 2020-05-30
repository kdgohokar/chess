package com.chess.rules;

import com.chess.pieces.Piece;
import com.chess.util.PieceEnum;

public class RuleEngine {

  public static IRule getRule(Piece piece) {
    PieceEnum pieceEnum = PieceEnum.permissiveValueOf(piece.getName());
    return pieceEnum.getRule();
  }

}
