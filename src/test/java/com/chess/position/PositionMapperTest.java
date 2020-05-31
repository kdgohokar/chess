package com.chess.position;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class PositionMapperTest {

  @Test
  public void shouldReturnLocation() {
    assertEquals("D6", PositionMapper.getLocation(new Position(3, 5)));
  }

  @Test
  public void shouldReturnNullForInvalidLocation() {
    assertNull(PositionMapper.getLocation(new Position(8, 7)));
  }

  @Test
  public void shouldReturnPosition() {
    final Position a1 = PositionMapper.getPosition("A1");
    assertEquals(new Position(0, 0), a1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void shouldReturnNullForInvalidPosition() {
    PositionMapper.getPosition("A9");
  }
}