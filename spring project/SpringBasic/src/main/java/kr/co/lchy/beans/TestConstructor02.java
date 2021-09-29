package kr.co.lchy.beans;

public class TestConstructor02 {
	private DataBean data1;
	private DataBean data2;
	
	public TestConstructor02(DataBean data1, DataBean data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void printData() {
		System.out.printf("data1: %s\n", data1);
		System.out.printf("data2: %s\n", data2);
	}

}
