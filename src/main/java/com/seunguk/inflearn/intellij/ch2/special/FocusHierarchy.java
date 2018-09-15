package com.seunguk.inflearn.intellij.ch2.special;

import java.time.LocalDate;
import java.util.Optional;

public class FocusHierarchy {
    public void increaseFocus() {
        // command + [ : before focus
        // command + ] : after focus
        System.out.println(Optional.of(new Member().getCourse())); // focus Member and option + up(down) and up up up
        System.out.println(LocalDate.of(2018, 5, 14));
    }
}
