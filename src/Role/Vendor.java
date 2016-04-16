package Role;

/**
 * Created by lenovo Nazar on 15.04.2016.
 */
public class Vendor {

    String [] products;
    private int index_numb;

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String product , int index) {
        this.products[index] = product;
    }
}
