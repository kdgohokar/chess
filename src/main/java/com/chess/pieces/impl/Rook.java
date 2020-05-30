package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;

import java.util.List;

public class Rook extends Piece {

  public Rook(final String name) {
    super(name);
  }

  @Override
  public List<String> possibleMoves(final Position piecePosition) {
    return null;
  }

}
