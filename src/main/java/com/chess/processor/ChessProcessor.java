package com.chess.processor;

import com.chess.command.Command;

import java.util.List;
import java.util.Scanner;

import static com.chess.util.Constants.QUIT_KEY;

public class ChessProcessor {

  private static final Scanner scanner = new Scanner(System.in);

  public void process() {
    do {
      System.out.println("Enter Your Input: ");
      String pieceStr = scanner.next();
      String positionStr = scanner.next();
      Command cmd = new Command(pieceStr, positionStr);
      final List<String> strings = cmd.getPiece().possibleMoves(cmd.getPosition());
      System.out.println(strings);
      System.out.println("Enter 'Q' to quit. 'Y' to continue.");
    } while (playAgain());

    scanner.close();
  }

  private boolean playAgain() {
    return !(QUIT_KEY.equalsIgnoreCase(scanner.next()));
  }

}
