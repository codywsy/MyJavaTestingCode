package com.imooc;



public class HelloWorld {
    String name; // ��������name
	String sex; // ��������sex
	static int age;// ������̬����age
    
    // ���췽��
	public HelloWorld() { 
		System.out.println("ͨ�����췽����ʼ��name");
		name = "tom";
	}
    
    // ��ʼ����
	{ 
		System.out.println("ͨ����ʼ�����ʼ��sex");
		sex = "��";
	}
    
    // ��̬��ʼ����
	static{ 
		System.out.println("ͨ����̬��ʼ�����ʼ��age");
		age = 20;
	}
    
	public void show() {
		System.out.println("������" + name + "���Ա�" + sex + "�����䣺" + age);
	}
    
	public static void main(String[] args) {
        
        // ��������
		HelloWorld hello = new HelloWorld();
		// ���ö����show����
        hello.show();
        
        //����Tlephone
        Tlephone tel = new Tlephone();
        tel.call();
	}

}
