package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class QueenTest {

  private static final int          ROW           = 0;
  private static final int          COLUMN        = 0;
  private static final List<String> expectedMoves = Arrays.asList("B2", "C3", "D4", "E5", "F6", "G7", "H8", "B1", "C1",
                                                                  "D1", "E1", "F1", "G1", "H1", "A2", "A3", "A4", "A5",
                                                                  "A6", "A7", "A8");

  @Test
  public void shouldGetPossibleMoves() {
    Piece queen = new Queen(PieceEnum.QUEEN.getName());
    Position position = new Position(ROW, COLUMN);
    final List<String> possibleMoves = queen.getPossibleMoves(position);
    assertEquals(expectedMoves, possibleMoves);
  }
}