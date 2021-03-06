package com.aique.logging.javautil;

import java.io.IOException;
import java.util.logging.Formatter;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogFormatter {

	private static final Logger LOGGER = Logger.getLogger(LoggerExample.class.getName());
	public static void main(String[] args) {

		Handler fileHandler = null;
		Formatter simpleFormatter = null;
		try{
			
			// Creating FileHandler
			fileHandler = new FileHandler("/Users/sn/Training/codework/javawork/resources/app.formatter.log");
			
			// Creating SimpleFormatter
			simpleFormatter = new SimpleFormatter();
			
			// Assigning handler to logger
			LOGGER.addHandler(fileHandler);
			
			// Logging message of Level info (this should be publish in the default format i.e. XMLFormat)
			LOGGER.info("Finnest message: Logger with DEFAULT FORMATTER");
			
			// Setting formatter to the handler
			fileHandler.setFormatter(simpleFormatter);
			
			// Setting Level to ALL
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);
			
			// Logging message of Level finest (this should be publish in the simple format)
			LOGGER.finest("Finnest message: Logger with SIMPLE FORMATTER");
		}catch(IOException exception){
			LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
		}
	}

}
