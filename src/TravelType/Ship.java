package TravelType;

public class Ship  extends Travel implements ICost ,ITime{
    public Ship(int cost, int timeByHour, String vehicleName) {
        super(cost, timeByHour, vehicleName);
    }

    @Override
    public void costAmount() {

    }

    @Override
    public void timeSpend() {

    }
}
