package Correspondence;

/**
 * Created by Misha on 15.04.2016.
 */
public class Media {
    private String mediaID;
    private String videoID;
    private String audioID;

    public void setAudioID(String audioID) {
        this.audioID = audioID;
    }

    public void setMediaID(String mediaID) {
        this.mediaID = mediaID;
    }

    public String getMediaID() {
        return mediaID;
    }

    public String getAudioID() {
        return audioID;
    }

    public void setVideoID(String videoID) {
        this.videoID = videoID;
    }

    public String getVideoID() {
        return videoID;
    }

}
