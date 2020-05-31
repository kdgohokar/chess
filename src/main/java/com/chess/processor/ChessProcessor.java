package com.chess.processor;

import com.chess.command.Command;

import java.util.List;
import java.util.Scanner;

import static com.chess.util.Constants.QUIT_KEY;

public class ChessProcessor {

  private static final Scanner scanner = new Scanner(System.in);

  public void start() {
    do {
      play();
    } while (playAgain());
    scanner.close();
  }

  private void play() {
    try {
      System.out.println("Enter Your Input: ");
      String pieceStr = scanner.next();
      String positionStr = scanner.next();
      Command cmd = new Command(pieceStr, positionStr);
      final List<String> possibleMoves = cmd.getPiece().getPossibleMoves(cmd.getPosition());
      System.out.println(possibleMoves);
    } catch (Exception e) {
      System.err.println(e.getMessage());
    } finally {
      System.out.println("Enter 'Q' to quit. 'Y' to continue.");
    }
  }

  private boolean playAgain() {
    return !(QUIT_KEY.equalsIgnoreCase(scanner.next()));
  }

}
