package Account;

import Correspondence.Penpal;
import Media.SFile;

import java.io.*;

/**
 * Created by oleksiypolshchak on 4/15/16.
 */
public class Account {
    private int AccountFotoID;
    private AData info = new AData();
    private SFile serFile = new SFile("userdata","json","./json");
    private Penpal penpal = new Penpal();

    public void setInfo(AData info) {
        this.info = info;
    }

    public void setPenpal(Penpal penpal) {
        this.penpal = penpal;
    }

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
            info = (AData) in.readObject();
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
