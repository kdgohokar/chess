package com.chess.rule;

import com.chess.position.Position;

public interface IRule {

  int getRow(final int index);

  int getCol(final int index);

  default boolean validate(final Position end) {
    return end.validate();
  }

}
