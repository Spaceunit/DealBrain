package Account;

/**
 * Created by Yaroslav on 15.04.2016.
 */
abstract public class Content {

    private long textID;
    private long attachmentID;

    public void setText(long textID) {this.textID = textID;}
    public long setText() {return textID;}

    public void setAttachment(long attachmentID) {this.attachmentID = attachmentID;}
    public long setAttachment() {return attachmentID;}


}
