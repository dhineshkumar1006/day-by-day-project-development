package com.revised;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_Logg {
	
	static Logger log = Logger.getLogger(Property_Logg.class);
	
	public static void main(String[] args) {
		
		PropertyConfigurator.configure("console appender");
		
		log.info("info ok");
		log.warn("warn ok");
		log.error("error ok");
		log.fatal("fatal ok");
		
		
	
		
		
		
		
		
		
	}
}
