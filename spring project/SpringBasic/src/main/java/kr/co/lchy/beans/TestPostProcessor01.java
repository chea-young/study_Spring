package kr.co.lchy.beans;

public class TestPostProcessor01 {
	public TestPostProcessor01(){
		System.out.println("TestPostProcessor01 생성자입니다.");
	}
	
	public void bean1_init() {
		System.out.println("TestPostProcessor01의 init 메서드");
	}
}
