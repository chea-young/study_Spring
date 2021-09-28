package kr.co.lchy.beans;

public class TestBeanLifeCycle02 {

	public TestBeanLifeCycle02() {
		System.out.println(" TestBeanLifeCycle02 생성자 입니다.");

	}
	
	public void default_init() {
		System.out.println("TestBeanLifeCYcle02의 default init");
	}
	
	public void default_destory() {
		System.out.println("TestBeanLifeCycle02의 default destoroy");
	}

}
