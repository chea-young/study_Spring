package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.TestAX;

public class AOPXML {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/bean_AX.xml");
		TestAX bean1 = ctx.getBean("xml1", TestAX.class);
		bean1.method1();

		ctx.close();

	}

}
