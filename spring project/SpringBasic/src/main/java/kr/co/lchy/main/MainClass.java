package kr.co.lchy.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.lchy.beans.Helloworld;
import kr.co.lchy.beans.TestBean;

public class MainClass {
	public static void main(String[] args) {
		// beans.xml 파일을 로딩한다.
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/lchy/config/beans.xml");
		
		//xml에 정의한 bean 객체의 주소값을 가져온다., Helloworld로 형변환을 시킨다.
		Helloworld hello1 = (Helloworld)ctx.getBean("hello");
		callMethod(hello1);
		
		Helloworld hello2 = ctx.getBean("hello", Helloworld.class);
		callMethod(hello2);
		
		TestBean t1 = ctx.getBean("test1", TestBean.class);
		System.out.printf("t1: %s\n", t1);
		
		ctx.close();
	}
	
	
	public static void callMethod(Helloworld hello) {
		hello.sayHello();
	}

}
