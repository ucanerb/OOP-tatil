package Countries;

import VacationSeason.ISpring;

public class Japan extends Country implements ISpring {
    public Japan(String countryName, String continentName, boolean isAnIsland, int neighbourCount) {
        super(countryName, continentName, isAnIsland, neighbourCount);
    }

    @Override
    public void goHiking() {
        System.out.println("You're going to hiking");
    }


    @Override
    public String toString() {
        return "Japan{} " + super.toString();
    }
}
