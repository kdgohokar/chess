package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.pieces.PieceFactory;
import com.chess.position.Position;
import com.chess.util.PieceEnum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Queen extends Piece {

  public Queen(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    List<String> possibleMoves = new ArrayList<>();
    Piece bishop = PieceFactory.getPiece(PieceEnum.BISHOP);
    Piece rook = PieceFactory.getPiece(PieceEnum.ROOK);
    List<Piece> pieces = Arrays.asList(bishop, rook);
    for (Piece piece : pieces) {
      possibleMoves.addAll(piece.getPossibleMoves(position));
    }
    return possibleMoves;
  }

}
