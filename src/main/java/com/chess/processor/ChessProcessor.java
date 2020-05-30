package com.chess.processor;

import com.chess.command.Command;
import com.chess.pieces.Piece;

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
      Piece piece = cmd.getPiece();
      List<String> possibleMovesList = piece.possibleMoves(cmd.getPosition());
      System.out.println(possibleMovesList);
      System.out.println("Press 'Q' to quit. Press any other key to play again.");
    } while (playAgain());

    scanner.close();
  }

  private boolean playAgain() {
    return !(QUIT_KEY.equalsIgnoreCase(scanner.next()));
  }

}
