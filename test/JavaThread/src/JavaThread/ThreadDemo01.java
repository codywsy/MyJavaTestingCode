package JavaThread;


public class ThreadDemo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MyThread t1 = new MyThread("A");
//		MyThread t2 = new MyThread("B");
//	    t1.start();
//	    t2.start();
		MyThread2 t3 = new MyThread2("A2");
		new Thread(t3).run();
		new Thread(t3).run();	
	}

}
