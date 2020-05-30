package com.chess.rule.impl;

import com.chess.rule.IRule;

import java.util.Arrays;
import java.util.List;

public class HorseRule implements IRule {

  private static final List<Integer> rows   = Arrays.asList(2, 1, -1, -2, -2, -1, 1, 2);
  private static final List<Integer> column = Arrays.asList(1, 2, 2, 1, -1, -2, -2, -1);

  @Override
  public int getRow(final int index) {
    return rows.get(index);
  }

  @Override
  public int getCol(final int index) {
    return column.get(index);
  }

}
