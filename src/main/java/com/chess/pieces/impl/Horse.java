package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;

import java.util.List;

public class Horse extends Piece {

  public Horse(final String name) {
    super(name);
  }

  @Override
  public List<String> possibleMoves(final Position piecePosition) {
    return null;
  }

}
