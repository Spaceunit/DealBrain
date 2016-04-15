package Account;

/**
 * Created by lenovo on 15.04.2016.
 */
public class Product {

    private String typeProduct;
    private int amountProduct;
    private boolean accessProduct;

    public void setAccessProduct(boolean accessProduct) {
        this.accessProduct = accessProduct;
    }

    public int getAmountProduct() {
        return amountProduct;
    }

    public String getTypeProduct() {
        return typeProduct;
    }

    public void setAmountProduct(int amountProduct) {
        this.amountProduct = amountProduct;
    }

    public boolean isAccessProduct() {
        return accessProduct;
    }

    public void setTypeProduct(String typeProduct) {
        this.typeProduct = typeProduct;
    }

}
