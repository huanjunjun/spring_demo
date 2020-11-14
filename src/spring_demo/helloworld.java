package spring_demo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class helloworld {
	public static void main(String arg[]) {
		helloworld helloworld = new helloworld();
	}

	public helloworld() {

		// 创建IOC容器对象
		// 将xml理解为容器
		ApplicationContext aplContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		person person = (person) aplContext.getBean("person");
		person.sayhello();
	}
}
