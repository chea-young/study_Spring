package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.TestPostProcessor01;

public class BeanPostProcessor {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans_postprocessor.xml");
		
		TestPostProcessor01  t1 = ctx.getBean("t1", TestPostProcessor01.class);
		System.out.printf("t1: %s\n", t1);
		System.out.println("----------------------------------------------------------");
		
		TestPostProcessor01  t2 = ctx.getBean("t2", TestPostProcessor01.class);
		System.out.printf("t2: %s\n", t2);
		
		ctx.close();
	}

}
