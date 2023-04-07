package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("kr/co/softsoldesk/config/beans.xml");
		
		TestBean1 xml1 = ctx2.getBean(TestBean1.class);
		
		xml1.method1();
		
		ctx2.close();
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		TestBean1 java1 = ctx.getBean(TestBean1.class);
		//java1.method1();
		try {
			java1.method1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ctx.close();
	}

}
