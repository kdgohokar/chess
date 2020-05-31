package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {

  public Bishop(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    List<String> possibleMoves = new ArrayList<>();
    int row = position.getRow();
    int col = position.getCol();

    for (int i = row + 1, j = col + 1; i < 8 && j < 8; i++, j++) {
      Position destination = new Position(i, j);
      if (validate(position, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    for (int i = row + 1, j = col - 1; i < 8 && j >= 0; i++, j--) {
      Position destination = new Position(i, j);
      if (validate(position, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
      Position destination = new Position(i, j);
      if (validate(position, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    for (int i = row - 1, j = col + 1; i >= 0 && j < 8; i--, j++) {
      Position destination = new Position(i, j);
      if (validate(position, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    return possibleMoves;
  }

}
