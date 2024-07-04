import java.util.Random;

public class RollADice {

    public static void main(String[] args) {
        int player1Score = 0;
        int player2Score = 0;
        int winningScore = 100;
        Random random = new Random();

        boolean player1Turn = true; // to alternate turns

        while (player1Score < winningScore && player2Score < winningScore) {
            int dice1 = random.nextInt(6) + 1;
            int dice2 = random.nextInt(6) + 1;

            if (dice1 == dice2 && dice1 != 1) {
                // Same result (not 1), player gets another chance
                continue;

            }

            if (player1Turn) {

                if (dice1 == 1 && dice2 == 1) {

                    player1Score = 0;
                    System.out.println("Player 1 score is reset to 0. ");

                } else {

                    player1Score += dice1 + dice2;
                    System.out.println("Player 1 rolled " + dice1 + " and " + dice2 + ". New score: " + player1Score);

                }

                player1Turn = false; // Switch to player 2's turn

            } else {

                if (dice1 == 1 && dice2 == 1) {

                    player2Score = 0;
                    System.out.println("Player 2 score is reset to 0.");

                } else {

                    player2Score += dice1 + dice2;
                    System.out.println("Player 2 rolled " + dice1 + " and " + dice2 + ". New score: " + player2Score);

                }

                player1Turn = true; // Switch to player 1's turn

            }
        }

        if (player1Score >= winningScore) {

            System.out.println("Player 1 wins with a score of " + player1Score + "!");

        } else {

            System.out.println("Player 2 wins with a score of " + player2Score + "!");

        }

    }
    
}
