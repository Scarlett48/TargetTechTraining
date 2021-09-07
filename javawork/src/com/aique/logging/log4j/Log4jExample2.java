package com.aique.logging.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jExample2 {
    final static Logger logger = LogManager.getLogger(Log4jExample2.class.getName());

    public static void main(String[] args) {

        Log4jExample2 obj = new Log4jExample2();
        obj.runMe("Run Me");

    }

    private void runMe(String parameter){

        if(logger.isDebugEnabled()){
            logger.debug("This is debug : " + parameter);
        }

        if(logger.isInfoEnabled()){
            logger.info("This is info : " + parameter);
        }

        logger.warn("This is warn : " + parameter);
        logger.error("This is error : " + parameter);
        logger.fatal("This is fatal : " + parameter);

    }
}
