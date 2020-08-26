package com.siyee.designpatterns.factory.factorymethod;

public class DataBaseLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("使用数据库进行写入日志");
    }

}
