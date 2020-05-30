package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;

import java.util.List;

public class Queen extends Piece {

  public Queen(final String name) {
    super(name);
  }

  @Override
  public List<String> possibleMoves(final Position piecePosition) {
    return null;
  }

}
