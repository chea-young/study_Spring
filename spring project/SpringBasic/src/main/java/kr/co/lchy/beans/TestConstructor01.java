package kr.co.lchy.beans;

public class TestConstructor01 {
	
	private int data1;
	private double data2;
	private String data3;
	
	public TestConstructor01() {
		System.out.println("TestConstructor01의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
		
	}
	public TestConstructor01(int data1) {
		System.out.println("생성자: int 변수 1개");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestConstructor01(double data2) {
		System.out.println("생성자: double 변수 1개");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}
	
	public TestConstructor01(int data1, double data2, String data3) {
		System.out.println("생성자: 변수 3개");
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	public void printData() {
		System.out.printf("data1: %d\n", data1);
		System.out.printf("data1: %f\n", data2);
		System.out.printf("data1: %s\n", data3);
	}
}
