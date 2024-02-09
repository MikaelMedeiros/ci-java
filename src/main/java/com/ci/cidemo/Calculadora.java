package com.ci.cidemo;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculadora {

    public BigDecimal somar(BigDecimal number1, BigDecimal number2) {
        return number1.add(number2);
    }
}
