package kr.co.lchy.beans;

public class Test_JD01 {
	private int data1;
	private String data2;
	private DataBean_JD01 data3;
	
	public Test_JD01 () {
		
		
	}

	public Test_JD01(int data1, String data2, DataBean_JD01 data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public int getData1() {
		return data1;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public String getData2() {
		return data2;
	}

	public void setData2(String data2) {
		this.data2 = data2;
	}

	public DataBean_JD01 getData3() {
		return data3;
	}

	public void setData3(DataBean_JD01 data3) {
		this.data3 = data3;
	}

}
