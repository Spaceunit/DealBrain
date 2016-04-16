package Path;

/**
 * Created by oleksiypolshchak on 4/15/16.
 */
public class Path extends Location {
    private int amountLocation;
    private double distance;
    private int approximateTime;

    public double getDistance() {
        return distance;
    }

    public int getAmountLocation() {
        return amountLocation;
    }

    public void setAmountLocation(int amountLocation) {
        this.amountLocation = amountLocation;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }

}
