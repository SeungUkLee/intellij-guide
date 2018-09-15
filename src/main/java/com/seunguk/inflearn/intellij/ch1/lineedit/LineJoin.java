package com.seunguk.inflearn.intellij.ch1.lineedit;

public class LineJoin {
    public String joinString() {
        String profile = "안녕하세요. " +
                "Intellij 강의에 오신것을 " +
                "환영합니다.";

        return profile;
    }

    public String createQuery() {
        String query = "SELECT * " +
                "FROM member " +
                "WHERE member.name = seunguk";

        return query;
    }
}
