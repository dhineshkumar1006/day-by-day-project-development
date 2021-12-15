package com.revised;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Base_Log {
	
	//step 1 create class obj without using new keyword
	//we seen in previous interface = class
	//class = class is known as upcasting
	//interface = interface is known as downcasting
	//here the same thing interface = interface so no need create new keyword
	//without creating object with new keyword is known as factory design pattern
	
	static Logger log = Logger.getLogger(Base_Log.class);//now it is class var
	
	//showing error because of outside main
	
	public static void main(String[] args) {
		
		
		BasicConfigurator.configure();
		
		log.debug("debug");
		log.info("information");
		log.warn("alert");
		log.error("error");
		log.fatal("fatal");
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


