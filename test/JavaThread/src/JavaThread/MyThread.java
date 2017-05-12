package JavaThread;

public class MyThread extends Thread{
	private int ticket = 20;
	String name;
	public MyThread(String name){
		this.name = name;
	}
	
	public void run(){
		for(int i=0; i<100; i++){
			if(this.ticket > 0){
				System.out.println("ticket=" + ticket);
			}
		}
	}
}

