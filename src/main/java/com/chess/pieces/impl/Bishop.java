package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;

import java.util.List;

public class Bishop extends Piece {

  public Bishop(final String name) {
    super(name);
  }

  @Override
  public boolean validate(final Position start, final Position end) {
    return super.validate(start, end);
  }

  @Override
  public List<String> possibleMoves(final Position piecePosition) {
    return null;
  }

}
