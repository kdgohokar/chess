package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {

  public Pawn(final String name) {
    super(name);
  }

  @Override
  public List<String> getPossibleMoves(final Position position) {
    List<String> possibleMoves = new ArrayList<>();
    int row = position.getRow();
    int col = position.getCol();
    Position destination = new Position(row, col + 1);
    if (validate(position, destination)) {
      String location = PositionMapper.getLocation(destination);
      possibleMoves.add(location);
    }
    return possibleMoves;
  }

}
