package com.imooc2;

public class Initial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CellPhone cellphone = new CellPhone();
		SmartPhone smartphone = new SmartPhone();
		Psp psp = new Psp();
	
		smartphone.playGame();
		psp.playGame();
	
		IPlayGame smartphone_1 = new SmartPhone();
		smartphone_1.playGame();
	}

}
