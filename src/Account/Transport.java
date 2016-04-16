package Account;

/**
 * Created by User on 4/15/2016.
 */
public class Transport {
    private int capacityCargo;
    private boolean accessTransit;
    private String model;
    private int[] typeCab;
    //This array consist of some numbers, that means certain type of car's cab
    public int getCapacityCargo(){

        return capacityCargo;
    }
    public String model(){

        return model;
    }
    public boolean getAccessTransit()
    {
        return accessTransit;
    }
    public void setCapacityCargo(int capacityCargo){
        this.capacityCargo = capacityCargo;
    }
    public void setAccessTransit(boolean accessTransit) {
        this.accessTransit = accessTransit;
    }

}

