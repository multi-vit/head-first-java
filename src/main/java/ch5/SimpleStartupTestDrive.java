package ch5;

public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();

        int[] locations = {2, 3, 4};
        dot.setLocationCells(locations);

        int userGuess = 2;
        String result = dot.checkYourself(userGuess);

        String testResult = "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
    }
}

// We are not yet testing that the locations array is the correct length
// We are not yet testing if the "kill" or "miss" strings are being returned in correct circumstances