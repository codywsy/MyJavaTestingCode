package imooc_exception_test;

public class TryCatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TryCatchTest tct = new TryCatchTest();
//		int result = tct.test();
//		System.out.println("test()方法，执行完毕！返回值为：" + result);
//		int result2 = tct.test2();
		int result = tct.test3();
		System.out.println("我想大声告诉你！test3()，result值为" + result);
	}
	
	/*
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while虚幻
	 * 每次循环，divider减一，result = result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！”，返回-1
	 * 否则：返回 result
	 */
	public int test()
	{
		int divider =10;
		int result = 100;
		try{
			while(divider>-1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了！！");
			return -1;
		}
	}
	
	/*
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while虚幻
	 * 每次循环，divider减一，result = result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！”，返回999，
	 * 否则：返回 result
	 * finally：打印输出"这是finally!!!”，同时打印输出result的值
	 */
	public int test2()
	{
		int divider = 10;
		int result = 100;
		try{
			while(divider>-1){
				divider--;
				result = result + 100/divider;
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了！！");
			return result = 999;
		}finally{
			System.out.println("我是finally语句块！！");
			System.out.println("我是Result，值为" + result);
		}
	}
	
	/*
	 * divider(除数)
	 * result(结果)
	 * try-catch捕获while虚幻
	 * 每次循环，divider减一，result = result+100/divider
	 * 如果：捕获异常，打印输出“抛出异常了！！！”，返回999，
	 * 否则：返回 result
	 * finally：打印输出"这是finally!!!”同时打印输出result的值
	 * 最后，返回1111作为结果
	 */
	public int test3()
	{
		int divider = 10;
		int result = 100;
		try{
			while(divider>-1){
				divider--;
				result = result + 100/divider;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("循环抛出异常了！！");
		}finally{
			System.out.println("我是finally语句块！！");
			System.out.println("我是Result，值为" + result);
		}
		System.out.println("我是test3()，别想我");
		return 1111;
		
	}
}
