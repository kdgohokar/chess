package com.chess.rules;

import java.util.Arrays;
import java.util.List;

public class HorseRule implements IRule {

  private static final List<Integer> rows    = Arrays.asList(2, 1, -1, -2, -2, -1, 1, 2);
  private static final List<Integer> columns = Arrays.asList(1, 2, 2, 1, -1, -2, -2, -1);

  @Override
  public int getRowValue(final int index) {
    return rows.get(index);
  }
  
  @Override
  public int getColValue(final int index) {
    return columns.get(index);
  }

}
