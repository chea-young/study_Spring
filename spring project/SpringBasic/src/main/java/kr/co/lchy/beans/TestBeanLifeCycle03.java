package kr.co.lchy.beans;

public class TestBeanLifeCycle03 {
	public TestBeanLifeCycle03() {
		System.out.println("TestBeanLifeCycle03 생성자");
		
	}
	
	public void default_init() {
		System.out.println("TestBeanLifeCYcle03의 default init");
	}
	
	public void default_destory() {
		System.out.println("TestBeanLifeCycle04의 default destoroy");
	}
	
	public void bean3_init() {
		System.out.println("TestBeanLifeCycle04TestBeanLifeCycle03 inti 메서드");
	} 
	public void bean3_destroy() {
		System.out.println("TestBeanLifeCycle03 destroy 메서드");
	}
	

}
