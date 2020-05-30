package com.chess.position;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PositionMapper {

  private static final Map<String, Position> positionMap = new HashMap<>();

  private static void initialize() {
    for (int i = 8; i >= 1; i--) {
      char ch = 'A';
      for (int j = 0; j < 8; j++) {
        String key = ch + "" + i;
        positionMap.put(key, new Position(j, i - 1));
        ch++;
      }
    }
  }

  public static Integer getRow(final String location) {
    if (positionMap.isEmpty()) {
      initialize();
    }
    return Optional.ofNullable(location).map(positionMap::get).map(Position::getRow).orElse(null);
  }

  public static Integer getCol(final String location) {
    if (positionMap.isEmpty()) {
      initialize();
    }
    return Optional.ofNullable(location).map(positionMap::get).map(Position::getCol).orElse(null);
  }

  public static String getLocation(Position position) {
    return positionMap
        .entrySet()
        .stream()
        .filter(e -> e.getValue().equals(position))
        .map(Map.Entry::getKey)
        .findFirst()
        .orElse(null);
  }

  public static Position getPosition(final String location) {
    if (positionMap.isEmpty()) {
      initialize();
    }
    return positionMap.get(location);
  }

}
