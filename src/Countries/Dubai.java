package Countries;

import VacationSeason.ISummer;

public class Dubai extends Country implements ISummer {


    public Dubai(String countryName, String continentName, boolean isAnIsland, int neighbourCount) {
        super(countryName, continentName, isAnIsland, neighbourCount);
    }

    @Override
    public String doSafari(String string){
        System.out.println("You're going to do safari in desert..Take water with you..");
        return string;
    }

    @Override
    public String doSwim(String string){
        return "It's too hot to swim but its your choice, enjoy!";
    }
  public void visitFerrariMuseum(){

      System.out.println("It's perfect choice to go Ferrari Museum! Little bit expensive but definetely worth it!");

  }
    }
