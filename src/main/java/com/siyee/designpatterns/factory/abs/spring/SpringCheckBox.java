package com.siyee.designpatterns.factory.abs.spring;

import com.siyee.designpatterns.factory.abs.CheckBox;

public class SpringCheckBox implements CheckBox {

    @Override
    public void display() {
        System.out.println("Spring样式的CheckBox");
    }

}
