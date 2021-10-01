package kr.co.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import kr.co.lchy.beans.DataBean_JD01;
import kr.co.lchy.beans.DataBean_JD02;
import kr.co.lchy.beans.Test_JD01;
import kr.co.lchy.beans.Test_JD02;

@Configurable
public class BeanConfigClass_JD {

	@Bean
	public Test_JD01 java1() {
		return new Test_JD01(200, "문자열2", new DataBean_JD01());
	}

	@Bean
	public Test_JD01 java2() {

		Test_JD01 t1 = new Test_JD01();
		t1.setData1(400);
		t1.setData2("문자열4");
		t1.setData3(new DataBean_JD01());
		
		return t1;
	}
	
	@Bean
	public DataBean_JD02 data1() {
		return new DataBean_JD02();
	}
	
	@Bean
	public DataBean_JD02 data2() {
		return new DataBean_JD02();
	}
	
	@Bean(autowire=Autowire.BY_NAME) 
	public Test_JD02 java3() {
		return new Test_JD02();
	}

}
