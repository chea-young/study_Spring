package kr.co.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import kr.co.lchy.beans.Test_JBC01;

@Configurable
public class BeanConfigClass_JBC {
	
	@Bean
	public Test_JBC01 java1() {
		Test_JBC01 t1 = new Test_JBC01(); // Test_JBC01 객체 생성
		return t1;
	}

}
 