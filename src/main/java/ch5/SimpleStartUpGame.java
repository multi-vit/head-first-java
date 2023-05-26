package ch5;

import java.util.Random;
import java.util.Scanner;

public class SimpleStartUpGame {
    public static void main(String[] args) {
        int numUserGuesses = 0;
        boolean isAlive = true;
        int[] locations = new int[3];
        SimpleStartup game = new SimpleStartup();
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(4) + 1;
        System.out.println("Random number is: " + randomNumber);
        for (int i = 0; i < locations.length; i++) {
            locations[i] = randomNumber;
            randomNumber++;
        }
        System.out.println("Locations are: " + locations[0] + locations[1] + locations[2]);
        game.setLocationCells(locations);
        while (isAlive) {
            System.out.println("Please guess a location which will be a number between 1 and 7 (inclusive)");
            int userGuess = in.nextInt();
            String result = game.checkYourself(userGuess);
            numUserGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numUserGuesses + " guesses");
            }
        }
    }
}

// There is a bug in here, you can enter the same "hit" number 3 times and win the game
// We will fix it in the next chapter