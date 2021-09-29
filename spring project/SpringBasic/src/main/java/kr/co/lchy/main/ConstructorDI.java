package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.DataBean_setter;
import kr.co.lchy.beans.TestConstructor01;
import kr.co.lchy.beans.TestConstructor02;

public class ConstructorDI {
	public static void main(String[] args) {
		TestConstructor01 t1 = new TestConstructor01();
		t1.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		TestConstructor01 t2 = new TestConstructor01(100);
		t2.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		TestConstructor01 t3 = new TestConstructor01(100, 11, "안뇽");
		t3.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans_cosntructorDI.xml");
		
		TestConstructor01 obj1 = ctx.getBean("obj1", TestConstructor01.class);
		obj1.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		TestConstructor01 obj2 = ctx.getBean("obj2", TestConstructor01.class);
		obj2.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		TestConstructor01 obj3 = ctx.getBean("obj3", TestConstructor01.class);
		obj3.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		DataBean_setter d1 = new DataBean_setter();
		DataBean_setter d2 = new DataBean_setter();
		TestConstructor02 t200 = new TestConstructor02(d1, d2);
		t200.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		TestConstructor02 obj4 = ctx.getBean("obj4", TestConstructor02.class);
		obj4.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		TestConstructor02 obj5 = ctx.getBean("obj5", TestConstructor02.class);
		obj5.printData();
		System.out.println("--------------------------------------------------------------------------------");
		
		ctx.close();
	}
	

}
