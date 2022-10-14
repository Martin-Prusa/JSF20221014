package cz.martin.services;

import cz.martin.models.MathProblem;
import cz.martin.models.RandomOperator;
import cz.martin.models.Score;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Inject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@SessionScoped
public class ProblemsService implements Serializable {

    @Inject
    private ScoreService scoreService;

    @Inject
    private NameService nameService;

    private final int count = 3;
    private final int to = 20;
    private List<MathProblem> mathProblemList = new ArrayList<>();

    private float score = 0;

    public ProblemsService() {
        this.generate();
    }

    public void generate() {
        this.mathProblemList.clear();
        Random rand = new Random();
        RandomOperator randomOp = new RandomOperator();
        for (int i = 0; i < count; i++) {
            mathProblemList.add(new MathProblem(rand.nextInt(to), rand.nextInt(to), randomOp.getRandomOperation()));
        }
    }

    public void submit() {
        this.score = mathProblemList.stream().filter(i -> i.isValid()).count() * 1f / count;
        this.scoreService.newScore(new Score(nameService.getNickName(), 0, score));
    }

    public List<MathProblem> getMathProblemList() {
        return mathProblemList;
    }

    public float getScore() {
        return score;
    }
}
