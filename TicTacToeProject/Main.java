package TicTacToeProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playAgain = true;

        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println("--------------------------");
        System.out.println("Instructions:");
        System.out.println("Enter row and column numbers. Example: '1 2' means row 1, column 2.");
        System.out.println();

        while (playAgain) {
            String name1 = "";
            String name2 = "";

            // Ask for Player 1 name (X)
            while (true) {
                System.out.print("Enter name for Player 1 (X): ");
                name1 = sc.nextLine().trim();
                if (!name1.isEmpty()) break;
                System.out.println("Player 1 name cannot be empty. Please enter a name.");
            }

            // Ask for Player 2 name (O)
            while (true) {
                System.out.print("Enter name for Player 2 (O): ");
                name2 = sc.nextLine().trim();
                if (!name2.isEmpty()) break;
                System.out.println("Player 2 name cannot be empty. Please enter a name.");
            }

            Player p1 = new Player(name1, 'X');
            Player p2 = new Player(name2, 'O');

            Game game = new Game(p1, p2);
            game.start();

            System.out.print("Do you want to play again? (yes/no): ");
            String response = sc.nextLine().trim();
            playAgain = response.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing Tic Tac Toe!");
    }
}

