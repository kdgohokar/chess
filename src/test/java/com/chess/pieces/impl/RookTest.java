package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RookTest {

  private static final int          ROW           = 2;
  private static final int          COLUMN        = 4;
  private static final List<String> expectedMoves = Arrays.asList("D5", "E5", "F5", "G5", "H5", "B5", "A5", "C6", "C7",
                                                                  "C8", "C4", "C3", "C2", "C1");

  @Test
  public void shouldGetPossibleMoves() {
    Piece rook = new Rook(PieceEnum.ROOK.getName());
    Position position = new Position(ROW, COLUMN);
    final List<String> possibleMoves = rook.getPossibleMoves(position);
    assertEquals(expectedMoves, possibleMoves);
  }
}