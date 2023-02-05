package TravelType;

public class Train extends Travel implements ICost ,ITime{
    public Train(int cost, int timeByHour, String vehicleName) {
        super(cost, timeByHour, vehicleName);
    }

    @Override
    public void costAmount() {

    }

    @Override
    public void timeSpend() {

    }
}
