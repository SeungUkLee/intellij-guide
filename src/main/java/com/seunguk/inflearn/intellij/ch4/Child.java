package com.seunguk.inflearn.intellij.ch4;

public class Child implements Parent{
    // ctrl + i : 구현할 수 있는 모든 메소드

    @Override
    public void buy(Long amount) {

    }

    @Override
    public void drive(String name) {

    }

    @Override
    public boolean isWishList(String item) {
        return false;
    }
}
