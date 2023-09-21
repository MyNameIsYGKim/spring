package com.yedam.app.java.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	@Autowired
	Chef chef;
	
	@Autowired
	TV tv;
	
	public void open() {
		chef.cooking();
	}
}
