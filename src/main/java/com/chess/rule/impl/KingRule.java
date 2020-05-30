package com.chess.rule.impl;

import com.chess.rule.IRule;

public class KingRule implements IRule {

  private static final int[] rows    = {0, 1, 1, 1, 0, -1, -1, -1};
  private static final int[] columns = {1, 1, 0, -1, -1, -1, 0, 1};

  @Override
  public int getRow(final int index) {
    return rows[index];
  }

  @Override
  public int getCol(final int index) {
    return columns[index];
  }

}
