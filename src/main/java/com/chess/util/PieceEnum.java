package com.chess.util;

import java.util.stream.Stream;

public enum PieceEnum {
  KING("King"),
  QUEEN("Queen"),
  BISHOP("Bishop"),
  HORSE("Horse"),
  ROOK("Rook"),
  PAWN("Pawn");

  private String name;

  PieceEnum(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public static PieceEnum permissiveValueOf(final String name) {
    return Stream
        .of(values())
        .filter(p -> p.name.equalsIgnoreCase(name))
        .findFirst()
        .orElseThrow(() -> new RuntimeException(name + " does not exists."));
  }

}
