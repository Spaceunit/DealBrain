package Account;

/**
 * Created by lenovo Nazar on 15.04.2016.
  */
public class Customer {

    private int amountGoods;
    private boolean methodPayment;
    private boolean signatureDeal;

    public void setAmountGoods(int amountGoods) {
        this.amountGoods = amountGoods;
    }

    public int getAmountGoods() {
        return amountGoods;
    }

    public void setSignatureDeal(boolean signatureDeal) {
        this.signatureDeal = signatureDeal;
    }

    public boolean isSignatureDeal() {
        return signatureDeal;
    }



    public void setMethodPayment(boolean methodPayment) {
        this.methodPayment = methodPayment;
    }

    public boolean isMethodPayment() {
        return methodPayment;
    }

}
