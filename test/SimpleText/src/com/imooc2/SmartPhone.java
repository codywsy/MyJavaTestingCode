package com.imooc2;

public class SmartPhone extends Phone implements IPlayGame{

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("用屏幕打电话");
	}

	@Override
	public void messga() {
		// TODO Auto-generated method stub
		System.out.println("用屏幕发信息");
	}
	
	public void playGame(){
		System.out.println("具有玩游戏功能");
	}

}
