package com.siyee.designpatterns.factory.simple;

/**
 * 简单工厂
 */
public class ProductFactory {

    /**
     * 通过不同的参数来创建不同的Product
     * @param arg
     * @return
     */
    public static Product create(String arg) {
        switch (arg) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return null;
        }
    }

}
