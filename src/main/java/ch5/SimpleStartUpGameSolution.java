package ch5;

public class SimpleStartUpGameSolution {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleStartup theStartUp = new SimpleStartup();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theStartUp.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            String result = theStartUp.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }
    }
}

// There is a bug in here, you can enter the same number for a hit three times and win the game
// We will fix it next chapter

/*
Notes:
- Math.random returns a double from zero to just less than 1
- (int) is a cast: forces the thing immediately after it to become this type
- In this case, the cast will just chop off the fractional part after the .
- More common and convenient is to use java.util.Random's nextInt() method (which doesn't need casting to an int)
- The Random class is in a different package and we haven't covered packages yet, hence using Math.random()
- The GameHelper class has been used to abstract the detail of how to get user input as it opens up topics best left for later
*/