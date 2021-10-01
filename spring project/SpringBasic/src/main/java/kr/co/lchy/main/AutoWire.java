package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.TestAutowire01;

public class AutoWire {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans_AutoWire.xml");
		System.out.println("check");
		
		TestAutowire01  obj1 = ctx.getBean("obj1", TestAutowire01.class);
		System.out.printf("obj1.data1 : %s\n", obj1.getData1());
		System.out.printf("obj1.data2 : %s\n", obj1.getData2());
		
		System.out.println("----------------------------------");
		
		TestAutowire01 obj2 = ctx.getBean("obj2", TestAutowire01.class);
		System.out.printf("obj2.data1 : %s\n", obj2.getData1());
		System.out.printf("obj2.data2 : %s\n", obj2.getData2());
		
		System.out.println("-------------------------------------");
		
		ctx.close();

	}

}
