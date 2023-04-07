package com.web.study.IocAndDi;

import org.springframework.stereotype.Component;

public class TestC implements Test {
	
	@Override
	public void printTest() {
		System.out.println("TestC 클래스!!!");
	}
}
