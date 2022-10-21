package cz.martin.models;

public class Score {
    private String nickname;
    private long time;
    private float percent;

    public Score(String nickname, long time, float percent) {
        this.nickname = nickname;
        this.time = time;
        this.percent = percent;
    }

    public String getNickname() {
        return nickname;
    }

    public long getTime() {
        return time;
    }

    public float getPercent() {
        return percent;
    }
}
