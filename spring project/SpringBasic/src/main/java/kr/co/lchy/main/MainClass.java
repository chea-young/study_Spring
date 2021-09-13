package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans.xml");
		
		ctx.close();
	}

}
