// Luqman Kabiru
import java.util.*;
public class Blackjack {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        Random rand = new Random();
        boolean playAgain = true;
        // created a boolean so that a while loop for the game to play if user says yes happens

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Welcome To the Blackjack Table");
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        // intro to the game

        while (playAgain) {
            // initial cards for the player
            int playerNum1 = rand.nextInt(1, 12);
            int playerNum2 = rand.nextInt(1, 12);
            int playerSum = playerNum1 + playerNum2;

            // initial cards for the dealer
            int dealerNum1 = rand.nextInt(1, 12);
            int dealerNum2 = rand.nextInt(1, 12);
            int dealerSum = dealerNum1 + dealerNum2;

            // game start
            System.out.println("Player’s Turn +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            System.out.println("Card: " + playerNum1 + " Current total: " + playerNum1);
            System.out.println("Card: " + playerNum2 + " Current total: " + playerSum);

            // player's turn begins
            while (playerSum <= 21) {
                System.out.print("(h)it or (s)tand?: ");
                String status = console.next();
                // asking the user to hit or stand if their total is less than or equal to 21

                if (status.equals("h")) {
                    int newCard = rand.nextInt(1, 12);
                    // this variable is the new value of the card given to the player everytime they hit
                    playerSum = playerSum + newCard;
                    // this variable is the total count added on to the count before
                    System.out.println("Card: " + newCard + " Current total: " + playerSum);
                    // out put of the current card they were given and their total value
                }
                else if (status.equals("s")) {
                    break;
                    // when the player stands the player's turn ends due to the break
                }
            }

            System.out.println("Player’s total is: " + playerSum);
            // total player sum
            System.out.println("Dealer’s Turn +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            // intro to dealer's turn
            int newDealer1 = rand.nextInt(1, 12);
            int newDealer2 = rand.nextInt(1, 12);
            // dealer's first two cards
            dealerSum = (newDealer1 + newDealer2);
            // sum of the first two cards
            System.out.println("Card: " + newDealer1 + " Current total: " + newDealer1);
            System.out.println("Card: " + newDealer2 + " Current total: " + dealerSum);

            // dealer's turn begins
            while (dealerSum < 17) {
                int newCard = rand.nextInt(1, 12);
                // when the value of the dealer's cards isn't equal to or over 17, a new value for the card is generated
                dealerSum = dealerSum + newCard;
                // sum of dealer's cards added to the current card given to the dealer
                System.out.println("Card: " + newCard + " Current total: " + dealerSum);
                // outputs current card value given and total card sum
            }
            System.out.println("Dealer’s total is: " + dealerSum);
            // when value of cards are equal to or over 17, the dealer's total is presented and the round is over

            if (playerSum > 21 && dealerSum > 21) {
                System.out.println("It's a tie!");
                // if both player and dealer bust, it's a tie
            }
            else if (playerSum > 21) {
                System.out.println("Dealer wins!");
                // if only the player busts then the dealer wins
            }
            else if (dealerSum > 21) {
                System.out.println("Player wins!");
                // if only the dealer busts then the player wins
            }
            else if (playerSum == dealerSum) {
                System.out.println("It's a tie!");
                // if both dealer and player has the same value in their total sum then it's a tie
            }
            else if ((playerSum > dealerSum) && playerSum <= 21) {
                System.out.println("Player wins!");
                // if player's sum is greater than dealer's sum and the sum of the player is less than or equal to 21 then the player wins
            }
            else if ((dealerSum > dealerNum1) && dealerSum <= 21) {
                System.out.println("Dealer wins!");
                // if dealer's sum is greater than player's sum and the sum of the dealer is less than or equal to 21 then the dealer wins

            }
            else {
                System.out.println("It's a tie!");
                // any other unforeseen result will be a tie
            }

            System.out.print("Play again? [y/n]: ");
            // asking the player if they want to keep playing within the while loop
            String play = console.next();
            playAgain = play.equals("y");
            // if player says y then the game moves on the next round, else the game is over
        }
    }
}
