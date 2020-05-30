package com.chess.position;

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

  @Override
  public String toString() {
    return "Position{" + "row=" + row + ", col=" + col + '}';
  }
}
