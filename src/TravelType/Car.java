package TravelType;

public class Car  extends Travel implements ICost ,ITime{
    public Car(int cost, int timeByHour, String vehicleName) {
        super(cost, timeByHour, vehicleName);
    }

    @Override
    public void costAmount() {


    }

    @Override
    public void timeSpend() {

    }
}
