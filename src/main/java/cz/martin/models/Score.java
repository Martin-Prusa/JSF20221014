package cz.martin.models;

public class Score {
    private String nickname;
    private int time;
    private float percent;

    public Score(String nickname, int time, float percent) {
        this.nickname = nickname;
        this.time = time;
        this.percent = percent;
    }

    public String getNickname() {
        return nickname;
    }

    public int getTime() {
        return time;
    }

    public float getPercent() {
        return percent;
    }
}
