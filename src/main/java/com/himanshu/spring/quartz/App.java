package com.himanshu.spring.quartz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-quartz.xml");
		context = null;
		//HelloWorldBean obj = (HelloWorldBean) context.getBean("helloBean");
		//obj.printHello();
	}
}