package cz.martin.beans;

import cz.martin.services.ScoreService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("score")
@RequestScoped
public class ScoreBean {
    @Inject
    private ScoreService scoreService;

    public ScoreService getScoreService() {
        return scoreService;
    }
}
