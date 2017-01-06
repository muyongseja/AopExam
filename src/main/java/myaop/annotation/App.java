package myaop.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:myaop/annotation/*.xml");
		
		Calculator cal = ctx.getBean("impeCalc", Calculator.class);
		cal.factorial(20);
	}
}
