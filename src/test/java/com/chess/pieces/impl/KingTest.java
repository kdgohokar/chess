package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class KingTest {

  private static final int          ROW           = 3;
  private static final int          COLUMN        = 4;
  private static final List<String> expectedMoves = Arrays.asList("D6", "E6", "E5", "E4", "D4", "C4", "C5", "C6");

  @Test
  public void shouldGetPossibleMoves() {
    Piece king = new King(PieceEnum.KING.getName());
    Position position = new Position(ROW, COLUMN);
    final List<String> possibleMoves = king.getPossibleMoves(position);
    assertEquals(expectedMoves, possibleMoves);
  }
}