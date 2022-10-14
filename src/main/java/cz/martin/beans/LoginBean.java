package cz.martin.beans;

import cz.martin.services.NameService;
import cz.martin.services.ProblemsService;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.IOException;

@Named("login")
@RequestScoped
public class LoginBean {
    @Inject
    private NameService nameService;
    @Inject
    private ProblemsService problemsService;

    private String nickname = "";

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void submit() throws IOException {
        nameService.setNickName(nickname);
        problemsService.generate();
        FacesContext.getCurrentInstance()
                .getExternalContext().redirect("math-problems.xhtml");
    }
}
