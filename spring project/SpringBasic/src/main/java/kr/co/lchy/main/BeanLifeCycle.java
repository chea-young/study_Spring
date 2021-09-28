package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.TestBeanLifeCycle01;
import kr.co.lchy.beans.TestBeanLifeCycle02;
import kr.co.lchy.beans.TestBeanLifeCycle03;

public class BeanLifeCycle {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans_beanlifecycle.xml");
		
		TestBeanLifeCycle01 t1 = ctx.getBean("t1", TestBeanLifeCycle01.class);
		System.out.printf("t1: %s\n", t1);
		
		System.out.println("---------------------------------");
		
		TestBeanLifeCycle02 t2 = ctx.getBean("t2", TestBeanLifeCycle02.class);
		System.out.printf("t2: %s\n", t2); 
		System.out.println("---------------------------------");
		
		
		TestBeanLifeCycle03 t3 = ctx.getBean("t3", TestBeanLifeCycle03.class);
		System.out.printf("t3: %s\n", t3); 
		System.out.println("---------------------------------");
		
		ctx.close();
		
	}
	

}
