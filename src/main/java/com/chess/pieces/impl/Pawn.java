package com.chess.pieces.impl;

import com.chess.pieces.Piece;

import java.util.List;

public class Pawn extends Piece {

  public Pawn(final String name) {
    super(name);
  }

  public List<String> possibleMoves() {
    return null;
  }

  public boolean canMove(final int start, final int dest) {
    return false;
  }
}
