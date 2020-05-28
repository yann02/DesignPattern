package com.yann.designpattern.factorymethod.classes;

import com.yann.designpattern.factorymethod.interfaces.FactoryOfNumber;

import java.math.BigDecimal;

public class FactoryOfNumberImp implements FactoryOfNumber {
    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
