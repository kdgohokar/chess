package com.chess.command;

public class Command {
  private String piece;
  private String position;

  public Command(final String piece, final String position) {
    this.piece = piece;
    this.position = position;
  }

  public String getPiece() {
    return piece;
  }

  public String getPosition() {
    return position;
  }

  @Override
  public String toString() {
    return "Command{" + "piece='" + piece + '\'' + ", position='" + position + '\'' + '}';
  }
}
