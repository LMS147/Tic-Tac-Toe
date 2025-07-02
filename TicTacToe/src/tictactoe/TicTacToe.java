/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tictactoe;
import java.util.Scanner;
/**
 *
 * @author masha
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        Board board = new Board();
        board.printBoard();
        System.out.println("Tic-Tac-Toe Game!");
        System.out.println("Player 1: X");
        System.out.println("Player 2: O");

        while (true) {
            int row, col;
            System.out.println("Player " + board.getCurrentPlayer() + ", enter your move (row and column): ");
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;

            if (board.placeMark(row, col)) {
                board.printBoard();
                if (board.checkForWin()) {
                    System.out.println("Player " + board.getCurrentPlayer() + " wins!");
                    break;
                }
                if (board.isBoardFull()) {
                    System.out.println("The game is a draw!");
                    break;
                }
                board.changePlayer();
            } else {
                System.out.println("This move is not valid");
            }
        }
        scanner.close();
    }
    }
    

