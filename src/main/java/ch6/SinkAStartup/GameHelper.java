package ch6.SinkAStartup;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class GameHelper {

    private final Random random = new Random();

    private String[] lettersArray = {"A", "B", "C", "D", "E", "F", "G"};
    private String[] startupNames = {"Blueviser", "Inition", "Startupit", "MixDragon", "Atstarter", "Seedup", "Caleeda", "Botla", "Terrastartup", "Startupbox"};

    public String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public String getStartupName() {
        int randomNumberForStartupNames = random.nextInt(10);
        return startupNames[randomNumberForStartupNames];
    }

    public ArrayList<String> placeStartup() {
        ArrayList<String> location = new ArrayList<>();
        int randomNumberForXAxis = random.nextInt(5) + 1;
        int randomNumberForYAxis = random.nextInt(7);
        System.out.println("Initial Startup Location is: " + lettersArray[randomNumberForYAxis] + randomNumberForXAxis);
        int randomNumberForOrientation = random.nextInt(2);
        if (randomNumberForOrientation == 1) {
            for (int i = 0; i < 3; i++) {
                location.add(lettersArray[randomNumberForYAxis] + randomNumberForXAxis);
                randomNumberForXAxis++;
            }
        } else {
            if (randomNumberForYAxis <= 4) {
                for (int i = 0; i < 3; i++) {
                    location.add(lettersArray[randomNumberForYAxis] + randomNumberForXAxis);
                    randomNumberForYAxis++;
                }
            } else {
                for (int i = 0; i < 3; i++) {
                    location.add(lettersArray[randomNumberForYAxis] + randomNumberForXAxis);
                    randomNumberForYAxis--;
                }
            }
        }
        System.out.println(location);
        return location;
    }
}
