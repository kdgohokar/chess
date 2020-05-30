package com.chess.position;

import java.util.Objects;

public class Position {

  private Integer row;
  private Integer col;

  public Position(final int row, final int col) {
    this.row = row;
    this.col = col;
  }

  public Position(final String position) {
    this.row = PositionMapper.getRow(position);
    this.col = PositionMapper.getCol(position);
  }

  public Integer getRow() {
    return row;
  }

  public Integer getCol() {
    return col;
  }

  public boolean validate() {
    return this.row >= 0 && this.col >= 0 && this.row < 8 && this.col < 8;
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
