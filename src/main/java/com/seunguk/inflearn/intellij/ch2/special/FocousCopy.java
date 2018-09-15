package com.seunguk.inflearn.intellij.ch2.special;

import java.util.ArrayList;
import java.util.List;

public class FocousCopy {
    public void copyFocus() {
        List<String> members = new ArrayList<>();

        members.add(new Member().getCourse()); // option + option + arrow (multi focus)
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
        members.add(new Member().getCourse());
    }
}
