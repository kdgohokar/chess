package com.chess.util;

import com.chess.rule.IRule;
import com.chess.rule.impl.BishopRule;
import com.chess.rule.impl.HorseRule;
import com.chess.rule.impl.KingRule;

import java.util.Optional;
import java.util.stream.Stream;

public enum PieceEnum {
  KING("King", new KingRule()),
  QUEEN("Queen", null),
  BISHOP("Bishop", new BishopRule()),
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

  public Optional<IRule> getRule() {
    return Optional.ofNullable(rule);
  }

  public static PieceEnum permissiveValueOf(final String name) {
    return Stream
        .of(values())
        .filter(p -> p.name.equalsIgnoreCase(name))
        .findFirst()
        .orElseThrow(() -> new RuntimeException(name + " does not exists."));
  }

}
