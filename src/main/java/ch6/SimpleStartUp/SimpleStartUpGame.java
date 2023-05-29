package ch6.SimpleStartUp;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SimpleStartUpGame {
    public static void main(String[] args) {
        int numUserGuesses = 0;
        boolean isAlive = true;
        ArrayList<Integer> locations = new ArrayList<Integer>();
        SimpleStartup game = new SimpleStartup();
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(4) + 1;
        System.out.println("Random number is: " + randomNumber);
        for (int i = 0; i < 3; i++) {
            locations.add(randomNumber);
            randomNumber++;
        }
        game.setLocationCells(locations);
        while (isAlive) {
            System.out.println("Please guess a location (a number between 1 and 7 (inclusive)): ");
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