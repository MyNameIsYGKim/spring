package com.yedam.app.java.spring;

import org.springframework.stereotype.Component;

@Component("tv")
public class SamsungTV implements TV{

	@Override
	public void on() {
		System.out.println("삼성 TV를 켰습니다.");
	}
	
}
