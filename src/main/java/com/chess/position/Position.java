package com.chess.position;

import java.util.Objects;

import static com.chess.util.Constants.MAX_SIZE;
import static com.chess.util.Constants.MIN_SIZE;

public class Position {

  private Integer row;
  private Integer col;

  public Position(final int row, final int col) {
    this.row = row;
    this.col = col;
  }

  public Integer getRow() {
    return row;
  }

  public Integer getCol() {
    return col;
  }

  public boolean validate() {
    return this.row >= MIN_SIZE && this.col >= MIN_SIZE && this.row < MAX_SIZE && this.col < MAX_SIZE;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final Position position = (Position) o;
    return Objects.equals(row, position.row) && Objects.equals(col, position.col);
  }

  @Override
  public int hashCode() {
    return Objects.hash(row, col);
  }

  @Override
  public String toString() {
    return "Position{" + "row=" + row + ", col=" + col + '}';
  }
}
