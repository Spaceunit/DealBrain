package Role;

/**
 * Created by Yaroslav on 16.04.2016.
 */
abstract public class Role {
    private int raiting;

    public void setRaiting( int raiting) {this.raiting = raiting;}
    public int getRaiting() { return raiting;}
    public void addRole() {}
    private PriceRange priceRange = new PriceRange();
}
