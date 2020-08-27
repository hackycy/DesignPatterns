package com.siyee.designpatterns.factory.abs.summer;

import com.siyee.designpatterns.factory.abs.ProgressBar;

public class SummerProgressBar implements ProgressBar {

    @Override
    public void display() {
        System.out.println("Summer样式的Progressbar");
    }

}
