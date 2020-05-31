package com.chess.position;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static com.chess.util.Constants.MAX_SIZE;
import static com.chess.util.Constants.MIN_SIZE;

public class PositionMapper {

  private static final Map<String, Position> positionMap = new HashMap<>();

  private static void initialize() {
    for (int i = MAX_SIZE; i >= 1; i--) {
      char ch = 'A';
      for (int j = MIN_SIZE; j < MAX_SIZE; j++) {
        String key = ch + "" + i;
        positionMap.put(key, new Position(j, i - 1));
        ch++;
      }
    }
  }

  public static String getLocation(final Position position) {
    reloadMap();
    return positionMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().equals(position))
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);
  }

  public static Position getPosition(final String location) {
    reloadMap();
    return Optional
        .ofNullable(location)
        .map(positionMap::get)
        .orElseThrow(() -> new IllegalArgumentException("Invalid location: " + location));
  }

  private static void reloadMap() {
    if (positionMap.isEmpty()) {
      initialize();
    }
  }

}
