package com.web.study.IocAndDi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class IocTest {

	@Qualifier("t1")			// Autowired를 통해서 연결된 요소중에 어떤 것을 연결할 건지 지정해줌 -> Autowired와 함께 쓰임
	@Autowired
	private Test test;
	
//	public IocTest(Test test) {		// 외부에서 의존성을 주입 = Dependency Injection / DI
//		this.test = test;
//	}
	
	public void run() {
		test.printTest();
		System.out.println("IoCTest 출력!");
	}
	
}
