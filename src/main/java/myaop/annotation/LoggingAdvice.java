package myaop.annotation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.util.StopWatch;

import myaop.java.App;

@Aspect
public class LoggingAdvice {
	static final Logger logger = LogManager.getLogger(App.class);
	
	@Around("execution(* factorial(..))")
	public Object invoke(ProceedingJoinPoint arg0) throws Throwable {
		StopWatch watch = new StopWatch();
		String methodName = arg0.getSignature().getName();
		
		watch.start(methodName);
		logger.info("[LOG]method : " + methodName + "시작됨");
		
		Object obj = arg0.proceed();
		
		watch.stop();
		logger.info("[LOG]method : " + methodName + "종료됨");
		logger.info("[LOG]처리시간 : " + watch.getTotalTimeMillis());
		
		return obj;
	}
}






