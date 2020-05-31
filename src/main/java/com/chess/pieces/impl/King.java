package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.chess.util.Constants.MAX_SIZE;

public class King extends Piece {

  private static final List<Integer> rows    = Arrays.asList(0, 1, 1, 1, 0, -1, -1, -1);
  private static final List<Integer> columns = Arrays.asList(1, 1, 0, -1, -1, -1, 0, 1);

  public King(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    List<String> possibleMoves = new ArrayList<>(MAX_SIZE);
    for (int i = 0; i < MAX_SIZE; i++) {
      int row = position.getRow() + rows.get(i);
      int col = position.getCol() + columns.get(i);
      Position destination = new Position(row, col);
      if (validate(position, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }
    return possibleMoves;
  }

}
