package com.chess.rule;

import com.chess.command.Command;
import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.position.PositionMapper;
import com.chess.util.PieceEnum;

import java.util.ArrayList;
import java.util.List;

public class RuleEngine {

  private Piece    piece;
  private Position position;

  public RuleEngine(final Command command) {
    this.piece = command.getPiece();
    this.position = command.getPosition();
  }

  public List<String> getPossibleMoves() {
    PieceEnum pieceEnum = PieceEnum.permissiveValueOf(piece.getName());
    IRule rule = pieceEnum.getRule().orElseThrow(() -> new RuntimeException("Rule not defined for " + piece.getName()));
    List<String> possibleMoves = new ArrayList<>(8);
    for (int i = 0; i < 8; i++) {
      int row = position.getRow() + rule.getRow(i);
      int col = position.getCol() + rule.getCol(i);
      Position destination = new Position(row, col);
      if (rule.validate(destination)) {
        String location = PositionMapper.getLocation(destination);
        possibleMoves.add(location);
      }
    }
    return possibleMoves;
  }

}
