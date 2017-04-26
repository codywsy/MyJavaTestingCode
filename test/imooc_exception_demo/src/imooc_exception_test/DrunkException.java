package imooc_exception_test;

public class DrunkException extends Exception{
	//因为我们自定义了一个有参的构造方法，所以编译器不会帮我们自动补充一个无参的构造方法，所以我们需要自己另外定义一个无参构造方法
	public DrunkException(){}
	
	
	public DrunkException(String message){
		super(message);
	}
}
