package com.seunguk.inflearn.intellij.ch7.code;

public class ReturnType {

    public void print() {
        String num = calculate();
        System.out.println(num);
    }

    // focus String and command + shift + fn + f6 and input Integer : Type migration
    private String calculate() {
        return "1";
    }
}
