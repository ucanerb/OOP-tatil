package Countries;

import VacationSeason.ISummer;

public class SouthAfrica extends Country implements ISummer {
    public SouthAfrica(String countryName, String continentName, boolean isAnIsland, int neighbourCount) {
        super(countryName, continentName, isAnIsland, neighbourCount);
    }

    @Override
    public String doSafari(String string){
        System.out.println("You're going to do Safari! Be careful with Lions..");
    return string;
    }

    @Override
    public String doSwim(String string){
        return "You're going to Swimming! Be careful with Sharks..";

    }
}
