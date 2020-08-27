package com.siyee.designpatterns.factory.abs.summer;

import com.siyee.designpatterns.factory.abs.Button;

public class SummerButton implements Button {

    @Override
    public void display() {
        System.out.println("Summer样式的按钮");
    }

}
