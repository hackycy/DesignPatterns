package com.siyee.designpatterns.factory.factorymethod;

public abstract class LoggerFactoryAdv {

    public void writeLog() {
        Logger logger = this.createLogger();
        logger.writeLog();
    }

    abstract Logger createLogger();

}
