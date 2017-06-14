package com.imooc;
//1.定义一个类
public class Tlephone {
	//2. 属性（成员变量）：有什么
	float screen;
	float cpu;
	float mem;
	int var;
	//3. 方法：干什么
	void call(){
		System.out.println("var" + var);
		System.out.println("Telephone 有打电话功能");
	}
	
	void sendMessage(){
		System.out.println("screen:"+screen+" cpu:"+ cpu + "mem:" + mem + "Telephone 有发短信的功能");
	}
}
