package cz.martin.beans;

import cz.martin.models.MathProblem;
import cz.martin.services.ProblemsService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.IOException;
import java.util.List;

@Named("problems")
@RequestScoped
public class MathProblemsBean {
    @Inject
    private ProblemsService service;

    public void submit() throws IOException {
        service.submit();
        FacesContext.getCurrentInstance()
                .getExternalContext().redirect("results.xhtml");
    }

    public List<MathProblem> getProblems() {
        return service.getMathProblemList();
    }
}
