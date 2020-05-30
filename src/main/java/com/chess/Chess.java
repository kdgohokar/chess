package com.chess;

import com.chess.command.Command;

import java.util.Scanner;

import static com.chess.util.Constants.QUIT_KEY;

public class Chess {

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      do {
        System.out.println("Enter Your Input: ");
        String piece = sc.next();
        String position = sc.next();
        Command cmd = new Command(piece, position);
        System.out.println("Press 'Q' to quit. Press any other key to play again.");
      } while (playAgain(sc));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static boolean playAgain(final Scanner sc) {
    return !(QUIT_KEY.equalsIgnoreCase(sc.next()));
  }

}
