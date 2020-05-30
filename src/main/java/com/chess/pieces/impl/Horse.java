package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.List;


public class Horse extends Piece {

  private static final int rows[]    = {2, 1, -1, -2, -2, -1, 1, 2};
  private static final int columns[] = {1, 2, 2, 1, -1, -2, -2, -1};

  public Horse(final String name) {
    super(name);
  }

  @Override
  public List<String> possibleMoves(final Position source) {
    List<String> possibleMoves = new ArrayList<>(8);
    for (int i = 0; i < 8; i++) {
      int row = source.getRow() + rows[i];
      int col = source.getCol() + columns[i];
      Position destination = new Position(row, col);
      if (validate(source, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }
    return possibleMoves;
  }
}
