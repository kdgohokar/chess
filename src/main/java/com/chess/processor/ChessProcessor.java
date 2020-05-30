package com.chess.processor;

import com.chess.command.Command;
import com.chess.rule.RuleEngine;

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
      RuleEngine ruleEngine = new RuleEngine(cmd);
      System.out.println(ruleEngine.getPossibleMoves());
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
