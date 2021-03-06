package com.aique.logging.javautil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class LogConfiguration {

	private static final LogManager logManager = LogManager.getLogManager();
	private static final Logger LOGGER = Logger.getLogger("confLogger");
	static{
		try {
			logManager.readConfiguration(new FileInputStream("/Users/sn/Training/codework/javawork/resources/logger.properties"));
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Error in loading configuration",exception);
		}
	}
	public static void main(String[] args) {

		LOGGER.fine("Fine message logged");
		LOGGER.info("Info message logged");
		LOGGER.warning("Warning message logged");
		LOGGER.severe("Severe message logged");
	}
}
