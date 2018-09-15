package com.seunguk.inflearn.intellij.ch6;

import org.junit.Test;

public class ProductServcieTest {
    @Test
    public void Evaluate사용하기() {
        productRepository.save(new Product(1000L, "책"));
    }
}
