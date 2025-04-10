// Luqman Kabiru
import java.util.*;
public class DiceStatistics {
    public static void main(String[] args) {
        System.out.println("Dice Statistics =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Summations: 2 3 4 5 6 7 8 9 10 11 12");
        Random rand = new Random();
        int diceNumber1 = rand.nextInt(1,7);
        // random dice number for the first die
        int diceNumber2 = rand.nextInt(1,7);
        // random dice number for the second die
        int diceNumber3 = rand.nextInt(1,7);
        int diceNumber4 = rand.nextInt(1,7);
        int diceNumber5 = rand.nextInt(1,7);
        int diceNumber6 = rand.nextInt(1,7);
        int [] countSum = new int[11];
        // this array is supposed to store counts
        double [] prob = new double[11];
        // array to store probability out of 36
        int [] diceCount = new int[11];
        // count used to find the probability for each sum out of 100
        int [] countDice = new int[11];
        // count used to find probability of each sum out of 1000
        int [] dices = new int [11];
        // count for prob out of 10,000
        double [] newProb = new double[11];
        // array to store probability out of 100
        double [] prob2 = new double[11];
        // array to store probability out of 1000
        double [] prob3 = new double[11];
        // array to store prob out of 10000

        for (int i = 1; i < 7; i++) {
            // for loop for the first dice
            for (int j = 1; j < 7; j++) {
                // second for loop for both die
                int sum = i + j;
                // total for every combination of dice numbers
                countSum[sum - 2]++;
                // increase the count for the sum
            }

        }
        System.out.print("\n# of Combinations: ");
        for (int i = 0; i < countSum.length; i++) {
            System.out.print(countSum[i] + " ");
            double probability = ((double) (countSum[i]) / 36) * 100;
            prob[i] = probability;
            //System.out.print(probability + " ");
        }
        System.out.print("\nProbabilities: ");
        for (int i = 0; i < prob.length; i++) {
            System.out.printf("%.2f%% ", prob[i]);
        }

        for (int i = 1; i < 101; i++) {
            diceNumber1 = rand.nextInt(1,7);
            diceNumber2 = rand.nextInt(1,7);
            int sum = diceNumber1 + diceNumber2;
            // total for every combination of dice numbers
            diceCount[sum - 2]++;
            // increase the count for the sum
        }

        for (int i = 0; i < diceCount.length; i++) {
            double probability = ((double) (diceCount[i]) / 100) * 100;
            newProb[i] = probability;
            //System.out.print(probability + " ");
        }
        System.out.print("\nProbabilities (100 rolls): ");
        for (int i = 0; i < newProb.length; i++) {
            System.out.printf("%.2f%% ", newProb[i]);
        }

        for (int i = 1; i < 1001; i++) {
            diceNumber3 = rand.nextInt(1,7);
            diceNumber4 = rand.nextInt(1,7);
            int sum = diceNumber3 + diceNumber4;
            // total for every combination of dice numbers
            countDice[sum - 2]++;
            // increase the count for the sum
        }

        for (int i = 0; i < countDice.length; i++) {
            double probability = ((double) (countDice[i]) / 1000) * 100;
            prob2[i] = probability;
            //System.out.print(probability + " ");
        }
        System.out.print("\nProbabilities (1000 rolls): ");
        for (int i = 0; i < prob2.length; i++) {
            System.out.printf("%.2f%% ", prob2[i]);
        }

        for (int i = 1; i < 10001; i++) {
            diceNumber5 = rand.nextInt(1,7);
            diceNumber6 = rand.nextInt(1,7);
            int sum = diceNumber5 + diceNumber6;
            // total for every combination of dice numbers
            dices[sum - 2]++;
            // increase the count for the sum
        }

        for (int i = 0; i < dices.length; i++) {
            double probability = ((double) (dices[i]) / 10000) * 100;
            prob3[i] = probability;
            //System.out.print(probability + " ");
        }
        System.out.print("\nProbabilities (10000 rolls): ");
        for (int i = 0; i < prob3.length; i++) {
            System.out.printf("%.2f%% ", prob3[i]);
        }
    }
}