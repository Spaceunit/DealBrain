package Correspondence;

import Media.Content;

/**
 * Created by Misha on 15.04.2016.
 */
public class Message {
    private boolean add;
    private boolean remove;
    private boolean readmessage;

    private Content content = new Content();

    public void setReadmessage(boolean readmessage) {
        this.readmessage = readmessage;
    }

    public boolean AddMessage(){
    return add;
    }

    public boolean RemoveMessage(){
    return remove;
    }
    public void response() {

    }
}
