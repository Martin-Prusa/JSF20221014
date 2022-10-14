package cz.martin.beans;

import cz.martin.services.ProblemsService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("results")
@RequestScoped
public class ResultsBean {
    @Inject
    private ProblemsService problemsService;

    private int time = 0;

    public int getScore() {
        return (int) (problemsService.getScore() * 100);
    }

    public int getTime() {
        return time;
    }
}
