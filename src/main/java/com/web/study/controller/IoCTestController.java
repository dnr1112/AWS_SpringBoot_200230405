package com.web.study.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.study.IocAndDi.IocTest;
import com.web.study.IocAndDi.IocTest2;

import lombok.RequiredArgsConstructor;

@RestController
//@RequiredArgsConstructor
public class IoCTestController {

	@Autowired
	private IocTest iocTest;
	@Autowired
	private IocTest2 iocTest2;
	
//	@Autowired의 원형
//	private final IocTest iocTest;
//	private final IocTest2 iocTest2;
	
//	@RequiredArgsConstructor로 생략 가능
//	public IoCTestController(IocTest iocTest, IocTest2 iocTest2) {
//		this.iocTest = iocTest;
//		this.iocTest2 = iocTest2;
//	}
	
	@GetMapping("/ioc/test")
	public Object test() {
		iocTest.run();
		iocTest2.run();
		return null;
	}
}
