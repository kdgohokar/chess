package com.chess.pieces.impl;

import com.chess.pieces.Piece;
import com.chess.position.Position;
import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class HorseTest {

  private static final int          ROW           = 4;
  private static final int          COLUMN        = 2;
  private static final List<String> expectedMoves = Arrays.asList("G4", "F5", "D5", "C4", "C2", "D1", "F1", "G2");

  @Test
  public void shouldGetPossibleMoves() {
    Piece horse = new Horse(PieceEnum.HORSE.getName());
    Position position = new Position(ROW, COLUMN);
    final List<String> possibleMoves = horse.getPossibleMoves(position);
    assertEquals(expectedMoves, possibleMoves);
  }
}