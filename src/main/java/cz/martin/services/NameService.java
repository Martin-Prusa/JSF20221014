package cz.martin.services;

import jakarta.enterprise.context.SessionScoped;

import java.io.Serializable;

@SessionScoped
public class NameService implements Serializable {
    private String nickName;

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}
