package com.siyee.designpatterns.adapter;

import com.siyee.designpatterns.adapter.classadapter.Adapter;
import com.siyee.designpatterns.adapter.classadapter.Target;

public class Client {

    public static void main(String[] args) {
        Target target = new Adapter(); //
        target.request();
    }

}
