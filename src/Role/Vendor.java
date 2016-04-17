package Role;

/**
 * Created by lenovo Nazar on 15.04.2016.
 */
public class Vendor extends Role{

    String [] products;
    private int index_numb;

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String product , int index) {
        this.products[index] = product;
    }
}
