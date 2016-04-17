package Dislocation;

/**
 * Created by oleksiypolshchak on 4/15/16.
 */
public class Point {
    private int arrivalTime;
    private int departureYime;
    private int []pos;

    public int getArrivalTime() {
        return arrivalTime;
    }
    public int getDepartureYime() {
        return departureYime;
    }
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureYime(int departureYime) {
        this.departureYime = departureYime;
    }

    public int[] getPos() {
        return pos;
    }

    public void setPos(int[] pos) {
        this.pos = pos;
    }
}
