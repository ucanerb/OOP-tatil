package Countries;

public abstract class Country {

    private String countryName;
    private String continentName;
    private boolean isAnIsland;
    private int neighbourCount;


    public Country(String countryName, String continentName, boolean isAnIsland, int neighbourCount) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.isAnIsland = isAnIsland;
        this.neighbourCount = neighbourCount;
    }
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public boolean isAnIsland() {
        return isAnIsland;
    }

    public void setAnIsland(boolean anIsland) {
        isAnIsland = anIsland;
    }

    public int getNeighbourCount() {
        return neighbourCount;
    }

    public void setNeighbourCount(int neighbourCount) {
        this.neighbourCount = neighbourCount;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", continentName='" + continentName + '\'' +
                ", isAnIsland=" + isAnIsland +
                ", neighbourCount=" + neighbourCount +
                '}';
    }
}
