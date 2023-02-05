package Countries;

import VacationSeason.ISummer;

public class Australia extends Country implements ISummer {

    public Australia(String countryName, String continentName, boolean isAnIsland, int neighbourCount) {
        super(countryName, continentName, isAnIsland, neighbourCount);
    }

    @Override
    public String doSafari(String string) {

return "You're going to do safari in the desert of "+ string +", be carefull with kangaroos! ";
    }

    @Override
    public String doSwim(String string) {
        return "You're going to swim in "+ string + ", enjoy!";

    }
    public String doSurfing(String string){

        return  string +"is one of the best places to do Surf in the world! Be carefull with Sharks!";
    }
}
