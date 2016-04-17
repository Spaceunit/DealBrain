package Correspondence;

import Account.ID;

/**
 * Created by Misha on 15.04.2016.
 */
public class Dialog {
    private ID membersID = new ID();
    private ID owner = new ID();

    public void setMembersID(ID membersID) {
        this.membersID = membersID;
    }

    public void setOwner(ID owner) {
        this.owner = owner;
    }

    public ID getMembersID() {
        return membersID;
    }

    public ID getOwner() {
        return owner;
    }

    public void addMembers(){

    }
    public void removeMembers(){

    }
}
