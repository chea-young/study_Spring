package kr.co.lchy.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.TestCollectionDI01;

public class CollectionDI {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans_CollectionDI.xml");
		
		TestCollectionDI01  t1 = ctx.getBean("t1", TestCollectionDI01.class);
		List<String> list1 = t1.getList1();
		for (String str: list1) {
			System.out.printf("list1: %s\n", str );
		}
		
		System.out.println("----------------------------------------------------------");
		
		
		ctx.close();

	}

}
