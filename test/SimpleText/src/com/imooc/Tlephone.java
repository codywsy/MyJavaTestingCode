package com.imooc;
//1.����һ����
public class Tlephone {
	//2. ���ԣ���Ա����������ʲô
	float screen;
	float cpu;
	float mem;
	int var;
	//3. ��������ʲô
	void call(){
		System.out.println("var" + var);
		System.out.println("Telephone �д�绰����");
	}
	
	void sendMessage(){
		System.out.println("screen:"+screen+" cpu:"+ cpu + "mem:" + mem + "Telephone �з����ŵĹ���");
	}
}
