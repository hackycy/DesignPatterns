package com.siyee.designpatterns.factory.simple;

public class ConcreteProductB extends Product {

    @Override
    void methodSame() {
        System.out.println("ConcreteProductB methodSame");
    }

    @Override
    void methodDiff() {
        System.out.println("ConcreteProductB methodDiff");
    }

}
