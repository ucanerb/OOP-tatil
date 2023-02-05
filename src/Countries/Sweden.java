package Countries;

import VacationSeason.IAutumn;

public class Sweden extends Country implements IAutumn {
    public Sweden(String countryName, String continentName, boolean isAnIsland, int neighbourCount) {
        super(countryName, continentName, isAnIsland, neighbourCount);
    }

    @Override
    public void watchAurora() {
        System.out.println("You're going to watch Aurora!");
    }

    @Override
    public String toString() {
        return "Sweden{} " + super.toString();
    }
}
