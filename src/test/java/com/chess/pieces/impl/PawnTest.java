package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PawnTest {

  private static final int          ROW           = 3;
  private static final int          COLUMN        = 4;
  private static final List<String> expectedMoves = Arrays.asList("D6");

  @Test
  public void shouldGetPossibleMoves() {
    Piece pawn = new Pawn(PieceEnum.PAWN.getName());
    Position position = new Position(ROW, COLUMN);
    final List<String> possibleMoves = pawn.getPossibleMoves(position);
    assertEquals(expectedMoves, possibleMoves);
  }
}