package myaop.java;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExeTimeCalculator implements Calculator{
	private Calculator delegate;
	static final Logger logger = LogManager.getLogger(App.class);
	
	public ExeTimeCalculator(Calculator cal){
		delegate = cal;
	}
	
	public long factorial(long num) {
		long start = System.nanoTime();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
		logger.info("실행시간 : " + (end-start));
		return result;
	}
}
