package Role;

import java.util.ArrayList;

/**
 * Created by lenovo Nazar on 15.04.2016.
 */
public class Vendor extends Role{

    String [] all_products;
    private int index_numb;

    private ArrayList<Product> product = new ArrayList<>();

    public String[] getProducts() {
        return all_products;
    }

    public void setProducts(String product , int index) {
        this.all_products[index] = product;
    }
}
