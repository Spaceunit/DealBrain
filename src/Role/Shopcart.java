package Role;

import java.util.ArrayList;

/**
 * Created by lenovo Nazar on 16.04.2016.
 */
public class Shopcart {
    private ArrayList<Product> orders = new ArrayList<Product>();
    public double price;
    public double deliveryPrice;
    public double deliveryCompany;



    public double getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(double deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public double getDeliveryPrice() {
        return deliveryPrice;
    }

    public void setDeliveryPrice(double deliveryPrice) {
        this.deliveryPrice = deliveryPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
