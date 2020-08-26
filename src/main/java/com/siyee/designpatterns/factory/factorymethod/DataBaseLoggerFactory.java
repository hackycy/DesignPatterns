package com.siyee.designpatterns.factory.factorymethod;

public class DataBaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        // 创建数据库连接等操作。。。
        return new DataBaseLogger();
    }

}
