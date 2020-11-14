package spring_demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class car_demo {
	@Test
	public void test1() {
		ApplicationContext aplc = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Car car = aplc.getBean("Car", Car.class);
		System.out.println(car);
	}

}
