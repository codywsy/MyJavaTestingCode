package imooc_exception_test;

public class ChainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChainTest ct = new ChainTest();
		ct.test2();
	}
	
	public void test1() throws DrunkException {
		throw new DrunkException("喝酒别开车！！");
	}
	
	public void test2(){
		try{
			test1();
		} catch(DrunkException e){
			RuntimeException NewExc = new RuntimeException("司机一滴酒，亲人两行泪！");
			NewExc.initCause(e);
			throw NewExc;
		}
		
	}
}
