package com.web.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.web.study.IocAndDi.IocTest;

@SpringBootApplication
public class StudyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudyApplication.class, args);
//		iocAndDiTest();
	}
	
	public static void iocAndDiTest() {
		// Inversion Of Control / IOC : 제어의 역전(제어를 개발자가 하지 않고 프로그램이 함)
		IocTest iocTest = new IocTest();
		iocTest.run();
	}

}
