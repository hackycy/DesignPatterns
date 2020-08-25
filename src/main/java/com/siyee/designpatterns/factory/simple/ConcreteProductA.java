package com.siyee.designpatterns.factory.simple;

public class ConcreteProductA extends Product {

    @Override
    void methodSame() {
        System.out.println("ConcreteProductA methodSame");
    }

    @Override
    void methodDiff() {
        System.out.println("ConcreteProductA methodDiff");
    }

}
