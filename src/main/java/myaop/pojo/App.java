package myaop.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("classpath:myaop/spring/*.xml");
		
		Calculator cal = ctx.getBean("proxy", Calculator.class);
		cal.factorial(20);
	}
}
