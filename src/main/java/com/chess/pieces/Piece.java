package com.chess.pieces;

import com.chess.position.Position;

import java.util.List;

public abstract class Piece {

  private String name;

  public boolean validate(Position start, Position end) {
    return start.validate() && end.validate();
  }

  public abstract List<String> possibleMoves(Position piecePosition);

  public Piece(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "Piece{" + "name='" + name + '\'' + '}';
  }
}
