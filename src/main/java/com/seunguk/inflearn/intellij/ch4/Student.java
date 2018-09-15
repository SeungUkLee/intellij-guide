package com.seunguk.inflearn.intellij.ch4;

public class Student {
    private Long id;
    private String email;
    private String name;

    // command + N : 자동 생성(Generate) (ex. Getter and Setter)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
