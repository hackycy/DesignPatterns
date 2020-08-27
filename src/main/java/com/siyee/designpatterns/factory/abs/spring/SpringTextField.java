package com.siyee.designpatterns.factory.abs.spring;

import com.siyee.designpatterns.factory.abs.TextField;

public class SpringTextField implements TextField {

    @Override
    public void display() {
        System.out.println("Spring样式的TextField");
    }

}
