package com.yedam.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExample {

	public static void main(String[] args) {
		ApplicationContext ctx 
			= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		Mail mail = (Mail)ctx.getBean("mail");
		mail.printMessage();
	}

}
