package com.chess.rules;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

import java.util.ArrayList;
import java.util.List;


public interface IRule {

  default List<String> possibleMoves(final Piece piece, final Position source) {
    IRule rule = RuleEngine.getRule(piece);
    List<String> possibleMoves = new ArrayList<>();
    for (int i = 0; i < 8; i++) {
      int row = source.getRow() + getRowValue(i);
      int col = source.getCol() + getColValue(i);
      Position destination = new Position(row, col);
      if (piece.validate(source, destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }
    return possibleMoves;
  }

  int getRowValue(final int index);

  int getColValue(final int index);
}
