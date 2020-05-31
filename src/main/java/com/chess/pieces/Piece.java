package com.chess.pieces;

import com.chess.position.Position;

import java.util.List;

public abstract class Piece {

  private String name;

  public Piece(final String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean validate(Position start, Position end) {
    return end.validate();
  }

  public abstract List<String> getPossibleMoves(Position position);

  @Override
  public String toString() {
    return "Piece{" + "name='" + name + '\'' + '}';
  }

}
