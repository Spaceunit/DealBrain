package Account;

/**
 * Created by oleksiypolshchak on 4/15/16.
 */
public class Account {
    private int AccountFotoID;
    private int Data;

    public void setData(int data) {
        Data = data;
    }

    public int getData() {
        return Data;
    }

    public void setAccountFotoID(int accountFotoID) {
        AccountFotoID = accountFotoID;
    }

    public int getAccountFotoID() {
        return AccountFotoID;
    }
}
