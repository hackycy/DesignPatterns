package com.siyee.designpatterns.adapter.classadapter;

/**
 * 适配者类
 */
public class Adapter extends Adaptee implements Target {

    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.specifcRequest();
    }

}
