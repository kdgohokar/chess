package com.chess.command;

import com.chess.pieces.Piece;
import com.chess.pieces.PieceFactory;
import com.chess.position.Position;
import com.chess.position.PositionMapper;

public class Command {
  private Piece    piece;
  private Position position;

  public Command(final String piece, final String position) {
    this.piece = PieceFactory.getPiece(piece);
    this.position = PositionMapper.getPosition(position);
  }

  public Piece getPiece() {
    return piece;
  }

  public Position getPosition() {
    return position;
  }

  @Override
  public String toString() {
    return "Command{" + "piece=" + piece + ", position=" + position + '}';
  }
}
