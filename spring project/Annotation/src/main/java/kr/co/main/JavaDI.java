package kr.co.main;

 import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.config.BeanConfigClass_JD;
import kr.co.lchy.beans.Test_JD01;
import kr.co.lchy.beans.Test_JD02;

public class JavaDI {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/config/beans_JD.xml");
		Test_JD01 xml1 = ctx1.getBean("xml1", Test_JD01.class);
		System.out.printf("xml1.data1 : %d\n", xml1.getData1());
		System.out.printf("xml1: data2 %s\n", xml1.getData2());
		System.out.printf("xml1: data3 %s\n", xml1.getData3());
		System.out.println("---------------------------------------------------------------------------");
		
		Test_JD01 xml2 = ctx1.getBean("xml2", Test_JD01.class);
		System.out.printf("xml2.data1 : %d\n", xml2.getData1());
		System.out.printf("xml2: data2 %s\n", xml2.getData2());
		System.out.printf("xml2: data3 %s\n", xml2.getData3());
		System.out.println("---------------------------------------------------------------------------");
		/*
		Test_JD02 xml3 = ctx1.getBean("xml3", Test_JD02 .class);
		System.out.printf("xml3.data1 : %s\n", xml3.getData1());
		System.out.printf("xml3: data2 %s\n", xml3.getData2());*/
		System.out.println("---------------------------------------------------------------------------");
		
		ctx1.close();
		
		
		//java 파일 사용하는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass_JD.class);
		Test_JD01 java1 = ctx2.getBean("java1", Test_JD01.class);
		System.out.printf("java1.data1: %d\n", java1.getData1());
		System.out.printf("java1.data2: %s\n", java1.getData2());
		System.out.printf("java1.data3: %s\n", java1.getData3());
		System.out.println("---------------------------------------------------------------------------");
		
		Test_JD01 java2 = ctx2.getBean("java2", Test_JD01.class);
		System.out.printf("java2.data1: %d\n", java2.getData1());
		System.out.printf("java2.data2: %s\n", java2.getData2());
		System.out.printf("java2.data3: %s\n", java2.getData3());
		System.out.println("---------------------------------------------------------------------------");
		
		Test_JD02 java3 = ctx2.getBean("java3", Test_JD02.class);
		System.out.printf("java3.data1: %s\n", java3.getData1());
		System.out.printf("java3.data2: %s\n", java3.getData2());
		
		ctx2.close();

	}

}
