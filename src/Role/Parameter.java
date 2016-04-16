package Role;

/**
 * Created by User on 4/15/2016.
 */
public class Parameter {
    private String name;
    private String description;
    private float amount;
    //type of amount may be change
    private boolean access;
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public float getAmount(){
        return amount;
    }
    public boolean getAcess(){
        return access;
    }


}
