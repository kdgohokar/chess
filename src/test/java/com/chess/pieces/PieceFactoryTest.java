package com.chess.pieces;

import com.chess.util.PieceEnum;
import org.junit.Test;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class PieceFactoryTest {

  @Test
  public void shouldReturnPieceForEnum() {
    Stream.of(PieceEnum.values()).forEach(pieceEnum -> {
      final Piece piece = PieceFactory.getPiece(pieceEnum);
      assertEquals(pieceEnum.getName(), piece.getName());
    });
  }

  @Test
  public void shouldReturnPieceForName() {
    Stream.of(PieceEnum.values()).forEach(pieceEnum -> {
      final Piece piece = PieceFactory.getPiece(pieceEnum.getName());
      assertEquals(pieceEnum.getName(), piece.getName());
    });
  }

}