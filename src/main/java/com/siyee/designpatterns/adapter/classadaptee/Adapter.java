package com.siyee.designpatterns.adapter.classadaptee;

/**
 * 适配器类
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.specifcRequest();
    }

}
