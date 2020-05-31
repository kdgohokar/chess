package com.chess.util;

public class Constants {
  private Constants() throws IllegalAccessException {
    throw new IllegalAccessException("Cannot instantiate Constants");
  }

  public static final int    MAX_SIZE = 8;
  public static final int    MIN_SIZE = 0;
  public static final String QUIT_KEY = "Q";
}
