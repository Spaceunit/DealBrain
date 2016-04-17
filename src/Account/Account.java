package Account;

import Media.SFile;

import java.io.*;

/**
 * Created by oleksiypolshchak on 4/15/16.
 */
public class Account {
    private int AccountFotoID;
    private Data info = new Data();
    private SFile serFile = new SFile("userdata","json","./json");

    /*public void setData(int data) {
        Data = data;
    }*/

    /*public int getData() {
        return Data;
    }*/

    public void setAccountFotoID(int accountFotoID) {
        AccountFotoID = accountFotoID;
    }

    public int getAccountFotoID() {
        return AccountFotoID;
    }
    public void serialazeData() {
        try {
            FileOutputStream fileOut = new FileOutputStream(serFile.getFullpath());
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(info);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in " + serFile.getFullpath() + " ;");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
    public void deserialazeData() {
        try {
            FileInputStream fileIn = new FileInputStream(serFile.getFullpath());
            ObjectInputStream in = new ObjectInputStream(fileIn);
            info = (Data) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            i.printStackTrace();
            return;
        } catch (ClassNotFoundException c) {
            System.out.println("No data.");
            c.printStackTrace();
            return;
        }
    }

}
