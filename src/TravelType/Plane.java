package TravelType;

public class Plane  extends Travel implements ICost ,ITime{
    public Plane(int cost, int timeByHour, String vehicleName) {
        super(cost, timeByHour, vehicleName);
    }

    @Override
    public void costAmount() {

    }

    @Override
    public void timeSpend() {

    }

    @Override
    public String toString() {
        return "Plane{} " + super.toString();
    }
}
