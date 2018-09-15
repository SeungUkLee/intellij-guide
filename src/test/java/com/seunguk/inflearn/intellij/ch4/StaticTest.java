package com.seunguk.inflearn.intellij.ch4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StaticTest {
    @Test
    public void name() {
        Calendar c = new GregorianCalendar();
        // ctrl + space : 불필요한거까지 자동완성 보여줌.
        // ctrl + shift + space : smart 자동 완성.
        // command + p and ctrl + shift + space

        // 인텔리제이에서 스텍틱 메소드는 제대로 지원이되지않는다. ex) assertThat : 코드 테스트할때 쓴다.
        // ctrl + space + space : static method 자동완성.
//        Assert.assertThat();
    }
}
