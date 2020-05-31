package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BishopTest {

  private static final int          ROW           = 3;
  private static final int          COLUMN        = 4;
  private static final List<String> expectedMoves = Arrays.asList("E6", "F7", "G8", "E4", "F3", "G2", "H1", "C4", "B3",
                                                                  "A2", "C6", "B7", "A8");

  @Test
  public void shouldGetPossibleMoves() {
    Piece bishop = new Bishop(PieceEnum.BISHOP.getName());
    Position position = new Position(ROW, COLUMN);
    final List<String> possibleMoves = bishop.getPossibleMoves(position);
    assertEquals(expectedMoves, possibleMoves);
  }
}