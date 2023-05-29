package ch6.SimpleStartup;

import java.util.ArrayList;

public class SimpleStartup {

    private ArrayList<Integer> locationCells;

    public String checkYourself(int guess) {
        String result = "miss";
        if (locationCells.contains(guess)) {
            locationCells.remove(locationCells.indexOf(guess));
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        System.out.println(result);

        return result;

    }

    public void setLocationCells(ArrayList<Integer> locs) {
        locationCells = locs;
    }

}
