package com.ci.cidemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import java.math.BigDecimal;

@SpringBootTest
@Import(Calculadora.class)
class CalculadoraTest {

    @Autowired
    Calculadora calculadora;

    @Test
    void deveSomar() {
        var result = calculadora.somar(BigDecimal.TEN, BigDecimal.TEN);
        Assertions.assertEquals(result, new BigDecimal(20));
    }
}