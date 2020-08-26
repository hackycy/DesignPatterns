package com.siyee.designpatterns.factory.factorymethod;

public class FileLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        // 创建文件等操作。。
        return new FileLogger();
    }

}
