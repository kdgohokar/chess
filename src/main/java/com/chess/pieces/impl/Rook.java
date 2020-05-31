package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {

  public Rook(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    List<String> possibleMoves = new ArrayList<>();
    int row = position.getRow();
    int col = position.getCol();

    for (int i = row + 1; i < 8; i++) {
      Position destination = new Position(i, col);
      if (validate(position, destination)) {
        final String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    for (int i = row - 1; i >= 0; i--) {
      Position destination = new Position(i, col);
      if (validate(position, destination)) {
        final String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    for (int i = col + 1; i < 8; i++) {
      Position destination = new Position(row, i);
      if (validate(position, destination)) {
        final String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    for (int i = col - 1; i >= 0; i--) {
      Position destination = new Position(row, i);
      if (validate(position, destination)) {
        final String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }

    return possibleMoves;
  }

}
