package kr.co.lchy.beans;

public class TestBeanLifeCycle01 {
	public TestBeanLifeCycle01() {
		System.out.println(" TestBeanLifeCycle01 생성자 입니다.");
	}
	
	public void bean1_init() {
		System.out.println("inti 메서드");
	} 
	public void bean1_destroy() {
		System.out.println("destroy 메서드");
	}
}

