package com.seunguk.inflearn.intellij.ch7.extract;

public class Variable {
    public void extractVariable() {
        // 2개의 코드가 완전히 동일하다. -> 변수를 생성하고 변경사항이 나오면 변수만 변경해주면 된다.
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));

        // focus String.format() (option + up) and option + command + v : extract variable
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));
        System.out.println(String.format("%d + %d = %d", 1, 2, 1+2));
    }
}
