package com.seunguk.inflearn.intellij.ch7.code;

public class Rename {

    public void rename() {
        // focus name variable and shift + fn + f6 : rename
        String name = "a";
        for (int i = 0; i < 10; i++) {
            System.out.println(name);
        }
        System.out.println("변수값 : " + name);
    }
}
