package myaop.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
	static final Logger logger = LogManager.getLogger(App.class);
	
	public static void main(String[] args) {
		/*
		long start1 = System.currentTimeMillis();
		Calculator cal = new ImpeCalculator();
		logger.info("반복문 : " + cal.factorial(10));
		long end1 = System.currentTimeMillis();
		logger.info("반복문 실행시간 : " + (end1-start1));
		
		long start2 = System.currentTimeMillis();
		cal = new RecCalculator();
		logger.info("재귀 : " + cal.factorial(10));
		long end2 = System.currentTimeMillis();
		logger.info("재귀 실행시간 : " + (end2-start2));
		*/
		
		ExeTimeCalculator cal = new ExeTimeCalculator(new ImpeCalculator());
		logger.info("반복문 : " + cal.factorial(20));
		
		cal = new ExeTimeCalculator(new RecCalculator());
		logger.info("재귀호출 : " + cal.factorial(20));
	}
}






