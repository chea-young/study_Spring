package main;

import beans.HelloWorld;
import beans.HelloWorldEn;
import beans.HelloWorldKo;

public class MainClass {
	public static void main(String[] args) {
		HelloWorld hello1 = new HelloWorldKo(); //new HelloWorldEn();
		callMethod(hello1);
	}
	

	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
