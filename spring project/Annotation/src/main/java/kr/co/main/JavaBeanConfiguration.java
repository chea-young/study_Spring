package kr.co.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.config.BeanConfigClass_JBC;
import kr.co.lchy.beans.Test_JBC01;

public class JavaBeanConfiguration {

	public static void main(String[] args) {
		//xml을 사용하는 방식
		ClassPathXmlApplicationContext ctx1 = new ClassPathXmlApplicationContext("kr/co/config/beans_JBC.xml");
		Test_JBC01 xml1 = ctx1.getBean("xml1", Test_JBC01.class);
		System.out.printf("xml1: %s\n", xml1);
		
		ctx1.close();
		System.out.println("---------------------------------------------------------------------------");
		
		//java 파일 사용하는 방식
		AnnotationConfigApplicationContext ctx2 = new AnnotationConfigApplicationContext(BeanConfigClass_JBC.class);
		ctx2.close();

	}

}
