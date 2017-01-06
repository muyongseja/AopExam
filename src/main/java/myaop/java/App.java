package myaop.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		
		Calculator cal = new ImpeCalculator();
		logger.info("반복문 : " + cal.factorial(4));
		
		cal = new RecCalculator();
		logger.info("재귀 : " + cal.factorial(4));
	}
}
