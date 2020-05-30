package com.chess.util;

import com.chess.rules.HorseRule;
import com.chess.rules.IRule;

import java.util.stream.Stream;

public enum PieceEnum {
  KING("King", null),
  QUEEN("Queen", null),
  BISHOP("Bishop", null),
  HORSE("Horse", new HorseRule()),
  ROOK("Rook", null),
  PAWN("Pawn", null);

  private String name;
  private IRule  rule;

  PieceEnum(String name, IRule rule) {
    this.name = name;
    this.rule = rule;
  }

  public String getName() {
    return name;
  }

  public IRule getRule() {
    return rule;
  }

  public static PieceEnum permissiveValueOf(final String name) {
    return Stream
        .of(values())
        .filter(p -> p.name.equalsIgnoreCase(name))
        .findFirst()
        .orElseThrow(() -> new RuntimeException(name + " does not exists."));
  }

}
