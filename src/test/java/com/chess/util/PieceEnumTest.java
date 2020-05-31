package com.chess.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PieceEnumTest {

  @Test
  public void shouldGetPermissiveValueOf() {
    final PieceEnum pieceEnum = PieceEnum.permissiveValueOf("king");
    assertEquals(PieceEnum.KING, pieceEnum);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldThrowExceptionForInvalidPiece() {
    PieceEnum.permissiveValueOf("xyz");
  }
}