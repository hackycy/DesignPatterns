package com.siyee.designpatterns.factory.factorymethod;

public class FileLogger implements Logger {

    @Override
    public void writeLog() {
        System.out.println("使用File进行写入日志");
    }

}
