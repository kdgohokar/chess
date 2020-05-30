package com.chess.pieces;

public abstract class Piece {

  private String name;

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
