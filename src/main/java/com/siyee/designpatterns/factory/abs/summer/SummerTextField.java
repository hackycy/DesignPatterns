package com.siyee.designpatterns.factory.abs.summer;

import com.siyee.designpatterns.factory.abs.TextField;

public class SummerTextField implements TextField {

    @Override
    public void display() {
        System.out.println("Summer样式的TextField");
    }

}
