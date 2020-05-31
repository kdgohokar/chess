package com.chess.pieces;

import com.chess.pieces.impl.Bishop;
import com.chess.pieces.impl.Horse;
import com.chess.pieces.impl.King;
import com.chess.pieces.impl.Pawn;
import com.chess.pieces.impl.Queen;
import com.chess.pieces.impl.Rook;
import com.chess.util.PieceEnum;

public class PieceFactory {

  private PieceFactory() throws IllegalAccessException {
    throw new IllegalAccessException("Invalid PieceFactory instantiation.");
  }

  public static Piece getPiece(final String piece) {
    PieceEnum pieceEnum = PieceEnum.permissiveValueOf(piece);
    return getPiece(pieceEnum);
  }

  public static Piece getPiece(final PieceEnum pieceEnum) {
    switch (pieceEnum) {
      case KING:
        return new King(pieceEnum.getName());
      case QUEEN:
        return new Queen(pieceEnum.getName());
      case BISHOP:
        return new Bishop(pieceEnum.getName());
      case HORSE:
        return new Horse(pieceEnum.getName());
      case ROOK:
        return new Rook(pieceEnum.getName());
      case PAWN:
        return new Pawn(pieceEnum.getName());
      default:
        throw new IllegalArgumentException("Piece does not exists");
    }
  }

}
