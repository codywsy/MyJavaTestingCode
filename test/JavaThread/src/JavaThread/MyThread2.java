package JavaThread;

public class MyThread2 implements Runnable{
	private int ticket = 20;
	private String name;
	public MyThread2(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i=0; i<100; i++){
			if(ticket>0){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ticket=" + ticket--);
			}
		}
	}
}

