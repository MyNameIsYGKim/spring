package com.yedam.app;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ex230926ApplicationTests {
	
	@Autowired
	StringEncryptor jasyptStringEncryptor;
	
	@Test
	void encryptionTest() {
		String[] dataList = {
								"oracle.jdbc.OracleDriver",
								"jdbc:oracle:thin:@127.0.0.1:1521/xe",
								"hr",
								"1234"
							};
		for(String data : dataList) {
			String encData = jasyptStringEncryptor.encrypt(data);
			System.out.println(encData);
		}
	}

}
