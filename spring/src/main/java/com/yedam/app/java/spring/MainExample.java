package com.yedam.app.java.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainExample {

	public static void main(String[] args) {
		ApplicationContext ctx
			= new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TV tv = (TV)ctx.getBean("tv");
		tv.on();
		
		Restaurant res = (Restaurant)ctx.getBean(Restaurant.class);
		res.open();
	}

}
