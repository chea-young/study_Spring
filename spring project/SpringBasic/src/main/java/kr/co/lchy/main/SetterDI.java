package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.TestSetter01;

public class SetterDI {

	public static void main(String[] args) {
		TestSetter01 obj1 = new TestSetter01();
		obj1.setData1(100);
		System.out.printf("obj1: data1: %d\n", obj1.getData1());
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans_setter.xml");
		
		TestSetter01 t1 = ctx.getBean("t1", TestSetter01.class);
		System.out.printf("t1: data1: %d\n", t1.getData1());
		System.out.printf("t1: data2: %f\n", t1.getData2());
		System.out.printf("t1: data3: %s\n", t1.isData3());
		System.out.printf("t1: data4: %s\n", t1.getData4());
		System.out.printf("t1: data5: %s\n", t1.getData5());
		System.out.printf("t1: data6: %s\n", t1.getData6());
		
		ctx.close();
	}

}
