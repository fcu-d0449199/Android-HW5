package lincyu.homework5;

/**
 * Created by LF on 2017/4/25.
 */

public class NBAitem {

    private String guestName;
    private int guestScore;
    private int guestImg;
    private String hostName;
    private int hostScore;
    private int hostImg;

    public NBAitem(int hostImg, String hostName, int hostScore, int guestImg, String guestName, int guestScore){

        setHostName(hostName);
        setHostScore(hostScore);
        setHostImg(hostImg);
        setGuestName(guestName);
        setGuestScore(guestScore);
        setGuestImg(guestImg);
    }

    public void setHostName(String hostName){

        this.hostName = hostName;
    }

    public void setHostScore(int hostScore){

        this.hostScore = hostScore;
    }

    public void setHostImg(int hostImg){

        this.hostImg = hostImg;
    }

    public void setGuestName(String guestName){

        this.guestName = guestName;
    }

    public void setGuestScore(int guestScore) {

        this.guestScore = guestScore;
    }

    public void setGuestImg(int guestImg) {

        this.guestImg = guestImg;
    }

    public int getHostImg() {

        return hostImg;
    }

    public int getHostScore() {

        return hostScore;
    }

    public String getHostName() {
        return hostName;
    }

    public int getGuestImg() {

        return guestImg;
    }

    public int getGuestScore() {

        return guestScore;
    }

    public String getGuestName() {

        return guestName;
    }
}
