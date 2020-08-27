package com.siyee.designpatterns.factory.abs.spring;

import com.siyee.designpatterns.factory.abs.Button;

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("Spring样式的按钮");
    }

}
