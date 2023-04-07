package kr.co.softsoldesk.beans;

import org.springframework.stereotype.Component;

@Component
public class TestBean1 {
	
	// 실습1
	 public void method1() { 
		 System.out.println("TestBean1의 method1() 호출"); 
	}
	 	
	/*
	public void method1() {
		System.out.println("TestBean1의 method1() 호출");
		
		int a1 = 10/0;
	}
	*/
}
