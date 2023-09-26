package com.yedam.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.yedam.app.**.mapper")
	// 인터페이스 읽는 어노테이션.
public class Ex230926Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex230926Application.class, args);
	}

}
