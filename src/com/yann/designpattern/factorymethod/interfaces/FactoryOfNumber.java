package com.yann.designpattern.factorymethod.interfaces;

import com.yann.designpattern.factorymethod.classes.FactoryOfNumberImp;

public interface FactoryOfNumber {
    Number parse(String s);

    static FactoryOfNumber imp = new FactoryOfNumberImp();
}
