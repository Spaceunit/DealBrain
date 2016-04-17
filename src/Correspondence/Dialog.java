package Correspondence;

import Account.ID;

/**
 * Created by Misha on 15.04.2016.
 */
public class Dialog {
    private ID membersID = new ID();
    private ID owner = new ID();

    public void setMembers(int members) {
        this.membersID = members;
    }

    public int getMembers() {
        return membersID;
    }

    public void setOwner(int owner) {
        this.owner = owner;
    }

    public int getOwner() {
        return owner;
    }
    public void addMembers(){

    }
    public void removeMembers(){

    }
}
