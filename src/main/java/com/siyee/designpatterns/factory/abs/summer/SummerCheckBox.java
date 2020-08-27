package com.siyee.designpatterns.factory.abs.summer;

import com.siyee.designpatterns.factory.abs.CheckBox;

public class SummerCheckBox implements CheckBox {

    @Override
    public void display() {
        System.out.println("Summer样式的CheckBox");
    }

}
