package com.siyee.designpatterns.factory.simple;

public class Client {

    public static void main(String[] args) {
//        Product p = ProductFactory.create("A");
        Product p = ProductFactory.create("B");
        if (p != null) {
            p.methodDiff();
            p.methodSame();
        }
    }

}
