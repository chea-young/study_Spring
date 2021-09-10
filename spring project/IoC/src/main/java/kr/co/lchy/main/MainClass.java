package kr.co.lchy.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import kr.co.lchy.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test2();
		//test3();
		test4();

	}
	//BeanFactory - 패키지 내부
	public static void test1() {
		ClassPathResource res = new ClassPathResource("kr/co/lchy/config/beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
	}
	
	//BeanFactory - 패키지 외부
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
	}
	
	//ApplicationContext 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans.xml"); //bean에 있는 모든 객체들이 다 생성
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		
		ctx.close();
	}
	
	//ApplicationContext 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean t1 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t1 : %s\n", t1);
		
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.printf("t2 : %s\n", t2);
		
		
		ctx.close();
	}
}
