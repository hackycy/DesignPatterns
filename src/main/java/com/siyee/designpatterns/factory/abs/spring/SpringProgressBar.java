package com.siyee.designpatterns.factory.abs.spring;

import com.siyee.designpatterns.factory.abs.ProgressBar;

public class SpringProgressBar implements ProgressBar {

    @Override
    public void display() {
        System.out.println("Spring样式的Progressbar");
    }

}
