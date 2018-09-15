package com.seunguk.inflearn.intellij.ch1.view;

public class ViewDefinition {
    public void ViewDefinition() {
        EmailSender emailSender = new EmailSender(1L, "seunguk", "seunguk@test.com");

        emailSender.send("test@test.com"); // method focus and option + space
    }
}
