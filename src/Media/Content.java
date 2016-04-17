package Media;

/**
 * Created by Yaroslav on 15.04.2016.
 */
public class Content {

    private long textID;
    private long attachmentID;

    private Media media = new Media();
    private Text text = new Text();

    public void setText(long textID) {this.textID = textID;}
    public long setText() {return textID;}

    public void setAttachment(long attachmentID) {this.attachmentID = attachmentID;}
    public long setAttachment() {return attachmentID;}


}
