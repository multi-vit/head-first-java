package ch6.SinkAStartup;

import java.util.ArrayList;

public class Startup {

    private String name;
    private ArrayList<String> locationCells;

    public void setLocationCells(ArrayList<String> locs) {
        locationCells = locs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput) {
        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);
            System.out.println("Remaining locations are: " + String.join(", ", locationCells));
            if (locationCells.isEmpty()) {
                return "kill";
            } else {
                return "hit";
            }
        }
        System.out.println("Remaining locations are: " + String.join(", ", locationCells));
        return "miss";
    }
}