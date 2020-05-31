package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Horse extends Piece {

  private static final List<Integer> rows   = Arrays.asList(2, 1, -1, -2, -2, -1, 1, 2);
  private static final List<Integer> column = Arrays.asList(1, 2, 2, 1, -1, -2, -2, -1);

  public Horse(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    List<String> possibleMoves = new ArrayList<>(8);
    for (int i = 0; i < 8; i++) {
      int row = position.getRow() + rows.get(i);
      int col = position.getCol() + column.get(i);
      Position destination = new Position(row, col);
      if (validate(position, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }
    return possibleMoves;
  }

}
