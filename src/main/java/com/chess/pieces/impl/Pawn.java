package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;

import java.util.List;

public class Pawn extends Piece {

  public Pawn(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    return null;
  }

}
