package com.aique.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log4jExample {
    private static final Logger logger = LogManager.getLogger(Log4jExample.class);
    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        logger.info("Hello world");
        logger.info("we are in logger info mode");

    }

}
