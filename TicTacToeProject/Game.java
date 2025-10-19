package TicTacToeProject;

import java.util.Scanner;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner sc;

    public Game(Player p1, Player p2) {
        board = new Board();
        player1 = p1;
        player2 = p2;
        currentPlayer = player1;   // X starts first
        sc = new Scanner(System.in);
    }

    public void start() {
        boolean gameOn = true;
        System.out.println("\nLet's begin Tic Tac Toe!");
        board.printBoard();

        while (gameOn) {
            System.out.println("Player " + currentPlayer.getName() +
                    " (" + currentPlayer.getSymbol() + "), make your move (row col): ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!board.isValidMove(row, col)) {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board.placeMove(row, col, currentPlayer.getSymbol());
            board.printBoard();

            if (board.checkWinner(currentPlayer.getSymbol())) {
                System.out.println("Player " + currentPlayer.getName() + " wins!");
                gameOn = false;
            } else if (board.isFull()) {
                System.out.println("It's a draw!");
                gameOn = false;
            } else {
                currentPlayer = (currentPlayer == player1) ? player2 : player1;
            }
        }
    }
}

