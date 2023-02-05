package TravelType;

public abstract class Travel {

    private int cost;
    private int timeByHour;
    private String vehicleName;

    public Travel(int cost, int timeByHour, String vehicleName) {
        this.cost = cost;
        this.timeByHour = timeByHour;
        this.vehicleName = vehicleName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTimeByHour() {
        return timeByHour;
    }

    public void setTimeByHour(int timeByHour) {
        this.timeByHour = timeByHour;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    @Override
    public String toString() {
        return "Travel{" +
                "cost=" + cost +
                ", timeByHour=" + timeByHour +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
