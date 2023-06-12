package ch6.SinkAStartup;

import java.util.ArrayList;

public class StartupBust {
    static ArrayList<Startup> startups = new ArrayList<>();
    static GameHelper helper = new GameHelper();
    static int numOfGuesses = 0;

    static void setUpGame() {
        for (int i = 0; i < 3; i++) {
            Startup startup = new Startup();
            startup.setName(helper.getStartupName());
            startup.setLocationCells(helper.placeStartup());
            startups.add(startup);
        }
        System.out.println("Would you like to play a game? This is like one-way battleships. You just need to guess a capital letter between A-G and a number between 1-7 like this: G7");
    }

    static void startPlaying() {
        while (!startups.isEmpty()) {
            String userGuess = helper.getUserInput("Please enter your guess (e.g. A1)");
            checkUserGuess(userGuess);
        }
    }

    static void checkUserGuess(String userGuess) {
        numOfGuesses++;
        String result = "miss";
        for (Startup startup : startups) {
            String resultCheck = startup.checkYourself(userGuess);
            if (resultCheck.equals("hit")) {
                System.out.println("We have a hit!");
                result = "hit";
                break;
            } else if (resultCheck.equals("kill")) {
                System.out.println("We have a kill!");
                result = "kill";
                startups.remove(startup);
                break;
            }
        }
        System.out.println(result);
    }


    static void finishGame() {
        System.out.println("Game Over");
        if (numOfGuesses < 20) {
            System.out.println("That was speedy, well done!");
        } else {
            System.out.println("What took you so long?");
        }
    }

    public static void main(String[] args) {
        setUpGame();
        startPlaying();
        finishGame();
    }
}
