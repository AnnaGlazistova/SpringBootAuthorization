package ru.netology.authorizationservice.model;

import ru.netology.authorizationservice.repository.Authorities;

import java.util.List;

public class User {

    private String user;
    private String password;
    private List<Authorities> listOfAuthorities;

    public User(String user, String password, List<Authorities> listOf) {
        this.user = user;
        this.password = password;
        this.listOfAuthorities = listOf;
    }

    public String getName() {
        return user;
    }

    public void setName(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authorities> getListOfAuthorities() {
        return listOfAuthorities;
    }

    public void setListOfAuthorities(List<Authorities> listOf) {
        this.listOfAuthorities = listOf;
    }
}
