package cz.martin.services;

import cz.martin.models.Score;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ScoreService {
    private List<Score> scores = new ArrayList<>();

    public void newScore(Score s) {
        this.scores.add(s);
        this.scores = new ArrayList<>(this.scores.stream().sorted((i ,j) -> (int) i.getPercent() *100 - (int) j.getPercent()*100).toList());
    }

    public List<Score> getScores() {
        return scores;
    }
}
